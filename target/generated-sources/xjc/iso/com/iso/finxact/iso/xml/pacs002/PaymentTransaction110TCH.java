//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package com.iso.finxact.iso.xml.pacs002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for PaymentTransaction110_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransaction110_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Max35Text"/&gt;
 *         &lt;element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}ExternalPaymentTransactionStatus1Code_TCH"/&gt;
 *         &lt;element name="StsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}StatusReasonInformation12_TCH" minOccurs="0"/&gt;
 *         &lt;element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}ISODateTime"/&gt;
 *         &lt;element name="ClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}BranchAndFinancialInstitutionIdentification6_TCH"/&gt;
 *         &lt;element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}BranchAndFinancialInstitutionIdentification6_TCH"/&gt;
 *         &lt;element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}OriginalTransactionReference28" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction110_TCH", propOrder = {
    "orgnlInstrId",
    "orgnlTxId",
    "txSts",
    "stsRsnInf",
    "accptncDtTm",
    "clrSysRef",
    "instgAgt",
    "instdAgt",
    "orgnlTxRef"
})
public class PaymentTransaction110TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OrgnlInstrId", required = true)
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlTxId")
    protected String orgnlTxId;
    @XmlElement(name = "TxSts", required = true)
    @XmlSchemaType(name = "string")
    protected ExternalPaymentTransactionStatus1CodeTCH txSts;
    @XmlElement(name = "StsRsnInf")
    protected StatusReasonInformation12TCH stsRsnInf;
    @XmlElement(name = "AccptncDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accptncDtTm;
    @XmlElement(name = "ClrSysRef")
    protected String clrSysRef;
    @XmlElement(name = "InstgAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6TCH instgAgt;
    @XmlElement(name = "InstdAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6TCH instdAgt;
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference28 orgnlTxRef;

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the orgnlTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    /**
     * Sets the value of the orgnlTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlTxId(String value) {
        this.orgnlTxId = value;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPaymentTransactionStatus1CodeTCH }
     *     
     */
    public ExternalPaymentTransactionStatus1CodeTCH getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPaymentTransactionStatus1CodeTCH }
     *     
     */
    public void setTxSts(ExternalPaymentTransactionStatus1CodeTCH value) {
        this.txSts = value;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonInformation12TCH }
     *     
     */
    public StatusReasonInformation12TCH getStsRsnInf() {
        return stsRsnInf;
    }

    /**
     * Sets the value of the stsRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonInformation12TCH }
     *     
     */
    public void setStsRsnInf(StatusReasonInformation12TCH value) {
        this.stsRsnInf = value;
    }

    /**
     * Gets the value of the accptncDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Sets the value of the accptncDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccptncDtTm(XMLGregorianCalendar value) {
        this.accptncDtTm = value;
    }

    /**
     * Gets the value of the clrSysRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrSysRef() {
        return clrSysRef;
    }

    /**
     * Sets the value of the clrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrSysRef(String value) {
        this.clrSysRef = value;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6TCH }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6TCH getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6TCH }
     *     
     */
    public void setInstgAgt(BranchAndFinancialInstitutionIdentification6TCH value) {
        this.instgAgt = value;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6TCH }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6TCH getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6TCH }
     *     
     */
    public void setInstdAgt(BranchAndFinancialInstitutionIdentification6TCH value) {
        this.instdAgt = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference28 }
     *     
     */
    public OriginalTransactionReference28 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference28 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference28 value) {
        this.orgnlTxRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentTransaction110TCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentTransaction110TCH that = ((PaymentTransaction110TCH) object);
        {
            String lhsOrgnlInstrId;
            lhsOrgnlInstrId = this.getOrgnlInstrId();
            String rhsOrgnlInstrId;
            rhsOrgnlInstrId = that.getOrgnlInstrId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlInstrId", lhsOrgnlInstrId), LocatorUtils.property(thatLocator, "orgnlInstrId", rhsOrgnlInstrId), lhsOrgnlInstrId, rhsOrgnlInstrId)) {
                return false;
            }
        }
        {
            String lhsOrgnlTxId;
            lhsOrgnlTxId = this.getOrgnlTxId();
            String rhsOrgnlTxId;
            rhsOrgnlTxId = that.getOrgnlTxId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlTxId", lhsOrgnlTxId), LocatorUtils.property(thatLocator, "orgnlTxId", rhsOrgnlTxId), lhsOrgnlTxId, rhsOrgnlTxId)) {
                return false;
            }
        }
        {
            ExternalPaymentTransactionStatus1CodeTCH lhsTxSts;
            lhsTxSts = this.getTxSts();
            ExternalPaymentTransactionStatus1CodeTCH rhsTxSts;
            rhsTxSts = that.getTxSts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txSts", lhsTxSts), LocatorUtils.property(thatLocator, "txSts", rhsTxSts), lhsTxSts, rhsTxSts)) {
                return false;
            }
        }
        {
            StatusReasonInformation12TCH lhsStsRsnInf;
            lhsStsRsnInf = this.getStsRsnInf();
            StatusReasonInformation12TCH rhsStsRsnInf;
            rhsStsRsnInf = that.getStsRsnInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stsRsnInf", lhsStsRsnInf), LocatorUtils.property(thatLocator, "stsRsnInf", rhsStsRsnInf), lhsStsRsnInf, rhsStsRsnInf)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsAccptncDtTm;
            lhsAccptncDtTm = this.getAccptncDtTm();
            XMLGregorianCalendar rhsAccptncDtTm;
            rhsAccptncDtTm = that.getAccptncDtTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accptncDtTm", lhsAccptncDtTm), LocatorUtils.property(thatLocator, "accptncDtTm", rhsAccptncDtTm), lhsAccptncDtTm, rhsAccptncDtTm)) {
                return false;
            }
        }
        {
            String lhsClrSysRef;
            lhsClrSysRef = this.getClrSysRef();
            String rhsClrSysRef;
            rhsClrSysRef = that.getClrSysRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clrSysRef", lhsClrSysRef), LocatorUtils.property(thatLocator, "clrSysRef", rhsClrSysRef), lhsClrSysRef, rhsClrSysRef)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification6TCH lhsInstgAgt;
            lhsInstgAgt = this.getInstgAgt();
            BranchAndFinancialInstitutionIdentification6TCH rhsInstgAgt;
            rhsInstgAgt = that.getInstgAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instgAgt", lhsInstgAgt), LocatorUtils.property(thatLocator, "instgAgt", rhsInstgAgt), lhsInstgAgt, rhsInstgAgt)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification6TCH lhsInstdAgt;
            lhsInstdAgt = this.getInstdAgt();
            BranchAndFinancialInstitutionIdentification6TCH rhsInstdAgt;
            rhsInstdAgt = that.getInstdAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instdAgt", lhsInstdAgt), LocatorUtils.property(thatLocator, "instdAgt", rhsInstdAgt), lhsInstdAgt, rhsInstdAgt)) {
                return false;
            }
        }
        {
            OriginalTransactionReference28 lhsOrgnlTxRef;
            lhsOrgnlTxRef = this.getOrgnlTxRef();
            OriginalTransactionReference28 rhsOrgnlTxRef;
            rhsOrgnlTxRef = that.getOrgnlTxRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlTxRef", lhsOrgnlTxRef), LocatorUtils.property(thatLocator, "orgnlTxRef", rhsOrgnlTxRef), lhsOrgnlTxRef, rhsOrgnlTxRef)) {
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
            String theOrgnlInstrId;
            theOrgnlInstrId = this.getOrgnlInstrId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlInstrId", theOrgnlInstrId), currentHashCode, theOrgnlInstrId);
        }
        {
            String theOrgnlTxId;
            theOrgnlTxId = this.getOrgnlTxId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlTxId", theOrgnlTxId), currentHashCode, theOrgnlTxId);
        }
        {
            ExternalPaymentTransactionStatus1CodeTCH theTxSts;
            theTxSts = this.getTxSts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txSts", theTxSts), currentHashCode, theTxSts);
        }
        {
            StatusReasonInformation12TCH theStsRsnInf;
            theStsRsnInf = this.getStsRsnInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stsRsnInf", theStsRsnInf), currentHashCode, theStsRsnInf);
        }
        {
            XMLGregorianCalendar theAccptncDtTm;
            theAccptncDtTm = this.getAccptncDtTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accptncDtTm", theAccptncDtTm), currentHashCode, theAccptncDtTm);
        }
        {
            String theClrSysRef;
            theClrSysRef = this.getClrSysRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clrSysRef", theClrSysRef), currentHashCode, theClrSysRef);
        }
        {
            BranchAndFinancialInstitutionIdentification6TCH theInstgAgt;
            theInstgAgt = this.getInstgAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instgAgt", theInstgAgt), currentHashCode, theInstgAgt);
        }
        {
            BranchAndFinancialInstitutionIdentification6TCH theInstdAgt;
            theInstdAgt = this.getInstdAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instdAgt", theInstdAgt), currentHashCode, theInstdAgt);
        }
        {
            OriginalTransactionReference28 theOrgnlTxRef;
            theOrgnlTxRef = this.getOrgnlTxRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlTxRef", theOrgnlTxRef), currentHashCode, theOrgnlTxRef);
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
            String theOrgnlInstrId;
            theOrgnlInstrId = this.getOrgnlInstrId();
            strategy.appendField(locator, this, "orgnlInstrId", buffer, theOrgnlInstrId);
        }
        {
            String theOrgnlTxId;
            theOrgnlTxId = this.getOrgnlTxId();
            strategy.appendField(locator, this, "orgnlTxId", buffer, theOrgnlTxId);
        }
        {
            ExternalPaymentTransactionStatus1CodeTCH theTxSts;
            theTxSts = this.getTxSts();
            strategy.appendField(locator, this, "txSts", buffer, theTxSts);
        }
        {
            StatusReasonInformation12TCH theStsRsnInf;
            theStsRsnInf = this.getStsRsnInf();
            strategy.appendField(locator, this, "stsRsnInf", buffer, theStsRsnInf);
        }
        {
            XMLGregorianCalendar theAccptncDtTm;
            theAccptncDtTm = this.getAccptncDtTm();
            strategy.appendField(locator, this, "accptncDtTm", buffer, theAccptncDtTm);
        }
        {
            String theClrSysRef;
            theClrSysRef = this.getClrSysRef();
            strategy.appendField(locator, this, "clrSysRef", buffer, theClrSysRef);
        }
        {
            BranchAndFinancialInstitutionIdentification6TCH theInstgAgt;
            theInstgAgt = this.getInstgAgt();
            strategy.appendField(locator, this, "instgAgt", buffer, theInstgAgt);
        }
        {
            BranchAndFinancialInstitutionIdentification6TCH theInstdAgt;
            theInstdAgt = this.getInstdAgt();
            strategy.appendField(locator, this, "instdAgt", buffer, theInstdAgt);
        }
        {
            OriginalTransactionReference28 theOrgnlTxRef;
            theOrgnlTxRef = this.getOrgnlTxRef();
            strategy.appendField(locator, this, "orgnlTxRef", buffer, theOrgnlTxRef);
        }
        return buffer;
    }

}
