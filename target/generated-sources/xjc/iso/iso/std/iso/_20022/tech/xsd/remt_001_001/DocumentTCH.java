//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.remt_001_001;

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
 *         &lt;element name="RmtAdvc" type="{urn:iso:std:iso:20022:tech:xsd:remt.001.001.04}RemittanceAdviceV04_DRAFT_TCH"/&gt;
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
    "rmtAdvc"
})
public class DocumentTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "RmtAdvc", required = true)
    protected RemittanceAdviceV04DRAFTTCH rmtAdvc;

    /**
     * Gets the value of the rmtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAdviceV04DRAFTTCH }
     *     
     */
    public RemittanceAdviceV04DRAFTTCH getRmtAdvc() {
        return rmtAdvc;
    }

    /**
     * Sets the value of the rmtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAdviceV04DRAFTTCH }
     *     
     */
    public void setRmtAdvc(RemittanceAdviceV04DRAFTTCH value) {
        this.rmtAdvc = value;
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
            RemittanceAdviceV04DRAFTTCH lhsRmtAdvc;
            lhsRmtAdvc = this.getRmtAdvc();
            RemittanceAdviceV04DRAFTTCH rhsRmtAdvc;
            rhsRmtAdvc = that.getRmtAdvc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rmtAdvc", lhsRmtAdvc), LocatorUtils.property(thatLocator, "rmtAdvc", rhsRmtAdvc), lhsRmtAdvc, rhsRmtAdvc)) {
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
            RemittanceAdviceV04DRAFTTCH theRmtAdvc;
            theRmtAdvc = this.getRmtAdvc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rmtAdvc", theRmtAdvc), currentHashCode, theRmtAdvc);
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
            RemittanceAdviceV04DRAFTTCH theRmtAdvc;
            theRmtAdvc = this.getRmtAdvc();
            strategy.appendField(locator, this, "rmtAdvc", buffer, theRmtAdvc);
        }
        return buffer;
    }

}