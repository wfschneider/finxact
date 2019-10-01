
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addHold",
    "removeHold",
    "auth"
})
public class Entry {

    /**
     * Hold
     * <p>
     * Defines parameters related to availability of specific sums of funds
     * 
     */
    @JsonProperty("addHold")
    @JsonPropertyDescription("Defines parameters related to availability of specific sums of funds")
    private Hold addHold;
    /**
     * Hold
     * <p>
     * Defines parameters related to availability of specific sums of funds
     * 
     */
    @JsonProperty("removeHold")
    @JsonPropertyDescription("Defines parameters related to availability of specific sums of funds")
    private Hold removeHold;
    /**
     * Transaction entry authorization
     * <p>
     * Transaction entry authorization
     * 
     */
    @JsonProperty("auth")
    @JsonPropertyDescription("Transaction entry authorization")
    private Auth auth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Hold
     * <p>
     * Defines parameters related to availability of specific sums of funds
     * 
     */
    @JsonProperty("addHold")
    public Hold getAddHold() {
        return addHold;
    }

    /**
     * Hold
     * <p>
     * Defines parameters related to availability of specific sums of funds
     * 
     */
    @JsonProperty("addHold")
    public void setAddHold(Hold addHold) {
        this.addHold = addHold;
    }

    /**
     * Hold
     * <p>
     * Defines parameters related to availability of specific sums of funds
     * 
     */
    @JsonProperty("removeHold")
    public Hold getRemoveHold() {
        return removeHold;
    }

    /**
     * Hold
     * <p>
     * Defines parameters related to availability of specific sums of funds
     * 
     */
    @JsonProperty("removeHold")
    public void setRemoveHold(Hold removeHold) {
        this.removeHold = removeHold;
    }

    /**
     * Transaction entry authorization
     * <p>
     * Transaction entry authorization
     * 
     */
    @JsonProperty("auth")
    public Auth getAuth() {
        return auth;
    }

    /**
     * Transaction entry authorization
     * <p>
     * Transaction entry authorization
     * 
     */
    @JsonProperty("auth")
    public void setAuth(Auth auth) {
        this.auth = auth;
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
        return new HashCodeBuilder().append(addHold).append(removeHold).append(auth).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entry) == false) {
            return false;
        }
        Entry rhs = ((Entry) other);
        return new EqualsBuilder().append(addHold, rhs.addHold).append(removeHold, rhs.removeHold).append(auth, rhs.auth).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
