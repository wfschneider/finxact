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
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FICdtTrf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}FinancialInstitutionCreditTransferV08_DRAFT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fiCdtTrf"
})
public class Document
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "FICdtTrf", required = true)
    protected FinancialInstitutionCreditTransferV08DRAFT fiCdtTrf;

    /**
     * Gets the value of the fiCdtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionCreditTransferV08DRAFT }
     *     
     */
    public FinancialInstitutionCreditTransferV08DRAFT getFICdtTrf() {
        return fiCdtTrf;
    }

    /**
     * Sets the value of the fiCdtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionCreditTransferV08DRAFT }
     *     
     */
    public void setFICdtTrf(FinancialInstitutionCreditTransferV08DRAFT value) {
        this.fiCdtTrf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Document)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Document that = ((Document) object);
        {
            FinancialInstitutionCreditTransferV08DRAFT lhsFICdtTrf;
            lhsFICdtTrf = this.getFICdtTrf();
            FinancialInstitutionCreditTransferV08DRAFT rhsFICdtTrf;
            rhsFICdtTrf = that.getFICdtTrf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fiCdtTrf", lhsFICdtTrf), LocatorUtils.property(thatLocator, "fiCdtTrf", rhsFICdtTrf), lhsFICdtTrf, rhsFICdtTrf)) {
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
            FinancialInstitutionCreditTransferV08DRAFT theFICdtTrf;
            theFICdtTrf = this.getFICdtTrf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fiCdtTrf", theFICdtTrf), currentHashCode, theFICdtTrf);
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
            FinancialInstitutionCreditTransferV08DRAFT theFICdtTrf;
            theFICdtTrf = this.getFICdtTrf();
            strategy.appendField(locator, this, "fiCdtTrf", buffer, theFICdtTrf);
        }
        return buffer;
    }

}
