//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pain_014_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AC02"/&gt;
 *     &lt;enumeration value="AC03"/&gt;
 *     &lt;enumeration value="AC04"/&gt;
 *     &lt;enumeration value="AC06"/&gt;
 *     &lt;enumeration value="AC07"/&gt;
 *     &lt;enumeration value="AG01"/&gt;
 *     &lt;enumeration value="AG03"/&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="AM02"/&gt;
 *     &lt;enumeration value="AM04"/&gt;
 *     &lt;enumeration value="AM09"/&gt;
 *     &lt;enumeration value="AM11"/&gt;
 *     &lt;enumeration value="AM12"/&gt;
 *     &lt;enumeration value="AM13"/&gt;
 *     &lt;enumeration value="AM14"/&gt;
 *     &lt;enumeration value="BE04"/&gt;
 *     &lt;enumeration value="BE06"/&gt;
 *     &lt;enumeration value="BE07"/&gt;
 *     &lt;enumeration value="BE10"/&gt;
 *     &lt;enumeration value="BE11"/&gt;
 *     &lt;enumeration value="BE13"/&gt;
 *     &lt;enumeration value="BE14"/&gt;
 *     &lt;enumeration value="BE16"/&gt;
 *     &lt;enumeration value="BE17"/&gt;
 *     &lt;enumeration value="DS0H"/&gt;
 *     &lt;enumeration value="DS24"/&gt;
 *     &lt;enumeration value="DT04"/&gt;
 *     &lt;enumeration value="DUPL"/&gt;
 *     &lt;enumeration value="FF02"/&gt;
 *     &lt;enumeration value="FF03"/&gt;
 *     &lt;enumeration value="FF08"/&gt;
 *     &lt;enumeration value="MD07"/&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *     &lt;enumeration value="RC01"/&gt;
 *     &lt;enumeration value="RC02"/&gt;
 *     &lt;enumeration value="RC03"/&gt;
 *     &lt;enumeration value="RC04"/&gt;
 *     &lt;enumeration value="TM01"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalStatusReason1Code")
@XmlEnum
public enum ExternalStatusReason1Code {

    @XmlEnumValue("AC02")
    AC_02("AC02"),
    @XmlEnumValue("AC03")
    AC_03("AC03"),
    @XmlEnumValue("AC04")
    AC_04("AC04"),
    @XmlEnumValue("AC06")
    AC_06("AC06"),
    @XmlEnumValue("AC07")
    AC_07("AC07"),
    @XmlEnumValue("AG01")
    AG_01("AG01"),
    @XmlEnumValue("AG03")
    AG_03("AG03"),
    AGNT("AGNT"),
    @XmlEnumValue("AM02")
    AM_02("AM02"),
    @XmlEnumValue("AM04")
    AM_04("AM04"),
    @XmlEnumValue("AM09")
    AM_09("AM09"),
    @XmlEnumValue("AM11")
    AM_11("AM11"),
    @XmlEnumValue("AM12")
    AM_12("AM12"),
    @XmlEnumValue("AM13")
    AM_13("AM13"),
    @XmlEnumValue("AM14")
    AM_14("AM14"),
    @XmlEnumValue("BE04")
    BE_04("BE04"),
    @XmlEnumValue("BE06")
    BE_06("BE06"),
    @XmlEnumValue("BE07")
    BE_07("BE07"),
    @XmlEnumValue("BE10")
    BE_10("BE10"),
    @XmlEnumValue("BE11")
    BE_11("BE11"),
    @XmlEnumValue("BE13")
    BE_13("BE13"),
    @XmlEnumValue("BE14")
    BE_14("BE14"),
    @XmlEnumValue("BE16")
    BE_16("BE16"),
    @XmlEnumValue("BE17")
    BE_17("BE17"),
    @XmlEnumValue("DS0H")
    DS_0_H("DS0H"),
    @XmlEnumValue("DS24")
    DS_24("DS24"),
    @XmlEnumValue("DT04")
    DT_04("DT04"),
    DUPL("DUPL"),
    @XmlEnumValue("FF02")
    FF_02("FF02"),
    @XmlEnumValue("FF03")
    FF_03("FF03"),
    @XmlEnumValue("FF08")
    FF_08("FF08"),
    @XmlEnumValue("MD07")
    MD_07("MD07"),
    NARR("NARR"),
    @XmlEnumValue("RC01")
    RC_01("RC01"),
    @XmlEnumValue("RC02")
    RC_02("RC02"),
    @XmlEnumValue("RC03")
    RC_03("RC03"),
    @XmlEnumValue("RC04")
    RC_04("RC04"),
    @XmlEnumValue("TM01")
    TM_01("TM01");
    private final String value;

    ExternalStatusReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalStatusReason1Code fromValue(String v) {
        for (ExternalStatusReason1Code c: ExternalStatusReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
