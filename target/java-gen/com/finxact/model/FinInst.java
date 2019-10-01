
package com.finxact.model;

import java.net.URI;
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
 * Financial institution
 * <p>
 * Financial institution detail
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "desc",
    "legalForm",
    "estDate",
    "region",
    "moFiscalYrEnd",
    "dbaName",
    "tradeName",
    "webSiteURL",
    "emailDomain",
    "isIntrntl",
    "nbrEmployed",
    "primaryBankId",
    "isSmallBusiness",
    "isTaxExempt",
    "taxExemptType",
    "dunsNbr",
    "isGovtOwn",
    "isPubliclyHeld",
    "finInstAba",
    "finInstBic"
})
public class FinInst {

    /**
     * Description
     * <p>
     * Description of the organization
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Description of the organization")
    private String desc;
    /**
     * Legal Form
     * <p>
     * Legal form of organization
     * 
     */
    @JsonProperty("legalForm")
    @JsonPropertyDescription("Legal form of organization")
    private Integer legalForm;
    /**
     * Date Established
     * <p>
     * The organization's date of establishment
     * 
     */
    @JsonProperty("estDate")
    @JsonPropertyDescription("The organization's date of establishment")
    private String estDate;
    /**
     * Region Code
     * <p>
     * The state or region of registration
     * 
     */
    @JsonProperty("region")
    @JsonPropertyDescription("The state or region of registration")
    private String region;
    /**
     * Month Fiscal Year End
     * <p>
     * The month of organization's fiscal year end date
     * 
     */
    @JsonProperty("moFiscalYrEnd")
    @JsonPropertyDescription("The month of organization's fiscal year end date")
    private Integer moFiscalYrEnd;
    /**
     * DBA Name
     * <p>
     * Doing business as name
     * 
     */
    @JsonProperty("dbaName")
    @JsonPropertyDescription("Doing business as name")
    private String dbaName;
    /**
     * Trade Name
     * <p>
     * The organization's trade name
     * 
     */
    @JsonProperty("tradeName")
    @JsonPropertyDescription("The organization's trade name")
    private String tradeName;
    /**
     * Website Url
     * <p>
     * The organization's home page
     * 
     */
    @JsonProperty("webSiteURL")
    @JsonPropertyDescription("The organization's home page")
    private URI webSiteURL;
    /**
     * Email Domain
     * <p>
     * Principal email domain
     * 
     */
    @JsonProperty("emailDomain")
    @JsonPropertyDescription("Principal email domain")
    private String emailDomain;
    /**
     * Is International
     * <p>
     * Indicates whether the organization is international
     * 
     */
    @JsonProperty("isIntrntl")
    @JsonPropertyDescription("Indicates whether the organization is international")
    private Boolean isIntrntl;
    /**
     * Number employed
     * <p>
     * Number of persons employed
     * 
     */
    @JsonProperty("nbrEmployed")
    @JsonPropertyDescription("Number of persons employed")
    private Integer nbrEmployed;
    /**
     * Primary Bank
     * <p>
     * The bank with which the organization has the majority of its financial dealings
     * 
     */
    @JsonProperty("primaryBankId")
    @JsonPropertyDescription("The bank with which the organization has the majority of its financial dealings")
    private String primaryBankId;
    /**
     * Is Small Business
     * <p>
     * Indicates whether the organization is classified a small business
     * 
     */
    @JsonProperty("isSmallBusiness")
    @JsonPropertyDescription("Indicates whether the organization is classified a small business")
    private Boolean isSmallBusiness;
    /**
     * Indicates if the organization is tax-exempt
     * 
     */
    @JsonProperty("isTaxExempt")
    @JsonPropertyDescription("Indicates if the organization is tax-exempt")
    private Boolean isTaxExempt;
    /**
     * Tax Exempt Type
     * <p>
     * The tax exempt entity type
     * 
     */
    @JsonProperty("taxExemptType")
    @JsonPropertyDescription("The tax exempt entity type")
    private Integer taxExemptType;
    /**
     * D & B Number
     * <p>
     * A unique nine-digit number assigned to the company by Dun & Bradstreet, if applicable
     * 
     */
    @JsonProperty("dunsNbr")
    @JsonPropertyDescription("A unique nine-digit number assigned to the company by Dun & Bradstreet, if applicable")
    private Integer dunsNbr;
    /**
     * Is Government Owned
     * <p>
     * Indicates whether the organization a government-owned entity
     * 
     */
    @JsonProperty("isGovtOwn")
    @JsonPropertyDescription("Indicates whether the organization a government-owned entity")
    private Boolean isGovtOwn;
    /**
     * Is Publicly Held
     * <p>
     * Indicates whether the organization is publicly held
     * 
     */
    @JsonProperty("isPubliclyHeld")
    @JsonPropertyDescription("Indicates whether the organization is publicly held")
    private Boolean isPubliclyHeld;
    /**
     * Bank ABA number
     * <p>
     * Bank ABA routing number (US only)
     * 
     */
    @JsonProperty("finInstAba")
    @JsonPropertyDescription("Bank ABA routing number (US only)")
    private String finInstAba;
    /**
     * BIC identifier number
     * <p>
     * Bank SWIFT BIC identifier
     * 
     */
    @JsonProperty("finInstBic")
    @JsonPropertyDescription("Bank SWIFT BIC identifier")
    private String finInstBic;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * Description of the organization
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Description of the organization
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Legal Form
     * <p>
     * Legal form of organization
     * 
     */
    @JsonProperty("legalForm")
    public Integer getLegalForm() {
        return legalForm;
    }

    /**
     * Legal Form
     * <p>
     * Legal form of organization
     * 
     */
    @JsonProperty("legalForm")
    public void setLegalForm(Integer legalForm) {
        this.legalForm = legalForm;
    }

    /**
     * Date Established
     * <p>
     * The organization's date of establishment
     * 
     */
    @JsonProperty("estDate")
    public String getEstDate() {
        return estDate;
    }

    /**
     * Date Established
     * <p>
     * The organization's date of establishment
     * 
     */
    @JsonProperty("estDate")
    public void setEstDate(String estDate) {
        this.estDate = estDate;
    }

    /**
     * Region Code
     * <p>
     * The state or region of registration
     * 
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * Region Code
     * <p>
     * The state or region of registration
     * 
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Month Fiscal Year End
     * <p>
     * The month of organization's fiscal year end date
     * 
     */
    @JsonProperty("moFiscalYrEnd")
    public Integer getMoFiscalYrEnd() {
        return moFiscalYrEnd;
    }

    /**
     * Month Fiscal Year End
     * <p>
     * The month of organization's fiscal year end date
     * 
     */
    @JsonProperty("moFiscalYrEnd")
    public void setMoFiscalYrEnd(Integer moFiscalYrEnd) {
        this.moFiscalYrEnd = moFiscalYrEnd;
    }

    /**
     * DBA Name
     * <p>
     * Doing business as name
     * 
     */
    @JsonProperty("dbaName")
    public String getDbaName() {
        return dbaName;
    }

    /**
     * DBA Name
     * <p>
     * Doing business as name
     * 
     */
    @JsonProperty("dbaName")
    public void setDbaName(String dbaName) {
        this.dbaName = dbaName;
    }

    /**
     * Trade Name
     * <p>
     * The organization's trade name
     * 
     */
    @JsonProperty("tradeName")
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Trade Name
     * <p>
     * The organization's trade name
     * 
     */
    @JsonProperty("tradeName")
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    /**
     * Website Url
     * <p>
     * The organization's home page
     * 
     */
    @JsonProperty("webSiteURL")
    public URI getWebSiteURL() {
        return webSiteURL;
    }

    /**
     * Website Url
     * <p>
     * The organization's home page
     * 
     */
    @JsonProperty("webSiteURL")
    public void setWebSiteURL(URI webSiteURL) {
        this.webSiteURL = webSiteURL;
    }

    /**
     * Email Domain
     * <p>
     * Principal email domain
     * 
     */
    @JsonProperty("emailDomain")
    public String getEmailDomain() {
        return emailDomain;
    }

    /**
     * Email Domain
     * <p>
     * Principal email domain
     * 
     */
    @JsonProperty("emailDomain")
    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    /**
     * Is International
     * <p>
     * Indicates whether the organization is international
     * 
     */
    @JsonProperty("isIntrntl")
    public Boolean getIsIntrntl() {
        return isIntrntl;
    }

    /**
     * Is International
     * <p>
     * Indicates whether the organization is international
     * 
     */
    @JsonProperty("isIntrntl")
    public void setIsIntrntl(Boolean isIntrntl) {
        this.isIntrntl = isIntrntl;
    }

    /**
     * Number employed
     * <p>
     * Number of persons employed
     * 
     */
    @JsonProperty("nbrEmployed")
    public Integer getNbrEmployed() {
        return nbrEmployed;
    }

    /**
     * Number employed
     * <p>
     * Number of persons employed
     * 
     */
    @JsonProperty("nbrEmployed")
    public void setNbrEmployed(Integer nbrEmployed) {
        this.nbrEmployed = nbrEmployed;
    }

    /**
     * Primary Bank
     * <p>
     * The bank with which the organization has the majority of its financial dealings
     * 
     */
    @JsonProperty("primaryBankId")
    public String getPrimaryBankId() {
        return primaryBankId;
    }

    /**
     * Primary Bank
     * <p>
     * The bank with which the organization has the majority of its financial dealings
     * 
     */
    @JsonProperty("primaryBankId")
    public void setPrimaryBankId(String primaryBankId) {
        this.primaryBankId = primaryBankId;
    }

    /**
     * Is Small Business
     * <p>
     * Indicates whether the organization is classified a small business
     * 
     */
    @JsonProperty("isSmallBusiness")
    public Boolean getIsSmallBusiness() {
        return isSmallBusiness;
    }

    /**
     * Is Small Business
     * <p>
     * Indicates whether the organization is classified a small business
     * 
     */
    @JsonProperty("isSmallBusiness")
    public void setIsSmallBusiness(Boolean isSmallBusiness) {
        this.isSmallBusiness = isSmallBusiness;
    }

    /**
     * Indicates if the organization is tax-exempt
     * 
     */
    @JsonProperty("isTaxExempt")
    public Boolean getIsTaxExempt() {
        return isTaxExempt;
    }

    /**
     * Indicates if the organization is tax-exempt
     * 
     */
    @JsonProperty("isTaxExempt")
    public void setIsTaxExempt(Boolean isTaxExempt) {
        this.isTaxExempt = isTaxExempt;
    }

    /**
     * Tax Exempt Type
     * <p>
     * The tax exempt entity type
     * 
     */
    @JsonProperty("taxExemptType")
    public Integer getTaxExemptType() {
        return taxExemptType;
    }

    /**
     * Tax Exempt Type
     * <p>
     * The tax exempt entity type
     * 
     */
    @JsonProperty("taxExemptType")
    public void setTaxExemptType(Integer taxExemptType) {
        this.taxExemptType = taxExemptType;
    }

    /**
     * D & B Number
     * <p>
     * A unique nine-digit number assigned to the company by Dun & Bradstreet, if applicable
     * 
     */
    @JsonProperty("dunsNbr")
    public Integer getDunsNbr() {
        return dunsNbr;
    }

    /**
     * D & B Number
     * <p>
     * A unique nine-digit number assigned to the company by Dun & Bradstreet, if applicable
     * 
     */
    @JsonProperty("dunsNbr")
    public void setDunsNbr(Integer dunsNbr) {
        this.dunsNbr = dunsNbr;
    }

    /**
     * Is Government Owned
     * <p>
     * Indicates whether the organization a government-owned entity
     * 
     */
    @JsonProperty("isGovtOwn")
    public Boolean getIsGovtOwn() {
        return isGovtOwn;
    }

    /**
     * Is Government Owned
     * <p>
     * Indicates whether the organization a government-owned entity
     * 
     */
    @JsonProperty("isGovtOwn")
    public void setIsGovtOwn(Boolean isGovtOwn) {
        this.isGovtOwn = isGovtOwn;
    }

    /**
     * Is Publicly Held
     * <p>
     * Indicates whether the organization is publicly held
     * 
     */
    @JsonProperty("isPubliclyHeld")
    public Boolean getIsPubliclyHeld() {
        return isPubliclyHeld;
    }

    /**
     * Is Publicly Held
     * <p>
     * Indicates whether the organization is publicly held
     * 
     */
    @JsonProperty("isPubliclyHeld")
    public void setIsPubliclyHeld(Boolean isPubliclyHeld) {
        this.isPubliclyHeld = isPubliclyHeld;
    }

    /**
     * Bank ABA number
     * <p>
     * Bank ABA routing number (US only)
     * 
     */
    @JsonProperty("finInstAba")
    public String getFinInstAba() {
        return finInstAba;
    }

    /**
     * Bank ABA number
     * <p>
     * Bank ABA routing number (US only)
     * 
     */
    @JsonProperty("finInstAba")
    public void setFinInstAba(String finInstAba) {
        this.finInstAba = finInstAba;
    }

    /**
     * BIC identifier number
     * <p>
     * Bank SWIFT BIC identifier
     * 
     */
    @JsonProperty("finInstBic")
    public String getFinInstBic() {
        return finInstBic;
    }

    /**
     * BIC identifier number
     * <p>
     * Bank SWIFT BIC identifier
     * 
     */
    @JsonProperty("finInstBic")
    public void setFinInstBic(String finInstBic) {
        this.finInstBic = finInstBic;
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
        return new HashCodeBuilder().append(desc).append(legalForm).append(estDate).append(region).append(moFiscalYrEnd).append(dbaName).append(tradeName).append(webSiteURL).append(emailDomain).append(isIntrntl).append(nbrEmployed).append(primaryBankId).append(isSmallBusiness).append(isTaxExempt).append(taxExemptType).append(dunsNbr).append(isGovtOwn).append(isPubliclyHeld).append(finInstAba).append(finInstBic).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinInst) == false) {
            return false;
        }
        FinInst rhs = ((FinInst) other);
        return new EqualsBuilder().append(desc, rhs.desc).append(legalForm, rhs.legalForm).append(estDate, rhs.estDate).append(region, rhs.region).append(moFiscalYrEnd, rhs.moFiscalYrEnd).append(dbaName, rhs.dbaName).append(tradeName, rhs.tradeName).append(webSiteURL, rhs.webSiteURL).append(emailDomain, rhs.emailDomain).append(isIntrntl, rhs.isIntrntl).append(nbrEmployed, rhs.nbrEmployed).append(primaryBankId, rhs.primaryBankId).append(isSmallBusiness, rhs.isSmallBusiness).append(isTaxExempt, rhs.isTaxExempt).append(taxExemptType, rhs.taxExemptType).append(dunsNbr, rhs.dunsNbr).append(isGovtOwn, rhs.isGovtOwn).append(isPubliclyHeld, rhs.isPubliclyHeld).append(finInstAba, rhs.finInstAba).append(finInstBic, rhs.finInstBic).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
