//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.admi_004_001;

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
 * VocaLink
 * 
 * <p>Java class for SystemEventNotificationV02_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemEventNotificationV02_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EvtInf" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}Event2_TCH"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventNotificationV02_TCH", propOrder = {
    "evtInf"
})
public class SystemEventNotificationV02TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "EvtInf", required = true)
    protected Event2TCH evtInf;

    /**
     * Gets the value of the evtInf property.
     * 
     * @return
     *     possible object is
     *     {@link Event2TCH }
     *     
     */
    public Event2TCH getEvtInf() {
        return evtInf;
    }

    /**
     * Sets the value of the evtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event2TCH }
     *     
     */
    public void setEvtInf(Event2TCH value) {
        this.evtInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SystemEventNotificationV02TCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SystemEventNotificationV02TCH that = ((SystemEventNotificationV02TCH) object);
        {
            Event2TCH lhsEvtInf;
            lhsEvtInf = this.getEvtInf();
            Event2TCH rhsEvtInf;
            rhsEvtInf = that.getEvtInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evtInf", lhsEvtInf), LocatorUtils.property(thatLocator, "evtInf", rhsEvtInf), lhsEvtInf, rhsEvtInf)) {
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
            Event2TCH theEvtInf;
            theEvtInf = this.getEvtInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evtInf", theEvtInf), currentHashCode, theEvtInf);
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
            Event2TCH theEvtInf;
            theEvtInf = this.getEvtInf();
            strategy.appendField(locator, this, "evtInf", buffer, theEvtInf);
        }
        return buffer;
    }

}