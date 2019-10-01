
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
 * Recurring order
 * <p>
 * Recurring or standing order detail
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "freq",
    "expDtm",
    "lastDtm",
    "nextDtm",
    "cnt",
    "remain",
    "nextId"
})
public class Recur {

    /**
     * Order frequency
     * <p>
     * Frequency that recurring order executes
     * (Required)
     * 
     */
    @JsonProperty("freq")
    @JsonPropertyDescription("Frequency that recurring order executes")
    private String freq;
    /**
     * Recurring order expiration date
     * <p>
     * The latest date a recurring order transaction can occur
     * 
     */
    @JsonProperty("expDtm")
    @JsonPropertyDescription("The latest date a recurring order transaction can occur")
    private Date expDtm;
    /**
     * Last date
     * <p>
     * The last date recurring order was executed
     * 
     */
    @JsonProperty("lastDtm")
    @JsonPropertyDescription("The last date recurring order was executed")
    private Date lastDtm;
    /**
     * Next date
     * <p>
     * The next date recurring order will executed
     * 
     */
    @JsonProperty("nextDtm")
    @JsonPropertyDescription("The next date recurring order will executed")
    private Date nextDtm;
    /**
     * Count executed
     * <p>
     * Current number of times order has executed
     * 
     */
    @JsonProperty("cnt")
    @JsonPropertyDescription("Current number of times order has executed")
    private Integer cnt;
    /**
     * Remaining count
     * <p>
     * Remaining number of time order will be executed
     * 
     */
    @JsonProperty("remain")
    @JsonPropertyDescription("Remaining number of time order will be executed")
    private Integer remain;
    /**
     * Next recurring order Id
     * <p>
     * The identifier of the next recurring order in the sequence
     * 
     */
    @JsonProperty("nextId")
    @JsonPropertyDescription("The identifier of the next recurring order in the sequence")
    private Integer nextId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Order frequency
     * <p>
     * Frequency that recurring order executes
     * (Required)
     * 
     */
    @JsonProperty("freq")
    public String getFreq() {
        return freq;
    }

    /**
     * Order frequency
     * <p>
     * Frequency that recurring order executes
     * (Required)
     * 
     */
    @JsonProperty("freq")
    public void setFreq(String freq) {
        this.freq = freq;
    }

    /**
     * Recurring order expiration date
     * <p>
     * The latest date a recurring order transaction can occur
     * 
     */
    @JsonProperty("expDtm")
    public Date getExpDtm() {
        return expDtm;
    }

    /**
     * Recurring order expiration date
     * <p>
     * The latest date a recurring order transaction can occur
     * 
     */
    @JsonProperty("expDtm")
    public void setExpDtm(Date expDtm) {
        this.expDtm = expDtm;
    }

    /**
     * Last date
     * <p>
     * The last date recurring order was executed
     * 
     */
    @JsonProperty("lastDtm")
    public Date getLastDtm() {
        return lastDtm;
    }

    /**
     * Last date
     * <p>
     * The last date recurring order was executed
     * 
     */
    @JsonProperty("lastDtm")
    public void setLastDtm(Date lastDtm) {
        this.lastDtm = lastDtm;
    }

    /**
     * Next date
     * <p>
     * The next date recurring order will executed
     * 
     */
    @JsonProperty("nextDtm")
    public Date getNextDtm() {
        return nextDtm;
    }

    /**
     * Next date
     * <p>
     * The next date recurring order will executed
     * 
     */
    @JsonProperty("nextDtm")
    public void setNextDtm(Date nextDtm) {
        this.nextDtm = nextDtm;
    }

    /**
     * Count executed
     * <p>
     * Current number of times order has executed
     * 
     */
    @JsonProperty("cnt")
    public Integer getCnt() {
        return cnt;
    }

    /**
     * Count executed
     * <p>
     * Current number of times order has executed
     * 
     */
    @JsonProperty("cnt")
    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    /**
     * Remaining count
     * <p>
     * Remaining number of time order will be executed
     * 
     */
    @JsonProperty("remain")
    public Integer getRemain() {
        return remain;
    }

    /**
     * Remaining count
     * <p>
     * Remaining number of time order will be executed
     * 
     */
    @JsonProperty("remain")
    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    /**
     * Next recurring order Id
     * <p>
     * The identifier of the next recurring order in the sequence
     * 
     */
    @JsonProperty("nextId")
    public Integer getNextId() {
        return nextId;
    }

    /**
     * Next recurring order Id
     * <p>
     * The identifier of the next recurring order in the sequence
     * 
     */
    @JsonProperty("nextId")
    public void setNextId(Integer nextId) {
        this.nextId = nextId;
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
        return new HashCodeBuilder().append(freq).append(expDtm).append(lastDtm).append(nextDtm).append(cnt).append(remain).append(nextId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Recur) == false) {
            return false;
        }
        Recur rhs = ((Recur) other);
        return new EqualsBuilder().append(freq, rhs.freq).append(expDtm, rhs.expDtm).append(lastDtm, rhs.lastDtm).append(nextDtm, rhs.nextDtm).append(cnt, rhs.cnt).append(remain, rhs.remain).append(nextId, rhs.nextId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
