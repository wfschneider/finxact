//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_028_001;

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
 * <p>Java class for UnderlyingTransaction5Choice_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingTransaction5Choice_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Initn" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}UnderlyingPaymentInstruction5_TCH"/&gt;
 *         &lt;element name="IntrBk" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}UnderlyingPaymentTransaction4_TCH"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction5Choice_TCH", propOrder = {
    "intrBk",
    "initn"
})
public class UnderlyingTransaction5ChoiceTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction4TCH intrBk;
    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction5TCH initn;

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction4TCH }
     *     
     */
    public UnderlyingPaymentTransaction4TCH getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction4TCH }
     *     
     */
    public void setIntrBk(UnderlyingPaymentTransaction4TCH value) {
        this.intrBk = value;
    }

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction5TCH }
     *     
     */
    public UnderlyingPaymentInstruction5TCH getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction5TCH }
     *     
     */
    public void setInitn(UnderlyingPaymentInstruction5TCH value) {
        this.initn = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UnderlyingTransaction5ChoiceTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UnderlyingTransaction5ChoiceTCH that = ((UnderlyingTransaction5ChoiceTCH) object);
        {
            UnderlyingPaymentTransaction4TCH lhsIntrBk;
            lhsIntrBk = this.getIntrBk();
            UnderlyingPaymentTransaction4TCH rhsIntrBk;
            rhsIntrBk = that.getIntrBk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intrBk", lhsIntrBk), LocatorUtils.property(thatLocator, "intrBk", rhsIntrBk), lhsIntrBk, rhsIntrBk)) {
                return false;
            }
        }
        {
            UnderlyingPaymentInstruction5TCH lhsInitn;
            lhsInitn = this.getInitn();
            UnderlyingPaymentInstruction5TCH rhsInitn;
            rhsInitn = that.getInitn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initn", lhsInitn), LocatorUtils.property(thatLocator, "initn", rhsInitn), lhsInitn, rhsInitn)) {
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
            UnderlyingPaymentTransaction4TCH theIntrBk;
            theIntrBk = this.getIntrBk();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intrBk", theIntrBk), currentHashCode, theIntrBk);
        }
        {
            UnderlyingPaymentInstruction5TCH theInitn;
            theInitn = this.getInitn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initn", theInitn), currentHashCode, theInitn);
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
            UnderlyingPaymentTransaction4TCH theIntrBk;
            theIntrBk = this.getIntrBk();
            strategy.appendField(locator, this, "intrBk", buffer, theIntrBk);
        }
        {
            UnderlyingPaymentInstruction5TCH theInitn;
            theInitn = this.getInitn();
            strategy.appendField(locator, this, "initn", buffer, theInitn);
        }
        return buffer;
    }

}
