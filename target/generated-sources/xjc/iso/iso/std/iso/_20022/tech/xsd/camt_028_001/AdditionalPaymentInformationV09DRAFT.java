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
 * VocaLink
 * 
 * <p>Java class for AdditionalPaymentInformationV09_DRAFT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalPaymentInformationV09_DRAFT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}CaseAssignment5"/&gt;
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}Case5"/&gt;
 *         &lt;element name="Undrlyg" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}UnderlyingTransaction5Choice"/&gt;
 *         &lt;element name="Inf" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}PaymentComplementaryInformation8"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalPaymentInformationV09_DRAFT", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "inf"
})
public class AdditionalPaymentInformationV09DRAFT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case5 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction5Choice undrlyg;
    @XmlElement(name = "Inf", required = true)
    protected PaymentComplementaryInformation8 inf;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public void setAssgnmt(CaseAssignment5 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public void setCase(Case5 value) {
        this._case = value;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction5Choice }
     *     
     */
    public UnderlyingTransaction5Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction5Choice }
     *     
     */
    public void setUndrlyg(UnderlyingTransaction5Choice value) {
        this.undrlyg = value;
    }

    /**
     * Gets the value of the inf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentComplementaryInformation8 }
     *     
     */
    public PaymentComplementaryInformation8 getInf() {
        return inf;
    }

    /**
     * Sets the value of the inf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentComplementaryInformation8 }
     *     
     */
    public void setInf(PaymentComplementaryInformation8 value) {
        this.inf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AdditionalPaymentInformationV09DRAFT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AdditionalPaymentInformationV09DRAFT that = ((AdditionalPaymentInformationV09DRAFT) object);
        {
            CaseAssignment5 lhsAssgnmt;
            lhsAssgnmt = this.getAssgnmt();
            CaseAssignment5 rhsAssgnmt;
            rhsAssgnmt = that.getAssgnmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assgnmt", lhsAssgnmt), LocatorUtils.property(thatLocator, "assgnmt", rhsAssgnmt), lhsAssgnmt, rhsAssgnmt)) {
                return false;
            }
        }
        {
            Case5 lhsCase;
            lhsCase = this.getCase();
            Case5 rhsCase;
            rhsCase = that.getCase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_case", lhsCase), LocatorUtils.property(thatLocator, "_case", rhsCase), lhsCase, rhsCase)) {
                return false;
            }
        }
        {
            UnderlyingTransaction5Choice lhsUndrlyg;
            lhsUndrlyg = this.getUndrlyg();
            UnderlyingTransaction5Choice rhsUndrlyg;
            rhsUndrlyg = that.getUndrlyg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undrlyg", lhsUndrlyg), LocatorUtils.property(thatLocator, "undrlyg", rhsUndrlyg), lhsUndrlyg, rhsUndrlyg)) {
                return false;
            }
        }
        {
            PaymentComplementaryInformation8 lhsInf;
            lhsInf = this.getInf();
            PaymentComplementaryInformation8 rhsInf;
            rhsInf = that.getInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inf", lhsInf), LocatorUtils.property(thatLocator, "inf", rhsInf), lhsInf, rhsInf)) {
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
            CaseAssignment5 theAssgnmt;
            theAssgnmt = this.getAssgnmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assgnmt", theAssgnmt), currentHashCode, theAssgnmt);
        }
        {
            Case5 theCase;
            theCase = this.getCase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_case", theCase), currentHashCode, theCase);
        }
        {
            UnderlyingTransaction5Choice theUndrlyg;
            theUndrlyg = this.getUndrlyg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undrlyg", theUndrlyg), currentHashCode, theUndrlyg);
        }
        {
            PaymentComplementaryInformation8 theInf;
            theInf = this.getInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inf", theInf), currentHashCode, theInf);
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
            CaseAssignment5 theAssgnmt;
            theAssgnmt = this.getAssgnmt();
            strategy.appendField(locator, this, "assgnmt", buffer, theAssgnmt);
        }
        {
            Case5 theCase;
            theCase = this.getCase();
            strategy.appendField(locator, this, "_case", buffer, theCase);
        }
        {
            UnderlyingTransaction5Choice theUndrlyg;
            theUndrlyg = this.getUndrlyg();
            strategy.appendField(locator, this, "undrlyg", buffer, theUndrlyg);
        }
        {
            PaymentComplementaryInformation8 theInf;
            theInf = this.getInf();
            strategy.appendField(locator, this, "inf", buffer, theInf);
        }
        return buffer;
    }

}
