
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
 * POS status condition
 * <p>
 * Point of service (POS) condition
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "terminal",
    "customer",
    "card",
    "presentment",
    "security",
    "terminalType"
})
public class PosStatus {

    /**
     * Terminal class
     * <p>
     * Terminal class
     * 
     */
    @JsonProperty("terminal")
    @JsonPropertyDescription("Terminal class")
    private Integer terminal;
    /**
     * Customer status
     * <p>
     * Customer present status
     * 
     */
    @JsonProperty("customer")
    @JsonPropertyDescription("Customer present status")
    private Integer customer;
    /**
     * Card status
     * <p>
     * Card present status
     * 
     */
    @JsonProperty("card")
    @JsonPropertyDescription("Card present status")
    private Integer card;
    /**
     * Presentment status
     * <p>
     * Presentment status
     * 
     */
    @JsonProperty("presentment")
    @JsonPropertyDescription("Presentment status")
    private Integer presentment;
    /**
     * Security status
     * <p>
     * Security status
     * 
     */
    @JsonProperty("security")
    @JsonPropertyDescription("Security status")
    private Integer security;
    /**
     * Terminal type
     * <p>
     * Terminal type
     * 
     */
    @JsonProperty("terminalType")
    @JsonPropertyDescription("Terminal type")
    private Integer terminalType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Terminal class
     * <p>
     * Terminal class
     * 
     */
    @JsonProperty("terminal")
    public Integer getTerminal() {
        return terminal;
    }

    /**
     * Terminal class
     * <p>
     * Terminal class
     * 
     */
    @JsonProperty("terminal")
    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    /**
     * Customer status
     * <p>
     * Customer present status
     * 
     */
    @JsonProperty("customer")
    public Integer getCustomer() {
        return customer;
    }

    /**
     * Customer status
     * <p>
     * Customer present status
     * 
     */
    @JsonProperty("customer")
    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    /**
     * Card status
     * <p>
     * Card present status
     * 
     */
    @JsonProperty("card")
    public Integer getCard() {
        return card;
    }

    /**
     * Card status
     * <p>
     * Card present status
     * 
     */
    @JsonProperty("card")
    public void setCard(Integer card) {
        this.card = card;
    }

    /**
     * Presentment status
     * <p>
     * Presentment status
     * 
     */
    @JsonProperty("presentment")
    public Integer getPresentment() {
        return presentment;
    }

    /**
     * Presentment status
     * <p>
     * Presentment status
     * 
     */
    @JsonProperty("presentment")
    public void setPresentment(Integer presentment) {
        this.presentment = presentment;
    }

    /**
     * Security status
     * <p>
     * Security status
     * 
     */
    @JsonProperty("security")
    public Integer getSecurity() {
        return security;
    }

    /**
     * Security status
     * <p>
     * Security status
     * 
     */
    @JsonProperty("security")
    public void setSecurity(Integer security) {
        this.security = security;
    }

    /**
     * Terminal type
     * <p>
     * Terminal type
     * 
     */
    @JsonProperty("terminalType")
    public Integer getTerminalType() {
        return terminalType;
    }

    /**
     * Terminal type
     * <p>
     * Terminal type
     * 
     */
    @JsonProperty("terminalType")
    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
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
        return new HashCodeBuilder().append(terminal).append(customer).append(card).append(presentment).append(security).append(terminalType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PosStatus) == false) {
            return false;
        }
        PosStatus rhs = ((PosStatus) other);
        return new EqualsBuilder().append(terminal, rhs.terminal).append(customer, rhs.customer).append(card, rhs.card).append(presentment, rhs.presentment).append(security, rhs.security).append(terminalType, rhs.terminalType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
