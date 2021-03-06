//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_035_001;

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
 * <p>Java class for ProprietaryData6_reduced complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProprietaryData6_reduced"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ustrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.035.001.05}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="OrigRefs" type="{urn:iso:std:iso:20022:tech:xsd:camt.035.001.05}TransactionReferences8_reduced"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryData6_reduced", propOrder = {
    "ustrd",
    "origRefs"
})
public class ProprietaryData6Reduced
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Ustrd")
    protected String ustrd;
    @XmlElement(name = "OrigRefs", required = true)
    protected TransactionReferences8Reduced origRefs;

    /**
     * Gets the value of the ustrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUstrd() {
        return ustrd;
    }

    /**
     * Sets the value of the ustrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUstrd(String value) {
        this.ustrd = value;
    }

    /**
     * Gets the value of the origRefs property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences8Reduced }
     *     
     */
    public TransactionReferences8Reduced getOrigRefs() {
        return origRefs;
    }

    /**
     * Sets the value of the origRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences8Reduced }
     *     
     */
    public void setOrigRefs(TransactionReferences8Reduced value) {
        this.origRefs = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProprietaryData6Reduced)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProprietaryData6Reduced that = ((ProprietaryData6Reduced) object);
        {
            String lhsUstrd;
            lhsUstrd = this.getUstrd();
            String rhsUstrd;
            rhsUstrd = that.getUstrd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ustrd", lhsUstrd), LocatorUtils.property(thatLocator, "ustrd", rhsUstrd), lhsUstrd, rhsUstrd)) {
                return false;
            }
        }
        {
            TransactionReferences8Reduced lhsOrigRefs;
            lhsOrigRefs = this.getOrigRefs();
            TransactionReferences8Reduced rhsOrigRefs;
            rhsOrigRefs = that.getOrigRefs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "origRefs", lhsOrigRefs), LocatorUtils.property(thatLocator, "origRefs", rhsOrigRefs), lhsOrigRefs, rhsOrigRefs)) {
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
            String theUstrd;
            theUstrd = this.getUstrd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ustrd", theUstrd), currentHashCode, theUstrd);
        }
        {
            TransactionReferences8Reduced theOrigRefs;
            theOrigRefs = this.getOrigRefs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "origRefs", theOrigRefs), currentHashCode, theOrigRefs);
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
            String theUstrd;
            theUstrd = this.getUstrd();
            strategy.appendField(locator, this, "ustrd", buffer, theUstrd);
        }
        {
            TransactionReferences8Reduced theOrigRefs;
            theOrigRefs = this.getOrigRefs();
            strategy.appendField(locator, this, "origRefs", buffer, theOrigRefs);
        }
        return buffer;
    }

}
