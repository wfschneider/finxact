//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.head_001_001;

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
 * VocaLink
 * 
 * <p>Java class for BusinessApplicationHeaderV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessApplicationHeaderV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Party9Choice"/&gt;
 *         &lt;element name="To" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Party9Choice"/&gt;
 *         &lt;element name="BizMsgIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Max35Text"/&gt;
 *         &lt;element name="MsgDefIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}OrigMsgName"/&gt;
 *         &lt;element name="CreDt" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}ISONormalisedDateTime"/&gt;
 *         &lt;element name="CpyDplct" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}CopyDuplicate1Code" minOccurs="0"/&gt;
 *         &lt;element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}SignatureEnvelope" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessApplicationHeaderV01", propOrder = {
    "fr",
    "to",
    "bizMsgIdr",
    "msgDefIdr",
    "creDt",
    "cpyDplct",
    "sgntr"
})
public class BusinessApplicationHeaderV01
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Fr", required = true)
    protected Party9Choice fr;
    @XmlElement(name = "To", required = true)
    protected Party9Choice to;
    @XmlElement(name = "BizMsgIdr", required = true)
    protected String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr", required = true)
    @XmlSchemaType(name = "string")
    protected OrigMsgName msgDefIdr;
    @XmlElement(name = "CreDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDt;
    @XmlElement(name = "CpyDplct")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplct;
    @XmlElement(name = "Sgntr")
    protected SignatureEnvelope sgntr;

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link Party9Choice }
     *     
     */
    public Party9Choice getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party9Choice }
     *     
     */
    public void setFr(Party9Choice value) {
        this.fr = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Party9Choice }
     *     
     */
    public Party9Choice getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party9Choice }
     *     
     */
    public void setTo(Party9Choice value) {
        this.to = value;
    }

    /**
     * Gets the value of the bizMsgIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizMsgIdr() {
        return bizMsgIdr;
    }

    /**
     * Sets the value of the bizMsgIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizMsgIdr(String value) {
        this.bizMsgIdr = value;
    }

    /**
     * Gets the value of the msgDefIdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrigMsgName }
     *     
     */
    public OrigMsgName getMsgDefIdr() {
        return msgDefIdr;
    }

    /**
     * Sets the value of the msgDefIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigMsgName }
     *     
     */
    public void setMsgDefIdr(OrigMsgName value) {
        this.msgDefIdr = value;
    }

    /**
     * Gets the value of the creDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDt() {
        return creDt;
    }

    /**
     * Sets the value of the creDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDt(XMLGregorianCalendar value) {
        this.creDt = value;
    }

    /**
     * Gets the value of the cpyDplct property.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplct() {
        return cpyDplct;
    }

    /**
     * Sets the value of the cpyDplct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public void setCpyDplct(CopyDuplicate1Code value) {
        this.cpyDplct = value;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelope }
     *     
     */
    public SignatureEnvelope getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelope }
     *     
     */
    public void setSgntr(SignatureEnvelope value) {
        this.sgntr = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BusinessApplicationHeaderV01)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BusinessApplicationHeaderV01 that = ((BusinessApplicationHeaderV01) object);
        {
            Party9Choice lhsFr;
            lhsFr = this.getFr();
            Party9Choice rhsFr;
            rhsFr = that.getFr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fr", lhsFr), LocatorUtils.property(thatLocator, "fr", rhsFr), lhsFr, rhsFr)) {
                return false;
            }
        }
        {
            Party9Choice lhsTo;
            lhsTo = this.getTo();
            Party9Choice rhsTo;
            rhsTo = that.getTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "to", lhsTo), LocatorUtils.property(thatLocator, "to", rhsTo), lhsTo, rhsTo)) {
                return false;
            }
        }
        {
            String lhsBizMsgIdr;
            lhsBizMsgIdr = this.getBizMsgIdr();
            String rhsBizMsgIdr;
            rhsBizMsgIdr = that.getBizMsgIdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bizMsgIdr", lhsBizMsgIdr), LocatorUtils.property(thatLocator, "bizMsgIdr", rhsBizMsgIdr), lhsBizMsgIdr, rhsBizMsgIdr)) {
                return false;
            }
        }
        {
            OrigMsgName lhsMsgDefIdr;
            lhsMsgDefIdr = this.getMsgDefIdr();
            OrigMsgName rhsMsgDefIdr;
            rhsMsgDefIdr = that.getMsgDefIdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgDefIdr", lhsMsgDefIdr), LocatorUtils.property(thatLocator, "msgDefIdr", rhsMsgDefIdr), lhsMsgDefIdr, rhsMsgDefIdr)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCreDt;
            lhsCreDt = this.getCreDt();
            XMLGregorianCalendar rhsCreDt;
            rhsCreDt = that.getCreDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creDt", lhsCreDt), LocatorUtils.property(thatLocator, "creDt", rhsCreDt), lhsCreDt, rhsCreDt)) {
                return false;
            }
        }
        {
            CopyDuplicate1Code lhsCpyDplct;
            lhsCpyDplct = this.getCpyDplct();
            CopyDuplicate1Code rhsCpyDplct;
            rhsCpyDplct = that.getCpyDplct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpyDplct", lhsCpyDplct), LocatorUtils.property(thatLocator, "cpyDplct", rhsCpyDplct), lhsCpyDplct, rhsCpyDplct)) {
                return false;
            }
        }
        {
            SignatureEnvelope lhsSgntr;
            lhsSgntr = this.getSgntr();
            SignatureEnvelope rhsSgntr;
            rhsSgntr = that.getSgntr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sgntr", lhsSgntr), LocatorUtils.property(thatLocator, "sgntr", rhsSgntr), lhsSgntr, rhsSgntr)) {
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
            Party9Choice theFr;
            theFr = this.getFr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fr", theFr), currentHashCode, theFr);
        }
        {
            Party9Choice theTo;
            theTo = this.getTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "to", theTo), currentHashCode, theTo);
        }
        {
            String theBizMsgIdr;
            theBizMsgIdr = this.getBizMsgIdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bizMsgIdr", theBizMsgIdr), currentHashCode, theBizMsgIdr);
        }
        {
            OrigMsgName theMsgDefIdr;
            theMsgDefIdr = this.getMsgDefIdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgDefIdr", theMsgDefIdr), currentHashCode, theMsgDefIdr);
        }
        {
            XMLGregorianCalendar theCreDt;
            theCreDt = this.getCreDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creDt", theCreDt), currentHashCode, theCreDt);
        }
        {
            CopyDuplicate1Code theCpyDplct;
            theCpyDplct = this.getCpyDplct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpyDplct", theCpyDplct), currentHashCode, theCpyDplct);
        }
        {
            SignatureEnvelope theSgntr;
            theSgntr = this.getSgntr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sgntr", theSgntr), currentHashCode, theSgntr);
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
            Party9Choice theFr;
            theFr = this.getFr();
            strategy.appendField(locator, this, "fr", buffer, theFr);
        }
        {
            Party9Choice theTo;
            theTo = this.getTo();
            strategy.appendField(locator, this, "to", buffer, theTo);
        }
        {
            String theBizMsgIdr;
            theBizMsgIdr = this.getBizMsgIdr();
            strategy.appendField(locator, this, "bizMsgIdr", buffer, theBizMsgIdr);
        }
        {
            OrigMsgName theMsgDefIdr;
            theMsgDefIdr = this.getMsgDefIdr();
            strategy.appendField(locator, this, "msgDefIdr", buffer, theMsgDefIdr);
        }
        {
            XMLGregorianCalendar theCreDt;
            theCreDt = this.getCreDt();
            strategy.appendField(locator, this, "creDt", buffer, theCreDt);
        }
        {
            CopyDuplicate1Code theCpyDplct;
            theCpyDplct = this.getCpyDplct();
            strategy.appendField(locator, this, "cpyDplct", buffer, theCpyDplct);
        }
        {
            SignatureEnvelope theSgntr;
            theSgntr = this.getSgntr();
            strategy.appendField(locator, this, "sgntr", buffer, theSgntr);
        }
        return buffer;
    }

}