//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_056_001;

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
 * <p>Java class for CancellationReason33Choice_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationReason33Choice_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.08}ExternalCancellationReason1Code_TCH"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.08}Max35Text_TCH_2"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationReason33Choice_TCH", propOrder = {
    "prtry",
    "cd"
})
public class CancellationReason33ChoiceTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Prtry")
    @XmlSchemaType(name = "string")
    protected Max35TextTCH2 prtry;
    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected ExternalCancellationReason1CodeTCH cd;

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link Max35TextTCH2 }
     *     
     */
    public Max35TextTCH2 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max35TextTCH2 }
     *     
     */
    public void setPrtry(Max35TextTCH2 value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalCancellationReason1CodeTCH }
     *     
     */
    public ExternalCancellationReason1CodeTCH getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalCancellationReason1CodeTCH }
     *     
     */
    public void setCd(ExternalCancellationReason1CodeTCH value) {
        this.cd = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CancellationReason33ChoiceTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CancellationReason33ChoiceTCH that = ((CancellationReason33ChoiceTCH) object);
        {
            Max35TextTCH2 lhsPrtry;
            lhsPrtry = this.getPrtry();
            Max35TextTCH2 rhsPrtry;
            rhsPrtry = that.getPrtry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prtry", lhsPrtry), LocatorUtils.property(thatLocator, "prtry", rhsPrtry), lhsPrtry, rhsPrtry)) {
                return false;
            }
        }
        {
            ExternalCancellationReason1CodeTCH lhsCd;
            lhsCd = this.getCd();
            ExternalCancellationReason1CodeTCH rhsCd;
            rhsCd = that.getCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cd", lhsCd), LocatorUtils.property(thatLocator, "cd", rhsCd), lhsCd, rhsCd)) {
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
            Max35TextTCH2 thePrtry;
            thePrtry = this.getPrtry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prtry", thePrtry), currentHashCode, thePrtry);
        }
        {
            ExternalCancellationReason1CodeTCH theCd;
            theCd = this.getCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cd", theCd), currentHashCode, theCd);
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
            Max35TextTCH2 thePrtry;
            thePrtry = this.getPrtry();
            strategy.appendField(locator, this, "prtry", buffer, thePrtry);
        }
        {
            ExternalCancellationReason1CodeTCH theCd;
            theCd = this.getCd();
            strategy.appendField(locator, this, "cd", buffer, theCd);
        }
        return buffer;
    }

}
