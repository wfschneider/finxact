//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pain_013_001;

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
 * <p>Java class for StructuredRemittanceInformation16_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredRemittanceInformation16_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}RemittanceAmount2_TCH" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation16_TCH", propOrder = {
    "rfrdDocAmt"
})
public class StructuredRemittanceInformation16TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "RfrdDocAmt")
    protected RemittanceAmount2TCH rfrdDocAmt;

    /**
     * Gets the value of the rfrdDocAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAmount2TCH }
     *     
     */
    public RemittanceAmount2TCH getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    /**
     * Sets the value of the rfrdDocAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount2TCH }
     *     
     */
    public void setRfrdDocAmt(RemittanceAmount2TCH value) {
        this.rfrdDocAmt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StructuredRemittanceInformation16TCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StructuredRemittanceInformation16TCH that = ((StructuredRemittanceInformation16TCH) object);
        {
            RemittanceAmount2TCH lhsRfrdDocAmt;
            lhsRfrdDocAmt = this.getRfrdDocAmt();
            RemittanceAmount2TCH rhsRfrdDocAmt;
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
            RemittanceAmount2TCH theRfrdDocAmt;
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
            RemittanceAmount2TCH theRfrdDocAmt;
            theRfrdDocAmt = this.getRfrdDocAmt();
            strategy.appendField(locator, this, "rfrdDocAmt", buffer, theRfrdDocAmt);
        }
        return buffer;
    }

}
