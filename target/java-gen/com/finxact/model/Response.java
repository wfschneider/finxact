
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
 * Response
 * <p>
 * Object containing the response code and memo from external vendor
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "memo"
})
public class Response {

    /**
     * Response Code
     * <p>
     * Response Code
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Response Code")
    private String code;
    /**
     * Response Memo
     * <p>
     * Response Memo
     * 
     */
    @JsonProperty("memo")
    @JsonPropertyDescription("Response Memo")
    private String memo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Response Code
     * <p>
     * Response Code
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Response Code
     * <p>
     * Response Code
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Response Memo
     * <p>
     * Response Memo
     * 
     */
    @JsonProperty("memo")
    public String getMemo() {
        return memo;
    }

    /**
     * Response Memo
     * <p>
     * Response Memo
     * 
     */
    @JsonProperty("memo")
    public void setMemo(String memo) {
        this.memo = memo;
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
        return new HashCodeBuilder().append(code).append(memo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(code, rhs.code).append(memo, rhs.memo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
