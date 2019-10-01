
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
 * Address
 * <p>
 * Physical address
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_Id",
    "street",
    "city",
    "region",
    "cntry",
    "postCode",
    "premise",
    "geoLoc"
})
public class Addr {

    /**
     * Address Id
     * <p>
     * The unique address identifier
     * 
     */
    @JsonProperty("_Id")
    @JsonPropertyDescription("The unique address identifier")
    private String id;
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
     * Address city
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Address city")
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
    /**
     * Premise
     * <p>
     * Name location or building name
     * 
     */
    @JsonProperty("premise")
    @JsonPropertyDescription("Name location or building name")
    private String premise;
    /**
     * Geo location
     * <p>
     * Fixed geographic location of address
     * 
     */
    @JsonProperty("geoLoc")
    @JsonPropertyDescription("Fixed geographic location of address")
    private GeoLoc geoLoc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address Id
     * <p>
     * The unique address identifier
     * 
     */
    @JsonProperty("_Id")
    public String getId() {
        return id;
    }

    /**
     * Address Id
     * <p>
     * The unique address identifier
     * 
     */
    @JsonProperty("_Id")
    public void setId(String id) {
        this.id = id;
    }

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
     * Address city
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Address city
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

    /**
     * Premise
     * <p>
     * Name location or building name
     * 
     */
    @JsonProperty("premise")
    public String getPremise() {
        return premise;
    }

    /**
     * Premise
     * <p>
     * Name location or building name
     * 
     */
    @JsonProperty("premise")
    public void setPremise(String premise) {
        this.premise = premise;
    }

    /**
     * Geo location
     * <p>
     * Fixed geographic location of address
     * 
     */
    @JsonProperty("geoLoc")
    public GeoLoc getGeoLoc() {
        return geoLoc;
    }

    /**
     * Geo location
     * <p>
     * Fixed geographic location of address
     * 
     */
    @JsonProperty("geoLoc")
    public void setGeoLoc(GeoLoc geoLoc) {
        this.geoLoc = geoLoc;
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
        return new HashCodeBuilder().append(id).append(street).append(city).append(region).append(cntry).append(postCode).append(premise).append(geoLoc).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Addr) == false) {
            return false;
        }
        Addr rhs = ((Addr) other);
        return new EqualsBuilder().append(id, rhs.id).append(street, rhs.street).append(city, rhs.city).append(region, rhs.region).append(cntry, rhs.cntry).append(postCode, rhs.postCode).append(premise, rhs.premise).append(geoLoc, rhs.geoLoc).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
