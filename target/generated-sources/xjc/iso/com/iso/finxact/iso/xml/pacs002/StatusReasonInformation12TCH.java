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
 * <p>Java class for StatusReasonInformation12_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusReasonInformation12_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}StatusReason6Choice_TCH" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Max105Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReasonInformation12_TCH", propOrder = {
    "rsn",
    "addtlInf"
})
public class StatusReasonInformation12TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Rsn")
    protected StatusReason6ChoiceTCH rsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason6ChoiceTCH }
     *     
     */
    public StatusReason6ChoiceTCH getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason6ChoiceTCH }
     *     
     */
    public void setRsn(StatusReason6ChoiceTCH value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StatusReasonInformation12TCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StatusReasonInformation12TCH that = ((StatusReasonInformation12TCH) object);
        {
            StatusReason6ChoiceTCH lhsRsn;
            lhsRsn = this.getRsn();
            StatusReason6ChoiceTCH rhsRsn;
            rhsRsn = that.getRsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rsn", lhsRsn), LocatorUtils.property(thatLocator, "rsn", rhsRsn), lhsRsn, rhsRsn)) {
                return false;
            }
        }
        {
            String lhsAddtlInf;
            lhsAddtlInf = this.getAddtlInf();
            String rhsAddtlInf;
            rhsAddtlInf = that.getAddtlInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addtlInf", lhsAddtlInf), LocatorUtils.property(thatLocator, "addtlInf", rhsAddtlInf), lhsAddtlInf, rhsAddtlInf)) {
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
            StatusReason6ChoiceTCH theRsn;
            theRsn = this.getRsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rsn", theRsn), currentHashCode, theRsn);
        }
        {
            String theAddtlInf;
            theAddtlInf = this.getAddtlInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addtlInf", theAddtlInf), currentHashCode, theAddtlInf);
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
            StatusReason6ChoiceTCH theRsn;
            theRsn = this.getRsn();
            strategy.appendField(locator, this, "rsn", buffer, theRsn);
        }
        {
            String theAddtlInf;
            theAddtlInf = this.getAddtlInf();
            strategy.appendField(locator, this, "addtlInf", buffer, theAddtlInf);
        }
        return buffer;
    }

}