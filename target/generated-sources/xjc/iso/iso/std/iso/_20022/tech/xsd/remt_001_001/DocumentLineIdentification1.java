//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.remt_001_001;

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
 * <p>Java class for DocumentLineIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentLineIdentification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}DocumentLineType1" minOccurs="0"/&gt;
 *         &lt;element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RltdDt" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}ISODate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLineIdentification1", propOrder = {
    "tp",
    "nb",
    "rltdDt"
})
public class DocumentLineIdentification1
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Tp")
    protected DocumentLineType1 tp;
    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "RltdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rltdDt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentLineType1 }
     *     
     */
    public DocumentLineType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentLineType1 }
     *     
     */
    public void setTp(DocumentLineType1 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Gets the value of the rltdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRltdDt() {
        return rltdDt;
    }

    /**
     * Sets the value of the rltdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRltdDt(XMLGregorianCalendar value) {
        this.rltdDt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DocumentLineIdentification1)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DocumentLineIdentification1 that = ((DocumentLineIdentification1) object);
        {
            DocumentLineType1 lhsTp;
            lhsTp = this.getTp();
            DocumentLineType1 rhsTp;
            rhsTp = that.getTp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tp", lhsTp), LocatorUtils.property(thatLocator, "tp", rhsTp), lhsTp, rhsTp)) {
                return false;
            }
        }
        {
            String lhsNb;
            lhsNb = this.getNb();
            String rhsNb;
            rhsNb = that.getNb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nb", lhsNb), LocatorUtils.property(thatLocator, "nb", rhsNb), lhsNb, rhsNb)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRltdDt;
            lhsRltdDt = this.getRltdDt();
            XMLGregorianCalendar rhsRltdDt;
            rhsRltdDt = that.getRltdDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rltdDt", lhsRltdDt), LocatorUtils.property(thatLocator, "rltdDt", rhsRltdDt), lhsRltdDt, rhsRltdDt)) {
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
            DocumentLineType1 theTp;
            theTp = this.getTp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tp", theTp), currentHashCode, theTp);
        }
        {
            String theNb;
            theNb = this.getNb();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nb", theNb), currentHashCode, theNb);
        }
        {
            XMLGregorianCalendar theRltdDt;
            theRltdDt = this.getRltdDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rltdDt", theRltdDt), currentHashCode, theRltdDt);
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
            DocumentLineType1 theTp;
            theTp = this.getTp();
            strategy.appendField(locator, this, "tp", buffer, theTp);
        }
        {
            String theNb;
            theNb = this.getNb();
            strategy.appendField(locator, this, "nb", buffer, theNb);
        }
        {
            XMLGregorianCalendar theRltdDt;
            theRltdDt = this.getRltdDt();
            strategy.appendField(locator, this, "rltdDt", buffer, theRltdDt);
        }
        return buffer;
    }

}
