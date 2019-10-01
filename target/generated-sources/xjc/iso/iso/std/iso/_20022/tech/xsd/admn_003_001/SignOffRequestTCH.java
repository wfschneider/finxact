//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.admn_003_001;

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
 * <p>Java class for SignOffRequest_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignOffRequest_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:admn.003.001.01}GrpHdr_TCH"/&gt;
 *         &lt;element name="SignOffReq" type="{urn:iso:std:iso:20022:tech:xsd:admn.003.001.01}SignOffReq_TCH"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignOffRequest_TCH", propOrder = {
    "grpHdr",
    "signOffReq"
})
public class SignOffRequestTCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "GrpHdr", required = true)
    protected GrpHdrTCH grpHdr;
    @XmlElement(name = "SignOffReq", required = true)
    protected SignOffReqTCH signOffReq;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GrpHdrTCH }
     *     
     */
    public GrpHdrTCH getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpHdrTCH }
     *     
     */
    public void setGrpHdr(GrpHdrTCH value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the signOffReq property.
     * 
     * @return
     *     possible object is
     *     {@link SignOffReqTCH }
     *     
     */
    public SignOffReqTCH getSignOffReq() {
        return signOffReq;
    }

    /**
     * Sets the value of the signOffReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignOffReqTCH }
     *     
     */
    public void setSignOffReq(SignOffReqTCH value) {
        this.signOffReq = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SignOffRequestTCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SignOffRequestTCH that = ((SignOffRequestTCH) object);
        {
            GrpHdrTCH lhsGrpHdr;
            lhsGrpHdr = this.getGrpHdr();
            GrpHdrTCH rhsGrpHdr;
            rhsGrpHdr = that.getGrpHdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grpHdr", lhsGrpHdr), LocatorUtils.property(thatLocator, "grpHdr", rhsGrpHdr), lhsGrpHdr, rhsGrpHdr)) {
                return false;
            }
        }
        {
            SignOffReqTCH lhsSignOffReq;
            lhsSignOffReq = this.getSignOffReq();
            SignOffReqTCH rhsSignOffReq;
            rhsSignOffReq = that.getSignOffReq();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signOffReq", lhsSignOffReq), LocatorUtils.property(thatLocator, "signOffReq", rhsSignOffReq), lhsSignOffReq, rhsSignOffReq)) {
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
            GrpHdrTCH theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grpHdr", theGrpHdr), currentHashCode, theGrpHdr);
        }
        {
            SignOffReqTCH theSignOffReq;
            theSignOffReq = this.getSignOffReq();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signOffReq", theSignOffReq), currentHashCode, theSignOffReq);
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
            GrpHdrTCH theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            strategy.appendField(locator, this, "grpHdr", buffer, theGrpHdr);
        }
        {
            SignOffReqTCH theSignOffReq;
            theSignOffReq = this.getSignOffReq();
            strategy.appendField(locator, this, "signOffReq", buffer, theSignOffReq);
        }
        return buffer;
    }

}