
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
 * Settlement exchange
 * <p>
 * Settlement exchange information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exchRate",
    "ccyCode",
    "trnAmt",
    "trnFee",
    "procFee",
    "x-dbInterface"
})
public class FxSettle {

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
     * Settlement currency code
     * 
     */
    @JsonProperty("ccyCode")
    @JsonPropertyDescription("Settlement currency code")
    private String ccyCode;
    /**
     * Settlement amount
     * <p>
     * Amount to be transferred between the acquirer and the issuer in the currency of settlement
     * 
     */
    @JsonProperty("trnAmt")
    @JsonPropertyDescription("Amount to be transferred between the acquirer and the issuer in the currency of settlement")
    private Double trnAmt;
    /**
     * Transaction fee amount
     * <p>
     * Transaction fee amount in the currency of settlement
     * 
     */
    @JsonProperty("trnFee")
    @JsonPropertyDescription("Transaction fee amount in the currency of settlement")
    private Double trnFee;
    /**
     * Processing fee amount
     * <p>
     * Processing fee amount in the currency of settlement
     * 
     */
    @JsonProperty("procFee")
    @JsonPropertyDescription("Processing fee amount in the currency of settlement")
    private Double procFee;
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
     * Settlement currency code
     * 
     */
    @JsonProperty("ccyCode")
    public String getCcyCode() {
        return ccyCode;
    }

    /**
     * Currency code
     * <p>
     * Settlement currency code
     * 
     */
    @JsonProperty("ccyCode")
    public void setCcyCode(String ccyCode) {
        this.ccyCode = ccyCode;
    }

    /**
     * Settlement amount
     * <p>
     * Amount to be transferred between the acquirer and the issuer in the currency of settlement
     * 
     */
    @JsonProperty("trnAmt")
    public Double getTrnAmt() {
        return trnAmt;
    }

    /**
     * Settlement amount
     * <p>
     * Amount to be transferred between the acquirer and the issuer in the currency of settlement
     * 
     */
    @JsonProperty("trnAmt")
    public void setTrnAmt(Double trnAmt) {
        this.trnAmt = trnAmt;
    }

    /**
     * Transaction fee amount
     * <p>
     * Transaction fee amount in the currency of settlement
     * 
     */
    @JsonProperty("trnFee")
    public Double getTrnFee() {
        return trnFee;
    }

    /**
     * Transaction fee amount
     * <p>
     * Transaction fee amount in the currency of settlement
     * 
     */
    @JsonProperty("trnFee")
    public void setTrnFee(Double trnFee) {
        this.trnFee = trnFee;
    }

    /**
     * Processing fee amount
     * <p>
     * Processing fee amount in the currency of settlement
     * 
     */
    @JsonProperty("procFee")
    public Double getProcFee() {
        return procFee;
    }

    /**
     * Processing fee amount
     * <p>
     * Processing fee amount in the currency of settlement
     * 
     */
    @JsonProperty("procFee")
    public void setProcFee(Double procFee) {
        this.procFee = procFee;
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
        return new HashCodeBuilder().append(exchRate).append(ccyCode).append(trnAmt).append(trnFee).append(procFee).append(xDbInterface).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FxSettle) == false) {
            return false;
        }
        FxSettle rhs = ((FxSettle) other);
        return new EqualsBuilder().append(exchRate, rhs.exchRate).append(ccyCode, rhs.ccyCode).append(trnAmt, rhs.trnAmt).append(trnFee, rhs.trnFee).append(procFee, rhs.procFee).append(xDbInterface, rhs.xDbInterface).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
