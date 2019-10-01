import com.finxact.model.*;
import com.iso.finxact.xml.msg.Message;
import com.iso.finxact.xml.pacs008.*;
import iso.std.iso._20022.tech.xsd.head_001_001.BusinessApplicationHeaderV01TCH;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.lang.Exception;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

public class Pacs008ToTranOrderTransformer {
    private static Order order = new Order();
    private static Trn trn = new Trn();

    private static DocumentTCH creditTransfer;

    //Single Point of Entry
    public static void main(String[] args) throws Exception {


        Message message_pacs008 = PacsGenerator.jaxbXmlFileToObject("/Users/lalluluke/Downloads/project/schema-finxact/finxactrtp/src/main/resources/iso-payload/pacs.008-old.xml");
        PacsGenerator.jaxbObjectToXML("pacs008.xml", message_pacs008);

        creditTransfer = message_pacs008.getCreditTransfer();

        populateHeader(message_pacs008.getAppHdr());
        populateBody();
        order.setVerifyDtm(new Date());
        trn.setOrder(order);
        PacsGenerator.writeToFile("trn.json", FinxactOrderGenerator.getJSONString(trn));

        Message message_pacs002 = PacsGenerator.createPacs002(trn.getOrder(),new SimpleDateFormat("yyyy-MM-dd").parse(trn.getGlJrnlDate()));
        PacsGenerator.jaxbObjectToXML("pacs002.xml", message_pacs002);
    }

    public static String format(String xml) {

        try {
            final InputSource src = new InputSource(new StringReader(xml));
            final Node document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getDocumentElement();
            final Boolean keepDeclaration = Boolean.valueOf(xml.startsWith("<?xml"));

            //May need this: System.setProperty(DOMImplementationRegistry.PROPERTY,"com.sun.org.apache.xerces.internal.dom.DOMImplementationSourceImpl");


            final DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
            final DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
            final LSSerializer writer = impl.createLSSerializer();

            writer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE); // Set this to true if the output needs to be beautified.
            writer.getDomConfig().setParameter("xml-declaration", keepDeclaration); // Set this to true if the declaration is needed to be outputted.

            return writer.writeToString(document);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void populateHeader(BusinessApplicationHeaderV01TCH appHrd) {

        Counterparty counterparty = new Counterparty();
        Counterparty cp = new Counterparty();
        FinInst finInst1 = new FinInst();
        finInst1.setFinInstBic(appHrd.getFr().getFIId().getFinInstnId().getClrSysMmbId().getMmbId());
        counterparty.setFinInst(finInst1);

        FinInst finInst = new FinInst();
        finInst.setFinInstBic(appHrd.getTo().getFIId().getFinInstnId().getClrSysMmbId().getMmbId());

        OtherProperties_ otherProperties = new OtherProperties_();

        order.setOtherProperties(otherProperties);
        otherProperties.setAdditionalProperty("orderBizIdr", appHrd.getBizMsgIdr());
        otherProperties.setAdditionalProperty("orderDefnIdr", appHrd.getMsgDefIdr() == null ? "pacs.008.001.08" : appHrd.getMsgDefIdr().value());
        otherProperties.setAdditionalProperty("orderCpyDplct", "Test-orderCpyDplct");
        counterparty.setAcctBranch("Test Branch Id - From" + nullGuard(() -> appHrd.getFr().getFIId().getBrnchId().getId()));
        cp.setAcctBranch("Test Branch Id - To" + nullGuard(() -> appHrd.getTo().getFIId().getBrnchId().getId()));
        order.setCreateDtm(appHrd.getCreDt().toGregorianCalendar().getTime());

        order.setOriginator(counterparty);
        order.setCounterParty(cp);
        order.setIntermedFi(finInst);

    }

    public static void populateBody() {
        FIToFICustomerCreditTransferV08DRAFTTCH transaction = creditTransfer.getFIToFICstmrCdtTrf();
        populateGroupHeader(transaction.getGrpHdr());
        populateTransaction(transaction.getCdtTrfTxInf());
    }

    public static void populateGroupHeader(GroupHeader93TCH groupHeader) {
        order.getOriginator().setRef(groupHeader.getMsgId());
        order.setOrderAmt(groupHeader.getTtlIntrBkSttlmAmt().getValue().doubleValue());
        trn.setGlJrnlDate(groupHeader.getIntrBkSttlmDt().toString());
        //  order.setAdditionalProperty("SttlmMtd", groupHeader.getSttlmInf().getSttlmMtd().value());
        // order.setAdditionalProperty("NbOfTxs", groupHeader.getNbOfTxs());
        //  order.setAdditionalProperty("ClrSys", groupHeader.getSttlmInf().getClrSys().getCd());

    }

    public static <T> T nullGuard(Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (@SuppressWarnings("unused") NullPointerException ignored) {
            return null;
        }
    }

    public static void populateTransaction(CreditTransferTransaction39TCH creditTransferTransaction) {
        order.getOtherProperties().setAdditionalProperty("InstrId", creditTransferTransaction.getPmtId().getInstrId());
        Counterparty originator = new Counterparty();
        if (order.getOriginator() != null) {
            originator = order.getOriginator();
        }
        order.setThreadId(creditTransferTransaction.getPmtId().getEndToEndId());

        order.getOtherProperties().setAdditionalProperty("trnId", creditTransferTransaction.getPmtId().getTxId());
        order.getOtherProperties().setAdditionalProperty("ClrSysRef", creditTransferTransaction.getPmtId().getClrSysRef());
        // order.setAdditionalProperty("SvcLvl", creditTransferTransaction.getPmtTpInf().getSvcLvl().getCd().value());
        order.getOtherProperties().setAdditionalProperty("orderInstrm", nullGuard(() -> creditTransferTransaction.getPmtTpInf().getLclInstrm().getPrtry().value()));


        order.getOtherProperties().setAdditionalProperty("customerType", nullGuard(() -> creditTransferTransaction.getPmtTpInf().getCtgyPurp().getPrtry().value()));
        ///originator.setId(creditTransferTransaction.getInstgAgt().getFinInstnId().getClrSysMmbId().getMmbId());
        originator.setName(creditTransferTransaction.getDbtr().getNm());
        setPostalAddress(creditTransferTransaction.getDbtr().getPstlAdr());
        List<Addr_> lst = new ArrayList<Addr_>();
        Addr_ addr = new Addr_();
        // originator.getAdd
       /* addr.set
        lst.add(addr);
        originator*/
        FinInst finInst = originator.getFinInst() == null ? new FinInst() : originator.getFinInst();
        order.getOtherProperties().setAdditionalProperty("originatorBankId", "originatorBankId" + nullGuard(() -> creditTransferTransaction.getDbtr().getId().getOrgId().getLEI()));
        finInst.setFinInstAba(creditTransferTransaction.getDbtrAgt().getFinInstnId().getClrSysMmbId().getMmbId());
        originator.setFinInst(finInst);

        getDbtrExtRef_(creditTransferTransaction);

        originator.setAcctNbr(creditTransferTransaction.getDbtrAcct().getId().getOthr().getId());
        order.setOriginator(originator);

        order.setBeneNetAmt(creditTransferTransaction.getIntrBkSttlmAmt().getValue().doubleValue());
        // order.setAdditionalProperty("orderInstrm", creditTransferTransaction.getChrgBr().value());

        Counterparty cp = new Counterparty();
        if (order.getCounterParty() != null) {
            cp = order.getCounterParty();
        }
        FinInst finInstC = new FinInst();
        finInstC.setFinInstAba(creditTransferTransaction.getCdtrAgt().getFinInstnId().getClrSysMmbId().getMmbId());
        cp.setFinInst(finInstC);
        cp.setName(creditTransferTransaction.getCdtr().getNm());

        setPostalAddressOtherProp(creditTransferTransaction.getCdtr().getPstlAdr());
        getCdrExtRef_(creditTransferTransaction);

        cp.setAcctNbr(creditTransferTransaction.getCdtrAcct().getId().getOthr().getId());
        order.setCounterParty(cp);

        // order.getCounterParty().setId(nullGuard(() -> creditTransferTransaction.getInstdAgt().getFinInstnId().getClrSysMmbId().getMmbId()));


    }
    private static void setPostalAddressOtherProp(PostalAddress24TCH postalAddress){
        OtherProperties otherProperties = new OtherProperties();
        order.getCounterParty().setOtherProperties(otherProperties);
        order.getCounterParty().getOtherProperties().setAdditionalProperty("street", nullGuard(() -> postalAddress.getStrtNm()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("premise", nullGuard(() -> postalAddress.getBldgNb()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("postCode", nullGuard(() -> postalAddress.getPstCd()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("city",nullGuard(() -> postalAddress.getTwnNm()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("region", nullGuard(() -> postalAddress.getCtrySubDvsn()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("cntry", nullGuard(() -> postalAddress.getCtry()));
    }
    private static void setPostalAddress(PostalAddress24TCH postalAddress) {
        Terminal terminal = new Terminal();
        Addr addr = new Addr();
        addr.setStreet( nullGuard(() -> postalAddress.getStrtNm()));
        addr.setPremise( nullGuard(() -> postalAddress.getBldgNb()));
        addr.setPostCode( nullGuard(() -> postalAddress.getPstCd()));
        addr.setCity( nullGuard(() -> postalAddress.getTwnNm()));
        addr.setRegion( nullGuard(() -> postalAddress.getCtrySubDvsn()));
        addr.setCntry(nullGuard(() -> postalAddress.getCtry()));
        terminal.setAddr(addr);
        trn.setTerminal(terminal);

    }

    private static void getDbtrExtRef_(CreditTransferTransaction39TCH creditTransferTransaction) {

        order.getOtherProperties().setAdditionalProperty("originatorBirthDt", "originatorBirthDt" + creditTransferTransaction.getDbtr().getId().getPrvtId().getDtAndPlcOfBirth().getBirthDt().toString());
        order.getOtherProperties().setAdditionalProperty("originatorCityOfBirth", "originatorCityOfBirth" + creditTransferTransaction.getDbtr().getId().getPrvtId().getDtAndPlcOfBirth().getCityOfBirth().toString());

        order.getOtherProperties().setAdditionalProperty("originatorCtryOfBirth", "originatorCtryOfBirth" + creditTransferTransaction.getDbtr().getId().getPrvtId().getDtAndPlcOfBirth().getCtryOfBirth().toString());

    }

    private static void getCdrExtRef_(CreditTransferTransaction39TCH creditTransferTransaction) {

        order.getOtherProperties().setAdditionalProperty("counterPartyBirthDt", "counterPartyBirthDt" + creditTransferTransaction.getCdtr().getId().getPrvtId().getDtAndPlcOfBirth().getBirthDt().toString());
        order.getOtherProperties().setAdditionalProperty("counterPartyCityOfBirth", "counterPartyCityOfBirth" + creditTransferTransaction.getCdtr().getId().getPrvtId().getDtAndPlcOfBirth().getCityOfBirth().toString());
        order.getOtherProperties().setAdditionalProperty("counterPartyCtryOfBirth", "counterPartyCtryOfBirth" + creditTransferTransaction.getCdtr().getId().getPrvtId().getDtAndPlcOfBirth().getCtryOfBirth().toString());


        if (creditTransferTransaction.getInstrForCdtrAgts().isEmpty()) {
            order.getOtherProperties().setAdditionalProperty("InstrForCdtrAgtCd", "InstrForCdtrAgtCd");
        } else {
            order.getOtherProperties().setAdditionalProperty("InstrForCdtrAgtCd", "InstrForCdtrAgtCd" + nullGuard(() -> creditTransferTransaction.getInstrForCdtrAgts().get(0).getCd()));
        }
        if (creditTransferTransaction.getInstrForCdtrAgts().isEmpty()) {
            order.getOtherProperties().setAdditionalProperty("InstrForCdtrAgtInstrInf", "InstrForCdtrAgtInstrInf");
        } else {
            order.getOtherProperties().setAdditionalProperty("InstrForCdtrAgtInstrInf", "InstrForCdtrAgtInstrInf" + nullGuard(() -> creditTransferTransaction.getInstrForCdtrAgts().get(0).getInstrInf()));
        }

        order.getOtherProperties().setAdditionalProperty("RmtInfUstrd", "RmtInfUstrd" + nullGuard(() -> creditTransferTransaction.getRmtInf().getUstrd()));
        order.getOtherProperties().setAdditionalProperty("RmtInfStrdNo", "RmtInfStrdNo" + nullGuard(() -> creditTransferTransaction.getRmtInf().getStrd().getRfrdDocInf().getNb()));
        order.getOtherProperties().setAdditionalProperty("RmtInfStrdDt", "RmtInfStrdDt" + nullGuard(() -> creditTransferTransaction.getRmtInf().getStrd().getRfrdDocInf().getRltdDt()));

        //  if((nullGuard(() -> creditTransferTransaction.getRmtInf().getStrd().getRfrdDocAmt() != null)
        //         || creditTransferTransaction.getRmtInf().getStrd().getRfrdDocAmt().getDscntApldAmts().isEmpty())){
        order.getOtherProperties().setAdditionalProperty("ReferDscntApldAmt", "0");
        order.getOtherProperties().setAdditionalProperty("RmtInfStrdDt", "ReferType");
        //  }else{
        //      property_8.setName(creditTransferTransaction.getRmtInf().getStrd().getRfrdDocAmt().getDscntApldAmts().get(0).getAmt().getValue().toString());
        //      property_9.setName("ReferType"+nullGuard(() -> creditTransferTransaction.getRmtInf().getStrd().getRfrdDocAmt().getDscntApldAmts().get(0).getTp().getPrtry()));
        // }

    }
}
