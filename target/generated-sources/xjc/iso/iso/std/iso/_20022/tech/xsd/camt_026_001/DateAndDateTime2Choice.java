//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_026_001;

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
 * <p>Java class for DateAndDateTime2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndDateTime2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.07}ISODate"/&gt;
 *         &lt;element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.026.001.07}ISODateTime"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTime2Choice", propOrder = {
    "dtTm",
    "dt"
})
public class DateAndDateTime2Choice
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "DtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DateAndDateTime2Choice)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DateAndDateTime2Choice that = ((DateAndDateTime2Choice) object);
        {
            XMLGregorianCalendar lhsDtTm;
            lhsDtTm = this.getDtTm();
            XMLGregorianCalendar rhsDtTm;
            rhsDtTm = that.getDtTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dtTm", lhsDtTm), LocatorUtils.property(thatLocator, "dtTm", rhsDtTm), lhsDtTm, rhsDtTm)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDt;
            lhsDt = this.getDt();
            XMLGregorianCalendar rhsDt;
            rhsDt = that.getDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dt", lhsDt), LocatorUtils.property(thatLocator, "dt", rhsDt), lhsDt, rhsDt)) {
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
            XMLGregorianCalendar theDtTm;
            theDtTm = this.getDtTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dtTm", theDtTm), currentHashCode, theDtTm);
        }
        {
            XMLGregorianCalendar theDt;
            theDt = this.getDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dt", theDt), currentHashCode, theDt);
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
            XMLGregorianCalendar theDtTm;
            theDtTm = this.getDtTm();
            strategy.appendField(locator, this, "dtTm", buffer, theDtTm);
        }
        {
            XMLGregorianCalendar theDt;
            theDt = this.getDt();
            strategy.appendField(locator, this, "dt", buffer, theDt);
        }
        return buffer;
    }

}
