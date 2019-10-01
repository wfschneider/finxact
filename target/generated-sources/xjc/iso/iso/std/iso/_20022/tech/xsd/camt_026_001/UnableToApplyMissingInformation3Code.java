//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_026_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnableToApplyMissingInformation3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnableToApplyMissingInformation3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MS01"/&gt;
 *     &lt;enumeration value="MS02"/&gt;
 *     &lt;enumeration value="MS03"/&gt;
 *     &lt;enumeration value="MS04"/&gt;
 *     &lt;enumeration value="MS05"/&gt;
 *     &lt;enumeration value="MS06"/&gt;
 *     &lt;enumeration value="MS07"/&gt;
 *     &lt;enumeration value="MS08"/&gt;
 *     &lt;enumeration value="MS09"/&gt;
 *     &lt;enumeration value="MS10"/&gt;
 *     &lt;enumeration value="MS11"/&gt;
 *     &lt;enumeration value="MS12"/&gt;
 *     &lt;enumeration value="MS13"/&gt;
 *     &lt;enumeration value="MS14"/&gt;
 *     &lt;enumeration value="MS15"/&gt;
 *     &lt;enumeration value="MS16"/&gt;
 *     &lt;enumeration value="MS17"/&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnableToApplyMissingInformation3Code")
@XmlEnum
public enum UnableToApplyMissingInformation3Code {

    @XmlEnumValue("MS01")
    MS_01("MS01"),
    @XmlEnumValue("MS02")
    MS_02("MS02"),
    @XmlEnumValue("MS03")
    MS_03("MS03"),
    @XmlEnumValue("MS04")
    MS_04("MS04"),
    @XmlEnumValue("MS05")
    MS_05("MS05"),
    @XmlEnumValue("MS06")
    MS_06("MS06"),
    @XmlEnumValue("MS07")
    MS_07("MS07"),
    @XmlEnumValue("MS08")
    MS_08("MS08"),
    @XmlEnumValue("MS09")
    MS_09("MS09"),
    @XmlEnumValue("MS10")
    MS_10("MS10"),
    @XmlEnumValue("MS11")
    MS_11("MS11"),
    @XmlEnumValue("MS12")
    MS_12("MS12"),
    @XmlEnumValue("MS13")
    MS_13("MS13"),
    @XmlEnumValue("MS14")
    MS_14("MS14"),
    @XmlEnumValue("MS15")
    MS_15("MS15"),
    @XmlEnumValue("MS16")
    MS_16("MS16"),
    @XmlEnumValue("MS17")
    MS_17("MS17"),
    NARR("NARR");
    private final String value;

    UnableToApplyMissingInformation3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnableToApplyMissingInformation3Code fromValue(String v) {
        for (UnableToApplyMissingInformation3Code c: UnableToApplyMissingInformation3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}