//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package com.iso.finxact.iso.xml.pacs002;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for PaymentTransaction110 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransaction110"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}ExternalPaymentTransactionStatus1Code" minOccurs="0"/&gt;
 *         &lt;element name="StsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}StatusReasonInformation12" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="ClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *         &lt;element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentTransaction110", propOrder = {
    "orgnlInstrId",
    "orgnlTxId",
    "txSts",
    "stsRsnInves",
    "accptncDtTm",
    "clrSysRef",
    "instgAgt",
    "instdAgt",
    "orgnlTxRef"
})
public class PaymentTransaction110
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlTxId")
    protected String orgnlTxId;
    @XmlElement(name = "TxSts")
    protected String txSts;
    @XmlElement(name = "StsRsnInf")
    protected List<StatusReasonInformation12> stsRsnInves;
    @XmlElement(name = "AccptncDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accptncDtTm;
    @XmlElement(name = "ClrSysRef")
    protected String clrSysRef;
    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification6 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification6 instdAgt;
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
     *     {@link String }
     *     
     */
    public String getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxSts(String value) {
        this.txSts = value;
    }

    /**
     * Gets the value of the stsRsnInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsnInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsnInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation12 }
     * 
     * 
     */
    public List<StatusReasonInformation12> getStsRsnInves() {
        if (stsRsnInves == null) {
            stsRsnInves = new ArrayList<StatusReasonInformation12>();
        }
        return this.stsRsnInves;
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
        if (!(object instanceof PaymentTransaction110)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentTransaction110 that = ((PaymentTransaction110) object);
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
            String lhsTxSts;
            lhsTxSts = this.getTxSts();
            String rhsTxSts;
            rhsTxSts = that.getTxSts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txSts", lhsTxSts), LocatorUtils.property(thatLocator, "txSts", rhsTxSts), lhsTxSts, rhsTxSts)) {
                return false;
            }
        }
        {
            List<StatusReasonInformation12> lhsStsRsnInves;
            lhsStsRsnInves = (((this.stsRsnInves!= null)&&(!this.stsRsnInves.isEmpty()))?this.getStsRsnInves():null);
            List<StatusReasonInformation12> rhsStsRsnInves;
            rhsStsRsnInves = (((that.stsRsnInves!= null)&&(!that.stsRsnInves.isEmpty()))?that.getStsRsnInves():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stsRsnInves", lhsStsRsnInves), LocatorUtils.property(thatLocator, "stsRsnInves", rhsStsRsnInves), lhsStsRsnInves, rhsStsRsnInves)) {
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
            String theTxSts;
            theTxSts = this.getTxSts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txSts", theTxSts), currentHashCode, theTxSts);
        }
        {
            List<StatusReasonInformation12> theStsRsnInves;
            theStsRsnInves = (((this.stsRsnInves!= null)&&(!this.stsRsnInves.isEmpty()))?this.getStsRsnInves():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stsRsnInves", theStsRsnInves), currentHashCode, theStsRsnInves);
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
            String theTxSts;
            theTxSts = this.getTxSts();
            strategy.appendField(locator, this, "txSts", buffer, theTxSts);
        }
        {
            List<StatusReasonInformation12> theStsRsnInves;
            theStsRsnInves = (((this.stsRsnInves!= null)&&(!this.stsRsnInves.isEmpty()))?this.getStsRsnInves():null);
            strategy.appendField(locator, this, "stsRsnInves", buffer, theStsRsnInves);
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
            OriginalTransactionReference28 theOrgnlTxRef;
            theOrgnlTxRef = this.getOrgnlTxRef();
            strategy.appendField(locator, this, "orgnlTxRef", buffer, theOrgnlTxRef);
        }
        return buffer;
    }

}
