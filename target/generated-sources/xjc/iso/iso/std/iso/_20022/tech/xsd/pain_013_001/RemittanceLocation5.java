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
 * <p>Java class for RemittanceLocation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceLocation5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RmtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RmtLctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}RemittanceLocationDetails2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation5", propOrder = {
    "rmtId",
    "rmtLctnDtls"
})
public class RemittanceLocation5
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "RmtId")
    protected String rmtId;
    @XmlElement(name = "RmtLctnDtls")
    protected List<RemittanceLocationDetails2> rmtLctnDtls;

    /**
     * Gets the value of the rmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtId() {
        return rmtId;
    }

    /**
     * Sets the value of the rmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmtId(String value) {
        this.rmtId = value;
    }

    /**
     * Gets the value of the rmtLctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rmtLctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmtLctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocationDetails2 }
     * 
     * 
     */
    public List<RemittanceLocationDetails2> getRmtLctnDtls() {
        if (rmtLctnDtls == null) {
            rmtLctnDtls = new ArrayList<RemittanceLocationDetails2>();
        }
        return this.rmtLctnDtls;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RemittanceLocation5)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RemittanceLocation5 that = ((RemittanceLocation5) object);
        {
            String lhsRmtId;
            lhsRmtId = this.getRmtId();
            String rhsRmtId;
            rhsRmtId = that.getRmtId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rmtId", lhsRmtId), LocatorUtils.property(thatLocator, "rmtId", rhsRmtId), lhsRmtId, rhsRmtId)) {
                return false;
            }
        }
        {
            List<RemittanceLocationDetails2> lhsRmtLctnDtls;
            lhsRmtLctnDtls = (((this.rmtLctnDtls!= null)&&(!this.rmtLctnDtls.isEmpty()))?this.getRmtLctnDtls():null);
            List<RemittanceLocationDetails2> rhsRmtLctnDtls;
            rhsRmtLctnDtls = (((that.rmtLctnDtls!= null)&&(!that.rmtLctnDtls.isEmpty()))?that.getRmtLctnDtls():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rmtLctnDtls", lhsRmtLctnDtls), LocatorUtils.property(thatLocator, "rmtLctnDtls", rhsRmtLctnDtls), lhsRmtLctnDtls, rhsRmtLctnDtls)) {
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
            String theRmtId;
            theRmtId = this.getRmtId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rmtId", theRmtId), currentHashCode, theRmtId);
        }
        {
            List<RemittanceLocationDetails2> theRmtLctnDtls;
            theRmtLctnDtls = (((this.rmtLctnDtls!= null)&&(!this.rmtLctnDtls.isEmpty()))?this.getRmtLctnDtls():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rmtLctnDtls", theRmtLctnDtls), currentHashCode, theRmtLctnDtls);
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
            String theRmtId;
            theRmtId = this.getRmtId();
            strategy.appendField(locator, this, "rmtId", buffer, theRmtId);
        }
        {
            List<RemittanceLocationDetails2> theRmtLctnDtls;
            theRmtLctnDtls = (((this.rmtLctnDtls!= null)&&(!this.rmtLctnDtls.isEmpty()))?this.getRmtLctnDtls():null);
            strategy.appendField(locator, this, "rmtLctnDtls", buffer, theRmtLctnDtls);
        }
        return buffer;
    }

}
