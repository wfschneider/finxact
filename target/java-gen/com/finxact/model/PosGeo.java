
package com.finxact.model;

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
 * POS geographic data
 * <p>
 * Point of service (POS) geographic data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "street",
    "city",
    "region",
    "cntry",
    "postCode"
})
public class PosGeo {

    /**
     * Address street
     * <p>
     * Street number, PO box or RD and street name
     * 
     */
    @JsonProperty("street")
    @JsonPropertyDescription("Street number, PO box or RD and street name")
    private String street;
    /**
     * City
     * <p>
     * City
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City")
    private String city;
    /**
     * Region
     * <p>
     * State, Province, County or Land
     * 
     */
    @JsonProperty("region")
    @JsonPropertyDescription("State, Province, County or Land")
    private String region;
    /**
     * Country
     * <p>
     * Address country
     * 
     */
    @JsonProperty("cntry")
    @JsonPropertyDescription("Address country")
    private String cntry;
    /**
     * Postal code
     * <p>
     * The address postal code
     * 
     */
    @JsonProperty("postCode")
    @JsonPropertyDescription("The address postal code")
    private String postCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address street
     * <p>
     * Street number, PO box or RD and street name
     * 
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * Address street
     * <p>
     * Street number, PO box or RD and street name
     * 
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * City
     * <p>
     * City
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * City
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Region
     * <p>
     * State, Province, County or Land
     * 
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * Region
     * <p>
     * State, Province, County or Land
     * 
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Country
     * <p>
     * Address country
     * 
     */
    @JsonProperty("cntry")
    public String getCntry() {
        return cntry;
    }

    /**
     * Country
     * <p>
     * Address country
     * 
     */
    @JsonProperty("cntry")
    public void setCntry(String cntry) {
        this.cntry = cntry;
    }

    /**
     * Postal code
     * <p>
     * The address postal code
     * 
     */
    @JsonProperty("postCode")
    public String getPostCode() {
        return postCode;
    }

    /**
     * Postal code
     * <p>
     * The address postal code
     * 
     */
    @JsonProperty("postCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
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
        return new HashCodeBuilder().append(street).append(city).append(region).append(cntry).append(postCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PosGeo) == false) {
            return false;
        }
        PosGeo rhs = ((PosGeo) other);
        return new EqualsBuilder().append(street, rhs.street).append(city, rhs.city).append(region, rhs.region).append(cntry, rhs.cntry).append(postCode, rhs.postCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
