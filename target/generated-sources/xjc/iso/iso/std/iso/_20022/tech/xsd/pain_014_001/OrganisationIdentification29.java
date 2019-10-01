//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pain_014_001;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for OrganisationIdentification29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationIdentification29"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.07}LEIIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.07}GenericOrganisationIdentification1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification29", propOrder = {
    "lei",
    "othrs"
})
public class OrganisationIdentification29
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "Othr")
    protected List<GenericOrganisationIdentification1> othrs;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the othrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericOrganisationIdentification1 }
     * 
     * 
     */
    public List<GenericOrganisationIdentification1> getOthrs() {
        if (othrs == null) {
            othrs = new ArrayList<GenericOrganisationIdentification1>();
        }
        return this.othrs;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OrganisationIdentification29)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OrganisationIdentification29 that = ((OrganisationIdentification29) object);
        {
            String lhsLEI;
            lhsLEI = this.getLEI();
            String rhsLEI;
            rhsLEI = that.getLEI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lei", lhsLEI), LocatorUtils.property(thatLocator, "lei", rhsLEI), lhsLEI, rhsLEI)) {
                return false;
            }
        }
        {
            List<GenericOrganisationIdentification1> lhsOthrs;
            lhsOthrs = (((this.othrs!= null)&&(!this.othrs.isEmpty()))?this.getOthrs():null);
            List<GenericOrganisationIdentification1> rhsOthrs;
            rhsOthrs = (((that.othrs!= null)&&(!that.othrs.isEmpty()))?that.getOthrs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "othrs", lhsOthrs), LocatorUtils.property(thatLocator, "othrs", rhsOthrs), lhsOthrs, rhsOthrs)) {
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
            String theLEI;
            theLEI = this.getLEI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lei", theLEI), currentHashCode, theLEI);
        }
        {
            List<GenericOrganisationIdentification1> theOthrs;
            theOthrs = (((this.othrs!= null)&&(!this.othrs.isEmpty()))?this.getOthrs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "othrs", theOthrs), currentHashCode, theOthrs);
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
            String theLEI;
            theLEI = this.getLEI();
            strategy.appendField(locator, this, "lei", buffer, theLEI);
        }
        {
            List<GenericOrganisationIdentification1> theOthrs;
            theOthrs = (((this.othrs!= null)&&(!this.othrs.isEmpty()))?this.getOthrs():null);
            strategy.appendField(locator, this, "othrs", buffer, theOthrs);
        }
        return buffer;
    }

}