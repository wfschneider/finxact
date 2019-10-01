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
 * <p>Java class for PaymentIdentification6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentIdentification6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}Max35Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification6", propOrder = {
    "instrId",
    "endToEndId"
})
public class PaymentIdentification6
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "EndToEndId", required = true)
    protected String endToEndId;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentIdentification6)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentIdentification6 that = ((PaymentIdentification6) object);
        {
            String lhsInstrId;
            lhsInstrId = this.getInstrId();
            String rhsInstrId;
            rhsInstrId = that.getInstrId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrId", lhsInstrId), LocatorUtils.property(thatLocator, "instrId", rhsInstrId), lhsInstrId, rhsInstrId)) {
                return false;
            }
        }
        {
            String lhsEndToEndId;
            lhsEndToEndId = this.getEndToEndId();
            String rhsEndToEndId;
            rhsEndToEndId = that.getEndToEndId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endToEndId", lhsEndToEndId), LocatorUtils.property(thatLocator, "endToEndId", rhsEndToEndId), lhsEndToEndId, rhsEndToEndId)) {
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
            String theInstrId;
            theInstrId = this.getInstrId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrId", theInstrId), currentHashCode, theInstrId);
        }
        {
            String theEndToEndId;
            theEndToEndId = this.getEndToEndId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endToEndId", theEndToEndId), currentHashCode, theEndToEndId);
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
            String theInstrId;
            theInstrId = this.getInstrId();
            strategy.appendField(locator, this, "instrId", buffer, theInstrId);
        }
        {
            String theEndToEndId;
            theEndToEndId = this.getEndToEndId();
            strategy.appendField(locator, this, "endToEndId", buffer, theEndToEndId);
        }
        return buffer;
    }

}