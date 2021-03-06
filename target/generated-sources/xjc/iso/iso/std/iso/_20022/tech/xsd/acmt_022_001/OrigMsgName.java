//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package iso.std.iso._20022.tech.xsd.acmt_022_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrigMsgName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrigMsgName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="acmt.022.001.02"/&gt;
 *     &lt;enumeration value="admi.002.001.01"/&gt;
 *     &lt;enumeration value="admi.004.001.02"/&gt;
 *     &lt;enumeration value="admn.001.001.01"/&gt;
 *     &lt;enumeration value="admn.002.001.01"/&gt;
 *     &lt;enumeration value="admn.003.001.01"/&gt;
 *     &lt;enumeration value="admn.004.001.01"/&gt;
 *     &lt;enumeration value="admn.005.001.01"/&gt;
 *     &lt;enumeration value="admn.006.001.01"/&gt;
 *     &lt;enumeration value="admn.007.001.01"/&gt;
 *     &lt;enumeration value="admn.008.001.01"/&gt;
 *     &lt;enumeration value="camt.026.001.05"/&gt;
 *     &lt;enumeration value="camt.026.001.07"/&gt;
 *     &lt;enumeration value="camt.028.001.06"/&gt;
 *     &lt;enumeration value="camt.028.001.09"/&gt;
 *     &lt;enumeration value="camt.029.001.06"/&gt;
 *     &lt;enumeration value="camt.029.001.09"/&gt;
 *     &lt;enumeration value="camt.035.001.03"/&gt;
 *     &lt;enumeration value="camt.035.001.05"/&gt;
 *     &lt;enumeration value="camt.056.001.05"/&gt;
 *     &lt;enumeration value="camt.056.001.08"/&gt;
 *     &lt;enumeration value="pacs.002.001.07"/&gt;
 *     &lt;enumeration value="pacs.002.001.10"/&gt;
 *     &lt;enumeration value="pacs.008.001.06"/&gt;
 *     &lt;enumeration value="pacs.008.001.08"/&gt;
 *     &lt;enumeration value="pacs.009.001.08"/&gt;
 *     &lt;enumeration value="pacs.028.001.02"/&gt;
 *     &lt;enumeration value="pain.013.001.05"/&gt;
 *     &lt;enumeration value="pain.013.001.07"/&gt;
 *     &lt;enumeration value="pain.014.001.05"/&gt;
 *     &lt;enumeration value="pain.014.001.07"/&gt;
 *     &lt;enumeration value="remt.001.001.02"/&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="35"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrigMsgName")
@XmlEnum
public enum OrigMsgName {

    @XmlEnumValue("acmt.022.001.02")
    ACMT_022_001_02("acmt.022.001.02"),
    @XmlEnumValue("admi.002.001.01")
    ADMI_002_001_01("admi.002.001.01"),
    @XmlEnumValue("admi.004.001.02")
    ADMI_004_001_02("admi.004.001.02"),
    @XmlEnumValue("admn.001.001.01")
    ADMN_001_001_01("admn.001.001.01"),
    @XmlEnumValue("admn.002.001.01")
    ADMN_002_001_01("admn.002.001.01"),
    @XmlEnumValue("admn.003.001.01")
    ADMN_003_001_01("admn.003.001.01"),
    @XmlEnumValue("admn.004.001.01")
    ADMN_004_001_01("admn.004.001.01"),
    @XmlEnumValue("admn.005.001.01")
    ADMN_005_001_01("admn.005.001.01"),
    @XmlEnumValue("admn.006.001.01")
    ADMN_006_001_01("admn.006.001.01"),
    @XmlEnumValue("admn.007.001.01")
    ADMN_007_001_01("admn.007.001.01"),
    @XmlEnumValue("admn.008.001.01")
    ADMN_008_001_01("admn.008.001.01"),
    @XmlEnumValue("camt.026.001.05")
    CAMT_026_001_05("camt.026.001.05"),
    @XmlEnumValue("camt.026.001.07")
    CAMT_026_001_07("camt.026.001.07"),
    @XmlEnumValue("camt.028.001.06")
    CAMT_028_001_06("camt.028.001.06"),
    @XmlEnumValue("camt.028.001.09")
    CAMT_028_001_09("camt.028.001.09"),
    @XmlEnumValue("camt.029.001.06")
    CAMT_029_001_06("camt.029.001.06"),
    @XmlEnumValue("camt.029.001.09")
    CAMT_029_001_09("camt.029.001.09"),
    @XmlEnumValue("camt.035.001.03")
    CAMT_035_001_03("camt.035.001.03"),
    @XmlEnumValue("camt.035.001.05")
    CAMT_035_001_05("camt.035.001.05"),
    @XmlEnumValue("camt.056.001.05")
    CAMT_056_001_05("camt.056.001.05"),
    @XmlEnumValue("camt.056.001.08")
    CAMT_056_001_08("camt.056.001.08"),
    @XmlEnumValue("pacs.002.001.07")
    PACS_002_001_07("pacs.002.001.07"),
    @XmlEnumValue("pacs.002.001.10")
    PACS_002_001_10("pacs.002.001.10"),
    @XmlEnumValue("pacs.008.001.06")
    PACS_008_001_06("pacs.008.001.06"),
    @XmlEnumValue("pacs.008.001.08")
    PACS_008_001_08("pacs.008.001.08"),
    @XmlEnumValue("pacs.009.001.08")
    PACS_009_001_08("pacs.009.001.08"),
    @XmlEnumValue("pacs.028.001.02")
    PACS_028_001_02("pacs.028.001.02"),
    @XmlEnumValue("pain.013.001.05")
    PAIN_013_001_05("pain.013.001.05"),
    @XmlEnumValue("pain.013.001.07")
    PAIN_013_001_07("pain.013.001.07"),
    @XmlEnumValue("pain.014.001.05")
    PAIN_014_001_05("pain.014.001.05"),
    @XmlEnumValue("pain.014.001.07")
    PAIN_014_001_07("pain.014.001.07"),
    @XmlEnumValue("remt.001.001.02")
    REMT_001_001_02("remt.001.001.02");
    private final String value;

    OrigMsgName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrigMsgName fromValue(String v) {
        for (OrigMsgName c: OrigMsgName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
