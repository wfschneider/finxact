//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package _01._001._008.admn;

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
 * <p>Java class for AvailabilityReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cnnctn" type="{admn.008.001.01}Connection" minOccurs="0"/&gt;
 *         &lt;element name="AvlbtyPtcpt" type="{admn.008.001.01}AvailabilityParticipant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityReport", propOrder = {
    "cnnctn",
    "avlbtyPtcpt"
})
public class AvailabilityReport
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Cnnctn")
    protected Connection cnnctn;
    @XmlElement(name = "AvlbtyPtcpt")
    protected AvailabilityParticipant avlbtyPtcpt;

    /**
     * Gets the value of the cnnctn property.
     * 
     * @return
     *     possible object is
     *     {@link Connection }
     *     
     */
    public Connection getCnnctn() {
        return cnnctn;
    }

    /**
     * Sets the value of the cnnctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connection }
     *     
     */
    public void setCnnctn(Connection value) {
        this.cnnctn = value;
    }

    /**
     * Gets the value of the avlbtyPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityParticipant }
     *     
     */
    public AvailabilityParticipant getAvlbtyPtcpt() {
        return avlbtyPtcpt;
    }

    /**
     * Sets the value of the avlbtyPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityParticipant }
     *     
     */
    public void setAvlbtyPtcpt(AvailabilityParticipant value) {
        this.avlbtyPtcpt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AvailabilityReport)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AvailabilityReport that = ((AvailabilityReport) object);
        {
            Connection lhsCnnctn;
            lhsCnnctn = this.getCnnctn();
            Connection rhsCnnctn;
            rhsCnnctn = that.getCnnctn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cnnctn", lhsCnnctn), LocatorUtils.property(thatLocator, "cnnctn", rhsCnnctn), lhsCnnctn, rhsCnnctn)) {
                return false;
            }
        }
        {
            AvailabilityParticipant lhsAvlbtyPtcpt;
            lhsAvlbtyPtcpt = this.getAvlbtyPtcpt();
            AvailabilityParticipant rhsAvlbtyPtcpt;
            rhsAvlbtyPtcpt = that.getAvlbtyPtcpt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avlbtyPtcpt", lhsAvlbtyPtcpt), LocatorUtils.property(thatLocator, "avlbtyPtcpt", rhsAvlbtyPtcpt), lhsAvlbtyPtcpt, rhsAvlbtyPtcpt)) {
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
            Connection theCnnctn;
            theCnnctn = this.getCnnctn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cnnctn", theCnnctn), currentHashCode, theCnnctn);
        }
        {
            AvailabilityParticipant theAvlbtyPtcpt;
            theAvlbtyPtcpt = this.getAvlbtyPtcpt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avlbtyPtcpt", theAvlbtyPtcpt), currentHashCode, theAvlbtyPtcpt);
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
            Connection theCnnctn;
            theCnnctn = this.getCnnctn();
            strategy.appendField(locator, this, "cnnctn", buffer, theCnnctn);
        }
        {
            AvailabilityParticipant theAvlbtyPtcpt;
            theAvlbtyPtcpt = this.getAvlbtyPtcpt();
            strategy.appendField(locator, this, "avlbtyPtcpt", buffer, theAvlbtyPtcpt);
        }
        return buffer;
    }

}