//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pain_013_001;

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
 * <p>Java class for Document_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdtrPmtActvtnReq" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}CreditorPaymentActivationRequestV07_DRAFT_TCH"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document_TCH", propOrder = {
    "cdtrPmtActvtnReq"
})
public class DocumentTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "CdtrPmtActvtnReq", required = true)
    protected CreditorPaymentActivationRequestV07DRAFTTCH cdtrPmtActvtnReq;

    /**
     * Gets the value of the cdtrPmtActvtnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorPaymentActivationRequestV07DRAFTTCH }
     *     
     */
    public CreditorPaymentActivationRequestV07DRAFTTCH getCdtrPmtActvtnReq() {
        return cdtrPmtActvtnReq;
    }

    /**
     * Sets the value of the cdtrPmtActvtnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorPaymentActivationRequestV07DRAFTTCH }
     *     
     */
    public void setCdtrPmtActvtnReq(CreditorPaymentActivationRequestV07DRAFTTCH value) {
        this.cdtrPmtActvtnReq = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DocumentTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DocumentTCH that = ((DocumentTCH) object);
        {
            CreditorPaymentActivationRequestV07DRAFTTCH lhsCdtrPmtActvtnReq;
            lhsCdtrPmtActvtnReq = this.getCdtrPmtActvtnReq();
            CreditorPaymentActivationRequestV07DRAFTTCH rhsCdtrPmtActvtnReq;
            rhsCdtrPmtActvtnReq = that.getCdtrPmtActvtnReq();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtrPmtActvtnReq", lhsCdtrPmtActvtnReq), LocatorUtils.property(thatLocator, "cdtrPmtActvtnReq", rhsCdtrPmtActvtnReq), lhsCdtrPmtActvtnReq, rhsCdtrPmtActvtnReq)) {
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
            CreditorPaymentActivationRequestV07DRAFTTCH theCdtrPmtActvtnReq;
            theCdtrPmtActvtnReq = this.getCdtrPmtActvtnReq();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtrPmtActvtnReq", theCdtrPmtActvtnReq), currentHashCode, theCdtrPmtActvtnReq);
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
            CreditorPaymentActivationRequestV07DRAFTTCH theCdtrPmtActvtnReq;
            theCdtrPmtActvtnReq = this.getCdtrPmtActvtnReq();
            strategy.appendField(locator, this, "cdtrPmtActvtnReq", buffer, theCdtrPmtActvtnReq);
        }
        return buffer;
    }

}