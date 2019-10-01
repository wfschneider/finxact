
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
 * Geo location
 * <p>
 * Fixed geographic location of address
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lat",
    "lon",
    "alt",
    "geoplace"
})
public class GeoLoc {

    /**
     * Latitude
     * <p>
     * 
     * 
     */
    @JsonProperty("lat")
    private Double lat;
    /**
     * Longitude
     * <p>
     * 
     * 
     */
    @JsonProperty("lon")
    private Double lon;
    /**
     * Altitude
     * <p>
     * 
     * 
     */
    @JsonProperty("alt")
    private Double alt;
    /**
     * Google Place Id
     * <p>
     * Unique Google place Id
     * 
     */
    @JsonProperty("geoplace")
    @JsonPropertyDescription("Unique Google place Id")
    private String geoplace;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Latitude
     * <p>
     * 
     * 
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     * Latitude
     * <p>
     * 
     * 
     */
    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * Longitude
     * <p>
     * 
     * 
     */
    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    /**
     * Longitude
     * <p>
     * 
     * 
     */
    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * Altitude
     * <p>
     * 
     * 
     */
    @JsonProperty("alt")
    public Double getAlt() {
        return alt;
    }

    /**
     * Altitude
     * <p>
     * 
     * 
     */
    @JsonProperty("alt")
    public void setAlt(Double alt) {
        this.alt = alt;
    }

    /**
     * Google Place Id
     * <p>
     * Unique Google place Id
     * 
     */
    @JsonProperty("geoplace")
    public String getGeoplace() {
        return geoplace;
    }

    /**
     * Google Place Id
     * <p>
     * Unique Google place Id
     * 
     */
    @JsonProperty("geoplace")
    public void setGeoplace(String geoplace) {
        this.geoplace = geoplace;
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
        return new HashCodeBuilder().append(lat).append(lon).append(alt).append(geoplace).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoLoc) == false) {
            return false;
        }
        GeoLoc rhs = ((GeoLoc) other);
        return new EqualsBuilder().append(lat, rhs.lat).append(lon, rhs.lon).append(alt, rhs.alt).append(geoplace, rhs.geoplace).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
