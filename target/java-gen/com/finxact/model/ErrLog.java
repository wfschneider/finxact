
package com.finxact.model;

import java.util.ArrayList;
import java.util.Date;
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
 * Error log
 * <p>
 * Log of processing errors, exceptions and relevant details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_Id",
    "procName",
    "errName",
    "desc",
    "errDtm",
    "notes",
    "errDtls",
    "keyValues"
})
public class ErrLog {

    /**
     * Error Identifier
     * <p>
     * Unique Identifier for this error reference
     * 
     */
    @JsonProperty("_Id")
    @JsonPropertyDescription("Unique Identifier for this error reference")
    private String id;
    /**
     * Process Name
     * <p>
     * The name of the process that generated the error
     * 
     */
    @JsonProperty("procName")
    @JsonPropertyDescription("The name of the process that generated the error")
    private String procName;
    /**
     * Error Name
     * <p>
     * A short name of the error being logged
     * 
     */
    @JsonProperty("errName")
    @JsonPropertyDescription("A short name of the error being logged")
    private String errName;
    /**
     * Description
     * <p>
     * Error description
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Error description")
    private String desc;
    /**
     * Error Date
     * <p>
     * The date and time that the error occurred
     * 
     */
    @JsonProperty("errDtm")
    @JsonPropertyDescription("The date and time that the error occurred")
    private Date errDtm;
    /**
     * Error Note
     * <p>
     * Error notes containing additional detail
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Error notes containing additional detail")
    private String notes;
    /**
     * Error details
     * <p>
     * Errors that occurred during transaction processing
     * 
     */
    @JsonProperty("errDtls")
    @JsonPropertyDescription("Errors that occurred during transaction processing")
    private List<ErrDtl> errDtls = new ArrayList<ErrDtl>();
    /**
     * Key value pairs
     * <p>
     * The key-value pairing for this error
     * 
     */
    @JsonProperty("keyValues")
    @JsonPropertyDescription("The key-value pairing for this error")
    private KeyValues keyValues;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Error Identifier
     * <p>
     * Unique Identifier for this error reference
     * 
     */
    @JsonProperty("_Id")
    public String getId() {
        return id;
    }

    /**
     * Error Identifier
     * <p>
     * Unique Identifier for this error reference
     * 
     */
    @JsonProperty("_Id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Process Name
     * <p>
     * The name of the process that generated the error
     * 
     */
    @JsonProperty("procName")
    public String getProcName() {
        return procName;
    }

    /**
     * Process Name
     * <p>
     * The name of the process that generated the error
     * 
     */
    @JsonProperty("procName")
    public void setProcName(String procName) {
        this.procName = procName;
    }

    /**
     * Error Name
     * <p>
     * A short name of the error being logged
     * 
     */
    @JsonProperty("errName")
    public String getErrName() {
        return errName;
    }

    /**
     * Error Name
     * <p>
     * A short name of the error being logged
     * 
     */
    @JsonProperty("errName")
    public void setErrName(String errName) {
        this.errName = errName;
    }

    /**
     * Description
     * <p>
     * Error description
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Error description
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Error Date
     * <p>
     * The date and time that the error occurred
     * 
     */
    @JsonProperty("errDtm")
    public Date getErrDtm() {
        return errDtm;
    }

    /**
     * Error Date
     * <p>
     * The date and time that the error occurred
     * 
     */
    @JsonProperty("errDtm")
    public void setErrDtm(Date errDtm) {
        this.errDtm = errDtm;
    }

    /**
     * Error Note
     * <p>
     * Error notes containing additional detail
     * 
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    /**
     * Error Note
     * <p>
     * Error notes containing additional detail
     * 
     */
    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Error details
     * <p>
     * Errors that occurred during transaction processing
     * 
     */
    @JsonProperty("errDtls")
    public List<ErrDtl> getErrDtls() {
        return errDtls;
    }

    /**
     * Error details
     * <p>
     * Errors that occurred during transaction processing
     * 
     */
    @JsonProperty("errDtls")
    public void setErrDtls(List<ErrDtl> errDtls) {
        this.errDtls = errDtls;
    }

    /**
     * Key value pairs
     * <p>
     * The key-value pairing for this error
     * 
     */
    @JsonProperty("keyValues")
    public KeyValues getKeyValues() {
        return keyValues;
    }

    /**
     * Key value pairs
     * <p>
     * The key-value pairing for this error
     * 
     */
    @JsonProperty("keyValues")
    public void setKeyValues(KeyValues keyValues) {
        this.keyValues = keyValues;
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
        return new HashCodeBuilder().append(id).append(procName).append(errName).append(desc).append(errDtm).append(notes).append(errDtls).append(keyValues).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErrLog) == false) {
            return false;
        }
        ErrLog rhs = ((ErrLog) other);
        return new EqualsBuilder().append(id, rhs.id).append(procName, rhs.procName).append(errName, rhs.errName).append(desc, rhs.desc).append(errDtm, rhs.errDtm).append(notes, rhs.notes).append(errDtls, rhs.errDtls).append(keyValues, rhs.keyValues).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
