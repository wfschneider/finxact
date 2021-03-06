//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pain_013_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for PaymentInstruction31 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInstruction31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}PaymentMethod7Code"/&gt;
 *         &lt;element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}DateAndDateTime2Choice"/&gt;
 *         &lt;element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}DateAndDateTime2Choice" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}PartyIdentification135"/&gt;
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}BranchAndFinancialInstitutionIdentification6"/&gt;
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="CdtTrfTx" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}CreditTransferTransaction35" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction31", propOrder = {
    "pmtInfId",
    "pmtMtd",
    "reqdExctnDt",
    "xpryDt",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "ultmtDbtr",
    "cdtTrfTxes"
})
public class PaymentInstruction31
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "PmtInfId")
    protected String pmtInfId;
    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod7Code pmtMtd;
    @XmlElement(name = "ReqdExctnDt", required = true)
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "XpryDt")
    protected DateAndDateTime2Choice xpryDt;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification135 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "CdtTrfTx", required = true)
    protected List<CreditTransferTransaction35> cdtTrfTxes;

    /**
     * Gets the value of the pmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInfId() {
        return pmtInfId;
    }

    /**
     * Sets the value of the pmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInfId(String value) {
        this.pmtInfId = value;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod7Code }
     *     
     */
    public PaymentMethod7Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod7Code }
     *     
     */
    public void setPmtMtd(PaymentMethod7Code value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setXpryDt(DateAndDateTime2Choice value) {
        this.xpryDt = value;
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
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
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
     * Gets the value of the cdtTrfTxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtTrfTxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtTrfTxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferTransaction35 }
     * 
     * 
     */
    public List<CreditTransferTransaction35> getCdtTrfTxes() {
        if (cdtTrfTxes == null) {
            cdtTrfTxes = new ArrayList<CreditTransferTransaction35>();
        }
        return this.cdtTrfTxes;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentInstruction31)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentInstruction31 that = ((PaymentInstruction31) object);
        {
            String lhsPmtInfId;
            lhsPmtInfId = this.getPmtInfId();
            String rhsPmtInfId;
            rhsPmtInfId = that.getPmtInfId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtInfId", lhsPmtInfId), LocatorUtils.property(thatLocator, "pmtInfId", rhsPmtInfId), lhsPmtInfId, rhsPmtInfId)) {
                return false;
            }
        }
        {
            PaymentMethod7Code lhsPmtMtd;
            lhsPmtMtd = this.getPmtMtd();
            PaymentMethod7Code rhsPmtMtd;
            rhsPmtMtd = that.getPmtMtd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtMtd", lhsPmtMtd), LocatorUtils.property(thatLocator, "pmtMtd", rhsPmtMtd), lhsPmtMtd, rhsPmtMtd)) {
                return false;
            }
        }
        {
            DateAndDateTime2Choice lhsReqdExctnDt;
            lhsReqdExctnDt = this.getReqdExctnDt();
            DateAndDateTime2Choice rhsReqdExctnDt;
            rhsReqdExctnDt = that.getReqdExctnDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqdExctnDt", lhsReqdExctnDt), LocatorUtils.property(thatLocator, "reqdExctnDt", rhsReqdExctnDt), lhsReqdExctnDt, rhsReqdExctnDt)) {
                return false;
            }
        }
        {
            DateAndDateTime2Choice lhsXpryDt;
            lhsXpryDt = this.getXpryDt();
            DateAndDateTime2Choice rhsXpryDt;
            rhsXpryDt = that.getXpryDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xpryDt", lhsXpryDt), LocatorUtils.property(thatLocator, "xpryDt", rhsXpryDt), lhsXpryDt, rhsXpryDt)) {
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
            CashAccount38 lhsDbtrAcct;
            lhsDbtrAcct = this.getDbtrAcct();
            CashAccount38 rhsDbtrAcct;
            rhsDbtrAcct = that.getDbtrAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbtrAcct", lhsDbtrAcct), LocatorUtils.property(thatLocator, "dbtrAcct", rhsDbtrAcct), lhsDbtrAcct, rhsDbtrAcct)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification6 lhsDbtrAgt;
            lhsDbtrAgt = this.getDbtrAgt();
            BranchAndFinancialInstitutionIdentification6 rhsDbtrAgt;
            rhsDbtrAgt = that.getDbtrAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbtrAgt", lhsDbtrAgt), LocatorUtils.property(thatLocator, "dbtrAgt", rhsDbtrAgt), lhsDbtrAgt, rhsDbtrAgt)) {
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
            List<CreditTransferTransaction35> lhsCdtTrfTxes;
            lhsCdtTrfTxes = (((this.cdtTrfTxes!= null)&&(!this.cdtTrfTxes.isEmpty()))?this.getCdtTrfTxes():null);
            List<CreditTransferTransaction35> rhsCdtTrfTxes;
            rhsCdtTrfTxes = (((that.cdtTrfTxes!= null)&&(!that.cdtTrfTxes.isEmpty()))?that.getCdtTrfTxes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtTrfTxes", lhsCdtTrfTxes), LocatorUtils.property(thatLocator, "cdtTrfTxes", rhsCdtTrfTxes), lhsCdtTrfTxes, rhsCdtTrfTxes)) {
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
            String thePmtInfId;
            thePmtInfId = this.getPmtInfId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtInfId", thePmtInfId), currentHashCode, thePmtInfId);
        }
        {
            PaymentMethod7Code thePmtMtd;
            thePmtMtd = this.getPmtMtd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtMtd", thePmtMtd), currentHashCode, thePmtMtd);
        }
        {
            DateAndDateTime2Choice theReqdExctnDt;
            theReqdExctnDt = this.getReqdExctnDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqdExctnDt", theReqdExctnDt), currentHashCode, theReqdExctnDt);
        }
        {
            DateAndDateTime2Choice theXpryDt;
            theXpryDt = this.getXpryDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xpryDt", theXpryDt), currentHashCode, theXpryDt);
        }
        {
            PartyIdentification135 theDbtr;
            theDbtr = this.getDbtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtr", theDbtr), currentHashCode, theDbtr);
        }
        {
            CashAccount38 theDbtrAcct;
            theDbtrAcct = this.getDbtrAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtrAcct", theDbtrAcct), currentHashCode, theDbtrAcct);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theDbtrAgt;
            theDbtrAgt = this.getDbtrAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtrAgt", theDbtrAgt), currentHashCode, theDbtrAgt);
        }
        {
            PartyIdentification135 theUltmtDbtr;
            theUltmtDbtr = this.getUltmtDbtr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ultmtDbtr", theUltmtDbtr), currentHashCode, theUltmtDbtr);
        }
        {
            List<CreditTransferTransaction35> theCdtTrfTxes;
            theCdtTrfTxes = (((this.cdtTrfTxes!= null)&&(!this.cdtTrfTxes.isEmpty()))?this.getCdtTrfTxes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtTrfTxes", theCdtTrfTxes), currentHashCode, theCdtTrfTxes);
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
            String thePmtInfId;
            thePmtInfId = this.getPmtInfId();
            strategy.appendField(locator, this, "pmtInfId", buffer, thePmtInfId);
        }
        {
            PaymentMethod7Code thePmtMtd;
            thePmtMtd = this.getPmtMtd();
            strategy.appendField(locator, this, "pmtMtd", buffer, thePmtMtd);
        }
        {
            DateAndDateTime2Choice theReqdExctnDt;
            theReqdExctnDt = this.getReqdExctnDt();
            strategy.appendField(locator, this, "reqdExctnDt", buffer, theReqdExctnDt);
        }
        {
            DateAndDateTime2Choice theXpryDt;
            theXpryDt = this.getXpryDt();
            strategy.appendField(locator, this, "xpryDt", buffer, theXpryDt);
        }
        {
            PartyIdentification135 theDbtr;
            theDbtr = this.getDbtr();
            strategy.appendField(locator, this, "dbtr", buffer, theDbtr);
        }
        {
            CashAccount38 theDbtrAcct;
            theDbtrAcct = this.getDbtrAcct();
            strategy.appendField(locator, this, "dbtrAcct", buffer, theDbtrAcct);
        }
        {
            BranchAndFinancialInstitutionIdentification6 theDbtrAgt;
            theDbtrAgt = this.getDbtrAgt();
            strategy.appendField(locator, this, "dbtrAgt", buffer, theDbtrAgt);
        }
        {
            PartyIdentification135 theUltmtDbtr;
            theUltmtDbtr = this.getUltmtDbtr();
            strategy.appendField(locator, this, "ultmtDbtr", buffer, theUltmtDbtr);
        }
        {
            List<CreditTransferTransaction35> theCdtTrfTxes;
            theCdtTrfTxes = (((this.cdtTrfTxes!= null)&&(!this.cdtTrfTxes.isEmpty()))?this.getCdtTrfTxes():null);
            strategy.appendField(locator, this, "cdtTrfTxes", buffer, theCdtTrfTxes);
        }
        return buffer;
    }

}
