//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.admi_004_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for Event2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EvtCd" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}Max4AlphaNumericText"/&gt;
 *         &lt;element name="EvtParam" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EvtDesc" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}Max1000Text" minOccurs="0"/&gt;
 *         &lt;element name="EvtTm" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}ISODateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event2", propOrder = {
    "evtCd",
    "evtParams",
    "evtDesc",
    "evtTm"
})
public class Event2
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "EvtCd", required = true)
    protected String evtCd;
    @XmlElement(name = "EvtParam")
    protected List<String> evtParams;
    @XmlElement(name = "EvtDesc")
    protected String evtDesc;
    @XmlElement(name = "EvtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evtTm;

    /**
     * Gets the value of the evtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCd() {
        return evtCd;
    }

    /**
     * Sets the value of the evtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtCd(String value) {
        this.evtCd = value;
    }

    /**
     * Gets the value of the evtParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEvtParams() {
        if (evtParams == null) {
            evtParams = new ArrayList<String>();
        }
        return this.evtParams;
    }

    /**
     * Gets the value of the evtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtDesc() {
        return evtDesc;
    }

    /**
     * Sets the value of the evtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtDesc(String value) {
        this.evtDesc = value;
    }

    /**
     * Gets the value of the evtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtTm() {
        return evtTm;
    }

    /**
     * Sets the value of the evtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtTm(XMLGregorianCalendar value) {
        this.evtTm = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Event2)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Event2 that = ((Event2) object);
        {
            String lhsEvtCd;
            lhsEvtCd = this.getEvtCd();
            String rhsEvtCd;
            rhsEvtCd = that.getEvtCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evtCd", lhsEvtCd), LocatorUtils.property(thatLocator, "evtCd", rhsEvtCd), lhsEvtCd, rhsEvtCd)) {
                return false;
            }
        }
        {
            List<String> lhsEvtParams;
            lhsEvtParams = (((this.evtParams!= null)&&(!this.evtParams.isEmpty()))?this.getEvtParams():null);
            List<String> rhsEvtParams;
            rhsEvtParams = (((that.evtParams!= null)&&(!that.evtParams.isEmpty()))?that.getEvtParams():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evtParams", lhsEvtParams), LocatorUtils.property(thatLocator, "evtParams", rhsEvtParams), lhsEvtParams, rhsEvtParams)) {
                return false;
            }
        }
        {
            String lhsEvtDesc;
            lhsEvtDesc = this.getEvtDesc();
            String rhsEvtDesc;
            rhsEvtDesc = that.getEvtDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evtDesc", lhsEvtDesc), LocatorUtils.property(thatLocator, "evtDesc", rhsEvtDesc), lhsEvtDesc, rhsEvtDesc)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEvtTm;
            lhsEvtTm = this.getEvtTm();
            XMLGregorianCalendar rhsEvtTm;
            rhsEvtTm = that.getEvtTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evtTm", lhsEvtTm), LocatorUtils.property(thatLocator, "evtTm", rhsEvtTm), lhsEvtTm, rhsEvtTm)) {
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
            String theEvtCd;
            theEvtCd = this.getEvtCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evtCd", theEvtCd), currentHashCode, theEvtCd);
        }
        {
            List<String> theEvtParams;
            theEvtParams = (((this.evtParams!= null)&&(!this.evtParams.isEmpty()))?this.getEvtParams():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evtParams", theEvtParams), currentHashCode, theEvtParams);
        }
        {
            String theEvtDesc;
            theEvtDesc = this.getEvtDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evtDesc", theEvtDesc), currentHashCode, theEvtDesc);
        }
        {
            XMLGregorianCalendar theEvtTm;
            theEvtTm = this.getEvtTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evtTm", theEvtTm), currentHashCode, theEvtTm);
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
            String theEvtCd;
            theEvtCd = this.getEvtCd();
            strategy.appendField(locator, this, "evtCd", buffer, theEvtCd);
        }
        {
            List<String> theEvtParams;
            theEvtParams = (((this.evtParams!= null)&&(!this.evtParams.isEmpty()))?this.getEvtParams():null);
            strategy.appendField(locator, this, "evtParams", buffer, theEvtParams);
        }
        {
            String theEvtDesc;
            theEvtDesc = this.getEvtDesc();
            strategy.appendField(locator, this, "evtDesc", buffer, theEvtDesc);
        }
        {
            XMLGregorianCalendar theEvtTm;
            theEvtTm = this.getEvtTm();
            strategy.appendField(locator, this, "evtTm", buffer, theEvtTm);
        }
        return buffer;
    }

}