//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package _01._001._008.admn;

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
 * <p>Java class for ParticipantSuspended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantSuspended"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtcptId" type="{admn.008.001.01}Min11Max11Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantSuspended", propOrder = {
    "ptcptIds"
})
public class ParticipantSuspended
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "PtcptId")
    protected List<String> ptcptIds;

    /**
     * Gets the value of the ptcptIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcptIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtcptIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPtcptIds() {
        if (ptcptIds == null) {
            ptcptIds = new ArrayList<String>();
        }
        return this.ptcptIds;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ParticipantSuspended)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ParticipantSuspended that = ((ParticipantSuspended) object);
        {
            List<String> lhsPtcptIds;
            lhsPtcptIds = (((this.ptcptIds!= null)&&(!this.ptcptIds.isEmpty()))?this.getPtcptIds():null);
            List<String> rhsPtcptIds;
            rhsPtcptIds = (((that.ptcptIds!= null)&&(!that.ptcptIds.isEmpty()))?that.getPtcptIds():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ptcptIds", lhsPtcptIds), LocatorUtils.property(thatLocator, "ptcptIds", rhsPtcptIds), lhsPtcptIds, rhsPtcptIds)) {
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
            List<String> thePtcptIds;
            thePtcptIds = (((this.ptcptIds!= null)&&(!this.ptcptIds.isEmpty()))?this.getPtcptIds():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ptcptIds", thePtcptIds), currentHashCode, thePtcptIds);
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
            List<String> thePtcptIds;
            thePtcptIds = (((this.ptcptIds!= null)&&(!this.ptcptIds.isEmpty()))?this.getPtcptIds():null);
            strategy.appendField(locator, this, "ptcptIds", buffer, thePtcptIds);
        }
        return buffer;
    }

}
