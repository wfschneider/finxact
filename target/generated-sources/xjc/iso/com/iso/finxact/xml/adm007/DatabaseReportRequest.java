//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.25 at 11:22:31 AM EDT 
//


package com.iso.finxact.xml.adm007;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * VocaLink
 * 
 * <p>Java class for DatabaseReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseReportRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{admn.007.001.01}GrpHdr" minOccurs="0"/&gt;
 *         &lt;element name="DBRptInf" type="{admn.007.001.01}DatabaseReportInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseReportRequest", propOrder = {
    "grpHdr",
    "dbRptInf"
})
public class DatabaseReportRequest
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "GrpHdr")
    protected GrpHdr grpHdr;
    @XmlElement(name = "DBRptInf")
    protected DatabaseReportInformation dbRptInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GrpHdr }
     *     
     */
    public GrpHdr getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpHdr }
     *     
     */
    public void setGrpHdr(GrpHdr value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the dbRptInf property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseReportInformation }
     *     
     */
    public DatabaseReportInformation getDBRptInf() {
        return dbRptInf;
    }

    /**
     * Sets the value of the dbRptInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseReportInformation }
     *     
     */
    public void setDBRptInf(DatabaseReportInformation value) {
        this.dbRptInf = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DatabaseReportRequest)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DatabaseReportRequest that = ((DatabaseReportRequest) object);
        {
            GrpHdr lhsGrpHdr;
            lhsGrpHdr = this.getGrpHdr();
            GrpHdr rhsGrpHdr;
            rhsGrpHdr = that.getGrpHdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grpHdr", lhsGrpHdr), LocatorUtils.property(thatLocator, "grpHdr", rhsGrpHdr), lhsGrpHdr, rhsGrpHdr)) {
                return false;
            }
        }
        {
            DatabaseReportInformation lhsDBRptInf;
            lhsDBRptInf = this.getDBRptInf();
            DatabaseReportInformation rhsDBRptInf;
            rhsDBRptInf = that.getDBRptInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbRptInf", lhsDBRptInf), LocatorUtils.property(thatLocator, "dbRptInf", rhsDBRptInf), lhsDBRptInf, rhsDBRptInf)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            GrpHdr theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grpHdr", theGrpHdr), currentHashCode, theGrpHdr);
        }
        {
            DatabaseReportInformation theDBRptInf;
            theDBRptInf = this.getDBRptInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbRptInf", theDBRptInf), currentHashCode, theDBRptInf);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            GrpHdr theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            strategy.appendField(locator, this, "grpHdr", buffer, theGrpHdr);
        }
        {
            DatabaseReportInformation theDBRptInf;
            theDBRptInf = this.getDBRptInf();
            strategy.appendField(locator, this, "dbRptInf", buffer, theDBRptInf);
        }
        return buffer;
    }

}
