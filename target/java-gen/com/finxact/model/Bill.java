
package com.finxact.model;

import java.net.URI;
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
 * Bill
 * <p>
 * Retail, commercial or service bill or invoice
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "partyId",
    "billId",
    "merchant",
    "custId",
    "custTitle",
    "custAddr",
    "contractId",
    "jobId",
    "orderId",
    "orderDtm",
    "invId",
    "storeId",
    "billImg",
    "billDate",
    "pmtDueDate",
    "billFromDate",
    "billToDate",
    "stmtImg",
    "grossAmt",
    "finChrgAmt",
    "taxAmt",
    "dscntAmt",
    "shipAmt",
    "insureAmt",
    "crAmt",
    "pastDueAmt",
    "dueAmt",
    "minPmtDue",
    "note",
    "dtl"
})
public class Bill {

    /**
     * Party identifier
     * <p>
     * Unique Party identifier
     * (Required)
     * 
     */
    @JsonProperty("partyId")
    @JsonPropertyDescription("Unique Party identifier")
    private String partyId;
    /**
     * Bill identifier
     * <p>
     * Unique Bill identifier
     * (Required)
     * 
     */
    @JsonProperty("billId")
    @JsonPropertyDescription("Unique Bill identifier")
    private String billId;
    /**
     * Merchant
     * <p>
     * Identifies and provides details on a specific merchant
     * (Required)
     * 
     */
    @JsonProperty("merchant")
    @JsonPropertyDescription("Identifies and provides details on a specific merchant")
    private Merchant merchant;
    /**
     * Customer account
     * <p>
     * Customer account at merchant
     * 
     */
    @JsonProperty("custId")
    @JsonPropertyDescription("Customer account at merchant")
    private String custId;
    /**
     * Customer title
     * <p>
     * Customer account title or name at merchant
     * 
     */
    @JsonProperty("custTitle")
    @JsonPropertyDescription("Customer account title or name at merchant")
    private String custTitle;
    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("custAddr")
    @JsonPropertyDescription("Physical address")
    private Addr custAddr;
    /**
     * Contract Id
     * <p>
     * Contract or master services agreement identifier
     * 
     */
    @JsonProperty("contractId")
    @JsonPropertyDescription("Contract or master services agreement identifier")
    private String contractId;
    /**
     * Job Id
     * <p>
     * Job number or reference
     * 
     */
    @JsonProperty("jobId")
    @JsonPropertyDescription("Job number or reference")
    private String jobId;
    /**
     * Order Id
     * <p>
     * Purchase Order identifier
     * 
     */
    @JsonProperty("orderId")
    @JsonPropertyDescription("Purchase Order identifier")
    private String orderId;
    /**
     * Order Date
     * <p>
     * The order date
     * 
     */
    @JsonProperty("orderDtm")
    @JsonPropertyDescription("The order date")
    private Date orderDtm;
    /**
     * Invoice Id
     * <p>
     * Merchant bill/invoice identifier
     * 
     */
    @JsonProperty("invId")
    @JsonPropertyDescription("Merchant bill/invoice identifier")
    private String invId;
    /**
     * Store identifier
     * <p>
     * The store identifier
     * 
     */
    @JsonProperty("storeId")
    @JsonPropertyDescription("The store identifier")
    private String storeId;
    /**
     * Bill image
     * <p>
     * The bill image URI
     * 
     */
    @JsonProperty("billImg")
    @JsonPropertyDescription("The bill image URI")
    private URI billImg;
    /**
     * Bill date
     * <p>
     * The date bill was issued
     * 
     */
    @JsonProperty("billDate")
    @JsonPropertyDescription("The date bill was issued")
    private String billDate;
    /**
     * Due date
     * <p>
     * The payment due date
     * 
     */
    @JsonProperty("pmtDueDate")
    @JsonPropertyDescription("The payment due date")
    private String pmtDueDate;
    /**
     * Bill from date
     * <p>
     * The beginning of the billing period
     * 
     */
    @JsonProperty("billFromDate")
    @JsonPropertyDescription("The beginning of the billing period")
    private String billFromDate;
    /**
     * Bill to date
     * <p>
     * The end of the billing period
     * 
     */
    @JsonProperty("billToDate")
    @JsonPropertyDescription("The end of the billing period")
    private String billToDate;
    /**
     * Statement image
     * <p>
     * Electronic statement URL
     * 
     */
    @JsonProperty("stmtImg")
    @JsonPropertyDescription("Electronic statement URL")
    private URI stmtImg;
    /**
     * Gross amount
     * <p>
     * Gross bill/invoice amount
     * 
     */
    @JsonProperty("grossAmt")
    @JsonPropertyDescription("Gross bill/invoice amount")
    private Double grossAmt;
    /**
     * Finance charge
     * <p>
     * Finance charge amount
     * 
     */
    @JsonProperty("finChrgAmt")
    @JsonPropertyDescription("Finance charge amount")
    private Double finChrgAmt;
    /**
     * Tax amount
     * <p>
     * Total tax amount
     * 
     */
    @JsonProperty("taxAmt")
    @JsonPropertyDescription("Total tax amount")
    private Double taxAmt;
    /**
     * Discount amount
     * <p>
     * Total discount amount
     * 
     */
    @JsonProperty("dscntAmt")
    @JsonPropertyDescription("Total discount amount")
    private Double dscntAmt;
    /**
     * Shipping amount
     * <p>
     * Total shipping amount
     * 
     */
    @JsonProperty("shipAmt")
    @JsonPropertyDescription("Total shipping amount")
    private Double shipAmt;
    /**
     * Insurance amount
     * <p>
     * Total insurance amount
     * 
     */
    @JsonProperty("insureAmt")
    @JsonPropertyDescription("Total insurance amount")
    private Double insureAmt;
    /**
     * Credit amount
     * <p>
     * Total deposits, payments and credits previously applied
     * 
     */
    @JsonProperty("crAmt")
    @JsonPropertyDescription("Total deposits, payments and credits previously applied")
    private Double crAmt;
    /**
     * Past due amount
     * <p>
     * Total past due amount
     * 
     */
    @JsonProperty("pastDueAmt")
    @JsonPropertyDescription("Total past due amount")
    private Double pastDueAmt;
    /**
     * Due amount
     * <p>
     * Payment amount due balance
     * 
     */
    @JsonProperty("dueAmt")
    @JsonPropertyDescription("Payment amount due balance")
    private Double dueAmt;
    /**
     * Minumum payment amount
     * <p>
     * Minimum payment amount due
     * 
     */
    @JsonProperty("minPmtDue")
    @JsonPropertyDescription("Minimum payment amount due")
    private Double minPmtDue;
    /**
     * Bill note
     * <p>
     * Free form bill note
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Free form bill note")
    private String note;
    /**
     * Bill detail
     * <p>
     * Bill detail lines
     * 
     */
    @JsonProperty("dtl")
    @JsonPropertyDescription("Bill detail lines")
    private List<Dtl> dtl = new ArrayList<Dtl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Party identifier
     * <p>
     * Unique Party identifier
     * (Required)
     * 
     */
    @JsonProperty("partyId")
    public String getPartyId() {
        return partyId;
    }

    /**
     * Party identifier
     * <p>
     * Unique Party identifier
     * (Required)
     * 
     */
    @JsonProperty("partyId")
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    /**
     * Bill identifier
     * <p>
     * Unique Bill identifier
     * (Required)
     * 
     */
    @JsonProperty("billId")
    public String getBillId() {
        return billId;
    }

    /**
     * Bill identifier
     * <p>
     * Unique Bill identifier
     * (Required)
     * 
     */
    @JsonProperty("billId")
    public void setBillId(String billId) {
        this.billId = billId;
    }

    /**
     * Merchant
     * <p>
     * Identifies and provides details on a specific merchant
     * (Required)
     * 
     */
    @JsonProperty("merchant")
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Merchant
     * <p>
     * Identifies and provides details on a specific merchant
     * (Required)
     * 
     */
    @JsonProperty("merchant")
    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    /**
     * Customer account
     * <p>
     * Customer account at merchant
     * 
     */
    @JsonProperty("custId")
    public String getCustId() {
        return custId;
    }

    /**
     * Customer account
     * <p>
     * Customer account at merchant
     * 
     */
    @JsonProperty("custId")
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * Customer title
     * <p>
     * Customer account title or name at merchant
     * 
     */
    @JsonProperty("custTitle")
    public String getCustTitle() {
        return custTitle;
    }

    /**
     * Customer title
     * <p>
     * Customer account title or name at merchant
     * 
     */
    @JsonProperty("custTitle")
    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("custAddr")
    public Addr getCustAddr() {
        return custAddr;
    }

    /**
     * Address
     * <p>
     * Physical address
     * 
     */
    @JsonProperty("custAddr")
    public void setCustAddr(Addr custAddr) {
        this.custAddr = custAddr;
    }

    /**
     * Contract Id
     * <p>
     * Contract or master services agreement identifier
     * 
     */
    @JsonProperty("contractId")
    public String getContractId() {
        return contractId;
    }

    /**
     * Contract Id
     * <p>
     * Contract or master services agreement identifier
     * 
     */
    @JsonProperty("contractId")
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * Job Id
     * <p>
     * Job number or reference
     * 
     */
    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    /**
     * Job Id
     * <p>
     * Job number or reference
     * 
     */
    @JsonProperty("jobId")
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * Order Id
     * <p>
     * Purchase Order identifier
     * 
     */
    @JsonProperty("orderId")
    public String getOrderId() {
        return orderId;
    }

    /**
     * Order Id
     * <p>
     * Purchase Order identifier
     * 
     */
    @JsonProperty("orderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Order Date
     * <p>
     * The order date
     * 
     */
    @JsonProperty("orderDtm")
    public Date getOrderDtm() {
        return orderDtm;
    }

    /**
     * Order Date
     * <p>
     * The order date
     * 
     */
    @JsonProperty("orderDtm")
    public void setOrderDtm(Date orderDtm) {
        this.orderDtm = orderDtm;
    }

    /**
     * Invoice Id
     * <p>
     * Merchant bill/invoice identifier
     * 
     */
    @JsonProperty("invId")
    public String getInvId() {
        return invId;
    }

    /**
     * Invoice Id
     * <p>
     * Merchant bill/invoice identifier
     * 
     */
    @JsonProperty("invId")
    public void setInvId(String invId) {
        this.invId = invId;
    }

    /**
     * Store identifier
     * <p>
     * The store identifier
     * 
     */
    @JsonProperty("storeId")
    public String getStoreId() {
        return storeId;
    }

    /**
     * Store identifier
     * <p>
     * The store identifier
     * 
     */
    @JsonProperty("storeId")
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * Bill image
     * <p>
     * The bill image URI
     * 
     */
    @JsonProperty("billImg")
    public URI getBillImg() {
        return billImg;
    }

    /**
     * Bill image
     * <p>
     * The bill image URI
     * 
     */
    @JsonProperty("billImg")
    public void setBillImg(URI billImg) {
        this.billImg = billImg;
    }

    /**
     * Bill date
     * <p>
     * The date bill was issued
     * 
     */
    @JsonProperty("billDate")
    public String getBillDate() {
        return billDate;
    }

    /**
     * Bill date
     * <p>
     * The date bill was issued
     * 
     */
    @JsonProperty("billDate")
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    /**
     * Due date
     * <p>
     * The payment due date
     * 
     */
    @JsonProperty("pmtDueDate")
    public String getPmtDueDate() {
        return pmtDueDate;
    }

    /**
     * Due date
     * <p>
     * The payment due date
     * 
     */
    @JsonProperty("pmtDueDate")
    public void setPmtDueDate(String pmtDueDate) {
        this.pmtDueDate = pmtDueDate;
    }

    /**
     * Bill from date
     * <p>
     * The beginning of the billing period
     * 
     */
    @JsonProperty("billFromDate")
    public String getBillFromDate() {
        return billFromDate;
    }

    /**
     * Bill from date
     * <p>
     * The beginning of the billing period
     * 
     */
    @JsonProperty("billFromDate")
    public void setBillFromDate(String billFromDate) {
        this.billFromDate = billFromDate;
    }

    /**
     * Bill to date
     * <p>
     * The end of the billing period
     * 
     */
    @JsonProperty("billToDate")
    public String getBillToDate() {
        return billToDate;
    }

    /**
     * Bill to date
     * <p>
     * The end of the billing period
     * 
     */
    @JsonProperty("billToDate")
    public void setBillToDate(String billToDate) {
        this.billToDate = billToDate;
    }

    /**
     * Statement image
     * <p>
     * Electronic statement URL
     * 
     */
    @JsonProperty("stmtImg")
    public URI getStmtImg() {
        return stmtImg;
    }

    /**
     * Statement image
     * <p>
     * Electronic statement URL
     * 
     */
    @JsonProperty("stmtImg")
    public void setStmtImg(URI stmtImg) {
        this.stmtImg = stmtImg;
    }

    /**
     * Gross amount
     * <p>
     * Gross bill/invoice amount
     * 
     */
    @JsonProperty("grossAmt")
    public Double getGrossAmt() {
        return grossAmt;
    }

    /**
     * Gross amount
     * <p>
     * Gross bill/invoice amount
     * 
     */
    @JsonProperty("grossAmt")
    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
    }

    /**
     * Finance charge
     * <p>
     * Finance charge amount
     * 
     */
    @JsonProperty("finChrgAmt")
    public Double getFinChrgAmt() {
        return finChrgAmt;
    }

    /**
     * Finance charge
     * <p>
     * Finance charge amount
     * 
     */
    @JsonProperty("finChrgAmt")
    public void setFinChrgAmt(Double finChrgAmt) {
        this.finChrgAmt = finChrgAmt;
    }

    /**
     * Tax amount
     * <p>
     * Total tax amount
     * 
     */
    @JsonProperty("taxAmt")
    public Double getTaxAmt() {
        return taxAmt;
    }

    /**
     * Tax amount
     * <p>
     * Total tax amount
     * 
     */
    @JsonProperty("taxAmt")
    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    /**
     * Discount amount
     * <p>
     * Total discount amount
     * 
     */
    @JsonProperty("dscntAmt")
    public Double getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Discount amount
     * <p>
     * Total discount amount
     * 
     */
    @JsonProperty("dscntAmt")
    public void setDscntAmt(Double dscntAmt) {
        this.dscntAmt = dscntAmt;
    }

    /**
     * Shipping amount
     * <p>
     * Total shipping amount
     * 
     */
    @JsonProperty("shipAmt")
    public Double getShipAmt() {
        return shipAmt;
    }

    /**
     * Shipping amount
     * <p>
     * Total shipping amount
     * 
     */
    @JsonProperty("shipAmt")
    public void setShipAmt(Double shipAmt) {
        this.shipAmt = shipAmt;
    }

    /**
     * Insurance amount
     * <p>
     * Total insurance amount
     * 
     */
    @JsonProperty("insureAmt")
    public Double getInsureAmt() {
        return insureAmt;
    }

    /**
     * Insurance amount
     * <p>
     * Total insurance amount
     * 
     */
    @JsonProperty("insureAmt")
    public void setInsureAmt(Double insureAmt) {
        this.insureAmt = insureAmt;
    }

    /**
     * Credit amount
     * <p>
     * Total deposits, payments and credits previously applied
     * 
     */
    @JsonProperty("crAmt")
    public Double getCrAmt() {
        return crAmt;
    }

    /**
     * Credit amount
     * <p>
     * Total deposits, payments and credits previously applied
     * 
     */
    @JsonProperty("crAmt")
    public void setCrAmt(Double crAmt) {
        this.crAmt = crAmt;
    }

    /**
     * Past due amount
     * <p>
     * Total past due amount
     * 
     */
    @JsonProperty("pastDueAmt")
    public Double getPastDueAmt() {
        return pastDueAmt;
    }

    /**
     * Past due amount
     * <p>
     * Total past due amount
     * 
     */
    @JsonProperty("pastDueAmt")
    public void setPastDueAmt(Double pastDueAmt) {
        this.pastDueAmt = pastDueAmt;
    }

    /**
     * Due amount
     * <p>
     * Payment amount due balance
     * 
     */
    @JsonProperty("dueAmt")
    public Double getDueAmt() {
        return dueAmt;
    }

    /**
     * Due amount
     * <p>
     * Payment amount due balance
     * 
     */
    @JsonProperty("dueAmt")
    public void setDueAmt(Double dueAmt) {
        this.dueAmt = dueAmt;
    }

    /**
     * Minumum payment amount
     * <p>
     * Minimum payment amount due
     * 
     */
    @JsonProperty("minPmtDue")
    public Double getMinPmtDue() {
        return minPmtDue;
    }

    /**
     * Minumum payment amount
     * <p>
     * Minimum payment amount due
     * 
     */
    @JsonProperty("minPmtDue")
    public void setMinPmtDue(Double minPmtDue) {
        this.minPmtDue = minPmtDue;
    }

    /**
     * Bill note
     * <p>
     * Free form bill note
     * 
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Bill note
     * <p>
     * Free form bill note
     * 
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Bill detail
     * <p>
     * Bill detail lines
     * 
     */
    @JsonProperty("dtl")
    public List<Dtl> getDtl() {
        return dtl;
    }

    /**
     * Bill detail
     * <p>
     * Bill detail lines
     * 
     */
    @JsonProperty("dtl")
    public void setDtl(List<Dtl> dtl) {
        this.dtl = dtl;
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
        return new HashCodeBuilder().append(partyId).append(billId).append(merchant).append(custId).append(custTitle).append(custAddr).append(contractId).append(jobId).append(orderId).append(orderDtm).append(invId).append(storeId).append(billImg).append(billDate).append(pmtDueDate).append(billFromDate).append(billToDate).append(stmtImg).append(grossAmt).append(finChrgAmt).append(taxAmt).append(dscntAmt).append(shipAmt).append(insureAmt).append(crAmt).append(pastDueAmt).append(dueAmt).append(minPmtDue).append(note).append(dtl).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bill) == false) {
            return false;
        }
        Bill rhs = ((Bill) other);
        return new EqualsBuilder().append(partyId, rhs.partyId).append(billId, rhs.billId).append(merchant, rhs.merchant).append(custId, rhs.custId).append(custTitle, rhs.custTitle).append(custAddr, rhs.custAddr).append(contractId, rhs.contractId).append(jobId, rhs.jobId).append(orderId, rhs.orderId).append(orderDtm, rhs.orderDtm).append(invId, rhs.invId).append(storeId, rhs.storeId).append(billImg, rhs.billImg).append(billDate, rhs.billDate).append(pmtDueDate, rhs.pmtDueDate).append(billFromDate, rhs.billFromDate).append(billToDate, rhs.billToDate).append(stmtImg, rhs.stmtImg).append(grossAmt, rhs.grossAmt).append(finChrgAmt, rhs.finChrgAmt).append(taxAmt, rhs.taxAmt).append(dscntAmt, rhs.dscntAmt).append(shipAmt, rhs.shipAmt).append(insureAmt, rhs.insureAmt).append(crAmt, rhs.crAmt).append(pastDueAmt, rhs.pastDueAmt).append(dueAmt, rhs.dueAmt).append(minPmtDue, rhs.minPmtDue).append(note, rhs.note).append(dtl, rhs.dtl).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
