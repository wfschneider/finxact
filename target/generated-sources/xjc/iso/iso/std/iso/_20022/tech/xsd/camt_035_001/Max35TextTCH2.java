//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_035_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Max35Text_TCH_2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Max35Text_TCH_2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACK"/&gt;
 *     &lt;enumeration value="ACWP"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Max35Text_TCH_2")
@XmlEnum
public enum Max35TextTCH2 {

    ACK,
    ACWP;

    public String value() {
        return name();
    }

    public static Max35TextTCH2 fromValue(String v) {
        return valueOf(v);
    }

}