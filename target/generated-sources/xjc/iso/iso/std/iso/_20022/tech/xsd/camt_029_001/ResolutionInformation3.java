//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

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
 * <p>Java class for ResolutionInformation3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolutionInformation3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="ClrChanl" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}ClearingChannel2Code" minOccurs="0"/&gt;
 *         &lt;element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}Charges8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionInformation3", propOrder = {
    "intrBkSttlmAmt",
    "intrBkSttlmDt",
    "clrChanl",
    "chrgs"
})
public class ResolutionInformation3
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "IntrBkSttlmAmt")
    protected ActiveOrHistoricCurrencyAndAmount intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "ClrChanl")
    @XmlSchemaType(name = "string")
    protected ClearingChannel2Code clrChanl;
    @XmlElement(name = "Chrgs")
    protected List<Charges8> chrgs;

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setIntrBkSttlmAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Gets the value of the clrChanl property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public ClearingChannel2Code getClrChanl() {
        return clrChanl;
    }

    /**
     * Sets the value of the clrChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public void setClrChanl(ClearingChannel2Code value) {
        this.clrChanl = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges8 }
     * 
     * 
     */
    public List<Charges8> getChrgs() {
        if (chrgs == null) {
            chrgs = new ArrayList<Charges8>();
        }
        return this.chrgs;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ResolutionInformation3)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResolutionInformation3 that = ((ResolutionInformation3) object);
        {
            ActiveOrHistoricCurrencyAndAmount lhsIntrBkSttlmAmt;
            lhsIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            ActiveOrHistoricCurrencyAndAmount rhsIntrBkSttlmAmt;
            rhsIntrBkSttlmAmt = that.getIntrBkSttlmAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intrBkSttlmAmt", lhsIntrBkSttlmAmt), LocatorUtils.property(thatLocator, "intrBkSttlmAmt", rhsIntrBkSttlmAmt), lhsIntrBkSttlmAmt, rhsIntrBkSttlmAmt)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsIntrBkSttlmDt;
            lhsIntrBkSttlmDt = this.getIntrBkSttlmDt();
            XMLGregorianCalendar rhsIntrBkSttlmDt;
            rhsIntrBkSttlmDt = that.getIntrBkSttlmDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intrBkSttlmDt", lhsIntrBkSttlmDt), LocatorUtils.property(thatLocator, "intrBkSttlmDt", rhsIntrBkSttlmDt), lhsIntrBkSttlmDt, rhsIntrBkSttlmDt)) {
                return false;
            }
        }
        {
            ClearingChannel2Code lhsClrChanl;
            lhsClrChanl = this.getClrChanl();
            ClearingChannel2Code rhsClrChanl;
            rhsClrChanl = that.getClrChanl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clrChanl", lhsClrChanl), LocatorUtils.property(thatLocator, "clrChanl", rhsClrChanl), lhsClrChanl, rhsClrChanl)) {
                return false;
            }
        }
        {
            List<Charges8> lhsChrgs;
            lhsChrgs = (((this.chrgs!= null)&&(!this.chrgs.isEmpty()))?this.getChrgs():null);
            List<Charges8> rhsChrgs;
            rhsChrgs = (((that.chrgs!= null)&&(!that.chrgs.isEmpty()))?that.getChrgs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chrgs", lhsChrgs), LocatorUtils.property(thatLocator, "chrgs", rhsChrgs), lhsChrgs, rhsChrgs)) {
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
            ActiveOrHistoricCurrencyAndAmount theIntrBkSttlmAmt;
            theIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intrBkSttlmAmt", theIntrBkSttlmAmt), currentHashCode, theIntrBkSttlmAmt);
        }
        {
            XMLGregorianCalendar theIntrBkSttlmDt;
            theIntrBkSttlmDt = this.getIntrBkSttlmDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intrBkSttlmDt", theIntrBkSttlmDt), currentHashCode, theIntrBkSttlmDt);
        }
        {
            ClearingChannel2Code theClrChanl;
            theClrChanl = this.getClrChanl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clrChanl", theClrChanl), currentHashCode, theClrChanl);
        }
        {
            List<Charges8> theChrgs;
            theChrgs = (((this.chrgs!= null)&&(!this.chrgs.isEmpty()))?this.getChrgs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chrgs", theChrgs), currentHashCode, theChrgs);
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
            ActiveOrHistoricCurrencyAndAmount theIntrBkSttlmAmt;
            theIntrBkSttlmAmt = this.getIntrBkSttlmAmt();
            strategy.appendField(locator, this, "intrBkSttlmAmt", buffer, theIntrBkSttlmAmt);
        }
        {
            XMLGregorianCalendar theIntrBkSttlmDt;
            theIntrBkSttlmDt = this.getIntrBkSttlmDt();
            strategy.appendField(locator, this, "intrBkSttlmDt", buffer, theIntrBkSttlmDt);
        }
        {
            ClearingChannel2Code theClrChanl;
            theClrChanl = this.getClrChanl();
            strategy.appendField(locator, this, "clrChanl", buffer, theClrChanl);
        }
        {
            List<Charges8> theChrgs;
            theChrgs = (((this.chrgs!= null)&&(!this.chrgs.isEmpty()))?this.getChrgs():null);
            strategy.appendField(locator, this, "chrgs", buffer, theChrgs);
        }
        return buffer;
    }

}