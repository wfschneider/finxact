//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.remt_001_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for StructuredRemittanceInformation16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredRemittanceInformation16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfrdDocInf" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}ReferredDocumentInformation7" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}RemittanceAmount2" minOccurs="0"/&gt;
 *         &lt;element name="CdtrRefInf" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}CreditorReferenceInformation2" minOccurs="0"/&gt;
 *         &lt;element name="Invcr" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="Invcee" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="TaxRmt" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}TaxInformation7" minOccurs="0"/&gt;
 *         &lt;element name="GrnshmtRmt" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Garnishment3" minOccurs="0"/&gt;
 *         &lt;element name="AddtlRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Max140Text" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation16", propOrder = {
    "rfrdDocInves",
    "rfrdDocAmt",
    "cdtrRefInf",
    "invcr",
    "invcee",
    "taxRmt",
    "grnshmtRmt",
    "addtlRmtInves"
})
public class StructuredRemittanceInformation16
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "RfrdDocInf")
    protected List<ReferredDocumentInformation7> rfrdDocInves;
    @XmlElement(name = "RfrdDocAmt")
    protected RemittanceAmount2 rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformation2 cdtrRefInf;
    @XmlElement(name = "Invcr")
    protected PartyIdentification135 invcr;
    @XmlElement(name = "Invcee")
    protected PartyIdentification135 invcee;
    @XmlElement(name = "TaxRmt")
    protected TaxInformation7 taxRmt;
    @XmlElement(name = "GrnshmtRmt")
    protected Garnishment3 grnshmtRmt;
    @XmlElement(name = "AddtlRmtInf")
    protected List<String> addtlRmtInves;

    /**
     * Gets the value of the rfrdDocInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDocInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDocInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation7 }
     * 
     * 
     */
    public List<ReferredDocumentInformation7> getRfrdDocInves() {
        if (rfrdDocInves == null) {
            rfrdDocInves = new ArrayList<ReferredDocumentInformation7>();
        }
        return this.rfrdDocInves;
    }

    /**
     * Gets the value of the rfrdDocAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAmount2 }
     *     
     */
    public RemittanceAmount2 getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    /**
     * Sets the value of the rfrdDocAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount2 }
     *     
     */
    public void setRfrdDocAmt(RemittanceAmount2 value) {
        this.rfrdDocAmt = value;
    }

    /**
     * Gets the value of the cdtrRefInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public CreditorReferenceInformation2 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * Sets the value of the cdtrRefInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public void setCdtrRefInf(CreditorReferenceInformation2 value) {
        this.cdtrRefInf = value;
    }

    /**
     * Gets the value of the invcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInvcr() {
        return invcr;
    }

    /**
     * Sets the value of the invcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setInvcr(PartyIdentification135 value) {
        this.invcr = value;
    }

    /**
     * Gets the value of the invcee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInvcee() {
        return invcee;
    }

    /**
     * Sets the value of the invcee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setInvcee(PartyIdentification135 value) {
        this.invcee = value;
    }

    /**
     * Gets the value of the taxRmt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInformation7 }
     *     
     */
    public TaxInformation7 getTaxRmt() {
        return taxRmt;
    }

    /**
     * Sets the value of the taxRmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInformation7 }
     *     
     */
    public void setTaxRmt(TaxInformation7 value) {
        this.taxRmt = value;
    }

    /**
     * Gets the value of the grnshmtRmt property.
     * 
     * @return
     *     possible object is
     *     {@link Garnishment3 }
     *     
     */
    public Garnishment3 getGrnshmtRmt() {
        return grnshmtRmt;
    }

    /**
     * Sets the value of the grnshmtRmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Garnishment3 }
     *     
     */
    public void setGrnshmtRmt(Garnishment3 value) {
        this.grnshmtRmt = value;
    }

    /**
     * Gets the value of the addtlRmtInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRmtInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRmtInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlRmtInves() {
        if (addtlRmtInves == null) {
            addtlRmtInves = new ArrayList<String>();
        }
        return this.addtlRmtInves;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StructuredRemittanceInformation16)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StructuredRemittanceInformation16 that = ((StructuredRemittanceInformation16) object);
        {
            List<ReferredDocumentInformation7> lhsRfrdDocInves;
            lhsRfrdDocInves = (((this.rfrdDocInves!= null)&&(!this.rfrdDocInves.isEmpty()))?this.getRfrdDocInves():null);
            List<ReferredDocumentInformation7> rhsRfrdDocInves;
            rhsRfrdDocInves = (((that.rfrdDocInves!= null)&&(!that.rfrdDocInves.isEmpty()))?that.getRfrdDocInves():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rfrdDocInves", lhsRfrdDocInves), LocatorUtils.property(thatLocator, "rfrdDocInves", rhsRfrdDocInves), lhsRfrdDocInves, rhsRfrdDocInves)) {
                return false;
            }
        }
        {
            RemittanceAmount2 lhsRfrdDocAmt;
            lhsRfrdDocAmt = this.getRfrdDocAmt();
            RemittanceAmount2 rhsRfrdDocAmt;
            rhsRfrdDocAmt = that.getRfrdDocAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rfrdDocAmt", lhsRfrdDocAmt), LocatorUtils.property(thatLocator, "rfrdDocAmt", rhsRfrdDocAmt), lhsRfrdDocAmt, rhsRfrdDocAmt)) {
                return false;
            }
        }
        {
            CreditorReferenceInformation2 lhsCdtrRefInf;
            lhsCdtrRefInf = this.getCdtrRefInf();
            CreditorReferenceInformation2 rhsCdtrRefInf;
            rhsCdtrRefInf = that.getCdtrRefInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtrRefInf", lhsCdtrRefInf), LocatorUtils.property(thatLocator, "cdtrRefInf", rhsCdtrRefInf), lhsCdtrRefInf, rhsCdtrRefInf)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsInvcr;
            lhsInvcr = this.getInvcr();
            PartyIdentification135 rhsInvcr;
            rhsInvcr = that.getInvcr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invcr", lhsInvcr), LocatorUtils.property(thatLocator, "invcr", rhsInvcr), lhsInvcr, rhsInvcr)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsInvcee;
            lhsInvcee = this.getInvcee();
            PartyIdentification135 rhsInvcee;
            rhsInvcee = that.getInvcee();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invcee", lhsInvcee), LocatorUtils.property(thatLocator, "invcee", rhsInvcee), lhsInvcee, rhsInvcee)) {
                return false;
            }
        }
        {
            TaxInformation7 lhsTaxRmt;
            lhsTaxRmt = this.getTaxRmt();
            TaxInformation7 rhsTaxRmt;
            rhsTaxRmt = that.getTaxRmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRmt", lhsTaxRmt), LocatorUtils.property(thatLocator, "taxRmt", rhsTaxRmt), lhsTaxRmt, rhsTaxRmt)) {
                return false;
            }
        }
        {
            Garnishment3 lhsGrnshmtRmt;
            lhsGrnshmtRmt = this.getGrnshmtRmt();
            Garnishment3 rhsGrnshmtRmt;
            rhsGrnshmtRmt = that.getGrnshmtRmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grnshmtRmt", lhsGrnshmtRmt), LocatorUtils.property(thatLocator, "grnshmtRmt", rhsGrnshmtRmt), lhsGrnshmtRmt, rhsGrnshmtRmt)) {
                return false;
            }
        }
        {
            List<String> lhsAddtlRmtInves;
            lhsAddtlRmtInves = (((this.addtlRmtInves!= null)&&(!this.addtlRmtInves.isEmpty()))?this.getAddtlRmtInves():null);
            List<String> rhsAddtlRmtInves;
            rhsAddtlRmtInves = (((that.addtlRmtInves!= null)&&(!that.addtlRmtInves.isEmpty()))?that.getAddtlRmtInves():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addtlRmtInves", lhsAddtlRmtInves), LocatorUtils.property(thatLocator, "addtlRmtInves", rhsAddtlRmtInves), lhsAddtlRmtInves, rhsAddtlRmtInves)) {
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
            List<ReferredDocumentInformation7> theRfrdDocInves;
            theRfrdDocInves = (((this.rfrdDocInves!= null)&&(!this.rfrdDocInves.isEmpty()))?this.getRfrdDocInves():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rfrdDocInves", theRfrdDocInves), currentHashCode, theRfrdDocInves);
        }
        {
            RemittanceAmount2 theRfrdDocAmt;
            theRfrdDocAmt = this.getRfrdDocAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rfrdDocAmt", theRfrdDocAmt), currentHashCode, theRfrdDocAmt);
        }
        {
            CreditorReferenceInformation2 theCdtrRefInf;
            theCdtrRefInf = this.getCdtrRefInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtrRefInf", theCdtrRefInf), currentHashCode, theCdtrRefInf);
        }
        {
            PartyIdentification135 theInvcr;
            theInvcr = this.getInvcr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invcr", theInvcr), currentHashCode, theInvcr);
        }
        {
            PartyIdentification135 theInvcee;
            theInvcee = this.getInvcee();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invcee", theInvcee), currentHashCode, theInvcee);
        }
        {
            TaxInformation7 theTaxRmt;
            theTaxRmt = this.getTaxRmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRmt", theTaxRmt), currentHashCode, theTaxRmt);
        }
        {
            Garnishment3 theGrnshmtRmt;
            theGrnshmtRmt = this.getGrnshmtRmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grnshmtRmt", theGrnshmtRmt), currentHashCode, theGrnshmtRmt);
        }
        {
            List<String> theAddtlRmtInves;
            theAddtlRmtInves = (((this.addtlRmtInves!= null)&&(!this.addtlRmtInves.isEmpty()))?this.getAddtlRmtInves():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addtlRmtInves", theAddtlRmtInves), currentHashCode, theAddtlRmtInves);
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
            List<ReferredDocumentInformation7> theRfrdDocInves;
            theRfrdDocInves = (((this.rfrdDocInves!= null)&&(!this.rfrdDocInves.isEmpty()))?this.getRfrdDocInves():null);
            strategy.appendField(locator, this, "rfrdDocInves", buffer, theRfrdDocInves);
        }
        {
            RemittanceAmount2 theRfrdDocAmt;
            theRfrdDocAmt = this.getRfrdDocAmt();
            strategy.appendField(locator, this, "rfrdDocAmt", buffer, theRfrdDocAmt);
        }
        {
            CreditorReferenceInformation2 theCdtrRefInf;
            theCdtrRefInf = this.getCdtrRefInf();
            strategy.appendField(locator, this, "cdtrRefInf", buffer, theCdtrRefInf);
        }
        {
            PartyIdentification135 theInvcr;
            theInvcr = this.getInvcr();
            strategy.appendField(locator, this, "invcr", buffer, theInvcr);
        }
        {
            PartyIdentification135 theInvcee;
            theInvcee = this.getInvcee();
            strategy.appendField(locator, this, "invcee", buffer, theInvcee);
        }
        {
            TaxInformation7 theTaxRmt;
            theTaxRmt = this.getTaxRmt();
            strategy.appendField(locator, this, "taxRmt", buffer, theTaxRmt);
        }
        {
            Garnishment3 theGrnshmtRmt;
            theGrnshmtRmt = this.getGrnshmtRmt();
            strategy.appendField(locator, this, "grnshmtRmt", buffer, theGrnshmtRmt);
        }
        {
            List<String> theAddtlRmtInves;
            theAddtlRmtInves = (((this.addtlRmtInves!= null)&&(!this.addtlRmtInves.isEmpty()))?this.getAddtlRmtInves():null);
            strategy.appendField(locator, this, "addtlRmtInves", buffer, theAddtlRmtInves);
        }
        return buffer;
    }

}
