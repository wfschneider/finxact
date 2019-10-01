
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
 * Originating terminal
 * <p>
 * Originating or accepting terminal detail
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "device",
    "localDtm",
    "jrnlDate",
    "branchId",
    "cashierId",
    "msgId",
    "receipt",
    "addr"
})
public class Terminal_ {

    /**
     * Device detail
     * <p>
     * Details pertaining to source physical device or terminal
     * 
     */
    @JsonProperty("device")
    @JsonPropertyDescription("Details pertaining to source physical device or terminal")
    private Device device;
    /**
     * Local datetime
     * <p>
     * Terminal local datetime
     * (Required)
     * 
     */
    @JsonProperty("localDtm")
    @JsonPropertyDescription("Terminal local datetime")
    private Date localDtm;
    /**
     * Balance date
     * <p>
     * Terminal chronological journal date
     * (Required)
     * 
     */
    @JsonProperty("jrnlDate")
    @JsonPropertyDescription("Terminal chronological journal date")
    private String jrnlDate;
    /**
     * Terminal assigned branch Id
     * <p>
     * The branch identifier assigned to this terminal
     * 
     */
    @JsonProperty("branchId")
    @JsonPropertyDescription("The branch identifier assigned to this terminal")
    private String branchId;
    /**
     * Cashier or teller Id
     * <p>
     * The cashier or teller identifier assigned to this terminal
     * (Required)
     * 
     */
    @JsonProperty("cashierId")
    @JsonPropertyDescription("The cashier or teller identifier assigned to this terminal")
    private String cashierId;
    /**
     * Unique message Id
     * <p>
     * Terminal assigned unique message Id
     * (Required)
     * 
     */
    @JsonProperty("msgId")
    @JsonPropertyDescription("Terminal assigned unique message Id")
    private String msgId;
    /**
     * Transaction receipt
     * <p>
     * Terminal generated electronic receipt
     * 
     */
    @JsonProperty("receipt")
    @JsonPropertyDescription("Terminal generated electronic receipt")
    private String receipt;
    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("addr")
    @JsonPropertyDescription("Physical address")
    private Addr addr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Device detail
     * <p>
     * Details pertaining to source physical device or terminal
     * 
     */
    @JsonProperty("device")
    public Device getDevice() {
        return device;
    }

    /**
     * Device detail
     * <p>
     * Details pertaining to source physical device or terminal
     * 
     */
    @JsonProperty("device")
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * Local datetime
     * <p>
     * Terminal local datetime
     * (Required)
     * 
     */
    @JsonProperty("localDtm")
    public Date getLocalDtm() {
        return localDtm;
    }

    /**
     * Local datetime
     * <p>
     * Terminal local datetime
     * (Required)
     * 
     */
    @JsonProperty("localDtm")
    public void setLocalDtm(Date localDtm) {
        this.localDtm = localDtm;
    }

    /**
     * Balance date
     * <p>
     * Terminal chronological journal date
     * (Required)
     * 
     */
    @JsonProperty("jrnlDate")
    public String getJrnlDate() {
        return jrnlDate;
    }

    /**
     * Balance date
     * <p>
     * Terminal chronological journal date
     * (Required)
     * 
     */
    @JsonProperty("jrnlDate")
    public void setJrnlDate(String jrnlDate) {
        this.jrnlDate = jrnlDate;
    }

    /**
     * Terminal assigned branch Id
     * <p>
     * The branch identifier assigned to this terminal
     * 
     */
    @JsonProperty("branchId")
    public String getBranchId() {
        return branchId;
    }

    /**
     * Terminal assigned branch Id
     * <p>
     * The branch identifier assigned to this terminal
     * 
     */
    @JsonProperty("branchId")
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * Cashier or teller Id
     * <p>
     * The cashier or teller identifier assigned to this terminal
     * (Required)
     * 
     */
    @JsonProperty("cashierId")
    public String getCashierId() {
        return cashierId;
    }

    /**
     * Cashier or teller Id
     * <p>
     * The cashier or teller identifier assigned to this terminal
     * (Required)
     * 
     */
    @JsonProperty("cashierId")
    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    /**
     * Unique message Id
     * <p>
     * Terminal assigned unique message Id
     * (Required)
     * 
     */
    @JsonProperty("msgId")
    public String getMsgId() {
        return msgId;
    }

    /**
     * Unique message Id
     * <p>
     * Terminal assigned unique message Id
     * (Required)
     * 
     */
    @JsonProperty("msgId")
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * Transaction receipt
     * <p>
     * Terminal generated electronic receipt
     * 
     */
    @JsonProperty("receipt")
    public String getReceipt() {
        return receipt;
    }

    /**
     * Transaction receipt
     * <p>
     * Terminal generated electronic receipt
     * 
     */
    @JsonProperty("receipt")
    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("addr")
    public Addr getAddr() {
        return addr;
    }

    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("addr")
    public void setAddr(Addr addr) {
        this.addr = addr;
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
        return new HashCodeBuilder().append(device).append(localDtm).append(jrnlDate).append(branchId).append(cashierId).append(msgId).append(receipt).append(addr).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Terminal_) == false) {
            return false;
        }
        Terminal_ rhs = ((Terminal_) other);
        return new EqualsBuilder().append(device, rhs.device).append(localDtm, rhs.localDtm).append(jrnlDate, rhs.jrnlDate).append(branchId, rhs.branchId).append(cashierId, rhs.cashierId).append(msgId, rhs.msgId).append(receipt, rhs.receipt).append(addr, rhs.addr).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
