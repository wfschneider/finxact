
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exceptCode",
    "reason",
    "note",
    "roles",
    "userId"
})
public class Exception {

    /**
     * Exception code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceptCode")
    private String exceptCode;
    /**
     * Override decision reason
     * <p>
     * The reason for exception override decision
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("The reason for exception override decision")
    private String reason;
    /**
     * Authorize note
     * <p>
     * Authorization note
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Authorization note")
    private String note;
    /**
     * authorization roles
     * <p>
     * 
     * 
     */
    @JsonProperty("roles")
    private List<String> roles = new ArrayList<String>();
    /**
     * Authorize user
     * <p>
     * Authorization user
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Authorization user")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Exception code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceptCode")
    public String getExceptCode() {
        return exceptCode;
    }

    /**
     * Exception code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("exceptCode")
    public void setExceptCode(String exceptCode) {
        this.exceptCode = exceptCode;
    }

    /**
     * Override decision reason
     * <p>
     * The reason for exception override decision
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Override decision reason
     * <p>
     * The reason for exception override decision
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Authorize note
     * <p>
     * Authorization note
     * 
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Authorize note
     * <p>
     * Authorization note
     * 
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * authorization roles
     * <p>
     * 
     * 
     */
    @JsonProperty("roles")
    public List<String> getRoles() {
        return roles;
    }

    /**
     * authorization roles
     * <p>
     * 
     * 
     */
    @JsonProperty("roles")
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    /**
     * Authorize user
     * <p>
     * Authorization user
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Authorize user
     * <p>
     * Authorization user
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
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
        return new HashCodeBuilder().append(exceptCode).append(reason).append(note).append(roles).append(userId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Exception) == false) {
            return false;
        }
        Exception rhs = ((Exception) other);
        return new EqualsBuilder().append(exceptCode, rhs.exceptCode).append(reason, rhs.reason).append(note, rhs.note).append(roles, rhs.roles).append(userId, rhs.userId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
