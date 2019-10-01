
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
 * Transaction header
 * <p>
 * Financial transaction header
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "network",
    "glJrnlDate",
    "effectDtm",
    "settleDtm",
    "batchId",
    "workItem",
    "order",
    "reverseId",
    "trnCode",
    "eft",
    "mode",
    "terminal",
    "bill",
    "note",
    "attachments",
    "tags",
    "otherProperties"
})
public class TrnHdr {

    /**
     * network
     * <p>
     * The name of the settlement network that is the transaction source
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("The name of the settlement network that is the transaction source")
    private String network;
    /**
     * GL journal date
     * <p>
     * The GL journal date this transaction entry is posting on
     * 
     */
    @JsonProperty("glJrnlDate")
    @JsonPropertyDescription("The GL journal date this transaction entry is posting on")
    private String glJrnlDate;
    /**
     * Effective date
     * <p>
     * The effective date of the transaction for account processing if different that glJrnlDate, can be backdate or future
     * 
     */
    @JsonProperty("effectDtm")
    @JsonPropertyDescription("The effective date of the transaction for account processing if different that glJrnlDate, can be backdate or future")
    private Date effectDtm;
    /**
     * Settlement date
     * <p>
     * The settlement date of this transaction
     * 
     */
    @JsonProperty("settleDtm")
    @JsonPropertyDescription("The settlement date of this transaction")
    private Date settleDtm;
    /**
     * Batch source
     * <p>
     * For a batch source the object that contains batch detail
     * 
     */
    @JsonProperty("batchId")
    @JsonPropertyDescription("For a batch source the object that contains batch detail")
    private String batchId;
    /**
     * Work item
     * <p>
     * Work item
     * 
     */
    @JsonProperty("workItem")
    @JsonPropertyDescription("Work item")
    private WorkItem workItem;
    /**
     * Order detail
     * <p>
     * Payment, collection and transfer order detail
     * 
     */
    @JsonProperty("order")
    @JsonPropertyDescription("Payment, collection and transfer order detail")
    private Order order;
    /**
     * Reversal transaction reference
     * <p>
     * Transaction ID that this transaction reversed
     * 
     */
    @JsonProperty("reverseId")
    @JsonPropertyDescription("Transaction ID that this transaction reversed")
    private String reverseId;
    /**
     * Transaction code
     * <p>
     * The Finxact host transaction code
     * 
     */
    @JsonProperty("trnCode")
    @JsonPropertyDescription("The Finxact host transaction code")
    private String trnCode;
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
     * Processing mode
     * <p>
     * The FInxact processing mode
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("The FInxact processing mode")
    private Integer mode;
    /**
     * Originating terminal
     * <p>
     * Originating or accepting terminal detail
     * 
     */
    @JsonProperty("terminal")
    @JsonPropertyDescription("Originating or accepting terminal detail")
    private Terminal_ terminal;
    /**
     * Bill
     * <p>
     * Retail, commercial or service bill or invoice
     * 
     */
    @JsonProperty("bill")
    @JsonPropertyDescription("Retail, commercial or service bill or invoice")
    private Bill bill;
    /**
     * Transaction note
     * <p>
     * Detailed free form transaction notes
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Detailed free form transaction notes")
    private String note;
    /**
     * Attached items
     * <p>
     * URI references to attached documents and images
     * 
     */
    @JsonProperty("attachments")
    @JsonPropertyDescription("URI references to attached documents and images")
    private List<Attach> attachments = new ArrayList<Attach>();
    /**
     * Transaction Tags
     * <p>
     * Transaction reference tags
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Transaction reference tags")
    private Tags_ tags;
    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    @JsonPropertyDescription("Array of additional properties in name:value object pairs")
    private OtherProperties___ otherProperties;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * network
     * <p>
     * The name of the settlement network that is the transaction source
     * 
     */
    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    /**
     * network
     * <p>
     * The name of the settlement network that is the transaction source
     * 
     */
    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * GL journal date
     * <p>
     * The GL journal date this transaction entry is posting on
     * 
     */
    @JsonProperty("glJrnlDate")
    public String getGlJrnlDate() {
        return glJrnlDate;
    }

    /**
     * GL journal date
     * <p>
     * The GL journal date this transaction entry is posting on
     * 
     */
    @JsonProperty("glJrnlDate")
    public void setGlJrnlDate(String glJrnlDate) {
        this.glJrnlDate = glJrnlDate;
    }

    /**
     * Effective date
     * <p>
     * The effective date of the transaction for account processing if different that glJrnlDate, can be backdate or future
     * 
     */
    @JsonProperty("effectDtm")
    public Date getEffectDtm() {
        return effectDtm;
    }

    /**
     * Effective date
     * <p>
     * The effective date of the transaction for account processing if different that glJrnlDate, can be backdate or future
     * 
     */
    @JsonProperty("effectDtm")
    public void setEffectDtm(Date effectDtm) {
        this.effectDtm = effectDtm;
    }

    /**
     * Settlement date
     * <p>
     * The settlement date of this transaction
     * 
     */
    @JsonProperty("settleDtm")
    public Date getSettleDtm() {
        return settleDtm;
    }

    /**
     * Settlement date
     * <p>
     * The settlement date of this transaction
     * 
     */
    @JsonProperty("settleDtm")
    public void setSettleDtm(Date settleDtm) {
        this.settleDtm = settleDtm;
    }

    /**
     * Batch source
     * <p>
     * For a batch source the object that contains batch detail
     * 
     */
    @JsonProperty("batchId")
    public String getBatchId() {
        return batchId;
    }

    /**
     * Batch source
     * <p>
     * For a batch source the object that contains batch detail
     * 
     */
    @JsonProperty("batchId")
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * Work item
     * <p>
     * Work item
     * 
     */
    @JsonProperty("workItem")
    public WorkItem getWorkItem() {
        return workItem;
    }

    /**
     * Work item
     * <p>
     * Work item
     * 
     */
    @JsonProperty("workItem")
    public void setWorkItem(WorkItem workItem) {
        this.workItem = workItem;
    }

    /**
     * Order detail
     * <p>
     * Payment, collection and transfer order detail
     * 
     */
    @JsonProperty("order")
    public Order getOrder() {
        return order;
    }

    /**
     * Order detail
     * <p>
     * Payment, collection and transfer order detail
     * 
     */
    @JsonProperty("order")
    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * Reversal transaction reference
     * <p>
     * Transaction ID that this transaction reversed
     * 
     */
    @JsonProperty("reverseId")
    public String getReverseId() {
        return reverseId;
    }

    /**
     * Reversal transaction reference
     * <p>
     * Transaction ID that this transaction reversed
     * 
     */
    @JsonProperty("reverseId")
    public void setReverseId(String reverseId) {
        this.reverseId = reverseId;
    }

    /**
     * Transaction code
     * <p>
     * The Finxact host transaction code
     * 
     */
    @JsonProperty("trnCode")
    public String getTrnCode() {
        return trnCode;
    }

    /**
     * Transaction code
     * <p>
     * The Finxact host transaction code
     * 
     */
    @JsonProperty("trnCode")
    public void setTrnCode(String trnCode) {
        this.trnCode = trnCode;
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
     * Processing mode
     * <p>
     * The FInxact processing mode
     * 
     */
    @JsonProperty("mode")
    public Integer getMode() {
        return mode;
    }

    /**
     * Processing mode
     * <p>
     * The FInxact processing mode
     * 
     */
    @JsonProperty("mode")
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * Originating terminal
     * <p>
     * Originating or accepting terminal detail
     * 
     */
    @JsonProperty("terminal")
    public Terminal_ getTerminal() {
        return terminal;
    }

    /**
     * Originating terminal
     * <p>
     * Originating or accepting terminal detail
     * 
     */
    @JsonProperty("terminal")
    public void setTerminal(Terminal_ terminal) {
        this.terminal = terminal;
    }

    /**
     * Bill
     * <p>
     * Retail, commercial or service bill or invoice
     * 
     */
    @JsonProperty("bill")
    public Bill getBill() {
        return bill;
    }

    /**
     * Bill
     * <p>
     * Retail, commercial or service bill or invoice
     * 
     */
    @JsonProperty("bill")
    public void setBill(Bill bill) {
        this.bill = bill;
    }

    /**
     * Transaction note
     * <p>
     * Detailed free form transaction notes
     * 
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Transaction note
     * <p>
     * Detailed free form transaction notes
     * 
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Attached items
     * <p>
     * URI references to attached documents and images
     * 
     */
    @JsonProperty("attachments")
    public List<Attach> getAttachments() {
        return attachments;
    }

    /**
     * Attached items
     * <p>
     * URI references to attached documents and images
     * 
     */
    @JsonProperty("attachments")
    public void setAttachments(List<Attach> attachments) {
        this.attachments = attachments;
    }

    /**
     * Transaction Tags
     * <p>
     * Transaction reference tags
     * 
     */
    @JsonProperty("tags")
    public Tags_ getTags() {
        return tags;
    }

    /**
     * Transaction Tags
     * <p>
     * Transaction reference tags
     * 
     */
    @JsonProperty("tags")
    public void setTags(Tags_ tags) {
        this.tags = tags;
    }

    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    public OtherProperties___ getOtherProperties() {
        return otherProperties;
    }

    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    public void setOtherProperties(OtherProperties___ otherProperties) {
        this.otherProperties = otherProperties;
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
        return new HashCodeBuilder().append(network).append(glJrnlDate).append(effectDtm).append(settleDtm).append(batchId).append(workItem).append(order).append(reverseId).append(trnCode).append(eft).append(mode).append(terminal).append(bill).append(note).append(attachments).append(tags).append(otherProperties).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrnHdr) == false) {
            return false;
        }
        TrnHdr rhs = ((TrnHdr) other);
        return new EqualsBuilder().append(network, rhs.network).append(glJrnlDate, rhs.glJrnlDate).append(effectDtm, rhs.effectDtm).append(settleDtm, rhs.settleDtm).append(batchId, rhs.batchId).append(workItem, rhs.workItem).append(order, rhs.order).append(reverseId, rhs.reverseId).append(trnCode, rhs.trnCode).append(eft, rhs.eft).append(mode, rhs.mode).append(terminal, rhs.terminal).append(bill, rhs.bill).append(note, rhs.note).append(attachments, rhs.attachments).append(tags, rhs.tags).append(otherProperties, rhs.otherProperties).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
