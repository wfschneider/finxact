//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.admn_002_001;

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
 * <p>Java class for SignOnResp_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignOnResp_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:admn.002.001.01}Max35Text"/&gt;
 *         &lt;element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:admn.002.001.01}BranchAndFinancialInstitutionIdentification4ADMN"/&gt;
 *         &lt;element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:admn.002.001.01}BranchAndFinancialInstitutionIdentification4ADMN"/&gt;
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:admn.002.001.01}TransactionGroupStatus3Code_Admin"/&gt;
 *         &lt;element name="StsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:admn.002.001.01}StatusReasonInformation8_TCH" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignOnResp_TCH", propOrder = {
    "orgnlInstrId",
    "instgAgt",
    "instdAgt",
    "sts",
    "stsRsnInf"
})
public class SignOnRespTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OrgnlInstrId", required = true)
    protected String orgnlInstrId;
    @XmlElement(name = "InstgAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification4ADMN instgAgt;
    @XmlElement(name = "InstdAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification4ADMN instdAgt;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionGroupStatus3CodeAdmin sts;
    @XmlElement(name = "StsRsnInf")
    protected StatusReasonInformation8TCH stsRsnInf;

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4ADMN }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4ADMN getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4ADMN }
     *     
     */
    public void setInstgAgt(BranchAndFinancialInstitutionIdentification4ADMN value) {
        this.instgAgt = value;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4ADMN }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4ADMN getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4ADMN }
     *     
     */
    public void setInstdAgt(BranchAndFinancialInstitutionIdentification4ADMN value) {
        this.instdAgt = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionGroupStatus3CodeAdmin }
     *     
     */
    public TransactionGroupStatus3CodeAdmin getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionGroupStatus3CodeAdmin }
     *     
     */
    public void setSts(TransactionGroupStatus3CodeAdmin value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonInformation8TCH }
     *     
     */
    public StatusReasonInformation8TCH getStsRsnInf() {
        return stsRsnInf;
    }

    /**
     * Sets the value of the stsRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonInformation8TCH }
     *     
     */
    public void setStsRsnInf(StatusReasonInformation8TCH value) {
        this.stsRsnInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SignOnRespTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SignOnRespTCH that = ((SignOnRespTCH) object);
        {
            String lhsOrgnlInstrId;
            lhsOrgnlInstrId = this.getOrgnlInstrId();
            String rhsOrgnlInstrId;
            rhsOrgnlInstrId = that.getOrgnlInstrId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlInstrId", lhsOrgnlInstrId), LocatorUtils.property(thatLocator, "orgnlInstrId", rhsOrgnlInstrId), lhsOrgnlInstrId, rhsOrgnlInstrId)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification4ADMN lhsInstgAgt;
            lhsInstgAgt = this.getInstgAgt();
            BranchAndFinancialInstitutionIdentification4ADMN rhsInstgAgt;
            rhsInstgAgt = that.getInstgAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instgAgt", lhsInstgAgt), LocatorUtils.property(thatLocator, "instgAgt", rhsInstgAgt), lhsInstgAgt, rhsInstgAgt)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification4ADMN lhsInstdAgt;
            lhsInstdAgt = this.getInstdAgt();
            BranchAndFinancialInstitutionIdentification4ADMN rhsInstdAgt;
            rhsInstdAgt = that.getInstdAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instdAgt", lhsInstdAgt), LocatorUtils.property(thatLocator, "instdAgt", rhsInstdAgt), lhsInstdAgt, rhsInstdAgt)) {
                return false;
            }
        }
        {
            TransactionGroupStatus3CodeAdmin lhsSts;
            lhsSts = this.getSts();
            TransactionGroupStatus3CodeAdmin rhsSts;
            rhsSts = that.getSts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sts", lhsSts), LocatorUtils.property(thatLocator, "sts", rhsSts), lhsSts, rhsSts)) {
                return false;
            }
        }
        {
            StatusReasonInformation8TCH lhsStsRsnInf;
            lhsStsRsnInf = this.getStsRsnInf();
            StatusReasonInformation8TCH rhsStsRsnInf;
            rhsStsRsnInf = that.getStsRsnInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stsRsnInf", lhsStsRsnInf), LocatorUtils.property(thatLocator, "stsRsnInf", rhsStsRsnInf), lhsStsRsnInf, rhsStsRsnInf)) {
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
            String theOrgnlInstrId;
            theOrgnlInstrId = this.getOrgnlInstrId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlInstrId", theOrgnlInstrId), currentHashCode, theOrgnlInstrId);
        }
        {
            BranchAndFinancialInstitutionIdentification4ADMN theInstgAgt;
            theInstgAgt = this.getInstgAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instgAgt", theInstgAgt), currentHashCode, theInstgAgt);
        }
        {
            BranchAndFinancialInstitutionIdentification4ADMN theInstdAgt;
            theInstdAgt = this.getInstdAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instdAgt", theInstdAgt), currentHashCode, theInstdAgt);
        }
        {
            TransactionGroupStatus3CodeAdmin theSts;
            theSts = this.getSts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sts", theSts), currentHashCode, theSts);
        }
        {
            StatusReasonInformation8TCH theStsRsnInf;
            theStsRsnInf = this.getStsRsnInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stsRsnInf", theStsRsnInf), currentHashCode, theStsRsnInf);
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
            String theOrgnlInstrId;
            theOrgnlInstrId = this.getOrgnlInstrId();
            strategy.appendField(locator, this, "orgnlInstrId", buffer, theOrgnlInstrId);
        }
        {
            BranchAndFinancialInstitutionIdentification4ADMN theInstgAgt;
            theInstgAgt = this.getInstgAgt();
            strategy.appendField(locator, this, "instgAgt", buffer, theInstgAgt);
        }
        {
            BranchAndFinancialInstitutionIdentification4ADMN theInstdAgt;
            theInstdAgt = this.getInstdAgt();
            strategy.appendField(locator, this, "instdAgt", buffer, theInstdAgt);
        }
        {
            TransactionGroupStatus3CodeAdmin theSts;
            theSts = this.getSts();
            strategy.appendField(locator, this, "sts", buffer, theSts);
        }
        {
            StatusReasonInformation8TCH theStsRsnInf;
            theStsRsnInf = this.getStsRsnInf();
            strategy.appendField(locator, this, "stsRsnInf", buffer, theStsRsnInf);
        }
        return buffer;
    }

}
