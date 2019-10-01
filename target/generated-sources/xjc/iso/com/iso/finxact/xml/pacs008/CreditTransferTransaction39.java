//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package com.iso.finxact.xml.pacs008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for CreditTransferTransaction39 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTransferTransaction39"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}PaymentIdentification7"/&gt;
 *         &lt;element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}PaymentTypeInformation28" minOccurs="0"/&gt;
 *         &lt;element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}ChargeBearerType1Code"/&gt;
 *         &lt;element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *         &lt;element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}PartyIdentification135"/&gt;
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}BranchAndFinancialInstitutionIdentification6"/&gt;
 *         &lt;element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}BranchAndFinancialInstitutionIdentification6"/&gt;
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}PartyIdentification135"/&gt;
 *         &lt;element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="InstrForCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}InstructionForCreditorAgent1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}RemittanceLocation5" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}RemittanceInformation16" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransaction39", propOrder = {
    "pmtId",
    "pmtTpInf",
    "intrBkSttlmAmt",
    "chrgBr",
    "instgAgt",
    "instdAgt",
    "ultmtDbtr",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "cdtrAgt",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "instrForCdtrAgts",
    "rltdRmtInves",
    "rmtInf"
})
public class CreditTransferTransaction39
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification7 pmtId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation28 pmtTpInf;
    @XmlElement(name = "IntrBkSttlmAmt", required = true)
    protected ActiveCurrencyAndAmount intrBkSttlmAmt;
    @XmlElement(name = "ChrgBr", required = true)
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification6 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification6 instdAgt;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification135 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "CdtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 cdtrAgt;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount38 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "InstrForCdtrAgt")
    protected List<InstructionForCreditorAgent1> instrForCdtrAgts;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation5> rltdRmtInves;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation16 rmtInf;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification7 }
     *     
     */
    public PaymentIdentification7 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification7 }
     *     
     */
    public void setPmtId(PaymentIdentification7 value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation28 }
     *     
     */
    public PaymentTypeInformation28 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation28 }
     *     
     */
    public void setPmtTpInf(PaymentTypeInformation28 value) {
        this.pmtTpInf = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIntrBkSttlmAmt(ActiveCurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstgAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instgAgt = value;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstdAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instdAgt = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification135 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setDbtr(PartyIdentification135 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setCdtr(PartyIdentification135 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setCdtrAcct(CashAccount38 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtCdtr(PartyIdentification135 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Gets the value of the instrForCdtrAgts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrForCdtrAgts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForCdtrAgts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForCreditorAgent1 }
     * 
     * 
     */
    public List<InstructionForCreditorAgent1> getInstrForCdtrAgts() {
        if (instrForCdtrAgts == null) {
            instrForCdtrAgts = new ArrayList<InstructionForCreditorAgent1>();
        }
        return this.instrForCdtrAgts;
    }

    /**
     * Gets the value of the rltdRmtInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRmtInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation5 }
     * 
     * 
     */
    public List<RemittanceLocation5> getRltdRmtInves() {
        if (rltdRmtInves == null) {
            rltdRmtInves = new ArrayList<RemittanceLocation5>();
        }
        return this.rltdRmtInves;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation16 }
     *     
     */
    public RemittanceInformation16 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation16 }
     *     
     */
    public void setRmtInf(RemittanceInformation16 value) {
        this.rmtInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreditTransferTransaction39)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditTransferTransaction39 that = ((CreditTransferTransaction39) object);
        {
            PaymentIdentification7 lhsPmtId;
            lhsPmtId = this.getPmtId();
            PaymentIdentification7 rhsPmtId;
            rhsPmtId = that.getPmtId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtId", lhsPmtId), LocatorUtils.property(thatLocator, "pmtId", rhsPmtId), lhsPmtId, rhsPmtId)) {
                return false;
            }
        }
        {
            PaymentTypeInformation28 lhsPmtTpInf;
            lhsPmtTpInf = this.getPmtTpInf();
            PaymentTypeInformation28 rhsPmtTpInf;
            rhsPmtTpInf = that.getPmtTpInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtTpInf", lhsPmtTpInf), LocatorUtils.property(thatLocator, "pmtTpInf", rhsPmtTpInf), lhsPmtTpInf, rhsPmtTpInf)) {
                return false;
            }
        }
        {
            ActiveCurrencyAndAmount lhsIntrBkSttlmAmt;
            lhsIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            ActiveCurrencyAndAmount rhsIntrBkSttlmAmt;
            rhsIntrBkSttlmAmt = that.getIntrBkSttlmAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intrBkSttlmAmt", lhsIntrBkSttlmAmt), LocatorUtils.property(thatLocator, "intrBkSttlmAmt", rhsIntrBkSttlmAmt), lhsIntrBkSttlmAmt, rhsIntrBkSttlmAmt)) {
                return false;
            }
        }
        {
            ChargeBearerType1Code lhsChrgBr;
            lhsChrgBr = this.getChrgBr();
            ChargeBearerType1Code rhsChrgBr;
            rhsChrgBr = that.getChrgBr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chrgBr", lhsChrgBr), LocatorUtils.property(thatLocator, "chrgBr", rhsChrgBr), lhsChrgBr, rhsChrgBr)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification6 lhsInstgAgt;
            lhsInstgAgt = this.getInstgAgt();
            BranchAndFinancialInstitutionIdentification6 rhsInstgAgt;
            rhsInstgAgt = that.getInstgAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instgAgt", lhsInstgAgt), LocatorUtils.property(thatLocator, "instgAgt", rhsInstgAgt), lhsInstgAgt, rhsInstgAgt)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification6 lhsInstdAgt;
            lhsInstdAgt = this.getInstdAgt();
            BranchAndFinancialInstitutionIdentification6 rhsInstdAgt;
            rhsInstdAgt = that.getInstdAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instdAgt", lhsInstdAgt), LocatorUtils.property(thatLocator, "instdAgt", rhsInstdAgt), lhsInstdAgt, rhsInstdAgt)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsUltmtDbtr;
            lhsUltmtDbtr = this.getUltmtDbtr();
            PartyIdentification135 rhsUltmtDbtr;
            rhsUltmtDbtr = that.getUltmtDbtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ultmtDbtr", lhsUltmtDbtr), LocatorUtils.property(thatLocator, "ultmtDbtr", rhsUltmtDbtr), lhsUltmtDbtr, rhsUltmtDbtr)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsDbtr;
            lhsDbtr = this.getDbtr();
            PartyIdentification135 rhsDbtr;
            rhsDbtr = that.getDbtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbtr", lhsDbtr), LocatorUtils.property(thatLocator, "dbtr", rhsDbtr), lhsDbtr, rhsDbtr)) {
                return false;
            }
        }
        {
            CashAccount38 lhsDbtrAcct;
            lhsDbtrAcct = this.getDbtrAcct();
            CashAccount38 rhsDbtrAcct;
            rhsDbtrAcct = that.getDbtrAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbtrAcct", lhsDbtrAcct), LocatorUtils.property(thatLocator, "dbtrAcct", rhsDbtrAcct), lhsDbtrAcct, rhsDbtrAcct)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification6 lhsDbtrAgt;
            lhsDbtrAgt = this.getDbtrAgt();
            BranchAndFinancialInstitutionIdentification6 rhsDbtrAgt;
            rhsDbtrAgt = that.getDbtrAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbtrAgt", lhsDbtrAgt), LocatorUtils.property(thatLocator, "dbtrAgt", rhsDbtrAgt), lhsDbtrAgt, rhsDbtrAgt)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification6 lhsCdtrAgt;
            lhsCdtrAgt = this.getCdtrAgt();
            BranchAndFinancialInstitutionIdentification6 rhsCdtrAgt;
            rhsCdtrAgt = that.getCdtrAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtrAgt", lhsCdtrAgt), LocatorUtils.property(thatLocator, "cdtrAgt", rhsCdtrAgt), lhsCdtrAgt, rhsCdtrAgt)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsCdtr;
            lhsCdtr = this.getCdtr();
            PartyIdentification135 rhsCdtr;
            rhsCdtr = that.getCdtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtr", lhsCdtr), LocatorUtils.property(thatLocator, "cdtr", rhsCdtr), lhsCdtr, rhsCdtr)) {
                return false;
            }
        }
        {
            CashAccount38 lhsCdtrAcct;
            lhsCdtrAcct = this.getCdtrAcct();
            CashAccount38 rhsCdtrAcct;
            rhsCdtrAcct = that.getCdtrAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtrAcct", lhsCdtrAcct), LocatorUtils.property(thatLocator, "cdtrAcct", rhsCdtrAcct), lhsCdtrAcct, rhsCdtrAcct)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsUltmtCdtr;
            lhsUltmtCdtr = this.getUltmtCdtr();
            PartyIdentification135 rhsUltmtCdtr;
            rhsUltmtCdtr = that.getUltmtCdtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ultmtCdtr", lhsUltmtCdtr), LocatorUtils.property(thatLocator, "ultmtCdtr", rhsUltmtCdtr), lhsUltmtCdtr, rhsUltmtCdtr)) {
                return false;
            }
        }
        {
            List<InstructionForCreditorAgent1> lhsInstrForCdtrAgts;
            lhsInstrForCdtrAgts = (((this.instrForCdtrAgts!= null)&&(!this.instrForCdtrAgts.isEmpty()))?this.getInstrForCdtrAgts():null);
            List<InstructionForCreditorAgent1> rhsInstrForCdtrAgts;
            rhsInstrForCdtrAgts = (((that.instrForCdtrAgts!= null)&&(!that.instrForCdtrAgts.isEmpty()))?that.getInstrForCdtrAgts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrForCdtrAgts", lhsInstrForCdtrAgts), LocatorUtils.property(thatLocator, "instrForCdtrAgts", rhsInstrForCdtrAgts), lhsInstrForCdtrAgts, rhsInstrForCdtrAgts)) {
                return false;
            }
        }
        {
            List<RemittanceLocation5> lhsRltdRmtInves;
            lhsRltdRmtInves = (((this.rltdRmtInves!= null)&&(!this.rltdRmtInves.isEmpty()))?this.getRltdRmtInves():null);
            List<RemittanceLocation5> rhsRltdRmtInves;
            rhsRltdRmtInves = (((that.rltdRmtInves!= null)&&(!that.rltdRmtInves.isEmpty()))?that.getRltdRmtInves():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rltdRmtInves", lhsRltdRmtInves), LocatorUtils.property(thatLocator, "rltdRmtInves", rhsRltdRmtInves), lhsRltdRmtInves, rhsRltdRmtInves)) {
                return false;
            }
        }
        {
            RemittanceInformation16 lhsRmtInf;
            lhsRmtInf = this.getRmtInf();
            RemittanceInformation16 rhsRmtInf;
            rhsRmtInf = that.getRmtInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rmtInf", lhsRmtInf), LocatorUtils.property(thatLocator, "rmtInf", rhsRmtInf), lhsRmtInf, rhsRmtInf)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            PaymentIdentification7 thePmtId;
            thePmtId = this.getPmtId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtId", thePmtId), currentHashCode, thePmtId);
        }
        {
            PaymentTypeInformation28 thePmtTpInf;
            thePmtTpInf = this.getPmtTpInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtTpInf", thePmtTpInf), currentHashCode, thePmtTpInf);
        }
        {
            ActiveCurrencyAndAmount theIntrBkSttlmAmt;
            theIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intrBkSttlmAmt", theIntrBkSttlmAmt), currentHashCode, theIntrBkSttlmAmt);
        }
        {
            ChargeBearerType1Code theChrgBr;
            theChrgBr = this.getChrgBr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chrgBr", theChrgBr), currentHashCode, theChrgBr);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theInstgAgt;
            theInstgAgt = this.getInstgAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instgAgt", theInstgAgt), currentHashCode, theInstgAgt);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theInstdAgt;
            theInstdAgt = this.getInstdAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instdAgt", theInstdAgt), currentHashCode, theInstdAgt);
        }
        {
            PartyIdentification135 theUltmtDbtr;
            theUltmtDbtr = this.getUltmtDbtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ultmtDbtr", theUltmtDbtr), currentHashCode, theUltmtDbtr);
        }
        {
            PartyIdentification135 theDbtr;
            theDbtr = this.getDbtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtr", theDbtr), currentHashCode, theDbtr);
        }
        {
            CashAccount38 theDbtrAcct;
            theDbtrAcct = this.getDbtrAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtrAcct", theDbtrAcct), currentHashCode, theDbtrAcct);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theDbtrAgt;
            theDbtrAgt = this.getDbtrAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtrAgt", theDbtrAgt), currentHashCode, theDbtrAgt);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theCdtrAgt;
            theCdtrAgt = this.getCdtrAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtrAgt", theCdtrAgt), currentHashCode, theCdtrAgt);
        }
        {
            PartyIdentification135 theCdtr;
            theCdtr = this.getCdtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtr", theCdtr), currentHashCode, theCdtr);
        }
        {
            CashAccount38 theCdtrAcct;
            theCdtrAcct = this.getCdtrAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtrAcct", theCdtrAcct), currentHashCode, theCdtrAcct);
        }
        {
            PartyIdentification135 theUltmtCdtr;
            theUltmtCdtr = this.getUltmtCdtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ultmtCdtr", theUltmtCdtr), currentHashCode, theUltmtCdtr);
        }
        {
            List<InstructionForCreditorAgent1> theInstrForCdtrAgts;
            theInstrForCdtrAgts = (((this.instrForCdtrAgts!= null)&&(!this.instrForCdtrAgts.isEmpty()))?this.getInstrForCdtrAgts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrForCdtrAgts", theInstrForCdtrAgts), currentHashCode, theInstrForCdtrAgts);
        }
        {
            List<RemittanceLocation5> theRltdRmtInves;
            theRltdRmtInves = (((this.rltdRmtInves!= null)&&(!this.rltdRmtInves.isEmpty()))?this.getRltdRmtInves():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rltdRmtInves", theRltdRmtInves), currentHashCode, theRltdRmtInves);
        }
        {
            RemittanceInformation16 theRmtInf;
            theRmtInf = this.getRmtInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rmtInf", theRmtInf), currentHashCode, theRmtInf);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            PaymentIdentification7 thePmtId;
            thePmtId = this.getPmtId();
            strategy.appendField(locator, this, "pmtId", buffer, thePmtId);
        }
        {
            PaymentTypeInformation28 thePmtTpInf;
            thePmtTpInf = this.getPmtTpInf();
            strategy.appendField(locator, this, "pmtTpInf", buffer, thePmtTpInf);
        }
        {
            ActiveCurrencyAndAmount theIntrBkSttlmAmt;
            theIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            strategy.appendField(locator, this, "intrBkSttlmAmt", buffer, theIntrBkSttlmAmt);
        }
        {
            ChargeBearerType1Code theChrgBr;
            theChrgBr = this.getChrgBr();
            strategy.appendField(locator, this, "chrgBr", buffer, theChrgBr);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theInstgAgt;
            theInstgAgt = this.getInstgAgt();
            strategy.appendField(locator, this, "instgAgt", buffer, theInstgAgt);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theInstdAgt;
            theInstdAgt = this.getInstdAgt();
            strategy.appendField(locator, this, "instdAgt", buffer, theInstdAgt);
        }
        {
            PartyIdentification135 theUltmtDbtr;
            theUltmtDbtr = this.getUltmtDbtr();
            strategy.appendField(locator, this, "ultmtDbtr", buffer, theUltmtDbtr);
        }
        {
            PartyIdentification135 theDbtr;
            theDbtr = this.getDbtr();
            strategy.appendField(locator, this, "dbtr", buffer, theDbtr);
        }
        {
            CashAccount38 theDbtrAcct;
            theDbtrAcct = this.getDbtrAcct();
            strategy.appendField(locator, this, "dbtrAcct", buffer, theDbtrAcct);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theDbtrAgt;
            theDbtrAgt = this.getDbtrAgt();
            strategy.appendField(locator, this, "dbtrAgt", buffer, theDbtrAgt);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theCdtrAgt;
            theCdtrAgt = this.getCdtrAgt();
            strategy.appendField(locator, this, "cdtrAgt", buffer, theCdtrAgt);
        }
        {
            PartyIdentification135 theCdtr;
            theCdtr = this.getCdtr();
            strategy.appendField(locator, this, "cdtr", buffer, theCdtr);
        }
        {
            CashAccount38 theCdtrAcct;
            theCdtrAcct = this.getCdtrAcct();
            strategy.appendField(locator, this, "cdtrAcct", buffer, theCdtrAcct);
        }
        {
            PartyIdentification135 theUltmtCdtr;
            theUltmtCdtr = this.getUltmtCdtr();
            strategy.appendField(locator, this, "ultmtCdtr", buffer, theUltmtCdtr);
        }
        {
            List<InstructionForCreditorAgent1> theInstrForCdtrAgts;
            theInstrForCdtrAgts = (((this.instrForCdtrAgts!= null)&&(!this.instrForCdtrAgts.isEmpty()))?this.getInstrForCdtrAgts():null);
            strategy.appendField(locator, this, "instrForCdtrAgts", buffer, theInstrForCdtrAgts);
        }
        {
            List<RemittanceLocation5> theRltdRmtInves;
            theRltdRmtInves = (((this.rltdRmtInves!= null)&&(!this.rltdRmtInves.isEmpty()))?this.getRltdRmtInves():null);
            strategy.appendField(locator, this, "rltdRmtInves", buffer, theRltdRmtInves);
        }
        {
            RemittanceInformation16 theRmtInf;
            theRmtInf = this.getRmtInf();
            strategy.appendField(locator, this, "rmtInf", buffer, theRmtInf);
        }
        return buffer;
    }

}