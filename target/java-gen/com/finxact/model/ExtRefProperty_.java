
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
    "name",
    "ref",
    "path"
})
public class ExtRefProperty_ {

    /**
     * Interface name
     * <p>
     * Name of the interface
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the interface")
    private String name;
    /**
     * Interface reference
     * <p>
     * Reference, or key, token, pointer
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("Reference, or key, token, pointer")
    private String ref;
    /**
     * Reference path
     * <p>
     * Optional Resource path for API
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Optional Resource path for API")
    private String path;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Interface name
     * <p>
     * Name of the interface
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Interface name
     * <p>
     * Name of the interface
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Interface reference
     * <p>
     * Reference, or key, token, pointer
     * 
     */
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Interface reference
     * <p>
     * Reference, or key, token, pointer
     * 
     */
    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Reference path
     * <p>
     * Optional Resource path for API
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Reference path
     * <p>
     * Optional Resource path for API
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
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
        return new HashCodeBuilder().append(name).append(ref).append(path).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtRefProperty_) == false) {
            return false;
        }
        ExtRefProperty_ rhs = ((ExtRefProperty_) other);
        return new EqualsBuilder().append(name, rhs.name).append(ref, rhs.ref).append(path, rhs.path).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
