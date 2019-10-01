
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
 * Reason codes
 * <p>
 * Advice/Reversal reason codes
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "advice1",
    "advice2",
    "reverse1",
    "reverse2"
})
public class ReasonCodes {

    /**
     * Advice code 1
     * <p>
     * Advice reason code 1
     * 
     */
    @JsonProperty("advice1")
    @JsonPropertyDescription("Advice reason code 1")
    private Integer advice1;
    /**
     * Advice code 2
     * <p>
     * Advice reason code 2
     * 
     */
    @JsonProperty("advice2")
    @JsonPropertyDescription("Advice reason code 2")
    private Integer advice2;
    /**
     * Reverse code 1
     * <p>
     * Reverse reason code 1
     * 
     */
    @JsonProperty("reverse1")
    @JsonPropertyDescription("Reverse reason code 1")
    private Integer reverse1;
    /**
     * Reverse code 2
     * <p>
     * Reverse reason code 2
     * 
     */
    @JsonProperty("reverse2")
    @JsonPropertyDescription("Reverse reason code 2")
    private Integer reverse2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Advice code 1
     * <p>
     * Advice reason code 1
     * 
     */
    @JsonProperty("advice1")
    public Integer getAdvice1() {
        return advice1;
    }

    /**
     * Advice code 1
     * <p>
     * Advice reason code 1
     * 
     */
    @JsonProperty("advice1")
    public void setAdvice1(Integer advice1) {
        this.advice1 = advice1;
    }

    /**
     * Advice code 2
     * <p>
     * Advice reason code 2
     * 
     */
    @JsonProperty("advice2")
    public Integer getAdvice2() {
        return advice2;
    }

    /**
     * Advice code 2
     * <p>
     * Advice reason code 2
     * 
     */
    @JsonProperty("advice2")
    public void setAdvice2(Integer advice2) {
        this.advice2 = advice2;
    }

    /**
     * Reverse code 1
     * <p>
     * Reverse reason code 1
     * 
     */
    @JsonProperty("reverse1")
    public Integer getReverse1() {
        return reverse1;
    }

    /**
     * Reverse code 1
     * <p>
     * Reverse reason code 1
     * 
     */
    @JsonProperty("reverse1")
    public void setReverse1(Integer reverse1) {
        this.reverse1 = reverse1;
    }

    /**
     * Reverse code 2
     * <p>
     * Reverse reason code 2
     * 
     */
    @JsonProperty("reverse2")
    public Integer getReverse2() {
        return reverse2;
    }

    /**
     * Reverse code 2
     * <p>
     * Reverse reason code 2
     * 
     */
    @JsonProperty("reverse2")
    public void setReverse2(Integer reverse2) {
        this.reverse2 = reverse2;
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
        return new HashCodeBuilder().append(advice1).append(advice2).append(reverse1).append(reverse2).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReasonCodes) == false) {
            return false;
        }
        ReasonCodes rhs = ((ReasonCodes) other);
        return new EqualsBuilder().append(advice1, rhs.advice1).append(advice2, rhs.advice2).append(reverse1, rhs.reverse1).append(reverse2, rhs.reverse2).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
