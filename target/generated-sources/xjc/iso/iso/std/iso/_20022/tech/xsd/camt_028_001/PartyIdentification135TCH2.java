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
 * <p>Java class for PartyIdentification135_TCH_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification135_TCH_2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}PostalAddress24_TCH" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}Party38Choice_TCH" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification135_TCH_2", propOrder = {
    "nm",
    "pstlAdr",
    "id"
})
public class PartyIdentification135TCH2
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress24TCH pstlAdr;
    @XmlElement(name = "Id")
    protected Party38ChoiceTCH id;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress24TCH }
     *     
     */
    public PostalAddress24TCH getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24TCH }
     *     
     */
    public void setPstlAdr(PostalAddress24TCH value) {
        this.pstlAdr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Party38ChoiceTCH }
     *     
     */
    public Party38ChoiceTCH getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party38ChoiceTCH }
     *     
     */
    public void setId(Party38ChoiceTCH value) {
        this.id = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PartyIdentification135TCH2)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PartyIdentification135TCH2 that = ((PartyIdentification135TCH2) object);
        {
            String lhsNm;
            lhsNm = this.getNm();
            String rhsNm;
            rhsNm = that.getNm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nm", lhsNm), LocatorUtils.property(thatLocator, "nm", rhsNm), lhsNm, rhsNm)) {
                return false;
            }
        }
        {
            PostalAddress24TCH lhsPstlAdr;
            lhsPstlAdr = this.getPstlAdr();
            PostalAddress24TCH rhsPstlAdr;
            rhsPstlAdr = that.getPstlAdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pstlAdr", lhsPstlAdr), LocatorUtils.property(thatLocator, "pstlAdr", rhsPstlAdr), lhsPstlAdr, rhsPstlAdr)) {
                return false;
            }
        }
        {
            Party38ChoiceTCH lhsId;
            lhsId = this.getId();
            Party38ChoiceTCH rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            String theNm;
            theNm = this.getNm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nm", theNm), currentHashCode, theNm);
        }
        {
            PostalAddress24TCH thePstlAdr;
            thePstlAdr = this.getPstlAdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pstlAdr", thePstlAdr), currentHashCode, thePstlAdr);
        }
        {
            Party38ChoiceTCH theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
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
            String theNm;
            theNm = this.getNm();
            strategy.appendField(locator, this, "nm", buffer, theNm);
        }
        {
            PostalAddress24TCH thePstlAdr;
            thePstlAdr = this.getPstlAdr();
            strategy.appendField(locator, this, "pstlAdr", buffer, thePstlAdr);
        }
        {
            Party38ChoiceTCH theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

}
