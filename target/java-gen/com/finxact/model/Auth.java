
package com.finxact.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Transaction entry authorization
 * <p>
 * Transaction entry authorization
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isAuthAll",
    "exceptions"
})
public class Auth {

    /**
     * Is authorize all
     * <p>
     * if true, authorize all exceptions on this item
     * 
     */
    @JsonProperty("isAuthAll")
    @JsonPropertyDescription("if true, authorize all exceptions on this item")
    private Boolean isAuthAll;
    /**
     * Exception authorization
     * <p>
     * 
     * 
     */
    @JsonProperty("exceptions")
    private List<Exception> exceptions = new ArrayList<Exception>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Is authorize all
     * <p>
     * if true, authorize all exceptions on this item
     * 
     */
    @JsonProperty("isAuthAll")
    public Boolean getIsAuthAll() {
        return isAuthAll;
    }

    /**
     * Is authorize all
     * <p>
     * if true, authorize all exceptions on this item
     * 
     */
    @JsonProperty("isAuthAll")
    public void setIsAuthAll(Boolean isAuthAll) {
        this.isAuthAll = isAuthAll;
    }

    /**
     * Exception authorization
     * <p>
     * 
     * 
     */
    @JsonProperty("exceptions")
    public List<Exception> getExceptions() {
        return exceptions;
    }

    /**
     * Exception authorization
     * <p>
     * 
     * 
     */
    @JsonProperty("exceptions")
    public void setExceptions(List<Exception> exceptions) {
        this.exceptions = exceptions;
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
        return new HashCodeBuilder().append(isAuthAll).append(exceptions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Auth) == false) {
            return false;
        }
        Auth rhs = ((Auth) other);
        return new EqualsBuilder().append(isAuthAll, rhs.isAuthAll).append(exceptions, rhs.exceptions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
