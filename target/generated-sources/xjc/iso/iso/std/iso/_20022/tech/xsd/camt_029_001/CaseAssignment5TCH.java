//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

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
 * <p>Java class for CaseAssignment5_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseAssignment5_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}Max35Text"/&gt;
 *         &lt;element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}Party39Choice_TCH"/&gt;
 *         &lt;element name="Assgne" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}Party39Choice_TCH"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.09}ISODateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseAssignment5_TCH", propOrder = {
    "id",
    "assgnr",
    "assgne",
    "creDtTm"
})
public class CaseAssignment5TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Assgnr", required = true)
    protected Party39ChoiceTCH assgnr;
    @XmlElement(name = "Assgne", required = true)
    protected Party39ChoiceTCH assgne;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party39ChoiceTCH }
     *     
     */
    public Party39ChoiceTCH getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party39ChoiceTCH }
     *     
     */
    public void setAssgnr(Party39ChoiceTCH value) {
        this.assgnr = value;
    }

    /**
     * Gets the value of the assgne property.
     * 
     * @return
     *     possible object is
     *     {@link Party39ChoiceTCH }
     *     
     */
    public Party39ChoiceTCH getAssgne() {
        return assgne;
    }

    /**
     * Sets the value of the assgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party39ChoiceTCH }
     *     
     */
    public void setAssgne(Party39ChoiceTCH value) {
        this.assgne = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CaseAssignment5TCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CaseAssignment5TCH that = ((CaseAssignment5TCH) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            Party39ChoiceTCH lhsAssgnr;
            lhsAssgnr = this.getAssgnr();
            Party39ChoiceTCH rhsAssgnr;
            rhsAssgnr = that.getAssgnr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assgnr", lhsAssgnr), LocatorUtils.property(thatLocator, "assgnr", rhsAssgnr), lhsAssgnr, rhsAssgnr)) {
                return false;
            }
        }
        {
            Party39ChoiceTCH lhsAssgne;
            lhsAssgne = this.getAssgne();
            Party39ChoiceTCH rhsAssgne;
            rhsAssgne = that.getAssgne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assgne", lhsAssgne), LocatorUtils.property(thatLocator, "assgne", rhsAssgne), lhsAssgne, rhsAssgne)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCreDtTm;
            lhsCreDtTm = this.getCreDtTm();
            XMLGregorianCalendar rhsCreDtTm;
            rhsCreDtTm = that.getCreDtTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creDtTm", lhsCreDtTm), LocatorUtils.property(thatLocator, "creDtTm", rhsCreDtTm), lhsCreDtTm, rhsCreDtTm)) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            Party39ChoiceTCH theAssgnr;
            theAssgnr = this.getAssgnr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assgnr", theAssgnr), currentHashCode, theAssgnr);
        }
        {
            Party39ChoiceTCH theAssgne;
            theAssgne = this.getAssgne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assgne", theAssgne), currentHashCode, theAssgne);
        }
        {
            XMLGregorianCalendar theCreDtTm;
            theCreDtTm = this.getCreDtTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creDtTm", theCreDtTm), currentHashCode, theCreDtTm);
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            Party39ChoiceTCH theAssgnr;
            theAssgnr = this.getAssgnr();
            strategy.appendField(locator, this, "assgnr", buffer, theAssgnr);
        }
        {
            Party39ChoiceTCH theAssgne;
            theAssgne = this.getAssgne();
            strategy.appendField(locator, this, "assgne", buffer, theAssgne);
        }
        {
            XMLGregorianCalendar theCreDtTm;
            theCreDtTm = this.getCreDtTm();
            strategy.appendField(locator, this, "creDtTm", buffer, theCreDtTm);
        }
        return buffer;
    }

}
