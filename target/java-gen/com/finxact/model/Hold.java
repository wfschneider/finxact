
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
 * Hold
 * <p>
 * Defines parameters related to availability of specific sums of funds
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_Id",
    "network",
    "authRef",
    "holdType",
    "reason",
    "note",
    "holdAmt",
    "acctGroup",
    "posnAcctNbr",
    "posnId",
    "startDtm",
    "endDtm",
    "cancelDtm",
    "dur",
    "slices",
    "interval",
    "eft",
    "updtRef"
})
public class Hold {

    /**
     * Hold identifier
     * <p>
     * Unique hold identifier
     * 
     */
    @JsonProperty("_Id")
    @JsonPropertyDescription("Unique hold identifier")
    private String id;
    /**
     * Network
     * <p>
     * Network associated with authRef
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("Network associated with authRef")
    private Integer network;
    /**
     * Authorization reference
     * <p>
     * External reference for authorization hold
     * 
     */
    @JsonProperty("authRef")
    @JsonPropertyDescription("External reference for authorization hold")
    private Integer authRef;
    /**
     * Hold type code
     * <p>
     * The hold type code
     * 
     */
    @JsonProperty("holdType")
    @JsonPropertyDescription("The hold type code")
    private Integer holdType;
    /**
     * Hold reason code
     * <p>
     * The reason code for why hold was placed
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("The reason code for why hold was placed")
    private String reason;
    /**
     * Hold note
     * <p>
     * Free form accompanying note
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Free form accompanying note")
    private String note;
    /**
     * Hold amount
     * <p>
     * Amount to hold, default to entry.tranAmt
     * 
     */
    @JsonProperty("holdAmt")
    @JsonPropertyDescription("Amount to hold, default to entry.tranAmt")
    private Double holdAmt;
    /**
     * Account Group
     * <p>
     * Account Group code
     * 
     */
    @JsonProperty("acctGroup")
    @JsonPropertyDescription("Account Group code")
    private Integer acctGroup;
    /**
     * Position Account Number
     * <p>
     * The unique position identifier within an acctGroup
     * 
     */
    @JsonProperty("posnAcctNbr")
    @JsonPropertyDescription("The unique position identifier within an acctGroup")
    private String posnAcctNbr;
    /**
     * Position identifier
     * <p>
     * Unique position identifier
     * 
     */
    @JsonProperty("posnId")
    @JsonPropertyDescription("Unique position identifier")
    private String posnId;
    /**
     * Hold start
     * <p>
     * Date and time hold will start, default immediately
     * 
     */
    @JsonProperty("startDtm")
    @JsonPropertyDescription("Date and time hold will start, default immediately")
    private Date startDtm;
    /**
     * Hold expiration
     * <p>
     * Date and time hold will expire, default 10/15/2114-23:59
     * 
     */
    @JsonProperty("endDtm")
    @JsonPropertyDescription("Date and time hold will expire, default 10/15/2114-23:59")
    private Date endDtm;
    /**
     * Hold cancellation
     * <p>
     * Date and time hold was cancelled
     * 
     */
    @JsonProperty("cancelDtm")
    @JsonPropertyDescription("Date and time hold was cancelled")
    private Date cancelDtm;
    /**
     * Hold duration
     * <p>
     * Duration of the hold determines endDt
     * 
     */
    @JsonProperty("dur")
    @JsonPropertyDescription("Duration of the hold determines endDt")
    private String dur;
    /**
     * Hold slices
     * <p>
     * Hold release amount per period, used for reg CC or custom
     * 
     */
    @JsonProperty("slices")
    @JsonPropertyDescription("Hold release amount per period, used for reg CC or custom")
    private List<Double> slices = new ArrayList<Double>();
    /**
     * Slice interval
     * <p>
     * Duration of a slice interval if slices (e.g., (1D)
     * 
     */
    @JsonProperty("interval")
    @JsonPropertyDescription("Duration of a slice interval if slices (e.g., (1D)")
    private String interval;
    /**
     * Transaction EFT
     * <p>
     * Financial transaction EFT detail (ISO8583)
     * 
     */
    @JsonProperty("eft")
    @JsonPropertyDescription("Financial transaction EFT detail (ISO8583)")
    private Eft eft;
    /**
     * Update References
     * <p>
     * References to transactions that updated this hold
     * 
     */
    @JsonProperty("updtRef")
    @JsonPropertyDescription("References to transactions that updated this hold")
    private List<String> updtRef = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Hold identifier
     * <p>
     * Unique hold identifier
     * 
     */
    @JsonProperty("_Id")
    public String getId() {
        return id;
    }

    /**
     * Hold identifier
     * <p>
     * Unique hold identifier
     * 
     */
    @JsonProperty("_Id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Network
     * <p>
     * Network associated with authRef
     * 
     */
    @JsonProperty("network")
    public Integer getNetwork() {
        return network;
    }

    /**
     * Network
     * <p>
     * Network associated with authRef
     * 
     */
    @JsonProperty("network")
    public void setNetwork(Integer network) {
        this.network = network;
    }

    /**
     * Authorization reference
     * <p>
     * External reference for authorization hold
     * 
     */
    @JsonProperty("authRef")
    public Integer getAuthRef() {
        return authRef;
    }

    /**
     * Authorization reference
     * <p>
     * External reference for authorization hold
     * 
     */
    @JsonProperty("authRef")
    public void setAuthRef(Integer authRef) {
        this.authRef = authRef;
    }

    /**
     * Hold type code
     * <p>
     * The hold type code
     * 
     */
    @JsonProperty("holdType")
    public Integer getHoldType() {
        return holdType;
    }

    /**
     * Hold type code
     * <p>
     * The hold type code
     * 
     */
    @JsonProperty("holdType")
    public void setHoldType(Integer holdType) {
        this.holdType = holdType;
    }

    /**
     * Hold reason code
     * <p>
     * The reason code for why hold was placed
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Hold reason code
     * <p>
     * The reason code for why hold was placed
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Hold note
     * <p>
     * Free form accompanying note
     * 
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Hold note
     * <p>
     * Free form accompanying note
     * 
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Hold amount
     * <p>
     * Amount to hold, default to entry.tranAmt
     * 
     */
    @JsonProperty("holdAmt")
    public Double getHoldAmt() {
        return holdAmt;
    }

    /**
     * Hold amount
     * <p>
     * Amount to hold, default to entry.tranAmt
     * 
     */
    @JsonProperty("holdAmt")
    public void setHoldAmt(Double holdAmt) {
        this.holdAmt = holdAmt;
    }

    /**
     * Account Group
     * <p>
     * Account Group code
     * 
     */
    @JsonProperty("acctGroup")
    public Integer getAcctGroup() {
        return acctGroup;
    }

    /**
     * Account Group
     * <p>
     * Account Group code
     * 
     */
    @JsonProperty("acctGroup")
    public void setAcctGroup(Integer acctGroup) {
        this.acctGroup = acctGroup;
    }

    /**
     * Position Account Number
     * <p>
     * The unique position identifier within an acctGroup
     * 
     */
    @JsonProperty("posnAcctNbr")
    public String getPosnAcctNbr() {
        return posnAcctNbr;
    }

    /**
     * Position Account Number
     * <p>
     * The unique position identifier within an acctGroup
     * 
     */
    @JsonProperty("posnAcctNbr")
    public void setPosnAcctNbr(String posnAcctNbr) {
        this.posnAcctNbr = posnAcctNbr;
    }

    /**
     * Position identifier
     * <p>
     * Unique position identifier
     * 
     */
    @JsonProperty("posnId")
    public String getPosnId() {
        return posnId;
    }

    /**
     * Position identifier
     * <p>
     * Unique position identifier
     * 
     */
    @JsonProperty("posnId")
    public void setPosnId(String posnId) {
        this.posnId = posnId;
    }

    /**
     * Hold start
     * <p>
     * Date and time hold will start, default immediately
     * 
     */
    @JsonProperty("startDtm")
    public Date getStartDtm() {
        return startDtm;
    }

    /**
     * Hold start
     * <p>
     * Date and time hold will start, default immediately
     * 
     */
    @JsonProperty("startDtm")
    public void setStartDtm(Date startDtm) {
        this.startDtm = startDtm;
    }

    /**
     * Hold expiration
     * <p>
     * Date and time hold will expire, default 10/15/2114-23:59
     * 
     */
    @JsonProperty("endDtm")
    public Date getEndDtm() {
        return endDtm;
    }

    /**
     * Hold expiration
     * <p>
     * Date and time hold will expire, default 10/15/2114-23:59
     * 
     */
    @JsonProperty("endDtm")
    public void setEndDtm(Date endDtm) {
        this.endDtm = endDtm;
    }

    /**
     * Hold cancellation
     * <p>
     * Date and time hold was cancelled
     * 
     */
    @JsonProperty("cancelDtm")
    public Date getCancelDtm() {
        return cancelDtm;
    }

    /**
     * Hold cancellation
     * <p>
     * Date and time hold was cancelled
     * 
     */
    @JsonProperty("cancelDtm")
    public void setCancelDtm(Date cancelDtm) {
        this.cancelDtm = cancelDtm;
    }

    /**
     * Hold duration
     * <p>
     * Duration of the hold determines endDt
     * 
     */
    @JsonProperty("dur")
    public String getDur() {
        return dur;
    }

    /**
     * Hold duration
     * <p>
     * Duration of the hold determines endDt
     * 
     */
    @JsonProperty("dur")
    public void setDur(String dur) {
        this.dur = dur;
    }

    /**
     * Hold slices
     * <p>
     * Hold release amount per period, used for reg CC or custom
     * 
     */
    @JsonProperty("slices")
    public List<Double> getSlices() {
        return slices;
    }

    /**
     * Hold slices
     * <p>
     * Hold release amount per period, used for reg CC or custom
     * 
     */
    @JsonProperty("slices")
    public void setSlices(List<Double> slices) {
        this.slices = slices;
    }

    /**
     * Slice interval
     * <p>
     * Duration of a slice interval if slices (e.g., (1D)
     * 
     */
    @JsonProperty("interval")
    public String getInterval() {
        return interval;
    }

    /**
     * Slice interval
     * <p>
     * Duration of a slice interval if slices (e.g., (1D)
     * 
     */
    @JsonProperty("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * Transaction EFT
     * <p>
     * Financial transaction EFT detail (ISO8583)
     * 
     */
    @JsonProperty("eft")
    public Eft getEft() {
        return eft;
    }

    /**
     * Transaction EFT
     * <p>
     * Financial transaction EFT detail (ISO8583)
     * 
     */
    @JsonProperty("eft")
    public void setEft(Eft eft) {
        this.eft = eft;
    }

    /**
     * Update References
     * <p>
     * References to transactions that updated this hold
     * 
     */
    @JsonProperty("updtRef")
    public List<String> getUpdtRef() {
        return updtRef;
    }

    /**
     * Update References
     * <p>
     * References to transactions that updated this hold
     * 
     */
    @JsonProperty("updtRef")
    public void setUpdtRef(List<String> updtRef) {
        this.updtRef = updtRef;
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
        return new HashCodeBuilder().append(id).append(network).append(authRef).append(holdType).append(reason).append(note).append(holdAmt).append(acctGroup).append(posnAcctNbr).append(posnId).append(startDtm).append(endDtm).append(cancelDtm).append(dur).append(slices).append(interval).append(eft).append(updtRef).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hold) == false) {
            return false;
        }
        Hold rhs = ((Hold) other);
        return new EqualsBuilder().append(id, rhs.id).append(network, rhs.network).append(authRef, rhs.authRef).append(holdType, rhs.holdType).append(reason, rhs.reason).append(note, rhs.note).append(holdAmt, rhs.holdAmt).append(acctGroup, rhs.acctGroup).append(posnAcctNbr, rhs.posnAcctNbr).append(posnId, rhs.posnId).append(startDtm, rhs.startDtm).append(endDtm, rhs.endDtm).append(cancelDtm, rhs.cancelDtm).append(dur, rhs.dur).append(slices, rhs.slices).append(interval, rhs.interval).append(eft, rhs.eft).append(updtRef, rhs.updtRef).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
