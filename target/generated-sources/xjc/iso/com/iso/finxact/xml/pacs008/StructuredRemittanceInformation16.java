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
 *         &lt;element name="RfrdDocInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}ReferredDocumentInformation7" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}RemittanceAmount2" minOccurs="0"/&gt;
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
    "rfrdDocAmt"
})
public class StructuredRemittanceInformation16
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "RfrdDocInf")
    protected List<ReferredDocumentInformation7> rfrdDocInves;
    @XmlElement(name = "RfrdDocAmt")
    protected RemittanceAmount2 rfrdDocAmt;

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
        return buffer;
    }

}
