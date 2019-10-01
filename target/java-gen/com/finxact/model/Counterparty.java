
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
 * Counterparty
 * <p>
 * Transaction counterparty detail
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "finInst",
    "custId",
    "acctNbr",
    "acctGroup",
    "acctTitle",
    "acctBranch",
    "ifxAcctType",
    "acctType",
    "ref",
    "posnAcctNbr",
    "_Id",
    "lstContactDate",
    "name",
    "taxAddressId",
    "cntry",
    "contactPref",
    "tin",
    "tinType",
    "addrs",
    "emails",
    "phones",
    "otherProperties",
    "extRef"
})
public class Counterparty {

    /**
     * Financial institution
     * <p>
     * Financial institution detail
     * 
     */
    @JsonProperty("finInst")
    @JsonPropertyDescription("Financial institution detail")
    private FinInst finInst;
    /**
     * Counterparty id
     * <p>
     * Counter party Id in finInst
     * 
     */
    @JsonProperty("custId")
    @JsonPropertyDescription("Counter party Id in finInst")
    private String custId;
    /**
     * Account number
     * <p>
     * The unique account identifier within a type
     * 
     */
    @JsonProperty("acctNbr")
    @JsonPropertyDescription("The unique account identifier within a type")
    private String acctNbr;
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
     * Account title
     * <p>
     * Counter party account title in finInst
     * 
     */
    @JsonProperty("acctTitle")
    @JsonPropertyDescription("Counter party account title in finInst")
    private String acctTitle;
    /**
     * Account branch
     * <p>
     * Counter party account branch in finInst
     * 
     */
    @JsonProperty("acctBranch")
    @JsonPropertyDescription("Counter party account branch in finInst")
    private String acctBranch;
    /**
     * IFX account type
     * <p>
     * Assigns account to a generally recognized industry standard category
     * 
     */
    @JsonProperty("ifxAcctType")
    @JsonPropertyDescription("Assigns account to a generally recognized industry standard category")
    private String ifxAcctType;
    /**
     * Account type
     * <p>
     * Identifies the account as personal or business
     * 
     */
    @JsonProperty("acctType")
    @JsonPropertyDescription("Identifies the account as personal or business")
    private Integer acctType;
    /**
     * Transaction reference
     * <p>
     * Counter party transaction reference
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("Counter party transaction reference")
    private String ref;
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
     * Party identifier
     * <p>
     * Unique Party identifier
     * 
     */
    @JsonProperty("_Id")
    @JsonPropertyDescription("Unique Party identifier")
    private String id;
    /**
     * Last contact date
     * <p>
     * Last contact date
     * 
     */
    @JsonProperty("lstContactDate")
    @JsonPropertyDescription("Last contact date")
    private String lstContactDate;
    /**
     * Party name
     * <p>
     * Formatted full name of party
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Formatted full name of party")
    private String name;
    /**
     * Tax address
     * <p>
     * Current tax reporting address Id
     * 
     */
    @JsonProperty("taxAddressId")
    @JsonPropertyDescription("Current tax reporting address Id")
    private String taxAddressId;
    /**
     * Country
     * <p>
     * Country of residence or registration ISO 3166-2
     * 
     */
    @JsonProperty("cntry")
    @JsonPropertyDescription("Country of residence or registration ISO 3166-2")
    private String cntry;
    /**
     * Contact preference
     * <p>
     * The method of contact preference
     * 
     */
    @JsonProperty("contactPref")
    @JsonPropertyDescription("The method of contact preference")
    private Integer contactPref;
    /**
     * Tax Id number
     * <p>
     * SSN, EIN or ITIN tax identification number
     * 
     */
    @JsonProperty("tin")
    @JsonPropertyDescription("SSN, EIN or ITIN tax identification number")
    private String tin;
    /**
     * Tax Id type
     * <p>
     * Type of tax Id stored in tin
     * 
     */
    @JsonProperty("tinType")
    @JsonPropertyDescription("Type of tax Id stored in tin")
    private Integer tinType;
    /**
     * Party addresses
     * <p>
     * Addresses associated with this party
     * 
     */
    @JsonProperty("addrs")
    @JsonPropertyDescription("Addresses associated with this party")
    private List<Addr__> addrs = new ArrayList<Addr__>();
    /**
     * Party emails
     * <p>
     * Email addresses associated with this party
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("Email addresses associated with this party")
    private List<Email_> emails = new ArrayList<Email_>();
    /**
     * Party phones
     * <p>
     * Phone numbers associated with this party
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("Phone numbers associated with this party")
    private List<Phone_> phones = new ArrayList<Phone_>();
    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    @JsonPropertyDescription("Array of additional properties in name:value object pairs")
    private OtherProperties otherProperties;
    /**
     * External references
     * <p>
     * External Party | Customer linked references
     * 
     */
    @JsonProperty("extRef")
    @JsonPropertyDescription("External Party | Customer linked references")
    private ExtRef_ extRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Financial institution
     * <p>
     * Financial institution detail
     * 
     */
    @JsonProperty("finInst")
    public FinInst getFinInst() {
        return finInst;
    }

    /**
     * Financial institution
     * <p>
     * Financial institution detail
     * 
     */
    @JsonProperty("finInst")
    public void setFinInst(FinInst finInst) {
        this.finInst = finInst;
    }

    /**
     * Counterparty id
     * <p>
     * Counter party Id in finInst
     * 
     */
    @JsonProperty("custId")
    public String getCustId() {
        return custId;
    }

    /**
     * Counterparty id
     * <p>
     * Counter party Id in finInst
     * 
     */
    @JsonProperty("custId")
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * Account number
     * <p>
     * The unique account identifier within a type
     * 
     */
    @JsonProperty("acctNbr")
    public String getAcctNbr() {
        return acctNbr;
    }

    /**
     * Account number
     * <p>
     * The unique account identifier within a type
     * 
     */
    @JsonProperty("acctNbr")
    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
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
     * Account title
     * <p>
     * Counter party account title in finInst
     * 
     */
    @JsonProperty("acctTitle")
    public String getAcctTitle() {
        return acctTitle;
    }

    /**
     * Account title
     * <p>
     * Counter party account title in finInst
     * 
     */
    @JsonProperty("acctTitle")
    public void setAcctTitle(String acctTitle) {
        this.acctTitle = acctTitle;
    }

    /**
     * Account branch
     * <p>
     * Counter party account branch in finInst
     * 
     */
    @JsonProperty("acctBranch")
    public String getAcctBranch() {
        return acctBranch;
    }

    /**
     * Account branch
     * <p>
     * Counter party account branch in finInst
     * 
     */
    @JsonProperty("acctBranch")
    public void setAcctBranch(String acctBranch) {
        this.acctBranch = acctBranch;
    }

    /**
     * IFX account type
     * <p>
     * Assigns account to a generally recognized industry standard category
     * 
     */
    @JsonProperty("ifxAcctType")
    public String getIfxAcctType() {
        return ifxAcctType;
    }

    /**
     * IFX account type
     * <p>
     * Assigns account to a generally recognized industry standard category
     * 
     */
    @JsonProperty("ifxAcctType")
    public void setIfxAcctType(String ifxAcctType) {
        this.ifxAcctType = ifxAcctType;
    }

    /**
     * Account type
     * <p>
     * Identifies the account as personal or business
     * 
     */
    @JsonProperty("acctType")
    public Integer getAcctType() {
        return acctType;
    }

    /**
     * Account type
     * <p>
     * Identifies the account as personal or business
     * 
     */
    @JsonProperty("acctType")
    public void setAcctType(Integer acctType) {
        this.acctType = acctType;
    }

    /**
     * Transaction reference
     * <p>
     * Counter party transaction reference
     * 
     */
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Transaction reference
     * <p>
     * Counter party transaction reference
     * 
     */
    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
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
     * Party identifier
     * <p>
     * Unique Party identifier
     * 
     */
    @JsonProperty("_Id")
    public String getId() {
        return id;
    }

    /**
     * Party identifier
     * <p>
     * Unique Party identifier
     * 
     */
    @JsonProperty("_Id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Last contact date
     * <p>
     * Last contact date
     * 
     */
    @JsonProperty("lstContactDate")
    public String getLstContactDate() {
        return lstContactDate;
    }

    /**
     * Last contact date
     * <p>
     * Last contact date
     * 
     */
    @JsonProperty("lstContactDate")
    public void setLstContactDate(String lstContactDate) {
        this.lstContactDate = lstContactDate;
    }

    /**
     * Party name
     * <p>
     * Formatted full name of party
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Party name
     * <p>
     * Formatted full name of party
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Tax address
     * <p>
     * Current tax reporting address Id
     * 
     */
    @JsonProperty("taxAddressId")
    public String getTaxAddressId() {
        return taxAddressId;
    }

    /**
     * Tax address
     * <p>
     * Current tax reporting address Id
     * 
     */
    @JsonProperty("taxAddressId")
    public void setTaxAddressId(String taxAddressId) {
        this.taxAddressId = taxAddressId;
    }

    /**
     * Country
     * <p>
     * Country of residence or registration ISO 3166-2
     * 
     */
    @JsonProperty("cntry")
    public String getCntry() {
        return cntry;
    }

    /**
     * Country
     * <p>
     * Country of residence or registration ISO 3166-2
     * 
     */
    @JsonProperty("cntry")
    public void setCntry(String cntry) {
        this.cntry = cntry;
    }

    /**
     * Contact preference
     * <p>
     * The method of contact preference
     * 
     */
    @JsonProperty("contactPref")
    public Integer getContactPref() {
        return contactPref;
    }

    /**
     * Contact preference
     * <p>
     * The method of contact preference
     * 
     */
    @JsonProperty("contactPref")
    public void setContactPref(Integer contactPref) {
        this.contactPref = contactPref;
    }

    /**
     * Tax Id number
     * <p>
     * SSN, EIN or ITIN tax identification number
     * 
     */
    @JsonProperty("tin")
    public String getTin() {
        return tin;
    }

    /**
     * Tax Id number
     * <p>
     * SSN, EIN or ITIN tax identification number
     * 
     */
    @JsonProperty("tin")
    public void setTin(String tin) {
        this.tin = tin;
    }

    /**
     * Tax Id type
     * <p>
     * Type of tax Id stored in tin
     * 
     */
    @JsonProperty("tinType")
    public Integer getTinType() {
        return tinType;
    }

    /**
     * Tax Id type
     * <p>
     * Type of tax Id stored in tin
     * 
     */
    @JsonProperty("tinType")
    public void setTinType(Integer tinType) {
        this.tinType = tinType;
    }

    /**
     * Party addresses
     * <p>
     * Addresses associated with this party
     * 
     */
    @JsonProperty("addrs")
    public List<Addr__> getAddrs() {
        return addrs;
    }

    /**
     * Party addresses
     * <p>
     * Addresses associated with this party
     * 
     */
    @JsonProperty("addrs")
    public void setAddrs(List<Addr__> addrs) {
        this.addrs = addrs;
    }

    /**
     * Party emails
     * <p>
     * Email addresses associated with this party
     * 
     */
    @JsonProperty("emails")
    public List<Email_> getEmails() {
        return emails;
    }

    /**
     * Party emails
     * <p>
     * Email addresses associated with this party
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email_> emails) {
        this.emails = emails;
    }

    /**
     * Party phones
     * <p>
     * Phone numbers associated with this party
     * 
     */
    @JsonProperty("phones")
    public List<Phone_> getPhones() {
        return phones;
    }

    /**
     * Party phones
     * <p>
     * Phone numbers associated with this party
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone_> phones) {
        this.phones = phones;
    }

    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    public OtherProperties getOtherProperties() {
        return otherProperties;
    }

    /**
     * Other properties
     * <p>
     * Array of additional properties in name:value object pairs
     * 
     */
    @JsonProperty("otherProperties")
    public void setOtherProperties(OtherProperties otherProperties) {
        this.otherProperties = otherProperties;
    }

    /**
     * External references
     * <p>
     * External Party | Customer linked references
     * 
     */
    @JsonProperty("extRef")
    public ExtRef_ getExtRef() {
        return extRef;
    }

    /**
     * External references
     * <p>
     * External Party | Customer linked references
     * 
     */
    @JsonProperty("extRef")
    public void setExtRef(ExtRef_ extRef) {
        this.extRef = extRef;
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
        return new HashCodeBuilder().append(finInst).append(custId).append(acctNbr).append(acctGroup).append(acctTitle).append(acctBranch).append(ifxAcctType).append(acctType).append(ref).append(posnAcctNbr).append(id).append(lstContactDate).append(name).append(taxAddressId).append(cntry).append(contactPref).append(tin).append(tinType).append(addrs).append(emails).append(phones).append(otherProperties).append(extRef).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Counterparty) == false) {
            return false;
        }
        Counterparty rhs = ((Counterparty) other);
        return new EqualsBuilder().append(finInst, rhs.finInst).append(custId, rhs.custId).append(acctNbr, rhs.acctNbr).append(acctGroup, rhs.acctGroup).append(acctTitle, rhs.acctTitle).append(acctBranch, rhs.acctBranch).append(ifxAcctType, rhs.ifxAcctType).append(acctType, rhs.acctType).append(ref, rhs.ref).append(posnAcctNbr, rhs.posnAcctNbr).append(id, rhs.id).append(lstContactDate, rhs.lstContactDate).append(name, rhs.name).append(taxAddressId, rhs.taxAddressId).append(cntry, rhs.cntry).append(contactPref, rhs.contactPref).append(tin, rhs.tin).append(tinType, rhs.tinType).append(addrs, rhs.addrs).append(emails, rhs.emails).append(phones, rhs.phones).append(otherProperties, rhs.otherProperties).append(extRef, rhs.extRef).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
