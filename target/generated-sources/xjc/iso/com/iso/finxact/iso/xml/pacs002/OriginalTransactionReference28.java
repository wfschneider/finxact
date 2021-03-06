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
 * <p>Java class for OriginalTransactionReference28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalTransactionReference28"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}ISODate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransactionReference28", propOrder = {
    "intrBkSttlmAmt",
    "intrBkSttlmDt"
})
public class OriginalTransactionReference28
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "IntrBkSttlmAmt")
    protected ActiveOrHistoricCurrencyAndAmount intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setIntrBkSttlmAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OriginalTransactionReference28)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OriginalTransactionReference28 that = ((OriginalTransactionReference28) object);
        {
            ActiveOrHistoricCurrencyAndAmount lhsIntrBkSttlmAmt;
            lhsIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            ActiveOrHistoricCurrencyAndAmount rhsIntrBkSttlmAmt;
            rhsIntrBkSttlmAmt = that.getIntrBkSttlmAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intrBkSttlmAmt", lhsIntrBkSttlmAmt), LocatorUtils.property(thatLocator, "intrBkSttlmAmt", rhsIntrBkSttlmAmt), lhsIntrBkSttlmAmt, rhsIntrBkSttlmAmt)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsIntrBkSttlmDt;
            lhsIntrBkSttlmDt = this.getIntrBkSttlmDt();
            XMLGregorianCalendar rhsIntrBkSttlmDt;
            rhsIntrBkSttlmDt = that.getIntrBkSttlmDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intrBkSttlmDt", lhsIntrBkSttlmDt), LocatorUtils.property(thatLocator, "intrBkSttlmDt", rhsIntrBkSttlmDt), lhsIntrBkSttlmDt, rhsIntrBkSttlmDt)) {
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
            ActiveOrHistoricCurrencyAndAmount theIntrBkSttlmAmt;
            theIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intrBkSttlmAmt", theIntrBkSttlmAmt), currentHashCode, theIntrBkSttlmAmt);
        }
        {
            XMLGregorianCalendar theIntrBkSttlmDt;
            theIntrBkSttlmDt = this.getIntrBkSttlmDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intrBkSttlmDt", theIntrBkSttlmDt), currentHashCode, theIntrBkSttlmDt);
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
            ActiveOrHistoricCurrencyAndAmount theIntrBkSttlmAmt;
            theIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            strategy.appendField(locator, this, "intrBkSttlmAmt", buffer, theIntrBkSttlmAmt);
        }
        {
            XMLGregorianCalendar theIntrBkSttlmDt;
            theIntrBkSttlmDt = this.getIntrBkSttlmDt();
            strategy.appendField(locator, this, "intrBkSttlmDt", buffer, theIntrBkSttlmDt);
        }
        return buffer;
    }

}
