//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pain_014_001;

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
 * <p>Java class for CreditorPaymentActivationRequestStatusReportV07_DRAFT_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorPaymentActivationRequestStatusReportV07_DRAFT_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.07}GroupHeader87_TCH"/&gt;
 *         &lt;element name="OrgnlGrpInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.07}OriginalGroupInformation30_TCH"/&gt;
 *         &lt;element name="OrgnlPmtInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.07}OriginalPaymentInstruction31_TCH"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorPaymentActivationRequestStatusReportV07_DRAFT_TCH", propOrder = {
    "grpHdr",
    "orgnlGrpInfAndSts",
    "orgnlPmtInfAndSts"
})
public class CreditorPaymentActivationRequestStatusReportV07DRAFTTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader87TCH grpHdr;
    @XmlElement(name = "OrgnlGrpInfAndSts", required = true)
    protected OriginalGroupInformation30TCH orgnlGrpInfAndSts;
    @XmlElement(name = "OrgnlPmtInfAndSts", required = true)
    protected OriginalPaymentInstruction31TCH orgnlPmtInfAndSts;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader87TCH }
     *     
     */
    public GroupHeader87TCH getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader87TCH }
     *     
     */
    public void setGrpHdr(GroupHeader87TCH value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the orgnlGrpInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation30TCH }
     *     
     */
    public OriginalGroupInformation30TCH getOrgnlGrpInfAndSts() {
        return orgnlGrpInfAndSts;
    }

    /**
     * Sets the value of the orgnlGrpInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation30TCH }
     *     
     */
    public void setOrgnlGrpInfAndSts(OriginalGroupInformation30TCH value) {
        this.orgnlGrpInfAndSts = value;
    }

    /**
     * Gets the value of the orgnlPmtInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalPaymentInstruction31TCH }
     *     
     */
    public OriginalPaymentInstruction31TCH getOrgnlPmtInfAndSts() {
        return orgnlPmtInfAndSts;
    }

    /**
     * Sets the value of the orgnlPmtInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalPaymentInstruction31TCH }
     *     
     */
    public void setOrgnlPmtInfAndSts(OriginalPaymentInstruction31TCH value) {
        this.orgnlPmtInfAndSts = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreditorPaymentActivationRequestStatusReportV07DRAFTTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditorPaymentActivationRequestStatusReportV07DRAFTTCH that = ((CreditorPaymentActivationRequestStatusReportV07DRAFTTCH) object);
        {
            GroupHeader87TCH lhsGrpHdr;
            lhsGrpHdr = this.getGrpHdr();
            GroupHeader87TCH rhsGrpHdr;
            rhsGrpHdr = that.getGrpHdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grpHdr", lhsGrpHdr), LocatorUtils.property(thatLocator, "grpHdr", rhsGrpHdr), lhsGrpHdr, rhsGrpHdr)) {
                return false;
            }
        }
        {
            OriginalGroupInformation30TCH lhsOrgnlGrpInfAndSts;
            lhsOrgnlGrpInfAndSts = this.getOrgnlGrpInfAndSts();
            OriginalGroupInformation30TCH rhsOrgnlGrpInfAndSts;
            rhsOrgnlGrpInfAndSts = that.getOrgnlGrpInfAndSts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlGrpInfAndSts", lhsOrgnlGrpInfAndSts), LocatorUtils.property(thatLocator, "orgnlGrpInfAndSts", rhsOrgnlGrpInfAndSts), lhsOrgnlGrpInfAndSts, rhsOrgnlGrpInfAndSts)) {
                return false;
            }
        }
        {
            OriginalPaymentInstruction31TCH lhsOrgnlPmtInfAndSts;
            lhsOrgnlPmtInfAndSts = this.getOrgnlPmtInfAndSts();
            OriginalPaymentInstruction31TCH rhsOrgnlPmtInfAndSts;
            rhsOrgnlPmtInfAndSts = that.getOrgnlPmtInfAndSts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlPmtInfAndSts", lhsOrgnlPmtInfAndSts), LocatorUtils.property(thatLocator, "orgnlPmtInfAndSts", rhsOrgnlPmtInfAndSts), lhsOrgnlPmtInfAndSts, rhsOrgnlPmtInfAndSts)) {
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
            GroupHeader87TCH theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grpHdr", theGrpHdr), currentHashCode, theGrpHdr);
        }
        {
            OriginalGroupInformation30TCH theOrgnlGrpInfAndSts;
            theOrgnlGrpInfAndSts = this.getOrgnlGrpInfAndSts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlGrpInfAndSts", theOrgnlGrpInfAndSts), currentHashCode, theOrgnlGrpInfAndSts);
        }
        {
            OriginalPaymentInstruction31TCH theOrgnlPmtInfAndSts;
            theOrgnlPmtInfAndSts = this.getOrgnlPmtInfAndSts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlPmtInfAndSts", theOrgnlPmtInfAndSts), currentHashCode, theOrgnlPmtInfAndSts);
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
            GroupHeader87TCH theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            strategy.appendField(locator, this, "grpHdr", buffer, theGrpHdr);
        }
        {
            OriginalGroupInformation30TCH theOrgnlGrpInfAndSts;
            theOrgnlGrpInfAndSts = this.getOrgnlGrpInfAndSts();
            strategy.appendField(locator, this, "orgnlGrpInfAndSts", buffer, theOrgnlGrpInfAndSts);
        }
        {
            OriginalPaymentInstruction31TCH theOrgnlPmtInfAndSts;
            theOrgnlPmtInfAndSts = this.getOrgnlPmtInfAndSts();
            strategy.appendField(locator, this, "orgnlPmtInfAndSts", buffer, theOrgnlPmtInfAndSts);
        }
        return buffer;
    }

}
