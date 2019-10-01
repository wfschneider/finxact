
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
 * Acct Type
 * <p>
 * Acct Type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "typeCode",
    "seqNbr"
})
public class AcctType1 {

    /**
     * Account type
     * <p>
     * Account type code
     * 
     */
    @JsonProperty("typeCode")
    @JsonPropertyDescription("Account type code")
    private Integer typeCode;
    /**
     * Account sequence
     * <p>
     * Account sequence number
     * 
     */
    @JsonProperty("seqNbr")
    @JsonPropertyDescription("Account sequence number")
    private Integer seqNbr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Account type
     * <p>
     * Account type code
     * 
     */
    @JsonProperty("typeCode")
    public Integer getTypeCode() {
        return typeCode;
    }

    /**
     * Account type
     * <p>
     * Account type code
     * 
     */
    @JsonProperty("typeCode")
    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * Account sequence
     * <p>
     * Account sequence number
     * 
     */
    @JsonProperty("seqNbr")
    public Integer getSeqNbr() {
        return seqNbr;
    }

    /**
     * Account sequence
     * <p>
     * Account sequence number
     * 
     */
    @JsonProperty("seqNbr")
    public void setSeqNbr(Integer seqNbr) {
        this.seqNbr = seqNbr;
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
        return new HashCodeBuilder().append(typeCode).append(seqNbr).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcctType1) == false) {
            return false;
        }
        AcctType1 rhs = ((AcctType1) other);
        return new EqualsBuilder().append(typeCode, rhs.typeCode).append(seqNbr, rhs.seqNbr).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
