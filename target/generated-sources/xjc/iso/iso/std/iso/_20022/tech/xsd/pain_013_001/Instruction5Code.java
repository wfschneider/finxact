//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pain_013_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instruction5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Instruction5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PHOB"/&gt;
 *     &lt;enumeration value="PRTK"/&gt;
 *     &lt;enumeration value="TELB"/&gt;
 *     &lt;enumeration value="TOKN"/&gt;
 *     &lt;enumeration value="VLTK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Instruction5Code")
@XmlEnum
public enum Instruction5Code {

    PHOB,
    PRTK,
    TELB,
    TOKN,
    VLTK;

    public String value() {
        return name();
    }

    public static Instruction5Code fromValue(String v) {
        return valueOf(v);
    }

}
