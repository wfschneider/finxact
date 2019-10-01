//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.remt_001_001;

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
 * <p>Java class for PostalAddress24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress24"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}Max70Text" maxOccurs="7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress24", propOrder = {
    "strtNm",
    "bldgNb",
    "pstCd",
    "twnNm",
    "ctrySubDvsn",
    "ctry",
    "adrLines"
})
public class PostalAddress24
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "PstCd")
    protected String pstCd;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "CtrySubDvsn")
    protected String ctrySubDvsn;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "AdrLine")
    protected List<String> adrLines;

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * Gets the value of the pstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Sets the value of the pstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    /**
     * Gets the value of the ctrySubDvsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * Sets the value of the ctrySubDvsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsn(String value) {
        this.ctrySubDvsn = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the adrLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adrLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdrLines() {
        if (adrLines == null) {
            adrLines = new ArrayList<String>();
        }
        return this.adrLines;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PostalAddress24)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PostalAddress24 that = ((PostalAddress24) object);
        {
            String lhsStrtNm;
            lhsStrtNm = this.getStrtNm();
            String rhsStrtNm;
            rhsStrtNm = that.getStrtNm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strtNm", lhsStrtNm), LocatorUtils.property(thatLocator, "strtNm", rhsStrtNm), lhsStrtNm, rhsStrtNm)) {
                return false;
            }
        }
        {
            String lhsBldgNb;
            lhsBldgNb = this.getBldgNb();
            String rhsBldgNb;
            rhsBldgNb = that.getBldgNb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bldgNb", lhsBldgNb), LocatorUtils.property(thatLocator, "bldgNb", rhsBldgNb), lhsBldgNb, rhsBldgNb)) {
                return false;
            }
        }
        {
            String lhsPstCd;
            lhsPstCd = this.getPstCd();
            String rhsPstCd;
            rhsPstCd = that.getPstCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pstCd", lhsPstCd), LocatorUtils.property(thatLocator, "pstCd", rhsPstCd), lhsPstCd, rhsPstCd)) {
                return false;
            }
        }
        {
            String lhsTwnNm;
            lhsTwnNm = this.getTwnNm();
            String rhsTwnNm;
            rhsTwnNm = that.getTwnNm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "twnNm", lhsTwnNm), LocatorUtils.property(thatLocator, "twnNm", rhsTwnNm), lhsTwnNm, rhsTwnNm)) {
                return false;
            }
        }
        {
            String lhsCtrySubDvsn;
            lhsCtrySubDvsn = this.getCtrySubDvsn();
            String rhsCtrySubDvsn;
            rhsCtrySubDvsn = that.getCtrySubDvsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctrySubDvsn", lhsCtrySubDvsn), LocatorUtils.property(thatLocator, "ctrySubDvsn", rhsCtrySubDvsn), lhsCtrySubDvsn, rhsCtrySubDvsn)) {
                return false;
            }
        }
        {
            String lhsCtry;
            lhsCtry = this.getCtry();
            String rhsCtry;
            rhsCtry = that.getCtry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctry", lhsCtry), LocatorUtils.property(thatLocator, "ctry", rhsCtry), lhsCtry, rhsCtry)) {
                return false;
            }
        }
        {
            List<String> lhsAdrLines;
            lhsAdrLines = (((this.adrLines!= null)&&(!this.adrLines.isEmpty()))?this.getAdrLines():null);
            List<String> rhsAdrLines;
            rhsAdrLines = (((that.adrLines!= null)&&(!that.adrLines.isEmpty()))?that.getAdrLines():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adrLines", lhsAdrLines), LocatorUtils.property(thatLocator, "adrLines", rhsAdrLines), lhsAdrLines, rhsAdrLines)) {
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
            String theStrtNm;
            theStrtNm = this.getStrtNm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strtNm", theStrtNm), currentHashCode, theStrtNm);
        }
        {
            String theBldgNb;
            theBldgNb = this.getBldgNb();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bldgNb", theBldgNb), currentHashCode, theBldgNb);
        }
        {
            String thePstCd;
            thePstCd = this.getPstCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pstCd", thePstCd), currentHashCode, thePstCd);
        }
        {
            String theTwnNm;
            theTwnNm = this.getTwnNm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "twnNm", theTwnNm), currentHashCode, theTwnNm);
        }
        {
            String theCtrySubDvsn;
            theCtrySubDvsn = this.getCtrySubDvsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctrySubDvsn", theCtrySubDvsn), currentHashCode, theCtrySubDvsn);
        }
        {
            String theCtry;
            theCtry = this.getCtry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctry", theCtry), currentHashCode, theCtry);
        }
        {
            List<String> theAdrLines;
            theAdrLines = (((this.adrLines!= null)&&(!this.adrLines.isEmpty()))?this.getAdrLines():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adrLines", theAdrLines), currentHashCode, theAdrLines);
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
            String theStrtNm;
            theStrtNm = this.getStrtNm();
            strategy.appendField(locator, this, "strtNm", buffer, theStrtNm);
        }
        {
            String theBldgNb;
            theBldgNb = this.getBldgNb();
            strategy.appendField(locator, this, "bldgNb", buffer, theBldgNb);
        }
        {
            String thePstCd;
            thePstCd = this.getPstCd();
            strategy.appendField(locator, this, "pstCd", buffer, thePstCd);
        }
        {
            String theTwnNm;
            theTwnNm = this.getTwnNm();
            strategy.appendField(locator, this, "twnNm", buffer, theTwnNm);
        }
        {
            String theCtrySubDvsn;
            theCtrySubDvsn = this.getCtrySubDvsn();
            strategy.appendField(locator, this, "ctrySubDvsn", buffer, theCtrySubDvsn);
        }
        {
            String theCtry;
            theCtry = this.getCtry();
            strategy.appendField(locator, this, "ctry", buffer, theCtry);
        }
        {
            List<String> theAdrLines;
            theAdrLines = (((this.adrLines!= null)&&(!this.adrLines.isEmpty()))?this.getAdrLines():null);
            strategy.appendField(locator, this, "adrLines", buffer, theAdrLines);
        }
        return buffer;
    }

}
