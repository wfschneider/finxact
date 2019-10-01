//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_028_001;

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
 * <p>Java class for PaymentComplementaryInformation8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentComplementaryInformation8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.028.001.09}RemittanceInformation16" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentComplementaryInformation8", propOrder = {
    "instrId",
    "endToEndId",
    "txId",
    "ultmtDbtr",
    "dbtr",
    "cdtr",
    "ultmtCdtr",
    "rmtInf"
})
public class PaymentComplementaryInformation8
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "EndToEndId")
    protected String endToEndId;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification135 dbtr;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation16 rmtInf;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification135 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setDbtr(PartyIdentification135 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setCdtr(PartyIdentification135 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtCdtr(PartyIdentification135 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation16 }
     *     
     */
    public RemittanceInformation16 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation16 }
     *     
     */
    public void setRmtInf(RemittanceInformation16 value) {
        this.rmtInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentComplementaryInformation8)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentComplementaryInformation8 that = ((PaymentComplementaryInformation8) object);
        {
            String lhsInstrId;
            lhsInstrId = this.getInstrId();
            String rhsInstrId;
            rhsInstrId = that.getInstrId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrId", lhsInstrId), LocatorUtils.property(thatLocator, "instrId", rhsInstrId), lhsInstrId, rhsInstrId)) {
                return false;
            }
        }
        {
            String lhsEndToEndId;
            lhsEndToEndId = this.getEndToEndId();
            String rhsEndToEndId;
            rhsEndToEndId = that.getEndToEndId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endToEndId", lhsEndToEndId), LocatorUtils.property(thatLocator, "endToEndId", rhsEndToEndId), lhsEndToEndId, rhsEndToEndId)) {
                return false;
            }
        }
        {
            String lhsTxId;
            lhsTxId = this.getTxId();
            String rhsTxId;
            rhsTxId = that.getTxId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txId", lhsTxId), LocatorUtils.property(thatLocator, "txId", rhsTxId), lhsTxId, rhsTxId)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsUltmtDbtr;
            lhsUltmtDbtr = this.getUltmtDbtr();
            PartyIdentification135 rhsUltmtDbtr;
            rhsUltmtDbtr = that.getUltmtDbtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ultmtDbtr", lhsUltmtDbtr), LocatorUtils.property(thatLocator, "ultmtDbtr", rhsUltmtDbtr), lhsUltmtDbtr, rhsUltmtDbtr)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsDbtr;
            lhsDbtr = this.getDbtr();
            PartyIdentification135 rhsDbtr;
            rhsDbtr = that.getDbtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbtr", lhsDbtr), LocatorUtils.property(thatLocator, "dbtr", rhsDbtr), lhsDbtr, rhsDbtr)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsCdtr;
            lhsCdtr = this.getCdtr();
            PartyIdentification135 rhsCdtr;
            rhsCdtr = that.getCdtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtr", lhsCdtr), LocatorUtils.property(thatLocator, "cdtr", rhsCdtr), lhsCdtr, rhsCdtr)) {
                return false;
            }
        }
        {
            PartyIdentification135 lhsUltmtCdtr;
            lhsUltmtCdtr = this.getUltmtCdtr();
            PartyIdentification135 rhsUltmtCdtr;
            rhsUltmtCdtr = that.getUltmtCdtr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ultmtCdtr", lhsUltmtCdtr), LocatorUtils.property(thatLocator, "ultmtCdtr", rhsUltmtCdtr), lhsUltmtCdtr, rhsUltmtCdtr)) {
                return false;
            }
        }
        {
            RemittanceInformation16 lhsRmtInf;
            lhsRmtInf = this.getRmtInf();
            RemittanceInformation16 rhsRmtInf;
            rhsRmtInf = that.getRmtInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rmtInf", lhsRmtInf), LocatorUtils.property(thatLocator, "rmtInf", rhsRmtInf), lhsRmtInf, rhsRmtInf)) {
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
            String theInstrId;
            theInstrId = this.getInstrId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrId", theInstrId), currentHashCode, theInstrId);
        }
        {
            String theEndToEndId;
            theEndToEndId = this.getEndToEndId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endToEndId", theEndToEndId), currentHashCode, theEndToEndId);
        }
        {
            String theTxId;
            theTxId = this.getTxId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txId", theTxId), currentHashCode, theTxId);
        }
        {
            PartyIdentification135 theUltmtDbtr;
            theUltmtDbtr = this.getUltmtDbtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ultmtDbtr", theUltmtDbtr), currentHashCode, theUltmtDbtr);
        }
        {
            PartyIdentification135 theDbtr;
            theDbtr = this.getDbtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtr", theDbtr), currentHashCode, theDbtr);
        }
        {
            PartyIdentification135 theCdtr;
            theCdtr = this.getCdtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtr", theCdtr), currentHashCode, theCdtr);
        }
        {
            PartyIdentification135 theUltmtCdtr;
            theUltmtCdtr = this.getUltmtCdtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ultmtCdtr", theUltmtCdtr), currentHashCode, theUltmtCdtr);
        }
        {
            RemittanceInformation16 theRmtInf;
            theRmtInf = this.getRmtInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rmtInf", theRmtInf), currentHashCode, theRmtInf);
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
            String theInstrId;
            theInstrId = this.getInstrId();
            strategy.appendField(locator, this, "instrId", buffer, theInstrId);
        }
        {
            String theEndToEndId;
            theEndToEndId = this.getEndToEndId();
            strategy.appendField(locator, this, "endToEndId", buffer, theEndToEndId);
        }
        {
            String theTxId;
            theTxId = this.getTxId();
            strategy.appendField(locator, this, "txId", buffer, theTxId);
        }
        {
            PartyIdentification135 theUltmtDbtr;
            theUltmtDbtr = this.getUltmtDbtr();
            strategy.appendField(locator, this, "ultmtDbtr", buffer, theUltmtDbtr);
        }
        {
            PartyIdentification135 theDbtr;
            theDbtr = this.getDbtr();
            strategy.appendField(locator, this, "dbtr", buffer, theDbtr);
        }
        {
            PartyIdentification135 theCdtr;
            theCdtr = this.getCdtr();
            strategy.appendField(locator, this, "cdtr", buffer, theCdtr);
        }
        {
            PartyIdentification135 theUltmtCdtr;
            theUltmtCdtr = this.getUltmtCdtr();
            strategy.appendField(locator, this, "ultmtCdtr", buffer, theUltmtCdtr);
        }
        {
            RemittanceInformation16 theRmtInf;
            theRmtInf = this.getRmtInf();
            strategy.appendField(locator, this, "rmtInf", buffer, theRmtInf);
        }
        return buffer;
    }

}
