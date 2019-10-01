
package com.finxact.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Device detail
 * <p>
 * Details pertaining to source physical device or terminal
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_Id",
    "devType",
    "isMobile",
    "make",
    "model",
    "bootOs",
    "network",
    "owner",
    "didType",
    "didVal",
    "devHash",
    "desc",
    "ispIp",
    "ip",
    "locale"
})
public class Device {

    /**
     * Position identifier
     * <p>
     * Unique position identifier
     * 
     */
    @JsonProperty("_Id")
    @JsonPropertyDescription("Unique position identifier")
    private String id;
    /**
     * Device type
     * <p>
     * 
     * 
     */
    @JsonProperty("devType")
    private Integer devType;
    /**
     * Is mobile device
     * <p>
     * The device is mobile versus fixed
     * 
     */
    @JsonProperty("isMobile")
    @JsonPropertyDescription("The device is mobile versus fixed")
    private Boolean isMobile;
    /**
     * Device manufacturer
     * <p>
     * 
     * 
     */
    @JsonProperty("make")
    private String make;
    /**
     * Device model
     * <p>
     * 
     * 
     */
    @JsonProperty("model")
    private String model;
    /**
     * Operating system
     * <p>
     * The boot operating system and version running on the device
     * 
     */
    @JsonProperty("bootOs")
    @JsonPropertyDescription("The boot operating system and version running on the device")
    private String bootOs;
    /**
     * Network carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("network")
    private String network;
    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("Person or organization party record")
    private CreateBy owner;
    /**
     * Identifier type
     * <p>
     * The device identifier type, e.g., UDID
     * 
     */
    @JsonProperty("didType")
    @JsonPropertyDescription("The device identifier type, e.g., UDID")
    private String didType;
    /**
     * Identifier value
     * <p>
     * The electronic device identifier value
     * 
     */
    @JsonProperty("didVal")
    @JsonPropertyDescription("The electronic device identifier value")
    private String didVal;
    /**
     * Device hash
     * <p>
     * The device concatenated configuration hash
     * 
     */
    @JsonProperty("devHash")
    @JsonPropertyDescription("The device concatenated configuration hash")
    private String devHash;
    /**
     * Device description
     * <p>
     * 
     * 
     */
    @JsonProperty("desc")
    private String desc;
    /**
     * ISP IP address
     * <p>
     * The IP address of the ISP the device is using as a proxy server
     * 
     */
    @JsonProperty("ispIp")
    @JsonPropertyDescription("The IP address of the ISP the device is using as a proxy server")
    private String ispIp;
    /**
     * Home IP address
     * <p>
     * The registered or last home Ip of the device
     * 
     */
    @JsonProperty("ip")
    @JsonPropertyDescription("The registered or last home Ip of the device")
    private String ip;
    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("locale")
    @JsonPropertyDescription("Physical address")
    private Addr locale;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Position identifier
     * <p>
     * Unique position identifier
     * 
     */
    @JsonProperty("_Id")
    public String getId() {
        return id;
    }

    /**
     * Position identifier
     * <p>
     * Unique position identifier
     * 
     */
    @JsonProperty("_Id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Device type
     * <p>
     * 
     * 
     */
    @JsonProperty("devType")
    public Integer getDevType() {
        return devType;
    }

    /**
     * Device type
     * <p>
     * 
     * 
     */
    @JsonProperty("devType")
    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    /**
     * Is mobile device
     * <p>
     * The device is mobile versus fixed
     * 
     */
    @JsonProperty("isMobile")
    public Boolean getIsMobile() {
        return isMobile;
    }

    /**
     * Is mobile device
     * <p>
     * The device is mobile versus fixed
     * 
     */
    @JsonProperty("isMobile")
    public void setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
    }

    /**
     * Device manufacturer
     * <p>
     * 
     * 
     */
    @JsonProperty("make")
    public String getMake() {
        return make;
    }

    /**
     * Device manufacturer
     * <p>
     * 
     * 
     */
    @JsonProperty("make")
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Device model
     * <p>
     * 
     * 
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    /**
     * Device model
     * <p>
     * 
     * 
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Operating system
     * <p>
     * The boot operating system and version running on the device
     * 
     */
    @JsonProperty("bootOs")
    public String getBootOs() {
        return bootOs;
    }

    /**
     * Operating system
     * <p>
     * The boot operating system and version running on the device
     * 
     */
    @JsonProperty("bootOs")
    public void setBootOs(String bootOs) {
        this.bootOs = bootOs;
    }

    /**
     * Network carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    /**
     * Network carrier
     * <p>
     * 
     * 
     */
    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("owner")
    public CreateBy getOwner() {
        return owner;
    }

    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("owner")
    public void setOwner(CreateBy owner) {
        this.owner = owner;
    }

    /**
     * Identifier type
     * <p>
     * The device identifier type, e.g., UDID
     * 
     */
    @JsonProperty("didType")
    public String getDidType() {
        return didType;
    }

    /**
     * Identifier type
     * <p>
     * The device identifier type, e.g., UDID
     * 
     */
    @JsonProperty("didType")
    public void setDidType(String didType) {
        this.didType = didType;
    }

    /**
     * Identifier value
     * <p>
     * The electronic device identifier value
     * 
     */
    @JsonProperty("didVal")
    public String getDidVal() {
        return didVal;
    }

    /**
     * Identifier value
     * <p>
     * The electronic device identifier value
     * 
     */
    @JsonProperty("didVal")
    public void setDidVal(String didVal) {
        this.didVal = didVal;
    }

    /**
     * Device hash
     * <p>
     * The device concatenated configuration hash
     * 
     */
    @JsonProperty("devHash")
    public String getDevHash() {
        return devHash;
    }

    /**
     * Device hash
     * <p>
     * The device concatenated configuration hash
     * 
     */
    @JsonProperty("devHash")
    public void setDevHash(String devHash) {
        this.devHash = devHash;
    }

    /**
     * Device description
     * <p>
     * 
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Device description
     * <p>
     * 
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * ISP IP address
     * <p>
     * The IP address of the ISP the device is using as a proxy server
     * 
     */
    @JsonProperty("ispIp")
    public String getIspIp() {
        return ispIp;
    }

    /**
     * ISP IP address
     * <p>
     * The IP address of the ISP the device is using as a proxy server
     * 
     */
    @JsonProperty("ispIp")
    public void setIspIp(String ispIp) {
        this.ispIp = ispIp;
    }

    /**
     * Home IP address
     * <p>
     * The registered or last home Ip of the device
     * 
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * Home IP address
     * <p>
     * The registered or last home Ip of the device
     * 
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("locale")
    public Addr getLocale() {
        return locale;
    }

    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("locale")
    public void setLocale(Addr locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(devType).append(isMobile).append(make).append(model).append(bootOs).append(network).append(owner).append(didType).append(didVal).append(devHash).append(desc).append(ispIp).append(ip).append(locale).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Device) == false) {
            return false;
        }
        Device rhs = ((Device) other);
        return new EqualsBuilder().append(id, rhs.id).append(devType, rhs.devType).append(isMobile, rhs.isMobile).append(make, rhs.make).append(model, rhs.model).append(bootOs, rhs.bootOs).append(network, rhs.network).append(owner, rhs.owner).append(didType, rhs.didType).append(didVal, rhs.didVal).append(devHash, rhs.devHash).append(desc, rhs.desc).append(ispIp, rhs.ispIp).append(ip, rhs.ip).append(locale, rhs.locale).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
