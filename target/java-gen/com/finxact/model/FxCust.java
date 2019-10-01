
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
 * Customer exchange
 * <p>
 * Customer exchange information if account currency code is not the transaction currency code
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exchRate",
    "ccyCode",
    "x-dbInterface"
})
public class FxCust {

    /**
     * Exchange rate
     * <p>
     * Currency exchange rate
     * 
     */
    @JsonProperty("exchRate")
    @JsonPropertyDescription("Currency exchange rate")
    private Double exchRate;
    /**
     * Currency code
     * <p>
     * Account currency code
     * 
     */
    @JsonProperty("ccyCode")
    @JsonPropertyDescription("Account currency code")
    private String ccyCode;
    @JsonProperty("x-dbInterface")
    private Object xDbInterface;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Exchange rate
     * <p>
     * Currency exchange rate
     * 
     */
    @JsonProperty("exchRate")
    public Double getExchRate() {
        return exchRate;
    }

    /**
     * Exchange rate
     * <p>
     * Currency exchange rate
     * 
     */
    @JsonProperty("exchRate")
    public void setExchRate(Double exchRate) {
        this.exchRate = exchRate;
    }

    /**
     * Currency code
     * <p>
     * Account currency code
     * 
     */
    @JsonProperty("ccyCode")
    public String getCcyCode() {
        return ccyCode;
    }

    /**
     * Currency code
     * <p>
     * Account currency code
     * 
     */
    @JsonProperty("ccyCode")
    public void setCcyCode(String ccyCode) {
        this.ccyCode = ccyCode;
    }

    @JsonProperty("x-dbInterface")
    public Object getXDbInterface() {
        return xDbInterface;
    }

    @JsonProperty("x-dbInterface")
    public void setXDbInterface(Object xDbInterface) {
        this.xDbInterface = xDbInterface;
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
        return new HashCodeBuilder().append(exchRate).append(ccyCode).append(xDbInterface).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FxCust) == false) {
            return false;
        }
        FxCust rhs = ((FxCust) other);
        return new EqualsBuilder().append(exchRate, rhs.exchRate).append(ccyCode, rhs.ccyCode).append(xDbInterface, rhs.xDbInterface).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
