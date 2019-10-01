
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "qtyOrder",
    "qtyFill",
    "catCode",
    "partId",
    "desc",
    "itemImg",
    "cost",
    "dscntAmt",
    "dscntPct",
    "extendAmt",
    "isNonTax"
})
public class Dtl {

    /**
     * Quantity ordered
     * <p>
     * Quantity ordered
     * 
     */
    @JsonProperty("qtyOrder")
    @JsonPropertyDescription("Quantity ordered")
    private Integer qtyOrder;
    /**
     * Quantity fulfilled
     * <p>
     * Quantity fulfilled
     * 
     */
    @JsonProperty("qtyFill")
    @JsonPropertyDescription("Quantity fulfilled")
    private Integer qtyFill;
    /**
     * Category code
     * <p>
     * Category code
     * 
     */
    @JsonProperty("catCode")
    @JsonPropertyDescription("Category code")
    private String catCode;
    /**
     * Part number
     * <p>
     * Part Number or Id (SKU) ordered
     * 
     */
    @JsonProperty("partId")
    @JsonPropertyDescription("Part Number or Id (SKU) ordered")
    private String partId;
    /**
     * Description
     * <p>
     * Line item description
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Line item description")
    private String desc;
    /**
     * Image
     * <p>
     * Item image URL
     * 
     */
    @JsonProperty("itemImg")
    @JsonPropertyDescription("Item image URL")
    private URI itemImg;
    /**
     * Unit cost
     * <p>
     * Cost per one unit item
     * 
     */
    @JsonProperty("cost")
    @JsonPropertyDescription("Cost per one unit item")
    private Double cost;
    /**
     * Unit discount
     * <p>
     * Discount amount per unit item
     * 
     */
    @JsonProperty("dscntAmt")
    @JsonPropertyDescription("Discount amount per unit item")
    private Double dscntAmt;
    /**
     * Discount percent
     * <p>
     * Discount percentage
     * 
     */
    @JsonProperty("dscntPct")
    @JsonPropertyDescription("Discount percentage")
    private Integer dscntPct;
    /**
     * Extended cost
     * <p>
     * Total amount for line - extended
     * 
     */
    @JsonProperty("extendAmt")
    @JsonPropertyDescription("Total amount for line - extended")
    private Double extendAmt;
    /**
     * Non taxable
     * <p>
     * Is non-taxable item
     * 
     */
    @JsonProperty("isNonTax")
    @JsonPropertyDescription("Is non-taxable item")
    private Boolean isNonTax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Quantity ordered
     * <p>
     * Quantity ordered
     * 
     */
    @JsonProperty("qtyOrder")
    public Integer getQtyOrder() {
        return qtyOrder;
    }

    /**
     * Quantity ordered
     * <p>
     * Quantity ordered
     * 
     */
    @JsonProperty("qtyOrder")
    public void setQtyOrder(Integer qtyOrder) {
        this.qtyOrder = qtyOrder;
    }

    /**
     * Quantity fulfilled
     * <p>
     * Quantity fulfilled
     * 
     */
    @JsonProperty("qtyFill")
    public Integer getQtyFill() {
        return qtyFill;
    }

    /**
     * Quantity fulfilled
     * <p>
     * Quantity fulfilled
     * 
     */
    @JsonProperty("qtyFill")
    public void setQtyFill(Integer qtyFill) {
        this.qtyFill = qtyFill;
    }

    /**
     * Category code
     * <p>
     * Category code
     * 
     */
    @JsonProperty("catCode")
    public String getCatCode() {
        return catCode;
    }

    /**
     * Category code
     * <p>
     * Category code
     * 
     */
    @JsonProperty("catCode")
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    /**
     * Part number
     * <p>
     * Part Number or Id (SKU) ordered
     * 
     */
    @JsonProperty("partId")
    public String getPartId() {
        return partId;
    }

    /**
     * Part number
     * <p>
     * Part Number or Id (SKU) ordered
     * 
     */
    @JsonProperty("partId")
    public void setPartId(String partId) {
        this.partId = partId;
    }

    /**
     * Description
     * <p>
     * Line item description
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Line item description
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Image
     * <p>
     * Item image URL
     * 
     */
    @JsonProperty("itemImg")
    public URI getItemImg() {
        return itemImg;
    }

    /**
     * Image
     * <p>
     * Item image URL
     * 
     */
    @JsonProperty("itemImg")
    public void setItemImg(URI itemImg) {
        this.itemImg = itemImg;
    }

    /**
     * Unit cost
     * <p>
     * Cost per one unit item
     * 
     */
    @JsonProperty("cost")
    public Double getCost() {
        return cost;
    }

    /**
     * Unit cost
     * <p>
     * Cost per one unit item
     * 
     */
    @JsonProperty("cost")
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * Unit discount
     * <p>
     * Discount amount per unit item
     * 
     */
    @JsonProperty("dscntAmt")
    public Double getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Unit discount
     * <p>
     * Discount amount per unit item
     * 
     */
    @JsonProperty("dscntAmt")
    public void setDscntAmt(Double dscntAmt) {
        this.dscntAmt = dscntAmt;
    }

    /**
     * Discount percent
     * <p>
     * Discount percentage
     * 
     */
    @JsonProperty("dscntPct")
    public Integer getDscntPct() {
        return dscntPct;
    }

    /**
     * Discount percent
     * <p>
     * Discount percentage
     * 
     */
    @JsonProperty("dscntPct")
    public void setDscntPct(Integer dscntPct) {
        this.dscntPct = dscntPct;
    }

    /**
     * Extended cost
     * <p>
     * Total amount for line - extended
     * 
     */
    @JsonProperty("extendAmt")
    public Double getExtendAmt() {
        return extendAmt;
    }

    /**
     * Extended cost
     * <p>
     * Total amount for line - extended
     * 
     */
    @JsonProperty("extendAmt")
    public void setExtendAmt(Double extendAmt) {
        this.extendAmt = extendAmt;
    }

    /**
     * Non taxable
     * <p>
     * Is non-taxable item
     * 
     */
    @JsonProperty("isNonTax")
    public Boolean getIsNonTax() {
        return isNonTax;
    }

    /**
     * Non taxable
     * <p>
     * Is non-taxable item
     * 
     */
    @JsonProperty("isNonTax")
    public void setIsNonTax(Boolean isNonTax) {
        this.isNonTax = isNonTax;
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
        return new HashCodeBuilder().append(qtyOrder).append(qtyFill).append(catCode).append(partId).append(desc).append(itemImg).append(cost).append(dscntAmt).append(dscntPct).append(extendAmt).append(isNonTax).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dtl) == false) {
            return false;
        }
        Dtl rhs = ((Dtl) other);
        return new EqualsBuilder().append(qtyOrder, rhs.qtyOrder).append(qtyFill, rhs.qtyFill).append(catCode, rhs.catCode).append(partId, rhs.partId).append(desc, rhs.desc).append(itemImg, rhs.itemImg).append(cost, rhs.cost).append(dscntAmt, rhs.dscntAmt).append(dscntPct, rhs.dscntPct).append(extendAmt, rhs.extendAmt).append(isNonTax, rhs.isNonTax).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
