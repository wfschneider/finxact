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
 * <p>Java class for AvailabilityParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityParticipant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtcptSgnOff" type="{admn.008.001.01}ParticipantSignOff" minOccurs="0"/&gt;
 *         &lt;element name="PtcptSspd" type="{admn.008.001.01}ParticipantSuspended" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityParticipant", propOrder = {
    "ptcptSgnOff",
    "ptcptSspd"
})
public class AvailabilityParticipant
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "PtcptSgnOff")
    protected ParticipantSignOff ptcptSgnOff;
    @XmlElement(name = "PtcptSspd")
    protected ParticipantSuspended ptcptSspd;

    /**
     * Gets the value of the ptcptSgnOff property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantSignOff }
     *     
     */
    public ParticipantSignOff getPtcptSgnOff() {
        return ptcptSgnOff;
    }

    /**
     * Sets the value of the ptcptSgnOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantSignOff }
     *     
     */
    public void setPtcptSgnOff(ParticipantSignOff value) {
        this.ptcptSgnOff = value;
    }

    /**
     * Gets the value of the ptcptSspd property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantSuspended }
     *     
     */
    public ParticipantSuspended getPtcptSspd() {
        return ptcptSspd;
    }

    /**
     * Sets the value of the ptcptSspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantSuspended }
     *     
     */
    public void setPtcptSspd(ParticipantSuspended value) {
        this.ptcptSspd = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AvailabilityParticipant)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AvailabilityParticipant that = ((AvailabilityParticipant) object);
        {
            ParticipantSignOff lhsPtcptSgnOff;
            lhsPtcptSgnOff = this.getPtcptSgnOff();
            ParticipantSignOff rhsPtcptSgnOff;
            rhsPtcptSgnOff = that.getPtcptSgnOff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ptcptSgnOff", lhsPtcptSgnOff), LocatorUtils.property(thatLocator, "ptcptSgnOff", rhsPtcptSgnOff), lhsPtcptSgnOff, rhsPtcptSgnOff)) {
                return false;
            }
        }
        {
            ParticipantSuspended lhsPtcptSspd;
            lhsPtcptSspd = this.getPtcptSspd();
            ParticipantSuspended rhsPtcptSspd;
            rhsPtcptSspd = that.getPtcptSspd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ptcptSspd", lhsPtcptSspd), LocatorUtils.property(thatLocator, "ptcptSspd", rhsPtcptSspd), lhsPtcptSspd, rhsPtcptSspd)) {
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
            ParticipantSignOff thePtcptSgnOff;
            thePtcptSgnOff = this.getPtcptSgnOff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ptcptSgnOff", thePtcptSgnOff), currentHashCode, thePtcptSgnOff);
        }
        {
            ParticipantSuspended thePtcptSspd;
            thePtcptSspd = this.getPtcptSspd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ptcptSspd", thePtcptSspd), currentHashCode, thePtcptSspd);
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
            ParticipantSignOff thePtcptSgnOff;
            thePtcptSgnOff = this.getPtcptSgnOff();
            strategy.appendField(locator, this, "ptcptSgnOff", buffer, thePtcptSgnOff);
        }
        {
            ParticipantSuspended thePtcptSspd;
            thePtcptSspd = this.getPtcptSspd();
            strategy.appendField(locator, this, "ptcptSspd", buffer, thePtcptSspd);
        }
        return buffer;
    }

}