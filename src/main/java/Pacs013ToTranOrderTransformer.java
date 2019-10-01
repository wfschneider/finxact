import com.finxact.model.*;
import com.iso.finxact.xml.msg.Message;
import iso.std.iso._20022.tech.xsd.head_001_001.BusinessApplicationHeaderV01TCH;
import iso.std.iso._20022.tech.xsd.pain_013_001.*;

import java.lang.Exception;
import java.util.Date;
import java.util.function.Supplier;

public class Pacs013ToTranOrderTransformer {
    private static Order order = new Order();
    private static Trn trn = new Trn();
    private static BusinessApplicationHeaderV01TCH appHrd;
    private static DocumentTCH pain013;

    //Single Point of Entry
    public static void main(String[] args) throws Exception {


        Message message_pacs013 = PacsGenerator.jaxbXmlFileToObject("/Users/lalluluke/Downloads/project/schema-finxact/finxactrtp/src/main/resources/iso-payload/pain.013.xml");
        PacsGenerator.jaxbObjectToXML("pain013.xml", message_pacs013);
        appHrd = message_pacs013.getAppHdr();
        pain013 = message_pacs013.getPaymentRequest();

        populateHeader(appHrd);
        populateBody();
        order.setVerifyDtm(new Date());
        trn.setOrder(order);
        PacsGenerator.writeToFile("trn13.json", FinxactOrderGenerator.getJSONString(trn));

       // Message message_pacs002 = PacsGenerator.createPacs002(trn.getOrder(),new SimpleDateFormat("yyyy-MM-dd").parse(trn.getGlJrnlDate()));
        //PacsGenerator.jaxbObjectToXML("pacs002.xml", message_pacs002);
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
        CreditorPaymentActivationRequestV07DRAFTTCH transaction = pain013.getCdtrPmtActvtnReq();
        populateGroupHeader(transaction.getGrpHdr());
        populateTransaction(transaction.getPmtInf());

        trn.setEffectDtm(nullGuard(() -> transaction.getPmtInf().getReqdExctnDt().getDt().toGregorianCalendar().getGregorianChange()));
        trn.setEffectDtm(new Date());
        trn.setSettleDtm(nullGuard(() -> transaction.getPmtInf().getXpryDt().getDt().toGregorianCalendar().getGregorianChange()));
        trn.setSettleDtm(new Date());
    }

    public static void populateGroupHeader(GroupHeader78TCH groupHeader) {
        order.getOriginator().setRef(groupHeader.getMsgId());
        order.setCreateDtm(groupHeader.getCreDtTm().toGregorianCalendar().getTime());
        order.getOriginator().getFinInst().setFinInstAba(groupHeader.getInitgPty().getId().getOrgId().getOthr().getId());



    }

    public static <T> T nullGuard(Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (@SuppressWarnings("unused") NullPointerException ignored) {
            return null;
        }
    }

    public static void populateTransaction(PaymentInstruction31TCH paymentInstruction31TCH) {
        order.getOtherProperties().setAdditionalProperty("pmtInfId", paymentInstruction31TCH.getPmtInfId());


        Counterparty originator = new Counterparty();
        if (order.getOriginator() != null) {
            originator = order.getOriginator();
        }
        originator.setName(paymentInstruction31TCH.getDbtr().getNm());
        setPostalAddress(paymentInstruction31TCH.getDbtr().getPstlAdr());
        getDbtrExtRef_(paymentInstruction31TCH);
        order.getOtherProperties().setAdditionalProperty("originatorBankId", "originatorBankId" + nullGuard(() -> paymentInstruction31TCH.getDbtr().getId().getOrgId().getLEI()));
        originator.setAcctNbr("acct no " + nullGuard(() ->paymentInstruction31TCH.getDbtrAcct().getId().getOthr().getId()));
        originator.setAcctTitle("proxy ID" + nullGuard(() ->paymentInstruction31TCH.getDbtrAcct().getPrxy().getId()));
        FinInst finInst = originator.getFinInst() == null ? new FinInst() : originator.getFinInst();
        finInst.setFinInstAba(paymentInstruction31TCH.getDbtrAgt().getFinInstnId().getClrSysMmbId().getMmbId());
        originator.setFinInst(finInst);
        CreditTransferTransaction35TCH creditTransferTransaction = paymentInstruction31TCH.getCdtTrfTx();

        order.getOtherProperties().setAdditionalProperty("InstrId", "InstrId" + nullGuard(() -> creditTransferTransaction.getPmtId().getInstrId()));
        order.setThreadId(creditTransferTransaction.getPmtId().getEndToEndId());
        order.getOtherProperties().setAdditionalProperty("InstrId", "orderInstrm " + nullGuard(() -> creditTransferTransaction.getPmtTpInf().getLclInstrm().getPrtry()));
        order.getOtherProperties().setAdditionalProperty("InstrId", "customerType " + nullGuard(() -> creditTransferTransaction.getPmtTpInf().getCtgyPurp().getPrtry()));
        order.setBeneNetAmt(creditTransferTransaction.getAmt().getInstdAmt().getValue().doubleValue());

        //order.getOtherProperties().setAdditionalProperty("trnId", creditTransferTransaction.getPmtId().getTxId());
        //order.getOtherProperties().setAdditionalProperty("ClrSysRef", creditTransferTransaction.getPmtId().getClrSysRef());
        // order.setAdditionalProperty("SvcLvl", creditTransferTransaction.getPmtTpInf().getSvcLvl().getCd().value());
        //order.getOtherProperties().setAdditionalProperty("customerType", nullGuard(() -> creditTransferTransaction.getPmtTpInf().getCtgyPurp().getPrtry().value()));
        ///originator.setId(creditTransferTransaction.getInstgAgt().getFinInstnId().getClrSysMmbId().getMmbId());
        order.setOriginator(originator);
        // order.setAdditionalProperty("orderInstrm", creditTransferTransaction.getChrgBr().value());
        Counterparty cp = new Counterparty();
        if (order.getCounterParty() != null) {
            cp = order.getCounterParty();
        }
        cp.setPosnAcctNbr(creditTransferTransaction.getCdtrAcct().getId().getOthr().getId());


        FinInst finInstC = new FinInst();
        finInstC.setFinInstAba(creditTransferTransaction.getCdtrAgt().getFinInstnId().getClrSysMmbId().getMmbId());
        cp.setFinInst(finInstC);
        cp.setName(creditTransferTransaction.getCdtr().getNm());

        setPostalAddressOtherProp(creditTransferTransaction.getCdtr().getPstlAdr());
        getCdrExtRef_(creditTransferTransaction);


        order.setCounterParty(cp);

        // order.getCounterParty().setId(nullGuard(() -> creditTransferTransaction.getInstdAgt().getFinInstnId().getClrSysMmbId().getMmbId()));


    }
    private static void setPostalAddressOtherProp(iso.std.iso._20022.tech.xsd.pain_013_001.PostalAddress24TCH postalAddress){
        OtherProperties otherProperties = new OtherProperties();
        order.getCounterParty().setOtherProperties(otherProperties);
        order.getCounterParty().getOtherProperties().setAdditionalProperty("street", "StrtNm "+nullGuard(() -> postalAddress.getStrtNm()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("premise", "premise "+nullGuard(() -> postalAddress.getBldgNb()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("postCode", "postCode "+nullGuard(() -> postalAddress.getPstCd()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("city","city "+nullGuard(() -> postalAddress.getTwnNm()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("region", "region "+nullGuard(() -> postalAddress.getCtrySubDvsn()));
        order.getCounterParty().getOtherProperties().setAdditionalProperty("cntry", "cntry "+nullGuard(() -> postalAddress.getCtry()));
    }
    private static void setPostalAddress(iso.std.iso._20022.tech.xsd.pain_013_001.PostalAddress24TCH postalAddress) {
        Terminal terminal = new Terminal();
        Addr addr = new Addr();
        addr.setStreet( "StrtNm"+ nullGuard(() -> postalAddress.getStrtNm()));
        addr.setPremise( "BldgNb"+nullGuard(() -> postalAddress.getBldgNb()));
        addr.setPostCode( "PstCd"+nullGuard(() -> postalAddress.getPstCd()));
        addr.setCity( "TwnNm"+nullGuard(() -> postalAddress.getTwnNm()));
        addr.setRegion( "CtrySubDvsn"+nullGuard(() -> postalAddress.getCtrySubDvsn()));
        addr.setCntry("Ctry"+nullGuard(() -> postalAddress.getCtry()));
        terminal.setAddr(addr);
        trn.setTerminal(terminal);

    }

    private static void getDbtrExtRef_(PaymentInstruction31TCH creditTransferTransaction) {

        order.getOtherProperties().setAdditionalProperty("originatorBirthDt", "originatorBirthDt" + nullGuard(() ->creditTransferTransaction.getDbtr().getId().getPrvtId().getDtAndPlcOfBirth().getBirthDt().toString()));
        order.getOtherProperties().setAdditionalProperty("originatorCityOfBirth", "originatorCityOfBirth" + nullGuard(() ->creditTransferTransaction.getDbtr().getId().getPrvtId().getDtAndPlcOfBirth().getCityOfBirth().toString()));

        order.getOtherProperties().setAdditionalProperty("originatorCtryOfBirth", "originatorCtryOfBirth" + nullGuard(() ->creditTransferTransaction.getDbtr().getId().getPrvtId().getDtAndPlcOfBirth().getCtryOfBirth().toString()));

    }

    private static void getCdrExtRef_(CreditTransferTransaction35TCH creditTransferTransaction) {
        order.getOtherProperties().setAdditionalProperty("counterPartyBankId", "counterPartyBankId" + nullGuard(() ->creditTransferTransaction.getCdtr().getId().getOrgId().getLEI()));
        order.getOtherProperties().setAdditionalProperty("counterPartyPhneNb", "counterPartyPhneNb" + nullGuard(() ->creditTransferTransaction.getCdtr().getCtctDtls().getPhneNb()));
        order.getOtherProperties().setAdditionalProperty("counterPartyBirthDt", "counterPartyBirthDt" + nullGuard(() ->creditTransferTransaction.getCdtr().getId().getPrvtId().getDtAndPlcOfBirth().getBirthDt().toString()));
        order.getOtherProperties().setAdditionalProperty("counterPartyCityOfBirth", "counterPartyCityOfBirth" + nullGuard(() ->creditTransferTransaction.getCdtr().getId().getPrvtId().getDtAndPlcOfBirth().getCityOfBirth().toString()));
        order.getOtherProperties().setAdditionalProperty("counterPartyCtryOfBirth", "counterPartyCtryOfBirth" + nullGuard(() ->creditTransferTransaction.getCdtr().getId().getPrvtId().getDtAndPlcOfBirth().getCtryOfBirth().toString()));
        order.getOtherProperties().setAdditionalProperty("RmtInfUstrd", "RmtInfUstrd" + nullGuard(() -> creditTransferTransaction.getRmtInf().getUstrd()));
        order.getOtherProperties().setAdditionalProperty("ReferType", "ReferType" + nullGuard(() -> creditTransferTransaction.getRmtInf().getStrd().getRfrdDocAmt().getDscntApldAmts().get(0).getTp().getPrtry()));
        order.getOtherProperties().setAdditionalProperty("ReferDscntApldAmt", "ReferDscntApldAmt" + nullGuard(() -> creditTransferTransaction.getRmtInf().getStrd().getRfrdDocAmt().getDscntApldAmts().get(0).getAmt().getValue().doubleValue()));

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

        order.getOtherProperties().setAdditionalProperty("RmtId", "RmtId" + nullGuard(() -> creditTransferTransaction.getRltdRmtInf().getRmtId()));
        order.getOtherProperties().setAdditionalProperty("RmtElctrncAdr", "RmtElctrncAdr" + nullGuard(() -> creditTransferTransaction.getRltdRmtInf().getRmtLctnDtls().getElctrncAdr()));
        order.getOtherProperties().setAdditionalProperty("RmtMtd", "RmtMtd" + nullGuard(() -> creditTransferTransaction.getRltdRmtInf().getRmtLctnDtls().getMtd().value()));

    }
}
