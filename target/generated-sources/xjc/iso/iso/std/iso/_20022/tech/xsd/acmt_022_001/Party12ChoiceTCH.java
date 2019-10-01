//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.acmt_022_001;

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
 * <p>Java class for Party12Choice_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party12Choice_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Agt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.022.001.02}BranchAndFinancialInstitutionIdentification5_TCH"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party12Choice_TCH", propOrder = {
    "agt"
})
public class Party12ChoiceTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Agt")
    protected BranchAndFinancialInstitutionIdentification5TCH agt;

    /**
     * Gets the value of the agt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5TCH }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5TCH getAgt() {
        return agt;
    }

    /**
     * Sets the value of the agt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5TCH }
     *     
     */
    public void setAgt(BranchAndFinancialInstitutionIdentification5TCH value) {
        this.agt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Party12ChoiceTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Party12ChoiceTCH that = ((Party12ChoiceTCH) object);
        {
            BranchAndFinancialInstitutionIdentification5TCH lhsAgt;
            lhsAgt = this.getAgt();
            BranchAndFinancialInstitutionIdentification5TCH rhsAgt;
            rhsAgt = that.getAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agt", lhsAgt), LocatorUtils.property(thatLocator, "agt", rhsAgt), lhsAgt, rhsAgt)) {
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
            BranchAndFinancialInstitutionIdentification5TCH theAgt;
            theAgt = this.getAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agt", theAgt), currentHashCode, theAgt);
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
            BranchAndFinancialInstitutionIdentification5TCH theAgt;
            theAgt = this.getAgt();
            strategy.appendField(locator, this, "agt", buffer, theAgt);
        }
        return buffer;
    }

}
