
package com.finxact.model;

import java.util.Date;
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
 * Party to address
 * <p>
 * Party to address links
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addrType",
    "label",
    "priority",
    "validFromDtm",
    "validToDtm",
    "verifyDtm",
    "addrId",
    "yrsAddr"
})
public class Addr__ {

    /**
     * Address type
     * <p>
     * The type of address
     * (Required)
     * 
     */
    @JsonProperty("addrType")
    @JsonPropertyDescription("The type of address")
    private Integer addrType;
    /**
     * Address label
     * <p>
     * The label of this address
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("The label of this address")
    private String label;
    /**
     * Sort priority
     * <p>
     * Listing sort priority
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Listing sort priority")
    private Integer priority;
    /**
     * Valid from
     * <p>
     * Address is valid from date
     * 
     */
    @JsonProperty("validFromDtm")
    @JsonPropertyDescription("Address is valid from date")
    private Date validFromDtm;
    /**
     * Valid to
     * <p>
     * Address is valid to date
     * 
     */
    @JsonProperty("validToDtm")
    @JsonPropertyDescription("Address is valid to date")
    private Date validToDtm;
    /**
     * Verified on
     * <p>
     * Date address was last verified
     * 
     */
    @JsonProperty("verifyDtm")
    @JsonPropertyDescription("Date address was last verified")
    private Date verifyDtm;
    /**
     * Address Id
     * <p>
     * The address Id
     * (Required)
     * 
     */
    @JsonProperty("addrId")
    @JsonPropertyDescription("The address Id")
    private String addrId;
    /**
     * Years at Address
     * <p>
     * The years at this addess
     * 
     */
    @JsonProperty("yrsAddr")
    @JsonPropertyDescription("The years at this addess")
    private Integer yrsAddr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address type
     * <p>
     * The type of address
     * (Required)
     * 
     */
    @JsonProperty("addrType")
    public Integer getAddrType() {
        return addrType;
    }

    /**
     * Address type
     * <p>
     * The type of address
     * (Required)
     * 
     */
    @JsonProperty("addrType")
    public void setAddrType(Integer addrType) {
        this.addrType = addrType;
    }

    /**
     * Address label
     * <p>
     * The label of this address
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Address label
     * <p>
     * The label of this address
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Sort priority
     * <p>
     * Listing sort priority
     * 
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sort priority
     * <p>
     * Listing sort priority
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Valid from
     * <p>
     * Address is valid from date
     * 
     */
    @JsonProperty("validFromDtm")
    public Date getValidFromDtm() {
        return validFromDtm;
    }

    /**
     * Valid from
     * <p>
     * Address is valid from date
     * 
     */
    @JsonProperty("validFromDtm")
    public void setValidFromDtm(Date validFromDtm) {
        this.validFromDtm = validFromDtm;
    }

    /**
     * Valid to
     * <p>
     * Address is valid to date
     * 
     */
    @JsonProperty("validToDtm")
    public Date getValidToDtm() {
        return validToDtm;
    }

    /**
     * Valid to
     * <p>
     * Address is valid to date
     * 
     */
    @JsonProperty("validToDtm")
    public void setValidToDtm(Date validToDtm) {
        this.validToDtm = validToDtm;
    }

    /**
     * Verified on
     * <p>
     * Date address was last verified
     * 
     */
    @JsonProperty("verifyDtm")
    public Date getVerifyDtm() {
        return verifyDtm;
    }

    /**
     * Verified on
     * <p>
     * Date address was last verified
     * 
     */
    @JsonProperty("verifyDtm")
    public void setVerifyDtm(Date verifyDtm) {
        this.verifyDtm = verifyDtm;
    }

    /**
     * Address Id
     * <p>
     * The address Id
     * (Required)
     * 
     */
    @JsonProperty("addrId")
    public String getAddrId() {
        return addrId;
    }

    /**
     * Address Id
     * <p>
     * The address Id
     * (Required)
     * 
     */
    @JsonProperty("addrId")
    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    /**
     * Years at Address
     * <p>
     * The years at this addess
     * 
     */
    @JsonProperty("yrsAddr")
    public Integer getYrsAddr() {
        return yrsAddr;
    }

    /**
     * Years at Address
     * <p>
     * The years at this addess
     * 
     */
    @JsonProperty("yrsAddr")
    public void setYrsAddr(Integer yrsAddr) {
        this.yrsAddr = yrsAddr;
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
        return new HashCodeBuilder().append(addrType).append(label).append(priority).append(validFromDtm).append(validToDtm).append(verifyDtm).append(addrId).append(yrsAddr).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Addr__) == false) {
            return false;
        }
        Addr__ rhs = ((Addr__) other);
        return new EqualsBuilder().append(addrType, rhs.addrType).append(label, rhs.label).append(priority, rhs.priority).append(validFromDtm, rhs.validFromDtm).append(validToDtm, rhs.validToDtm).append(verifyDtm, rhs.verifyDtm).append(addrId, rhs.addrId).append(yrsAddr, rhs.yrsAddr).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
