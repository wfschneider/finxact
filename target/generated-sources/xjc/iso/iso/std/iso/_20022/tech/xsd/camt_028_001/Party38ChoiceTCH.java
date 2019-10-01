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
 * <p>Java class for Party38Choice_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party38Choice_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}OrganisationIdentification29_TCH"/&gt;
 *         &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}PersonIdentification13_TCH"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party38Choice_TCH", propOrder = {
    "prvtId",
    "orgId"
})
public class Party38ChoiceTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "PrvtId")
    protected PersonIdentification13TCH prvtId;
    @XmlElement(name = "OrgId")
    protected OrganisationIdentification29TCH orgId;

    /**
     * Gets the value of the prvtId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification13TCH }
     *     
     */
    public PersonIdentification13TCH getPrvtId() {
        return prvtId;
    }

    /**
     * Sets the value of the prvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification13TCH }
     *     
     */
    public void setPrvtId(PersonIdentification13TCH value) {
        this.prvtId = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29TCH }
     *     
     */
    public OrganisationIdentification29TCH getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29TCH }
     *     
     */
    public void setOrgId(OrganisationIdentification29TCH value) {
        this.orgId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Party38ChoiceTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Party38ChoiceTCH that = ((Party38ChoiceTCH) object);
        {
            PersonIdentification13TCH lhsPrvtId;
            lhsPrvtId = this.getPrvtId();
            PersonIdentification13TCH rhsPrvtId;
            rhsPrvtId = that.getPrvtId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prvtId", lhsPrvtId), LocatorUtils.property(thatLocator, "prvtId", rhsPrvtId), lhsPrvtId, rhsPrvtId)) {
                return false;
            }
        }
        {
            OrganisationIdentification29TCH lhsOrgId;
            lhsOrgId = this.getOrgId();
            OrganisationIdentification29TCH rhsOrgId;
            rhsOrgId = that.getOrgId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgId", lhsOrgId), LocatorUtils.property(thatLocator, "orgId", rhsOrgId), lhsOrgId, rhsOrgId)) {
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
            PersonIdentification13TCH thePrvtId;
            thePrvtId = this.getPrvtId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prvtId", thePrvtId), currentHashCode, thePrvtId);
        }
        {
            OrganisationIdentification29TCH theOrgId;
            theOrgId = this.getOrgId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgId", theOrgId), currentHashCode, theOrgId);
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
            PersonIdentification13TCH thePrvtId;
            thePrvtId = this.getPrvtId();
            strategy.appendField(locator, this, "prvtId", buffer, thePrvtId);
        }
        {
            OrganisationIdentification29TCH theOrgId;
            theOrgId = this.getOrgId();
            strategy.appendField(locator, this, "orgId", buffer, theOrgId);
        }
        return buffer;
    }

}
