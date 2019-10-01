//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_028_001;

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
 * <p>Java class for PersonIdentification13_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentification13_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}GenericPersonIdentification1" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "othrs"
})
public class PersonIdentification13TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Othr")
    protected List<GenericPersonIdentification1> othrs;

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
     * {@link GenericPersonIdentification1 }
     * 
     * 
     */
    public List<GenericPersonIdentification1> getOthrs() {
        if (othrs == null) {
            othrs = new ArrayList<GenericPersonIdentification1>();
        }
        return this.othrs;
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
            List<GenericPersonIdentification1> lhsOthrs;
            lhsOthrs = (((this.othrs!= null)&&(!this.othrs.isEmpty()))?this.getOthrs():null);
            List<GenericPersonIdentification1> rhsOthrs;
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
            List<GenericPersonIdentification1> theOthrs;
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
            List<GenericPersonIdentification1> theOthrs;
            theOthrs = (((this.othrs!= null)&&(!this.othrs.isEmpty()))?this.getOthrs():null);
            strategy.appendField(locator, this, "othrs", buffer, theOthrs);
        }
        return buffer;
    }

}
