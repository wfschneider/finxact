
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
 * Order detail
 * <p>
 * Payment, collection and transfer order detail
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_Id",
    "posnId",
    "orderType",
    "orderSrc",
    "originSrc",
    "orderStatus",
    "createDtm",
    "createBy",
    "checkedBy",
    "orderDtm",
    "verifyDtm",
    "procDtm",
    "claimExpDtm",
    "cancelDtm",
    "cancelBy",
    "cancelReason",
    "orderAmt",
    "threshholdAmt",
    "orderInfo",
    "orderTotAmt",
    "beneNetAmt",
    "network",
    "originator",
    "notify",
    "senderFee",
    "intermedFi",
    "receiverFee",
    "remainRetry",
    "counterParty",
    "attachments",
    "auth",
    "recur",
    "trnId",
    "threadId",
    "trnExceptId",
    "otherProperties"
})
public class Order {

    /**
     * Unique order identifier
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("_Id")
    private Integer id;
    /**
     * Position Id
     * <p>
     * Related Position Id
     * 
     */
    @JsonProperty("posnId")
    @JsonPropertyDescription("Related Position Id")
    private Integer posnId;
    /**
     * Order type
     * <p>
     * The type of order
     * (Required)
     * 
     */
    @JsonProperty("orderType")
    @JsonPropertyDescription("The type of order")
    private Integer orderType;
    /**
     * Order source
     * <p>
     * The source that originated the order
     * 
     */
    @JsonProperty("orderSrc")
    @JsonPropertyDescription("The source that originated the order")
    private Integer orderSrc;
    /**
     * Origination Source
     * <p>
     * The origination source by which the order is placed (e.g. web or telephone)
     * 
     */
    @JsonProperty("originSrc")
    @JsonPropertyDescription("The origination source by which the order is placed (e.g. web or telephone)")
    private Integer originSrc;
    /**
     * Order Status
     * <p>
     * The status of the order
     * 
     */
    @JsonProperty("orderStatus")
    @JsonPropertyDescription("The status of the order")
    private Integer orderStatus;
    /**
     * Created on date
     * <p>
     * Order created on date
     * 
     */
    @JsonProperty("createDtm")
    @JsonPropertyDescription("Order created on date")
    private Date createDtm;
    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("createBy")
    @JsonPropertyDescription("Person or organization party record")
    private CreateBy createBy;
    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("checkedBy")
    @JsonPropertyDescription("Person or organization party record")
    private CreateBy checkedBy;
    /**
     * Order date
     * <p>
     * Order scheduled to be processed on datetime
     * (Required)
     * 
     */
    @JsonProperty("orderDtm")
    @JsonPropertyDescription("Order scheduled to be processed on datetime")
    private Date orderDtm;
    /**
     * Verified Date
     * <p>
     * Order verified on datetime
     * 
     */
    @JsonProperty("verifyDtm")
    @JsonPropertyDescription("Order verified on datetime")
    private Date verifyDtm;
    /**
     * Processed date
     * <p>
     * Order actually processed on datetime
     * 
     */
    @JsonProperty("procDtm")
    @JsonPropertyDescription("Order actually processed on datetime")
    private Date procDtm;
    /**
     * Claim expiration date
     * <p>
     * Order expired on datetime and can no longer be claimed
     * 
     */
    @JsonProperty("claimExpDtm")
    @JsonPropertyDescription("Order expired on datetime and can no longer be claimed")
    private Date claimExpDtm;
    /**
     * Cancel Date
     * <p>
     * Order canceled on datetime
     * 
     */
    @JsonProperty("cancelDtm")
    @JsonPropertyDescription("Order canceled on datetime")
    private Date cancelDtm;
    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("cancelBy")
    @JsonPropertyDescription("Person or organization party record")
    private CreateBy cancelBy;
    /**
     * Cancellation Reason
     * <p>
     * Reason the order was canceled
     * 
     */
    @JsonProperty("cancelReason")
    @JsonPropertyDescription("Reason the order was canceled")
    private String cancelReason;
    /**
     * Order amount
     * <p>
     * The amount of the order, net to transfer to receiver
     * 
     */
    @JsonProperty("orderAmt")
    @JsonPropertyDescription("The amount of the order, net to transfer to receiver")
    private Double orderAmt;
    /**
     * Threshhold amount
     * <p>
     * Amount used to determine balance for threshold transfer
     * 
     */
    @JsonProperty("threshholdAmt")
    @JsonPropertyDescription("Amount used to determine balance for threshold transfer")
    private Double threshholdAmt;
    /**
     * Originator Info
     * <p>
     * Originator to beneficiary information
     * 
     */
    @JsonProperty("orderInfo")
    @JsonPropertyDescription("Originator to beneficiary information")
    private String orderInfo;
    /**
     * Order total amount
     * <p>
     * Ordering customer total settled amount, order amount plus fees
     * 
     */
    @JsonProperty("orderTotAmt")
    @JsonPropertyDescription("Ordering customer total settled amount, order amount plus fees")
    private Double orderTotAmt;
    /**
     * Beneficiary total amount
     * <p>
     * Beneficiary customer total settled amount (sent amount - receiver fees)
     * 
     */
    @JsonProperty("beneNetAmt")
    @JsonPropertyDescription("Beneficiary customer total settled amount (sent amount - receiver fees)")
    private Double beneNetAmt;
    /**
     * Payment network
     * <p>
     * Payment network type
     * (Required)
     * 
     */
    @JsonProperty("network")
    @JsonPropertyDescription("Payment network type")
    private String network;
    /**
     * Counterparty
     * <p>
     * Transaction counterparty detail
     * (Required)
     * 
     */
    @JsonProperty("originator")
    @JsonPropertyDescription("Transaction counterparty detail")
    private Counterparty originator;
    /**
     * Notify list
     * <p>
     * List of parties to notify when order is executed
     * 
     */
    @JsonProperty("notify")
    @JsonPropertyDescription("List of parties to notify when order is executed")
    private List<CreateBy> notify = new ArrayList<CreateBy>();
    /**
     * Fee details
     * <p>
     * Defines parameters associated to a fee
     * 
     */
    @JsonProperty("senderFee")
    @JsonPropertyDescription("Defines parameters associated to a fee")
    private Fee senderFee;
    /**
     * Financial institution
     * <p>
     * Financial institution detail
     * 
     */
    @JsonProperty("intermedFi")
    @JsonPropertyDescription("Financial institution detail")
    private FinInst intermedFi;
    /**
     * Fee details
     * <p>
     * Defines parameters associated to a fee
     * 
     */
    @JsonProperty("receiverFee")
    @JsonPropertyDescription("Defines parameters associated to a fee")
    private Fee receiverFee;
    /**
     * Retries remaining
     * <p>
     * Number of retry attempts remaining
     * (Required)
     * 
     */
    @JsonProperty("remainRetry")
    @JsonPropertyDescription("Number of retry attempts remaining")
    private Integer remainRetry;
    /**
     * Counterparty
     * <p>
     * Transaction counterparty detail
     * (Required)
     * 
     */
    @JsonProperty("counterParty")
    @JsonPropertyDescription("Transaction counterparty detail")
    private Counterparty counterParty;
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
     * Transaction entry authorization
     * <p>
     * Transaction entry authorization
     * 
     */
    @JsonProperty("auth")
    @JsonPropertyDescription("Transaction entry authorization")
    private Auth auth;
    /**
     * Recurring order
     * <p>
     * Recurring or standing order detail
     * 
     */
    @JsonProperty("recur")
    @JsonPropertyDescription("Recurring or standing order detail")
    private Recur recur;
    /**
     * Transaction identifier
     * <p>
     * Unique transaction identifier
     * 
     */
    @JsonProperty("trnId")
    @JsonPropertyDescription("Unique transaction identifier")
    private String trnId;
    /**
     * Transaction thread reference
     * <p>
     * A unique trace, endToEndId, or other reference number generated by the transaction originator that may span multiple transactions or messages
     * 
     */
    @JsonProperty("threadId")
    @JsonPropertyDescription("A unique trace, endToEndId, or other reference number generated by the transaction originator that may span multiple transactions or messages")
    private String threadId;
    /**
     * Transaction exception identifier
     * <p>
     * Unique transaction exception identifier for order returns
     * 
     */
    @JsonProperty("trnExceptId")
    @JsonPropertyDescription("Unique transaction exception identifier for order returns")
    private String trnExceptId;
    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    @JsonPropertyDescription("Array of additional properties in name:value object pairs")
    private OtherProperties_ otherProperties;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unique order identifier
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("_Id")
    public Integer getId() {
        return id;
    }

    /**
     * Unique order identifier
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("_Id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Position Id
     * <p>
     * Related Position Id
     * 
     */
    @JsonProperty("posnId")
    public Integer getPosnId() {
        return posnId;
    }

    /**
     * Position Id
     * <p>
     * Related Position Id
     * 
     */
    @JsonProperty("posnId")
    public void setPosnId(Integer posnId) {
        this.posnId = posnId;
    }

    /**
     * Order type
     * <p>
     * The type of order
     * (Required)
     * 
     */
    @JsonProperty("orderType")
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * Order type
     * <p>
     * The type of order
     * (Required)
     * 
     */
    @JsonProperty("orderType")
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * Order source
     * <p>
     * The source that originated the order
     * 
     */
    @JsonProperty("orderSrc")
    public Integer getOrderSrc() {
        return orderSrc;
    }

    /**
     * Order source
     * <p>
     * The source that originated the order
     * 
     */
    @JsonProperty("orderSrc")
    public void setOrderSrc(Integer orderSrc) {
        this.orderSrc = orderSrc;
    }

    /**
     * Origination Source
     * <p>
     * The origination source by which the order is placed (e.g. web or telephone)
     * 
     */
    @JsonProperty("originSrc")
    public Integer getOriginSrc() {
        return originSrc;
    }

    /**
     * Origination Source
     * <p>
     * The origination source by which the order is placed (e.g. web or telephone)
     * 
     */
    @JsonProperty("originSrc")
    public void setOriginSrc(Integer originSrc) {
        this.originSrc = originSrc;
    }

    /**
     * Order Status
     * <p>
     * The status of the order
     * 
     */
    @JsonProperty("orderStatus")
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * Order Status
     * <p>
     * The status of the order
     * 
     */
    @JsonProperty("orderStatus")
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Created on date
     * <p>
     * Order created on date
     * 
     */
    @JsonProperty("createDtm")
    public Date getCreateDtm() {
        return createDtm;
    }

    /**
     * Created on date
     * <p>
     * Order created on date
     * 
     */
    @JsonProperty("createDtm")
    public void setCreateDtm(Date createDtm) {
        this.createDtm = createDtm;
    }

    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("createBy")
    public CreateBy getCreateBy() {
        return createBy;
    }

    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("createBy")
    public void setCreateBy(CreateBy createBy) {
        this.createBy = createBy;
    }

    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("checkedBy")
    public CreateBy getCheckedBy() {
        return checkedBy;
    }

    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("checkedBy")
    public void setCheckedBy(CreateBy checkedBy) {
        this.checkedBy = checkedBy;
    }

    /**
     * Order date
     * <p>
     * Order scheduled to be processed on datetime
     * (Required)
     * 
     */
    @JsonProperty("orderDtm")
    public Date getOrderDtm() {
        return orderDtm;
    }

    /**
     * Order date
     * <p>
     * Order scheduled to be processed on datetime
     * (Required)
     * 
     */
    @JsonProperty("orderDtm")
    public void setOrderDtm(Date orderDtm) {
        this.orderDtm = orderDtm;
    }

    /**
     * Verified Date
     * <p>
     * Order verified on datetime
     * 
     */
    @JsonProperty("verifyDtm")
    public Date getVerifyDtm() {
        return verifyDtm;
    }

    /**
     * Verified Date
     * <p>
     * Order verified on datetime
     * 
     */
    @JsonProperty("verifyDtm")
    public void setVerifyDtm(Date verifyDtm) {
        this.verifyDtm = verifyDtm;
    }

    /**
     * Processed date
     * <p>
     * Order actually processed on datetime
     * 
     */
    @JsonProperty("procDtm")
    public Date getProcDtm() {
        return procDtm;
    }

    /**
     * Processed date
     * <p>
     * Order actually processed on datetime
     * 
     */
    @JsonProperty("procDtm")
    public void setProcDtm(Date procDtm) {
        this.procDtm = procDtm;
    }

    /**
     * Claim expiration date
     * <p>
     * Order expired on datetime and can no longer be claimed
     * 
     */
    @JsonProperty("claimExpDtm")
    public Date getClaimExpDtm() {
        return claimExpDtm;
    }

    /**
     * Claim expiration date
     * <p>
     * Order expired on datetime and can no longer be claimed
     * 
     */
    @JsonProperty("claimExpDtm")
    public void setClaimExpDtm(Date claimExpDtm) {
        this.claimExpDtm = claimExpDtm;
    }

    /**
     * Cancel Date
     * <p>
     * Order canceled on datetime
     * 
     */
    @JsonProperty("cancelDtm")
    public Date getCancelDtm() {
        return cancelDtm;
    }

    /**
     * Cancel Date
     * <p>
     * Order canceled on datetime
     * 
     */
    @JsonProperty("cancelDtm")
    public void setCancelDtm(Date cancelDtm) {
        this.cancelDtm = cancelDtm;
    }

    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("cancelBy")
    public CreateBy getCancelBy() {
        return cancelBy;
    }

    /**
     * Party
     * <p>
     * Person or organization party record
     * 
     */
    @JsonProperty("cancelBy")
    public void setCancelBy(CreateBy cancelBy) {
        this.cancelBy = cancelBy;
    }

    /**
     * Cancellation Reason
     * <p>
     * Reason the order was canceled
     * 
     */
    @JsonProperty("cancelReason")
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Cancellation Reason
     * <p>
     * Reason the order was canceled
     * 
     */
    @JsonProperty("cancelReason")
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * Order amount
     * <p>
     * The amount of the order, net to transfer to receiver
     * 
     */
    @JsonProperty("orderAmt")
    public Double getOrderAmt() {
        return orderAmt;
    }

    /**
     * Order amount
     * <p>
     * The amount of the order, net to transfer to receiver
     * 
     */
    @JsonProperty("orderAmt")
    public void setOrderAmt(Double orderAmt) {
        this.orderAmt = orderAmt;
    }

    /**
     * Threshhold amount
     * <p>
     * Amount used to determine balance for threshold transfer
     * 
     */
    @JsonProperty("threshholdAmt")
    public Double getThreshholdAmt() {
        return threshholdAmt;
    }

    /**
     * Threshhold amount
     * <p>
     * Amount used to determine balance for threshold transfer
     * 
     */
    @JsonProperty("threshholdAmt")
    public void setThreshholdAmt(Double threshholdAmt) {
        this.threshholdAmt = threshholdAmt;
    }

    /**
     * Originator Info
     * <p>
     * Originator to beneficiary information
     * 
     */
    @JsonProperty("orderInfo")
    public String getOrderInfo() {
        return orderInfo;
    }

    /**
     * Originator Info
     * <p>
     * Originator to beneficiary information
     * 
     */
    @JsonProperty("orderInfo")
    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    /**
     * Order total amount
     * <p>
     * Ordering customer total settled amount, order amount plus fees
     * 
     */
    @JsonProperty("orderTotAmt")
    public Double getOrderTotAmt() {
        return orderTotAmt;
    }

    /**
     * Order total amount
     * <p>
     * Ordering customer total settled amount, order amount plus fees
     * 
     */
    @JsonProperty("orderTotAmt")
    public void setOrderTotAmt(Double orderTotAmt) {
        this.orderTotAmt = orderTotAmt;
    }

    /**
     * Beneficiary total amount
     * <p>
     * Beneficiary customer total settled amount (sent amount - receiver fees)
     * 
     */
    @JsonProperty("beneNetAmt")
    public Double getBeneNetAmt() {
        return beneNetAmt;
    }

    /**
     * Beneficiary total amount
     * <p>
     * Beneficiary customer total settled amount (sent amount - receiver fees)
     * 
     */
    @JsonProperty("beneNetAmt")
    public void setBeneNetAmt(Double beneNetAmt) {
        this.beneNetAmt = beneNetAmt;
    }

    /**
     * Payment network
     * <p>
     * Payment network type
     * (Required)
     * 
     */
    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    /**
     * Payment network
     * <p>
     * Payment network type
     * (Required)
     * 
     */
    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * Counterparty
     * <p>
     * Transaction counterparty detail
     * (Required)
     * 
     */
    @JsonProperty("originator")
    public Counterparty getOriginator() {
        return originator;
    }

    /**
     * Counterparty
     * <p>
     * Transaction counterparty detail
     * (Required)
     * 
     */
    @JsonProperty("originator")
    public void setOriginator(Counterparty originator) {
        this.originator = originator;
    }

    /**
     * Notify list
     * <p>
     * List of parties to notify when order is executed
     * 
     */
    @JsonProperty("notify")
    public List<CreateBy> getNotify() {
        return notify;
    }

    /**
     * Notify list
     * <p>
     * List of parties to notify when order is executed
     * 
     */
    @JsonProperty("notify")
    public void setNotify(List<CreateBy> notify) {
        this.notify = notify;
    }

    /**
     * Fee details
     * <p>
     * Defines parameters associated to a fee
     * 
     */
    @JsonProperty("senderFee")
    public Fee getSenderFee() {
        return senderFee;
    }

    /**
     * Fee details
     * <p>
     * Defines parameters associated to a fee
     * 
     */
    @JsonProperty("senderFee")
    public void setSenderFee(Fee senderFee) {
        this.senderFee = senderFee;
    }

    /**
     * Financial institution
     * <p>
     * Financial institution detail
     * 
     */
    @JsonProperty("intermedFi")
    public FinInst getIntermedFi() {
        return intermedFi;
    }

    /**
     * Financial institution
     * <p>
     * Financial institution detail
     * 
     */
    @JsonProperty("intermedFi")
    public void setIntermedFi(FinInst intermedFi) {
        this.intermedFi = intermedFi;
    }

    /**
     * Fee details
     * <p>
     * Defines parameters associated to a fee
     * 
     */
    @JsonProperty("receiverFee")
    public Fee getReceiverFee() {
        return receiverFee;
    }

    /**
     * Fee details
     * <p>
     * Defines parameters associated to a fee
     * 
     */
    @JsonProperty("receiverFee")
    public void setReceiverFee(Fee receiverFee) {
        this.receiverFee = receiverFee;
    }

    /**
     * Retries remaining
     * <p>
     * Number of retry attempts remaining
     * (Required)
     * 
     */
    @JsonProperty("remainRetry")
    public Integer getRemainRetry() {
        return remainRetry;
    }

    /**
     * Retries remaining
     * <p>
     * Number of retry attempts remaining
     * (Required)
     * 
     */
    @JsonProperty("remainRetry")
    public void setRemainRetry(Integer remainRetry) {
        this.remainRetry = remainRetry;
    }

    /**
     * Counterparty
     * <p>
     * Transaction counterparty detail
     * (Required)
     * 
     */
    @JsonProperty("counterParty")
    public Counterparty getCounterParty() {
        return counterParty;
    }

    /**
     * Counterparty
     * <p>
     * Transaction counterparty detail
     * (Required)
     * 
     */
    @JsonProperty("counterParty")
    public void setCounterParty(Counterparty counterParty) {
        this.counterParty = counterParty;
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

    /**
     * Recurring order
     * <p>
     * Recurring or standing order detail
     * 
     */
    @JsonProperty("recur")
    public Recur getRecur() {
        return recur;
    }

    /**
     * Recurring order
     * <p>
     * Recurring or standing order detail
     * 
     */
    @JsonProperty("recur")
    public void setRecur(Recur recur) {
        this.recur = recur;
    }

    /**
     * Transaction identifier
     * <p>
     * Unique transaction identifier
     * 
     */
    @JsonProperty("trnId")
    public String getTrnId() {
        return trnId;
    }

    /**
     * Transaction identifier
     * <p>
     * Unique transaction identifier
     * 
     */
    @JsonProperty("trnId")
    public void setTrnId(String trnId) {
        this.trnId = trnId;
    }

    /**
     * Transaction thread reference
     * <p>
     * A unique trace, endToEndId, or other reference number generated by the transaction originator that may span multiple transactions or messages
     * 
     */
    @JsonProperty("threadId")
    public String getThreadId() {
        return threadId;
    }

    /**
     * Transaction thread reference
     * <p>
     * A unique trace, endToEndId, or other reference number generated by the transaction originator that may span multiple transactions or messages
     * 
     */
    @JsonProperty("threadId")
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * Transaction exception identifier
     * <p>
     * Unique transaction exception identifier for order returns
     * 
     */
    @JsonProperty("trnExceptId")
    public String getTrnExceptId() {
        return trnExceptId;
    }

    /**
     * Transaction exception identifier
     * <p>
     * Unique transaction exception identifier for order returns
     * 
     */
    @JsonProperty("trnExceptId")
    public void setTrnExceptId(String trnExceptId) {
        this.trnExceptId = trnExceptId;
    }

    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    public OtherProperties_ getOtherProperties() {
        return otherProperties;
    }

    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    public void setOtherProperties(OtherProperties_ otherProperties) {
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
        return new HashCodeBuilder().append(id).append(posnId).append(orderType).append(orderSrc).append(originSrc).append(orderStatus).append(createDtm).append(createBy).append(checkedBy).append(orderDtm).append(verifyDtm).append(procDtm).append(claimExpDtm).append(cancelDtm).append(cancelBy).append(cancelReason).append(orderAmt).append(threshholdAmt).append(orderInfo).append(orderTotAmt).append(beneNetAmt).append(network).append(originator).append(notify).append(senderFee).append(intermedFi).append(receiverFee).append(remainRetry).append(counterParty).append(attachments).append(auth).append(recur).append(trnId).append(threadId).append(trnExceptId).append(otherProperties).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return new EqualsBuilder().append(id, rhs.id).append(posnId, rhs.posnId).append(orderType, rhs.orderType).append(orderSrc, rhs.orderSrc).append(originSrc, rhs.originSrc).append(orderStatus, rhs.orderStatus).append(createDtm, rhs.createDtm).append(createBy, rhs.createBy).append(checkedBy, rhs.checkedBy).append(orderDtm, rhs.orderDtm).append(verifyDtm, rhs.verifyDtm).append(procDtm, rhs.procDtm).append(claimExpDtm, rhs.claimExpDtm).append(cancelDtm, rhs.cancelDtm).append(cancelBy, rhs.cancelBy).append(cancelReason, rhs.cancelReason).append(orderAmt, rhs.orderAmt).append(threshholdAmt, rhs.threshholdAmt).append(orderInfo, rhs.orderInfo).append(orderTotAmt, rhs.orderTotAmt).append(beneNetAmt, rhs.beneNetAmt).append(network, rhs.network).append(originator, rhs.originator).append(notify, rhs.notify).append(senderFee, rhs.senderFee).append(intermedFi, rhs.intermedFi).append(receiverFee, rhs.receiverFee).append(remainRetry, rhs.remainRetry).append(counterParty, rhs.counterParty).append(attachments, rhs.attachments).append(auth, rhs.auth).append(recur, rhs.recur).append(trnId, rhs.trnId).append(threadId, rhs.threadId).append(trnExceptId, rhs.trnExceptId).append(otherProperties, rhs.otherProperties).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
