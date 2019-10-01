
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
 * Party email
 * <p>
 * Party email
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "emailType",
    "label",
    "data",
    "isPreferred",
    "validFromDtm",
    "validToDtm",
    "verifyDtm"
})
public class Email {

    /**
     * Email type
     * <p>
     * Email type
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    @JsonPropertyDescription("Email type")
    private Integer emailType;
    /**
     * Label
     * <p>
     * Label
     * 
     */
    @JsonProperty("label")
    @JsonPropertyDescription("Label")
    private String label;
    /**
     * Data
     * <p>
     * The email address
     * (Required)
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("The email address")
    private String data;
    /**
     * Is preferred
     * <p>
     * Identifies the party's preferred email address
     * 
     */
    @JsonProperty("isPreferred")
    @JsonPropertyDescription("Identifies the party's preferred email address")
    private Boolean isPreferred;
    /**
     * Valid from
     * <p>
     * Email is valid from date
     * 
     */
    @JsonProperty("validFromDtm")
    @JsonPropertyDescription("Email is valid from date")
    private Date validFromDtm;
    /**
     * Valid to
     * <p>
     * Email is valid to date
     * 
     */
    @JsonProperty("validToDtm")
    @JsonPropertyDescription("Email is valid to date")
    private Date validToDtm;
    /**
     * Verified on
     * <p>
     * Date email was last verified
     * 
     */
    @JsonProperty("verifyDtm")
    @JsonPropertyDescription("Date email was last verified")
    private Date verifyDtm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Email type
     * <p>
     * Email type
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    public Integer getEmailType() {
        return emailType;
    }

    /**
     * Email type
     * <p>
     * Email type
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    public void setEmailType(Integer emailType) {
        this.emailType = emailType;
    }

    /**
     * Label
     * <p>
     * Label
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Label
     * <p>
     * Label
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Data
     * <p>
     * The email address
     * (Required)
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * Data
     * <p>
     * The email address
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Is preferred
     * <p>
     * Identifies the party's preferred email address
     * 
     */
    @JsonProperty("isPreferred")
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    /**
     * Is preferred
     * <p>
     * Identifies the party's preferred email address
     * 
     */
    @JsonProperty("isPreferred")
    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    /**
     * Valid from
     * <p>
     * Email is valid from date
     * 
     */
    @JsonProperty("validFromDtm")
    public Date getValidFromDtm() {
        return validFromDtm;
    }

    /**
     * Valid from
     * <p>
     * Email is valid from date
     * 
     */
    @JsonProperty("validFromDtm")
    public void setValidFromDtm(Date validFromDtm) {
        this.validFromDtm = validFromDtm;
    }

    /**
     * Valid to
     * <p>
     * Email is valid to date
     * 
     */
    @JsonProperty("validToDtm")
    public Date getValidToDtm() {
        return validToDtm;
    }

    /**
     * Valid to
     * <p>
     * Email is valid to date
     * 
     */
    @JsonProperty("validToDtm")
    public void setValidToDtm(Date validToDtm) {
        this.validToDtm = validToDtm;
    }

    /**
     * Verified on
     * <p>
     * Date email was last verified
     * 
     */
    @JsonProperty("verifyDtm")
    public Date getVerifyDtm() {
        return verifyDtm;
    }

    /**
     * Verified on
     * <p>
     * Date email was last verified
     * 
     */
    @JsonProperty("verifyDtm")
    public void setVerifyDtm(Date verifyDtm) {
        this.verifyDtm = verifyDtm;
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
        return new HashCodeBuilder().append(emailType).append(label).append(data).append(isPreferred).append(validFromDtm).append(validToDtm).append(verifyDtm).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Email) == false) {
            return false;
        }
        Email rhs = ((Email) other);
        return new EqualsBuilder().append(emailType, rhs.emailType).append(label, rhs.label).append(data, rhs.data).append(isPreferred, rhs.isPreferred).append(validFromDtm, rhs.validFromDtm).append(validToDtm, rhs.validToDtm).append(verifyDtm, rhs.verifyDtm).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
