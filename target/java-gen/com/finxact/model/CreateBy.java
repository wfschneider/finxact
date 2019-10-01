
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
 * Party
 * <p>
 * Person or organization party record
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
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
    "extRef"
})
public class CreateBy {

    /**
     * Party identifier
     * <p>
     * Unique Party identifier
     * (Required)
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
     * (Required)
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
    private List<Addr_> addrs = new ArrayList<Addr_>();
    /**
     * Party emails
     * <p>
     * Email addresses associated with this party
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("Email addresses associated with this party")
    private List<Email> emails = new ArrayList<Email>();
    /**
     * Party phones
     * <p>
     * Phone numbers associated with this party
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("Phone numbers associated with this party")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * External references
     * <p>
     * External Party | Customer linked references
     * 
     */
    @JsonProperty("extRef")
    @JsonPropertyDescription("External Party | Customer linked references")
    private ExtRef extRef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Party identifier
     * <p>
     * Unique Party identifier
     * (Required)
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
     * (Required)
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
     * (Required)
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
     * (Required)
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
    public List<Addr_> getAddrs() {
        return addrs;
    }

    /**
     * Party addresses
     * <p>
     * Addresses associated with this party
     * 
     */
    @JsonProperty("addrs")
    public void setAddrs(List<Addr_> addrs) {
        this.addrs = addrs;
    }

    /**
     * Party emails
     * <p>
     * Email addresses associated with this party
     * 
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Party emails
     * <p>
     * Email addresses associated with this party
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    /**
     * Party phones
     * <p>
     * Phone numbers associated with this party
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Party phones
     * <p>
     * Phone numbers associated with this party
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    /**
     * External references
     * <p>
     * External Party | Customer linked references
     * 
     */
    @JsonProperty("extRef")
    public ExtRef getExtRef() {
        return extRef;
    }

    /**
     * External references
     * <p>
     * External Party | Customer linked references
     * 
     */
    @JsonProperty("extRef")
    public void setExtRef(ExtRef extRef) {
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
        return new HashCodeBuilder().append(id).append(lstContactDate).append(name).append(taxAddressId).append(cntry).append(contactPref).append(tin).append(tinType).append(addrs).append(emails).append(phones).append(extRef).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateBy) == false) {
            return false;
        }
        CreateBy rhs = ((CreateBy) other);
        return new EqualsBuilder().append(id, rhs.id).append(lstContactDate, rhs.lstContactDate).append(name, rhs.name).append(taxAddressId, rhs.taxAddressId).append(cntry, rhs.cntry).append(contactPref, rhs.contactPref).append(tin, rhs.tin).append(tinType, rhs.tinType).append(addrs, rhs.addrs).append(emails, rhs.emails).append(phones, rhs.phones).append(extRef, rhs.extRef).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
