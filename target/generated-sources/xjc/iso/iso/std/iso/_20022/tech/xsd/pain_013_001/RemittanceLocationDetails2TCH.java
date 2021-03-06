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
 * <p>Java class for RemittanceLocationDetails2_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceLocationDetails2_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}RemittanceLocationMethod2Code_TCH"/&gt;
 *         &lt;element name="ElctrncAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}Max2048Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocationDetails2_TCH", propOrder = {
    "mtd",
    "elctrncAdr"
})
public class RemittanceLocationDetails2TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Mtd", required = true)
    @XmlSchemaType(name = "string")
    protected RemittanceLocationMethod2CodeTCH mtd;
    @XmlElement(name = "ElctrncAdr", required = true)
    protected String elctrncAdr;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocationMethod2CodeTCH }
     *     
     */
    public RemittanceLocationMethod2CodeTCH getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationMethod2CodeTCH }
     *     
     */
    public void setMtd(RemittanceLocationMethod2CodeTCH value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the elctrncAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncAdr() {
        return elctrncAdr;
    }

    /**
     * Sets the value of the elctrncAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElctrncAdr(String value) {
        this.elctrncAdr = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RemittanceLocationDetails2TCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RemittanceLocationDetails2TCH that = ((RemittanceLocationDetails2TCH) object);
        {
            RemittanceLocationMethod2CodeTCH lhsMtd;
            lhsMtd = this.getMtd();
            RemittanceLocationMethod2CodeTCH rhsMtd;
            rhsMtd = that.getMtd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mtd", lhsMtd), LocatorUtils.property(thatLocator, "mtd", rhsMtd), lhsMtd, rhsMtd)) {
                return false;
            }
        }
        {
            String lhsElctrncAdr;
            lhsElctrncAdr = this.getElctrncAdr();
            String rhsElctrncAdr;
            rhsElctrncAdr = that.getElctrncAdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elctrncAdr", lhsElctrncAdr), LocatorUtils.property(thatLocator, "elctrncAdr", rhsElctrncAdr), lhsElctrncAdr, rhsElctrncAdr)) {
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
            RemittanceLocationMethod2CodeTCH theMtd;
            theMtd = this.getMtd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mtd", theMtd), currentHashCode, theMtd);
        }
        {
            String theElctrncAdr;
            theElctrncAdr = this.getElctrncAdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "elctrncAdr", theElctrncAdr), currentHashCode, theElctrncAdr);
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
            RemittanceLocationMethod2CodeTCH theMtd;
            theMtd = this.getMtd();
            strategy.appendField(locator, this, "mtd", buffer, theMtd);
        }
        {
            String theElctrncAdr;
            theElctrncAdr = this.getElctrncAdr();
            strategy.appendField(locator, this, "elctrncAdr", buffer, theElctrncAdr);
        }
        return buffer;
    }

}
