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
 * VocaLink
 * 
 * <p>Java class for CreditorPaymentActivationRequestV07_DRAFT_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorPaymentActivationRequestV07_DRAFT_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}GroupHeader78_TCH"/&gt;
 *         &lt;element name="PmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}PaymentInstruction31_TCH"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorPaymentActivationRequestV07_DRAFT_TCH", propOrder = {
    "grpHdr",
    "pmtInf"
})
public class CreditorPaymentActivationRequestV07DRAFTTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader78TCH grpHdr;
    @XmlElement(name = "PmtInf", required = true)
    protected PaymentInstruction31TCH pmtInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader78TCH }
     *     
     */
    public GroupHeader78TCH getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader78TCH }
     *     
     */
    public void setGrpHdr(GroupHeader78TCH value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the pmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstruction31TCH }
     *     
     */
    public PaymentInstruction31TCH getPmtInf() {
        return pmtInf;
    }

    /**
     * Sets the value of the pmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstruction31TCH }
     *     
     */
    public void setPmtInf(PaymentInstruction31TCH value) {
        this.pmtInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreditorPaymentActivationRequestV07DRAFTTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditorPaymentActivationRequestV07DRAFTTCH that = ((CreditorPaymentActivationRequestV07DRAFTTCH) object);
        {
            GroupHeader78TCH lhsGrpHdr;
            lhsGrpHdr = this.getGrpHdr();
            GroupHeader78TCH rhsGrpHdr;
            rhsGrpHdr = that.getGrpHdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grpHdr", lhsGrpHdr), LocatorUtils.property(thatLocator, "grpHdr", rhsGrpHdr), lhsGrpHdr, rhsGrpHdr)) {
                return false;
            }
        }
        {
            PaymentInstruction31TCH lhsPmtInf;
            lhsPmtInf = this.getPmtInf();
            PaymentInstruction31TCH rhsPmtInf;
            rhsPmtInf = that.getPmtInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtInf", lhsPmtInf), LocatorUtils.property(thatLocator, "pmtInf", rhsPmtInf), lhsPmtInf, rhsPmtInf)) {
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
            GroupHeader78TCH theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grpHdr", theGrpHdr), currentHashCode, theGrpHdr);
        }
        {
            PaymentInstruction31TCH thePmtInf;
            thePmtInf = this.getPmtInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtInf", thePmtInf), currentHashCode, thePmtInf);
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
            GroupHeader78TCH theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            strategy.appendField(locator, this, "grpHdr", buffer, theGrpHdr);
        }
        {
            PaymentInstruction31TCH thePmtInf;
            thePmtInf = this.getPmtInf();
            strategy.appendField(locator, this, "pmtInf", buffer, thePmtInf);
        }
        return buffer;
    }

}