//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.camt_028_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrigMsgName_TCH_2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrigMsgName_TCH_2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pacs.008.001.08"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="35"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrigMsgName_TCH_2")
@XmlEnum
public enum OrigMsgNameTCH2 {

    @XmlEnumValue("pacs.008.001.08")
    PACS_008_001_08("pacs.008.001.08");
    private final String value;

    OrigMsgNameTCH2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrigMsgNameTCH2 fromValue(String v) {
        for (OrigMsgNameTCH2 c: OrigMsgNameTCH2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
