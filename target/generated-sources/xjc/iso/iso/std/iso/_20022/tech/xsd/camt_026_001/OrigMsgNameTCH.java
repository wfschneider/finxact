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
 * <p>Java class for OrigMsgName_TCH.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrigMsgName_TCH"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pain.013.001.07"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="35"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrigMsgName_TCH")
@XmlEnum
public enum OrigMsgNameTCH {

    @XmlEnumValue("pain.013.001.07")
    PAIN_013_001_07("pain.013.001.07");
    private final String value;

    OrigMsgNameTCH(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrigMsgNameTCH fromValue(String v) {
        for (OrigMsgNameTCH c: OrigMsgNameTCH.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
