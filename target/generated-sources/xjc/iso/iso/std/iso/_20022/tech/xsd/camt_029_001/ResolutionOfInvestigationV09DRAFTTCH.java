//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

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
 * <p>Java class for ResolutionOfInvestigationV09_DRAFT_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolutionOfInvestigationV09_DRAFT_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}CaseAssignment5_TCH"/&gt;
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}InvestigationStatus5Choice_TCH"/&gt;
 *         &lt;element name="CxlDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}UnderlyingTransaction22_TCH"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionOfInvestigationV09_DRAFT_TCH", propOrder = {
    "assgnmt",
    "sts",
    "cxlDtls"
})
public class ResolutionOfInvestigationV09DRAFTTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5TCH assgnmt;
    @XmlElement(name = "Sts", required = true)
    protected InvestigationStatus5ChoiceTCH sts;
    @XmlElement(name = "CxlDtls", required = true)
    protected UnderlyingTransaction22TCH cxlDtls;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5TCH }
     *     
     */
    public CaseAssignment5TCH getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5TCH }
     *     
     */
    public void setAssgnmt(CaseAssignment5TCH value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus5ChoiceTCH }
     *     
     */
    public InvestigationStatus5ChoiceTCH getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus5ChoiceTCH }
     *     
     */
    public void setSts(InvestigationStatus5ChoiceTCH value) {
        this.sts = value;
    }

    /**
     * Gets the value of the cxlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction22TCH }
     *     
     */
    public UnderlyingTransaction22TCH getCxlDtls() {
        return cxlDtls;
    }

    /**
     * Sets the value of the cxlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction22TCH }
     *     
     */
    public void setCxlDtls(UnderlyingTransaction22TCH value) {
        this.cxlDtls = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ResolutionOfInvestigationV09DRAFTTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResolutionOfInvestigationV09DRAFTTCH that = ((ResolutionOfInvestigationV09DRAFTTCH) object);
        {
            CaseAssignment5TCH lhsAssgnmt;
            lhsAssgnmt = this.getAssgnmt();
            CaseAssignment5TCH rhsAssgnmt;
            rhsAssgnmt = that.getAssgnmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assgnmt", lhsAssgnmt), LocatorUtils.property(thatLocator, "assgnmt", rhsAssgnmt), lhsAssgnmt, rhsAssgnmt)) {
                return false;
            }
        }
        {
            InvestigationStatus5ChoiceTCH lhsSts;
            lhsSts = this.getSts();
            InvestigationStatus5ChoiceTCH rhsSts;
            rhsSts = that.getSts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sts", lhsSts), LocatorUtils.property(thatLocator, "sts", rhsSts), lhsSts, rhsSts)) {
                return false;
            }
        }
        {
            UnderlyingTransaction22TCH lhsCxlDtls;
            lhsCxlDtls = this.getCxlDtls();
            UnderlyingTransaction22TCH rhsCxlDtls;
            rhsCxlDtls = that.getCxlDtls();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cxlDtls", lhsCxlDtls), LocatorUtils.property(thatLocator, "cxlDtls", rhsCxlDtls), lhsCxlDtls, rhsCxlDtls)) {
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
            CaseAssignment5TCH theAssgnmt;
            theAssgnmt = this.getAssgnmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assgnmt", theAssgnmt), currentHashCode, theAssgnmt);
        }
        {
            InvestigationStatus5ChoiceTCH theSts;
            theSts = this.getSts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sts", theSts), currentHashCode, theSts);
        }
        {
            UnderlyingTransaction22TCH theCxlDtls;
            theCxlDtls = this.getCxlDtls();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cxlDtls", theCxlDtls), currentHashCode, theCxlDtls);
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
            CaseAssignment5TCH theAssgnmt;
            theAssgnmt = this.getAssgnmt();
            strategy.appendField(locator, this, "assgnmt", buffer, theAssgnmt);
        }
        {
            InvestigationStatus5ChoiceTCH theSts;
            theSts = this.getSts();
            strategy.appendField(locator, this, "sts", buffer, theSts);
        }
        {
            UnderlyingTransaction22TCH theCxlDtls;
            theCxlDtls = this.getCxlDtls();
            strategy.appendField(locator, this, "cxlDtls", buffer, theCxlDtls);
        }
        return buffer;
    }

}
