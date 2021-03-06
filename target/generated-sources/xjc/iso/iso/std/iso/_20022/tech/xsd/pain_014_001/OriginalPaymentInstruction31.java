//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pain_014_001;

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
 * <p>Java class for OriginalPaymentInstruction31 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalPaymentInstruction31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlPmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.07}Max35Text"/&gt;
 *         &lt;element name="TxInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.07}PaymentTransaction98" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalPaymentInstruction31", propOrder = {
    "orgnlPmtInfId",
    "txInfAndSts"
})
public class OriginalPaymentInstruction31
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OrgnlPmtInfId", required = true)
    protected String orgnlPmtInfId;
    @XmlElement(name = "TxInfAndSts")
    protected List<PaymentTransaction98> txInfAndSts;

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
    }

    /**
     * Gets the value of the txInfAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txInfAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInfAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction98 }
     * 
     * 
     */
    public List<PaymentTransaction98> getTxInfAndSts() {
        if (txInfAndSts == null) {
            txInfAndSts = new ArrayList<PaymentTransaction98>();
        }
        return this.txInfAndSts;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OriginalPaymentInstruction31)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OriginalPaymentInstruction31 that = ((OriginalPaymentInstruction31) object);
        {
            String lhsOrgnlPmtInfId;
            lhsOrgnlPmtInfId = this.getOrgnlPmtInfId();
            String rhsOrgnlPmtInfId;
            rhsOrgnlPmtInfId = that.getOrgnlPmtInfId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlPmtInfId", lhsOrgnlPmtInfId), LocatorUtils.property(thatLocator, "orgnlPmtInfId", rhsOrgnlPmtInfId), lhsOrgnlPmtInfId, rhsOrgnlPmtInfId)) {
                return false;
            }
        }
        {
            List<PaymentTransaction98> lhsTxInfAndSts;
            lhsTxInfAndSts = (((this.txInfAndSts!= null)&&(!this.txInfAndSts.isEmpty()))?this.getTxInfAndSts():null);
            List<PaymentTransaction98> rhsTxInfAndSts;
            rhsTxInfAndSts = (((that.txInfAndSts!= null)&&(!that.txInfAndSts.isEmpty()))?that.getTxInfAndSts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txInfAndSts", lhsTxInfAndSts), LocatorUtils.property(thatLocator, "txInfAndSts", rhsTxInfAndSts), lhsTxInfAndSts, rhsTxInfAndSts)) {
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
            String theOrgnlPmtInfId;
            theOrgnlPmtInfId = this.getOrgnlPmtInfId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlPmtInfId", theOrgnlPmtInfId), currentHashCode, theOrgnlPmtInfId);
        }
        {
            List<PaymentTransaction98> theTxInfAndSts;
            theTxInfAndSts = (((this.txInfAndSts!= null)&&(!this.txInfAndSts.isEmpty()))?this.getTxInfAndSts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txInfAndSts", theTxInfAndSts), currentHashCode, theTxInfAndSts);
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
            String theOrgnlPmtInfId;
            theOrgnlPmtInfId = this.getOrgnlPmtInfId();
            strategy.appendField(locator, this, "orgnlPmtInfId", buffer, theOrgnlPmtInfId);
        }
        {
            List<PaymentTransaction98> theTxInfAndSts;
            theTxInfAndSts = (((this.txInfAndSts!= null)&&(!this.txInfAndSts.isEmpty()))?this.getTxInfAndSts():null);
            strategy.appendField(locator, this, "txInfAndSts", buffer, theTxInfAndSts);
        }
        return buffer;
    }

}
