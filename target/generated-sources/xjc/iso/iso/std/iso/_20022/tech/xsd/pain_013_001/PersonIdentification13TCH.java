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
 * <p>Java class for PersonIdentification13_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentification13_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DtAndPlcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}DateAndPlaceOfBirth1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification13_TCH", propOrder = {
    "dtAndPlcOfBirth"
})
public class PersonIdentification13TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "DtAndPlcOfBirth", required = true)
    protected DateAndPlaceOfBirth1 dtAndPlcOfBirth;

    /**
     * Gets the value of the dtAndPlcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth1 }
     *     
     */
    public DateAndPlaceOfBirth1 getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    /**
     * Sets the value of the dtAndPlcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth1 }
     *     
     */
    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth1 value) {
        this.dtAndPlcOfBirth = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PersonIdentification13TCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PersonIdentification13TCH that = ((PersonIdentification13TCH) object);
        {
            DateAndPlaceOfBirth1 lhsDtAndPlcOfBirth;
            lhsDtAndPlcOfBirth = this.getDtAndPlcOfBirth();
            DateAndPlaceOfBirth1 rhsDtAndPlcOfBirth;
            rhsDtAndPlcOfBirth = that.getDtAndPlcOfBirth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dtAndPlcOfBirth", lhsDtAndPlcOfBirth), LocatorUtils.property(thatLocator, "dtAndPlcOfBirth", rhsDtAndPlcOfBirth), lhsDtAndPlcOfBirth, rhsDtAndPlcOfBirth)) {
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
            DateAndPlaceOfBirth1 theDtAndPlcOfBirth;
            theDtAndPlcOfBirth = this.getDtAndPlcOfBirth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dtAndPlcOfBirth", theDtAndPlcOfBirth), currentHashCode, theDtAndPlcOfBirth);
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
            DateAndPlaceOfBirth1 theDtAndPlcOfBirth;
            theDtAndPlcOfBirth = this.getDtAndPlcOfBirth();
            strategy.appendField(locator, this, "dtAndPlcOfBirth", buffer, theDtAndPlcOfBirth);
        }
        return buffer;
    }

}
