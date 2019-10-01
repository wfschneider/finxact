import com.finxact.model.Order;
import com.iso.finxact.iso.xml.pacs002.*;
import com.iso.finxact.iso.xml.pacs002.ClearingSystemMemberIdentification2;
import com.iso.finxact.xml.msg.Message;
import iso.std.iso._20022.tech.xsd.head_001_001.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

public class PacsGenerator {
/*    public static void main(String[] args) {


        Message message = new Message();

        BusinessApplicationHeaderV01TCH applicationHeaderV01TCH = new BusinessApplicationHeaderV01TCH();
        DocumentTCH  documentTCH = new DocumentTCH();


        message.setAppHdr(applicationHeaderV01TCH);
        message.setCreditTransfer(documentTCH);
        jaxbObjectToXML( message);

    }*/

    public static Message createPacs002(Order order, Date dt) {
        Message message = new Message();
        com.iso.finxact.iso.xml.pacs002.DocumentTCH documentTCH = new com.iso.finxact.iso.xml.pacs002.DocumentTCH();

        FIToFIPaymentStatusReportV10DRAFTTCH report = new FIToFIPaymentStatusReportV10DRAFTTCH();


        setOriginalGroupInfoAndSts(order, report);

        setGroupHeader(order, report);

        setPaymentTransaction(order, report,dt);

        documentTCH.setFIToFIPmtStsRpt(report);

        createAppHeader(order, message);


        message.setMessageStatusReport(documentTCH);
        return message;
    }

    private static void createAppHeader(Order order, Message message)  {
        BusinessApplicationHeaderV01TCH applicationHeaderV01TCH = new BusinessApplicationHeaderV01TCH();
        Party9ChoiceTCH party9ChoiceTCH = new Party9ChoiceTCH();
        BranchAndFinancialInstitutionIdentification5TCH branchAndFinancialInstitutionIdentification5TCH = new BranchAndFinancialInstitutionIdentification5TCH();
        FinancialInstitutionIdentification8TCH financialInstitutionIdentification8TCH = new FinancialInstitutionIdentification8TCH();
        iso.std.iso._20022.tech.xsd.head_001_001.ClearingSystemMemberIdentification2 clearingSystemMemberIdentification2 = new iso.std.iso._20022.tech.xsd.head_001_001.ClearingSystemMemberIdentification2();
        clearingSystemMemberIdentification2.setMmbId(order.getOriginator().getFinInst().getFinInstBic());
        financialInstitutionIdentification8TCH.setClrSysMmbId(clearingSystemMemberIdentification2);
        branchAndFinancialInstitutionIdentification5TCH.setFinInstnId(financialInstitutionIdentification8TCH);
        party9ChoiceTCH.setFIId(branchAndFinancialInstitutionIdentification5TCH);
        BranchData2TCH branchData2TCH = new BranchData2TCH();
        branchData2TCH.setId(Pacs008ToTranOrderTransformer.nullGuard(() -> order.getOriginator().getAcctBranch()));
        branchAndFinancialInstitutionIdentification5TCH.setBrnchId(branchData2TCH);

        Party9ChoiceTCH2 To = new Party9ChoiceTCH2();
        BranchAndFinancialInstitutionIdentification5TCH2 branch = new BranchAndFinancialInstitutionIdentification5TCH2();
        FinancialInstitutionIdentification8TCH fin = new FinancialInstitutionIdentification8TCH();
        iso.std.iso._20022.tech.xsd.head_001_001.ClearingSystemMemberIdentification2 clearingS = new iso.std.iso._20022.tech.xsd.head_001_001.ClearingSystemMemberIdentification2();
        clearingS.setMmbId(order.getIntermedFi().getFinInstBic());
        fin.setClrSysMmbId(clearingS);
        branch.setFinInstnId(fin);
        BranchData2 branchData = new BranchData2();
        branchData.setId(Pacs008ToTranOrderTransformer.nullGuard(() -> order.getCounterParty().getAcctBranch()));
        branch.setBrnchId(branchData);
        To.setFIId(branch);
        applicationHeaderV01TCH.setTo(To);
        applicationHeaderV01TCH.setFr(party9ChoiceTCH);
        applicationHeaderV01TCH.setBizMsgIdr("BYYYYMMDDbbbbbbbbbbbGAAAnnnnnnnnnnn" + Pacs008ToTranOrderTransformer.nullGuard(() -> order.getOriginator().getOtherProperties().getAdditionalProperties().get("orderBizIdr")));
        OrigMsgName origMsgName = null;

        applicationHeaderV01TCH.setMsgDefIdr(origMsgName);
        GregorianCalendar gc4 = new GregorianCalendar();
        gc4.setTime(order.getCreateDtm());
        try {
            applicationHeaderV01TCH.setCreDt(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc4));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        applicationHeaderV01TCH.setCpyDplct(CopyDuplicate1CodeTCH.fromValue("COPY"));
        // applicationHeaderV01TCH.setCpyDplct(order.getOriginator().getExtRef().getAdditionalProperties().get("orderCpyDplct").getName());
        SignatureEnvelope signatureEnvelope = new SignatureEnvelope();
      // signatureEnvelope.setAny(new El);
        applicationHeaderV01TCH.setSgntr(signatureEnvelope);
        message.setAppHdr(applicationHeaderV01TCH);
    }

    private static void setGroupHeader(Order order, FIToFIPaymentStatusReportV10DRAFTTCH report) {
        GroupHeader91TCH groupHeader91TCH = new GroupHeader91TCH();
        order.setOrderDtm(new Date());
        GregorianCalendar gc0 = new GregorianCalendar();
        gc0.setTime(order.getOrderDtm());
        try {
            groupHeader91TCH.setCreDtTm(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc0));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        groupHeader91TCH.setMsgId("MYYYYMMDDbbbbbbbbbbbBAAAnnnnnnnnnnn");
        report.setGrpHdr(groupHeader91TCH);
    }

    private static void setPaymentTransaction(Order order, FIToFIPaymentStatusReportV10DRAFTTCH report, Date date_send) {
        PaymentTransaction110TCH paymentTransaction110TCH = new PaymentTransaction110TCH();
        paymentTransaction110TCH.setOrgnlInstrId(order.getOtherProperties().getAdditionalProperties().get("InstrId").toString());
        paymentTransaction110TCH.setOrgnlTxId(order.getOtherProperties().getAdditionalProperties().get("trnId").toString());
        paymentTransaction110TCH.setTxSts(ExternalPaymentTransactionStatus1CodeTCH.fromValue("ACTC"));
        StatusReasonInformation12TCH statusReasonInformation12TCH = new StatusReasonInformation12TCH();
        StatusReason6ChoiceTCH statusReason6ChoiceTCH = new StatusReason6ChoiceTCH();
        statusReason6ChoiceTCH.setCd(ExternalStatusReason1Code.fromValue("AC02"));
        statusReason6ChoiceTCH.setPrtry("Not Sure");
        statusReasonInformation12TCH.setRsn(statusReason6ChoiceTCH);
        statusReasonInformation12TCH.setAddtlInf("Additional Info˜");
        paymentTransaction110TCH.setStsRsnInf(statusReasonInformation12TCH);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(order.getVerifyDtm());
        try {
            paymentTransaction110TCH.setAccptncDtTm(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        paymentTransaction110TCH.setClrSysRef(order.getOtherProperties().getAdditionalProperties().get("ClrSysRef").toString());

        BranchAndFinancialInstitutionIdentification6TCH instdAgt = new BranchAndFinancialInstitutionIdentification6TCH();

        FinancialInstitutionIdentification16TCH financialInstitutionIdentification16TCH = new FinancialInstitutionIdentification16TCH();
        ClearingSystemMemberIdentification2 clearingSystemMemberIdentification2 = new ClearingSystemMemberIdentification2();
        clearingSystemMemberIdentification2.setMmbId(order.getOriginator().getFinInst().getFinInstAba());
        financialInstitutionIdentification16TCH.setClrSysMmbId(clearingSystemMemberIdentification2);
        instdAgt.setFinInstnId(financialInstitutionIdentification16TCH);
        paymentTransaction110TCH.setInstdAgt(instdAgt);

        FinancialInstitutionIdentification16TCH financialInstitutionIdentification16TCH1 = new FinancialInstitutionIdentification16TCH();
        ClearingSystemMemberIdentification2 clearingSystemMemberIdentification21 = new ClearingSystemMemberIdentification2();
        clearingSystemMemberIdentification21.setMmbId(order.getCounterParty().getFinInst().getFinInstAba());
        financialInstitutionIdentification16TCH1.setClrSysMmbId(clearingSystemMemberIdentification21);
        instdAgt.setFinInstnId(financialInstitutionIdentification16TCH1);
        paymentTransaction110TCH.setInstdAgt(instdAgt);
        OriginalTransactionReference28 originalTransactionReference28 = new OriginalTransactionReference28();
        ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount = new ActiveOrHistoricCurrencyAndAmount();
        originalTransactionReference28.setIntrBkSttlmAmt(activeOrHistoricCurrencyAndAmount);
        activeOrHistoricCurrencyAndAmount.setValue(new BigDecimal(order.getBeneNetAmt()));
        activeOrHistoricCurrencyAndAmount.setCcy(ActiveOrHistoricCurrencyCode.USD);
        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.setTime(date_send);
        try {
            originalTransactionReference28.setIntrBkSttlmDt(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc1));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        paymentTransaction110TCH.setOrgnlTxRef(originalTransactionReference28);
        report.setTxInfAndSts(paymentTransaction110TCH);

    }

    private static void setOriginalGroupInfoAndSts(Order order, FIToFIPaymentStatusReportV10DRAFTTCH report) {
        OriginalGroupHeader17TCH originalGroupHeader17TCH = new OriginalGroupHeader17TCH();
        originalGroupHeader17TCH.setOrgnlMsgId(order.getOriginator().getRef());
        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(order.getCreateDtm());
        try {
            originalGroupHeader17TCH.setOrgnlCreDtTm(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        originalGroupHeader17TCH.setOrgnlMsgNmId(OrigMsgName2019TCH.fromValue(Pacs008ToTranOrderTransformer.nullGuard(() -> order.getOtherProperties().getAdditionalProperties().get("orderDefnIdr").toString())));
        originalGroupHeader17TCH.setOrgnlNbOfTxs("1");
        report.setOrgnlGrpInfAndSts(originalGroupHeader17TCH);
    }

    public static void jaxbObjectToXML(String filename, Message message) {
        try {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(Message.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            //jaxbMarshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION);

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(message, sw);

            //Verify XML Content
            String xmlContent = sw.toString();
            writeToFile(filename, xmlContent);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public static void writeToFile(String filename, String text) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(text);


            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static Message jaxbXmlFileToObject(String fileName) {

        File xmlFile = new File(fileName);
        Message message = null;
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Message.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            message = (Message) jaxbUnmarshaller.unmarshal(xmlFile);

            System.out.println(message);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return message;
    }



}
