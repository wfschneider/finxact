//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.head_001_001;

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
 * <p>Java class for Party9Choice_TCH_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party9Choice_TCH_2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FIId" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}BranchAndFinancialInstitutionIdentification5_TCH_2"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party9Choice_TCH_2", propOrder = {
    "fiId"
})
public class Party9ChoiceTCH2
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "FIId")
    protected BranchAndFinancialInstitutionIdentification5TCH2 fiId;

    /**
     * Gets the value of the fiId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5TCH2 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5TCH2 getFIId() {
        return fiId;
    }

    /**
     * Sets the value of the fiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5TCH2 }
     *     
     */
    public void setFIId(BranchAndFinancialInstitutionIdentification5TCH2 value) {
        this.fiId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Party9ChoiceTCH2)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Party9ChoiceTCH2 that = ((Party9ChoiceTCH2) object);
        {
            BranchAndFinancialInstitutionIdentification5TCH2 lhsFIId;
            lhsFIId = this.getFIId();
            BranchAndFinancialInstitutionIdentification5TCH2 rhsFIId;
            rhsFIId = that.getFIId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fiId", lhsFIId), LocatorUtils.property(thatLocator, "fiId", rhsFIId), lhsFIId, rhsFIId)) {
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
            BranchAndFinancialInstitutionIdentification5TCH2 theFIId;
            theFIId = this.getFIId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fiId", theFIId), currentHashCode, theFIId);
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
            BranchAndFinancialInstitutionIdentification5TCH2 theFIId;
            theFIId = this.getFIId();
            strategy.appendField(locator, this, "fiId", buffer, theFIId);
        }
        return buffer;
    }

}