
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
 * Work item
 * <p>
 * Work item
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_Id",
    "appId",
    "caseId",
    "caseType",
    "openDtm",
    "status",
    "activity",
    "task",
    "step",
    "note"
})
public class WorkItem {

    /**
     * Case identifier
     * <p>
     * The case identifier
     * 
     */
    @JsonProperty("_Id")
    @JsonPropertyDescription("The case identifier")
    private String id;
    /**
     * Application identifier
     * <p>
     * The case application identifier
     * 
     */
    @JsonProperty("appId")
    @JsonPropertyDescription("The case application identifier")
    private String appId;
    /**
     * Unique case identifier within apppId
     * <p>
     * 
     * 
     */
    @JsonProperty("caseId")
    private String caseId;
    /**
     * Case type
     * <p>
     * The case type
     * 
     */
    @JsonProperty("caseType")
    @JsonPropertyDescription("The case type")
    private String caseType;
    /**
     * Opened on
     * <p>
     * When case was opened
     * 
     */
    @JsonProperty("openDtm")
    @JsonPropertyDescription("When case was opened")
    private Date openDtm;
    /**
     * Status
     * <p>
     * The case status
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The case status")
    private String status;
    /**
     * Activity
     * <p>
     * The case activity
     * 
     */
    @JsonProperty("activity")
    @JsonPropertyDescription("The case activity")
    private String activity;
    /**
     * Task
     * <p>
     * The case task
     * 
     */
    @JsonProperty("task")
    @JsonPropertyDescription("The case task")
    private String task;
    /**
     * Step
     * <p>
     * The case step within task
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("The case step within task")
    private String step;
    /**
     * Note
     * <p>
     * Free text case note
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Free text case note")
    private String note;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Case identifier
     * <p>
     * The case identifier
     * 
     */
    @JsonProperty("_Id")
    public String getId() {
        return id;
    }

    /**
     * Case identifier
     * <p>
     * The case identifier
     * 
     */
    @JsonProperty("_Id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Application identifier
     * <p>
     * The case application identifier
     * 
     */
    @JsonProperty("appId")
    public String getAppId() {
        return appId;
    }

    /**
     * Application identifier
     * <p>
     * The case application identifier
     * 
     */
    @JsonProperty("appId")
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * Unique case identifier within apppId
     * <p>
     * 
     * 
     */
    @JsonProperty("caseId")
    public String getCaseId() {
        return caseId;
    }

    /**
     * Unique case identifier within apppId
     * <p>
     * 
     * 
     */
    @JsonProperty("caseId")
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * Case type
     * <p>
     * The case type
     * 
     */
    @JsonProperty("caseType")
    public String getCaseType() {
        return caseType;
    }

    /**
     * Case type
     * <p>
     * The case type
     * 
     */
    @JsonProperty("caseType")
    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    /**
     * Opened on
     * <p>
     * When case was opened
     * 
     */
    @JsonProperty("openDtm")
    public Date getOpenDtm() {
        return openDtm;
    }

    /**
     * Opened on
     * <p>
     * When case was opened
     * 
     */
    @JsonProperty("openDtm")
    public void setOpenDtm(Date openDtm) {
        this.openDtm = openDtm;
    }

    /**
     * Status
     * <p>
     * The case status
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The case status
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Activity
     * <p>
     * The case activity
     * 
     */
    @JsonProperty("activity")
    public String getActivity() {
        return activity;
    }

    /**
     * Activity
     * <p>
     * The case activity
     * 
     */
    @JsonProperty("activity")
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * Task
     * <p>
     * The case task
     * 
     */
    @JsonProperty("task")
    public String getTask() {
        return task;
    }

    /**
     * Task
     * <p>
     * The case task
     * 
     */
    @JsonProperty("task")
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * Step
     * <p>
     * The case step within task
     * 
     */
    @JsonProperty("step")
    public String getStep() {
        return step;
    }

    /**
     * Step
     * <p>
     * The case step within task
     * 
     */
    @JsonProperty("step")
    public void setStep(String step) {
        this.step = step;
    }

    /**
     * Note
     * <p>
     * Free text case note
     * 
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Note
     * <p>
     * Free text case note
     * 
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
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
        return new HashCodeBuilder().append(id).append(appId).append(caseId).append(caseType).append(openDtm).append(status).append(activity).append(task).append(step).append(note).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkItem) == false) {
            return false;
        }
        WorkItem rhs = ((WorkItem) other);
        return new EqualsBuilder().append(id, rhs.id).append(appId, rhs.appId).append(caseId, rhs.caseId).append(caseType, rhs.caseType).append(openDtm, rhs.openDtm).append(status, rhs.status).append(activity, rhs.activity).append(task, rhs.task).append(step, rhs.step).append(note, rhs.note).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
