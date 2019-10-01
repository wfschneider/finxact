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
 * <p>Java class for InstructionForCreditorAgent2_TCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstructionForCreditorAgent2_TCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}Instruction5Code_TCH"/&gt;
 *         &lt;element name="InstrInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.07}Max140Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionForCreditorAgent2_TCH", propOrder = {
    "cd",
    "instrInf"
})
public class InstructionForCreditorAgent2TCH
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected Instruction5CodeTCH cd;
    @XmlElement(name = "InstrInf", required = true)
    protected String instrInf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Instruction5CodeTCH }
     *     
     */
    public Instruction5CodeTCH getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instruction5CodeTCH }
     *     
     */
    public void setCd(Instruction5CodeTCH value) {
        this.cd = value;
    }

    /**
     * Gets the value of the instrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrInf() {
        return instrInf;
    }

    /**
     * Sets the value of the instrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrInf(String value) {
        this.instrInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InstructionForCreditorAgent2TCH)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InstructionForCreditorAgent2TCH that = ((InstructionForCreditorAgent2TCH) object);
        {
            Instruction5CodeTCH lhsCd;
            lhsCd = this.getCd();
            Instruction5CodeTCH rhsCd;
            rhsCd = that.getCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cd", lhsCd), LocatorUtils.property(thatLocator, "cd", rhsCd), lhsCd, rhsCd)) {
                return false;
            }
        }
        {
            String lhsInstrInf;
            lhsInstrInf = this.getInstrInf();
            String rhsInstrInf;
            rhsInstrInf = that.getInstrInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrInf", lhsInstrInf), LocatorUtils.property(thatLocator, "instrInf", rhsInstrInf), lhsInstrInf, rhsInstrInf)) {
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
            Instruction5CodeTCH theCd;
            theCd = this.getCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cd", theCd), currentHashCode, theCd);
        }
        {
            String theInstrInf;
            theInstrInf = this.getInstrInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrInf", theInstrInf), currentHashCode, theInstrInf);
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
            Instruction5CodeTCH theCd;
            theCd = this.getCd();
            strategy.appendField(locator, this, "cd", buffer, theCd);
        }
        {
            String theInstrInf;
            theInstrInf = this.getInstrInf();
            strategy.appendField(locator, this, "instrInf", buffer, theInstrInf);
        }
        return buffer;
    }

}
