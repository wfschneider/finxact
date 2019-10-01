
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
 * Attachment
 * <p>
 * Attached folder, file or URI item
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attachName",
    "desc",
    "itemType",
    "createDtm",
    "createBy",
    "val",
    "valType",
    "encoding"
})
public class Attach {

    /**
     * Attachment name
     * <p>
     * The name of the attached item
     * 
     */
    @JsonProperty("attachName")
    @JsonPropertyDescription("The name of the attached item")
    private String attachName;
    /**
     * Description
     * <p>
     * The description of the attached item
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("The description of the attached item")
    private String desc;
    /**
     * Attachment type
     * <p>
     * The type of the attached item
     * 
     */
    @JsonProperty("itemType")
    @JsonPropertyDescription("The type of the attached item")
    private Integer itemType;
    /**
     * Attachment created on
     * <p>
     * The date the attachment was created
     * 
     */
    @JsonProperty("createDtm")
    @JsonPropertyDescription("The date the attachment was created")
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
     * Content value
     * <p>
     * The attached content value
     * 
     */
    @JsonProperty("val")
    @JsonPropertyDescription("The attached content value")
    private String val;
    /**
     * Content type
     * <p>
     * The format type of the content
     * 
     */
    @JsonProperty("valType")
    @JsonPropertyDescription("The format type of the content")
    private Integer valType = 2;
    /**
     * Binary encoding
     * <p>
     * Binary encoding
     * 
     */
    @JsonProperty("encoding")
    @JsonPropertyDescription("Binary encoding")
    private Integer encoding = 1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attachment name
     * <p>
     * The name of the attached item
     * 
     */
    @JsonProperty("attachName")
    public String getAttachName() {
        return attachName;
    }

    /**
     * Attachment name
     * <p>
     * The name of the attached item
     * 
     */
    @JsonProperty("attachName")
    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }

    /**
     * Description
     * <p>
     * The description of the attached item
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * The description of the attached item
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Attachment type
     * <p>
     * The type of the attached item
     * 
     */
    @JsonProperty("itemType")
    public Integer getItemType() {
        return itemType;
    }

    /**
     * Attachment type
     * <p>
     * The type of the attached item
     * 
     */
    @JsonProperty("itemType")
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /**
     * Attachment created on
     * <p>
     * The date the attachment was created
     * 
     */
    @JsonProperty("createDtm")
    public Date getCreateDtm() {
        return createDtm;
    }

    /**
     * Attachment created on
     * <p>
     * The date the attachment was created
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
     * Content value
     * <p>
     * The attached content value
     * 
     */
    @JsonProperty("val")
    public String getVal() {
        return val;
    }

    /**
     * Content value
     * <p>
     * The attached content value
     * 
     */
    @JsonProperty("val")
    public void setVal(String val) {
        this.val = val;
    }

    /**
     * Content type
     * <p>
     * The format type of the content
     * 
     */
    @JsonProperty("valType")
    public Integer getValType() {
        return valType;
    }

    /**
     * Content type
     * <p>
     * The format type of the content
     * 
     */
    @JsonProperty("valType")
    public void setValType(Integer valType) {
        this.valType = valType;
    }

    /**
     * Binary encoding
     * <p>
     * Binary encoding
     * 
     */
    @JsonProperty("encoding")
    public Integer getEncoding() {
        return encoding;
    }

    /**
     * Binary encoding
     * <p>
     * Binary encoding
     * 
     */
    @JsonProperty("encoding")
    public void setEncoding(Integer encoding) {
        this.encoding = encoding;
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
        return new HashCodeBuilder().append(attachName).append(desc).append(itemType).append(createDtm).append(createBy).append(val).append(valType).append(encoding).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attach) == false) {
            return false;
        }
        Attach rhs = ((Attach) other);
        return new EqualsBuilder().append(attachName, rhs.attachName).append(desc, rhs.desc).append(itemType, rhs.itemType).append(createDtm, rhs.createDtm).append(createBy, rhs.createBy).append(val, rhs.val).append(valType, rhs.valType).append(encoding, rhs.encoding).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
