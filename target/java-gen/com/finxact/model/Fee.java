
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
 * Fee details
 * <p>
 * Defines parameters associated to a fee
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "feeCode",
    "desc",
    "reason",
    "fixAmtPd",
    "fixAmtAccr",
    "fixAmtWaived",
    "varAmtPd",
    "varAmtAccr",
    "varAmtWaived",
    "totAmtPd",
    "totAmtAccr",
    "totAmtWaived",
    "feeTax",
    "varPct"
})
public class Fee {

    /**
     * Fee code
     * <p>
     * The fee code
     * 
     */
    @JsonProperty("feeCode")
    @JsonPropertyDescription("The fee code")
    private String feeCode;
    /**
     * Fee description
     * <p>
     * The fee description
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("The fee description")
    private String desc;
    /**
     * Fee reason
     * <p>
     * Fee reason text
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Fee reason text")
    private String reason;
    /**
     * Fixed fee paid
     * <p>
     * The fixed fee amount paid
     * 
     */
    @JsonProperty("fixAmtPd")
    @JsonPropertyDescription("The fixed fee amount paid")
    private Double fixAmtPd;
    /**
     * Fixed fee accrued
     * <p>
     * The fixed fee amount accrued
     * 
     */
    @JsonProperty("fixAmtAccr")
    @JsonPropertyDescription("The fixed fee amount accrued")
    private Double fixAmtAccr;
    /**
     * Fixed fee waived
     * <p>
     * The fixed fee amount waived
     * 
     */
    @JsonProperty("fixAmtWaived")
    @JsonPropertyDescription("The fixed fee amount waived")
    private Double fixAmtWaived;
    /**
     * Variable fee paid
     * <p>
     * The variable fee amount paid
     * 
     */
    @JsonProperty("varAmtPd")
    @JsonPropertyDescription("The variable fee amount paid")
    private Double varAmtPd;
    /**
     * Variable fee accrued
     * <p>
     * The variable fee amount accrued
     * 
     */
    @JsonProperty("varAmtAccr")
    @JsonPropertyDescription("The variable fee amount accrued")
    private Double varAmtAccr;
    /**
     * Fixed fee waived
     * <p>
     * The variable fee amount waived
     * 
     */
    @JsonProperty("varAmtWaived")
    @JsonPropertyDescription("The variable fee amount waived")
    private Double varAmtWaived;
    /**
     * Total fee paid
     * <p>
     * The total fee amount paid
     * 
     */
    @JsonProperty("totAmtPd")
    @JsonPropertyDescription("The total fee amount paid")
    private Double totAmtPd;
    /**
     * Total fee accrued
     * <p>
     * The total fee amount accrued
     * 
     */
    @JsonProperty("totAmtAccr")
    @JsonPropertyDescription("The total fee amount accrued")
    private Double totAmtAccr;
    /**
     * Totalfee waived
     * <p>
     * The total fee amount waived
     * 
     */
    @JsonProperty("totAmtWaived")
    @JsonPropertyDescription("The total fee amount waived")
    private Double totAmtWaived;
    /**
     * Fee tax
     * <p>
     * The total tax on fee
     * 
     */
    @JsonProperty("feeTax")
    @JsonPropertyDescription("The total tax on fee")
    private Double feeTax;
    /**
     * Variable pcnt
     * <p>
     * The variable fee percentage
     * 
     */
    @JsonProperty("varPct")
    @JsonPropertyDescription("The variable fee percentage")
    private Double varPct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fee code
     * <p>
     * The fee code
     * 
     */
    @JsonProperty("feeCode")
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Fee code
     * <p>
     * The fee code
     * 
     */
    @JsonProperty("feeCode")
    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    /**
     * Fee description
     * <p>
     * The fee description
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Fee description
     * <p>
     * The fee description
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Fee reason
     * <p>
     * Fee reason text
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Fee reason
     * <p>
     * Fee reason text
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Fixed fee paid
     * <p>
     * The fixed fee amount paid
     * 
     */
    @JsonProperty("fixAmtPd")
    public Double getFixAmtPd() {
        return fixAmtPd;
    }

    /**
     * Fixed fee paid
     * <p>
     * The fixed fee amount paid
     * 
     */
    @JsonProperty("fixAmtPd")
    public void setFixAmtPd(Double fixAmtPd) {
        this.fixAmtPd = fixAmtPd;
    }

    /**
     * Fixed fee accrued
     * <p>
     * The fixed fee amount accrued
     * 
     */
    @JsonProperty("fixAmtAccr")
    public Double getFixAmtAccr() {
        return fixAmtAccr;
    }

    /**
     * Fixed fee accrued
     * <p>
     * The fixed fee amount accrued
     * 
     */
    @JsonProperty("fixAmtAccr")
    public void setFixAmtAccr(Double fixAmtAccr) {
        this.fixAmtAccr = fixAmtAccr;
    }

    /**
     * Fixed fee waived
     * <p>
     * The fixed fee amount waived
     * 
     */
    @JsonProperty("fixAmtWaived")
    public Double getFixAmtWaived() {
        return fixAmtWaived;
    }

    /**
     * Fixed fee waived
     * <p>
     * The fixed fee amount waived
     * 
     */
    @JsonProperty("fixAmtWaived")
    public void setFixAmtWaived(Double fixAmtWaived) {
        this.fixAmtWaived = fixAmtWaived;
    }

    /**
     * Variable fee paid
     * <p>
     * The variable fee amount paid
     * 
     */
    @JsonProperty("varAmtPd")
    public Double getVarAmtPd() {
        return varAmtPd;
    }

    /**
     * Variable fee paid
     * <p>
     * The variable fee amount paid
     * 
     */
    @JsonProperty("varAmtPd")
    public void setVarAmtPd(Double varAmtPd) {
        this.varAmtPd = varAmtPd;
    }

    /**
     * Variable fee accrued
     * <p>
     * The variable fee amount accrued
     * 
     */
    @JsonProperty("varAmtAccr")
    public Double getVarAmtAccr() {
        return varAmtAccr;
    }

    /**
     * Variable fee accrued
     * <p>
     * The variable fee amount accrued
     * 
     */
    @JsonProperty("varAmtAccr")
    public void setVarAmtAccr(Double varAmtAccr) {
        this.varAmtAccr = varAmtAccr;
    }

    /**
     * Fixed fee waived
     * <p>
     * The variable fee amount waived
     * 
     */
    @JsonProperty("varAmtWaived")
    public Double getVarAmtWaived() {
        return varAmtWaived;
    }

    /**
     * Fixed fee waived
     * <p>
     * The variable fee amount waived
     * 
     */
    @JsonProperty("varAmtWaived")
    public void setVarAmtWaived(Double varAmtWaived) {
        this.varAmtWaived = varAmtWaived;
    }

    /**
     * Total fee paid
     * <p>
     * The total fee amount paid
     * 
     */
    @JsonProperty("totAmtPd")
    public Double getTotAmtPd() {
        return totAmtPd;
    }

    /**
     * Total fee paid
     * <p>
     * The total fee amount paid
     * 
     */
    @JsonProperty("totAmtPd")
    public void setTotAmtPd(Double totAmtPd) {
        this.totAmtPd = totAmtPd;
    }

    /**
     * Total fee accrued
     * <p>
     * The total fee amount accrued
     * 
     */
    @JsonProperty("totAmtAccr")
    public Double getTotAmtAccr() {
        return totAmtAccr;
    }

    /**
     * Total fee accrued
     * <p>
     * The total fee amount accrued
     * 
     */
    @JsonProperty("totAmtAccr")
    public void setTotAmtAccr(Double totAmtAccr) {
        this.totAmtAccr = totAmtAccr;
    }

    /**
     * Totalfee waived
     * <p>
     * The total fee amount waived
     * 
     */
    @JsonProperty("totAmtWaived")
    public Double getTotAmtWaived() {
        return totAmtWaived;
    }

    /**
     * Totalfee waived
     * <p>
     * The total fee amount waived
     * 
     */
    @JsonProperty("totAmtWaived")
    public void setTotAmtWaived(Double totAmtWaived) {
        this.totAmtWaived = totAmtWaived;
    }

    /**
     * Fee tax
     * <p>
     * The total tax on fee
     * 
     */
    @JsonProperty("feeTax")
    public Double getFeeTax() {
        return feeTax;
    }

    /**
     * Fee tax
     * <p>
     * The total tax on fee
     * 
     */
    @JsonProperty("feeTax")
    public void setFeeTax(Double feeTax) {
        this.feeTax = feeTax;
    }

    /**
     * Variable pcnt
     * <p>
     * The variable fee percentage
     * 
     */
    @JsonProperty("varPct")
    public Double getVarPct() {
        return varPct;
    }

    /**
     * Variable pcnt
     * <p>
     * The variable fee percentage
     * 
     */
    @JsonProperty("varPct")
    public void setVarPct(Double varPct) {
        this.varPct = varPct;
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
        return new HashCodeBuilder().append(feeCode).append(desc).append(reason).append(fixAmtPd).append(fixAmtAccr).append(fixAmtWaived).append(varAmtPd).append(varAmtAccr).append(varAmtWaived).append(totAmtPd).append(totAmtAccr).append(totAmtWaived).append(feeTax).append(varPct).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fee) == false) {
            return false;
        }
        Fee rhs = ((Fee) other);
        return new EqualsBuilder().append(feeCode, rhs.feeCode).append(desc, rhs.desc).append(reason, rhs.reason).append(fixAmtPd, rhs.fixAmtPd).append(fixAmtAccr, rhs.fixAmtAccr).append(fixAmtWaived, rhs.fixAmtWaived).append(varAmtPd, rhs.varAmtPd).append(varAmtAccr, rhs.varAmtAccr).append(varAmtWaived, rhs.varAmtWaived).append(totAmtPd, rhs.totAmtPd).append(totAmtAccr, rhs.totAmtAccr).append(totAmtWaived, rhs.totAmtWaived).append(feeTax, rhs.feeTax).append(varPct, rhs.varPct).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
