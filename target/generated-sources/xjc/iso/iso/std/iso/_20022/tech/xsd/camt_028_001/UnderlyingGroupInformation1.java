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
 * <p>Java class for UnderlyingGroupInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingGroupInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlMsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}Max35Text"/&gt;
 *         &lt;element name="OrgnlMsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}OrigMsgName"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingGroupInformation1", propOrder = {
    "orgnlMsgId",
    "orgnlMsgNmId"
})
public class UnderlyingGroupInformation1
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    @XmlSchemaType(name = "string")
    protected OrigMsgName orgnlMsgNmId;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
    }

    /**
     * Gets the value of the orgnlMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link OrigMsgName }
     *     
     */
    public OrigMsgName getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigMsgName }
     *     
     */
    public void setOrgnlMsgNmId(OrigMsgName value) {
        this.orgnlMsgNmId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UnderlyingGroupInformation1)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UnderlyingGroupInformation1 that = ((UnderlyingGroupInformation1) object);
        {
            String lhsOrgnlMsgId;
            lhsOrgnlMsgId = this.getOrgnlMsgId();
            String rhsOrgnlMsgId;
            rhsOrgnlMsgId = that.getOrgnlMsgId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlMsgId", lhsOrgnlMsgId), LocatorUtils.property(thatLocator, "orgnlMsgId", rhsOrgnlMsgId), lhsOrgnlMsgId, rhsOrgnlMsgId)) {
                return false;
            }
        }
        {
            OrigMsgName lhsOrgnlMsgNmId;
            lhsOrgnlMsgNmId = this.getOrgnlMsgNmId();
            OrigMsgName rhsOrgnlMsgNmId;
            rhsOrgnlMsgNmId = that.getOrgnlMsgNmId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlMsgNmId", lhsOrgnlMsgNmId), LocatorUtils.property(thatLocator, "orgnlMsgNmId", rhsOrgnlMsgNmId), lhsOrgnlMsgNmId, rhsOrgnlMsgNmId)) {
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
            String theOrgnlMsgId;
            theOrgnlMsgId = this.getOrgnlMsgId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlMsgId", theOrgnlMsgId), currentHashCode, theOrgnlMsgId);
        }
        {
            OrigMsgName theOrgnlMsgNmId;
            theOrgnlMsgNmId = this.getOrgnlMsgNmId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlMsgNmId", theOrgnlMsgNmId), currentHashCode, theOrgnlMsgNmId);
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
            String theOrgnlMsgId;
            theOrgnlMsgId = this.getOrgnlMsgId();
            strategy.appendField(locator, this, "orgnlMsgId", buffer, theOrgnlMsgId);
        }
        {
            OrigMsgName theOrgnlMsgNmId;
            theOrgnlMsgNmId = this.getOrgnlMsgNmId();
            strategy.appendField(locator, this, "orgnlMsgNmId", buffer, theOrgnlMsgNmId);
        }
        return buffer;
    }

}
