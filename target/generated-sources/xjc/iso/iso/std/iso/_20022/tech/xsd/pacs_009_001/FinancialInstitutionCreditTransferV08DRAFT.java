//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pacs_009_001;

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
 * VocaLink
 * 
 * <p>Java class for FinancialInstitutionCreditTransferV08_DRAFT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionCreditTransferV08_DRAFT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}GroupHeader93"/&gt;
 *         &lt;element name="CdtTrfTxInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}CreditTransferTransaction36"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionCreditTransferV08_DRAFT", propOrder = {
    "grpHdr",
    "cdtTrfTxInf"
})
public class FinancialInstitutionCreditTransferV08DRAFT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader93 grpHdr;
    @XmlElement(name = "CdtTrfTxInf", required = true)
    protected CreditTransferTransaction36 cdtTrfTxInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader93 }
     *     
     */
    public GroupHeader93 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader93 }
     *     
     */
    public void setGrpHdr(GroupHeader93 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the cdtTrfTxInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction36 }
     *     
     */
    public CreditTransferTransaction36 getCdtTrfTxInf() {
        return cdtTrfTxInf;
    }

    /**
     * Sets the value of the cdtTrfTxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction36 }
     *     
     */
    public void setCdtTrfTxInf(CreditTransferTransaction36 value) {
        this.cdtTrfTxInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FinancialInstitutionCreditTransferV08DRAFT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FinancialInstitutionCreditTransferV08DRAFT that = ((FinancialInstitutionCreditTransferV08DRAFT) object);
        {
            GroupHeader93 lhsGrpHdr;
            lhsGrpHdr = this.getGrpHdr();
            GroupHeader93 rhsGrpHdr;
            rhsGrpHdr = that.getGrpHdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grpHdr", lhsGrpHdr), LocatorUtils.property(thatLocator, "grpHdr", rhsGrpHdr), lhsGrpHdr, rhsGrpHdr)) {
                return false;
            }
        }
        {
            CreditTransferTransaction36 lhsCdtTrfTxInf;
            lhsCdtTrfTxInf = this.getCdtTrfTxInf();
            CreditTransferTransaction36 rhsCdtTrfTxInf;
            rhsCdtTrfTxInf = that.getCdtTrfTxInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtTrfTxInf", lhsCdtTrfTxInf), LocatorUtils.property(thatLocator, "cdtTrfTxInf", rhsCdtTrfTxInf), lhsCdtTrfTxInf, rhsCdtTrfTxInf)) {
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
            GroupHeader93 theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grpHdr", theGrpHdr), currentHashCode, theGrpHdr);
        }
        {
            CreditTransferTransaction36 theCdtTrfTxInf;
            theCdtTrfTxInf = this.getCdtTrfTxInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtTrfTxInf", theCdtTrfTxInf), currentHashCode, theCdtTrfTxInf);
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
            GroupHeader93 theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            strategy.appendField(locator, this, "grpHdr", buffer, theGrpHdr);
        }
        {
            CreditTransferTransaction36 theCdtTrfTxInf;
            theCdtTrfTxInf = this.getCdtTrfTxInf();
            strategy.appendField(locator, this, "cdtTrfTxInf", buffer, theCdtTrfTxInf);
        }
        return buffer;
    }

}