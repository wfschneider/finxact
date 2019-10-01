//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.admn_006_001;

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
 *         &lt;element name="AdmnEchoResp" type="{urn:iso:std:iso:20022:tech:xsd:admn.006.001.01}EchoResponse"/&gt;
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
    "admnEchoResp"
})
public class Document
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "AdmnEchoResp", required = true)
    protected EchoResponse admnEchoResp;

    /**
     * Gets the value of the admnEchoResp property.
     * 
     * @return
     *     possible object is
     *     {@link EchoResponse }
     *     
     */
    public EchoResponse getAdmnEchoResp() {
        return admnEchoResp;
    }

    /**
     * Sets the value of the admnEchoResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EchoResponse }
     *     
     */
    public void setAdmnEchoResp(EchoResponse value) {
        this.admnEchoResp = value;
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
            EchoResponse lhsAdmnEchoResp;
            lhsAdmnEchoResp = this.getAdmnEchoResp();
            EchoResponse rhsAdmnEchoResp;
            rhsAdmnEchoResp = that.getAdmnEchoResp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "admnEchoResp", lhsAdmnEchoResp), LocatorUtils.property(thatLocator, "admnEchoResp", rhsAdmnEchoResp), lhsAdmnEchoResp, rhsAdmnEchoResp)) {
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
            EchoResponse theAdmnEchoResp;
            theAdmnEchoResp = this.getAdmnEchoResp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "admnEchoResp", theAdmnEchoResp), currentHashCode, theAdmnEchoResp);
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
            EchoResponse theAdmnEchoResp;
            theAdmnEchoResp = this.getAdmnEchoResp();
            strategy.appendField(locator, this, "admnEchoResp", buffer, theAdmnEchoResp);
        }
        return buffer;
    }

}