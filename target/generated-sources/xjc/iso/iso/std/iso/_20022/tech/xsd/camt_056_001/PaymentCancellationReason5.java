//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_056_001;

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
 * <p>Java class for PaymentCancellationReason5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCancellationReason5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.08}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.08}CancellationReason33Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.08}Max105Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCancellationReason5", propOrder = {
    "orgtr",
    "rsn",
    "addtlInves"
})
public class PaymentCancellationReason5
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Orgtr")
    protected PartyIdentification135 orgtr;
    @XmlElement(name = "Rsn")
    protected CancellationReason33Choice rsn;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInves;

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setOrgtr(PartyIdentification135 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason33Choice }
     *     
     */
    public CancellationReason33Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason33Choice }
     *     
     */
    public void setRsn(CancellationReason33Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the addtlInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInves() {
        if (addtlInves == null) {
            addtlInves = new ArrayList<String>();
        }
        return this.addtlInves;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentCancellationReason5)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentCancellationReason5 that = ((PaymentCancellationReason5) object);
        {
            PartyIdentification135 lhsOrgtr;
            lhsOrgtr = this.getOrgtr();
            PartyIdentification135 rhsOrgtr;
            rhsOrgtr = that.getOrgtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgtr", lhsOrgtr), LocatorUtils.property(thatLocator, "orgtr", rhsOrgtr), lhsOrgtr, rhsOrgtr)) {
                return false;
            }
        }
        {
            CancellationReason33Choice lhsRsn;
            lhsRsn = this.getRsn();
            CancellationReason33Choice rhsRsn;
            rhsRsn = that.getRsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rsn", lhsRsn), LocatorUtils.property(thatLocator, "rsn", rhsRsn), lhsRsn, rhsRsn)) {
                return false;
            }
        }
        {
            List<String> lhsAddtlInves;
            lhsAddtlInves = (((this.addtlInves!= null)&&(!this.addtlInves.isEmpty()))?this.getAddtlInves():null);
            List<String> rhsAddtlInves;
            rhsAddtlInves = (((that.addtlInves!= null)&&(!that.addtlInves.isEmpty()))?that.getAddtlInves():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addtlInves", lhsAddtlInves), LocatorUtils.property(thatLocator, "addtlInves", rhsAddtlInves), lhsAddtlInves, rhsAddtlInves)) {
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
            PartyIdentification135 theOrgtr;
            theOrgtr = this.getOrgtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgtr", theOrgtr), currentHashCode, theOrgtr);
        }
        {
            CancellationReason33Choice theRsn;
            theRsn = this.getRsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rsn", theRsn), currentHashCode, theRsn);
        }
        {
            List<String> theAddtlInves;
            theAddtlInves = (((this.addtlInves!= null)&&(!this.addtlInves.isEmpty()))?this.getAddtlInves():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addtlInves", theAddtlInves), currentHashCode, theAddtlInves);
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
            PartyIdentification135 theOrgtr;
            theOrgtr = this.getOrgtr();
            strategy.appendField(locator, this, "orgtr", buffer, theOrgtr);
        }
        {
            CancellationReason33Choice theRsn;
            theRsn = this.getRsn();
            strategy.appendField(locator, this, "rsn", buffer, theRsn);
        }
        {
            List<String> theAddtlInves;
            theAddtlInves = (((this.addtlInves!= null)&&(!this.addtlInves.isEmpty()))?this.getAddtlInves():null);
            strategy.appendField(locator, this, "addtlInves", buffer, theAddtlInves);
        }
        return buffer;
    }

}