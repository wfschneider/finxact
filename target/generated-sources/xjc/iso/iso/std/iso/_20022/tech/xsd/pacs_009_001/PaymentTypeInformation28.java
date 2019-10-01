//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pacs_009_001;

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
 * <p>Java class for PaymentTypeInformation28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformation28"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}ServiceLevel8Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation28", propOrder = {
    "svcLvls"
})
public class PaymentTypeInformation28
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "SvcLvl")
    protected List<ServiceLevel8Choice> svcLvls;

    /**
     * Gets the value of the svcLvls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcLvls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcLvls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLevel8Choice }
     * 
     * 
     */
    public List<ServiceLevel8Choice> getSvcLvls() {
        if (svcLvls == null) {
            svcLvls = new ArrayList<ServiceLevel8Choice>();
        }
        return this.svcLvls;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentTypeInformation28)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentTypeInformation28 that = ((PaymentTypeInformation28) object);
        {
            List<ServiceLevel8Choice> lhsSvcLvls;
            lhsSvcLvls = (((this.svcLvls!= null)&&(!this.svcLvls.isEmpty()))?this.getSvcLvls():null);
            List<ServiceLevel8Choice> rhsSvcLvls;
            rhsSvcLvls = (((that.svcLvls!= null)&&(!that.svcLvls.isEmpty()))?that.getSvcLvls():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "svcLvls", lhsSvcLvls), LocatorUtils.property(thatLocator, "svcLvls", rhsSvcLvls), lhsSvcLvls, rhsSvcLvls)) {
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
            List<ServiceLevel8Choice> theSvcLvls;
            theSvcLvls = (((this.svcLvls!= null)&&(!this.svcLvls.isEmpty()))?this.getSvcLvls():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "svcLvls", theSvcLvls), currentHashCode, theSvcLvls);
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
            List<ServiceLevel8Choice> theSvcLvls;
            theSvcLvls = (((this.svcLvls!= null)&&(!this.svcLvls.isEmpty()))?this.getSvcLvls():null);
            strategy.appendField(locator, this, "svcLvls", buffer, theSvcLvls);
        }
        return buffer;
    }

}