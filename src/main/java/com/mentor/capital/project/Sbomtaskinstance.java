//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:46:37 AM CST 
//


package com.mentor.capital.project;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sbomtaskinstance")
public class Sbomtaskinstance {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "index", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String index;
    @XmlAttribute(name = "sbomtaskref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sbomtaskref;
    @XmlAttribute(name = "costformularef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String costformularef;
    @XmlAttribute(name = "costcenterref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String costcenterref;
    @XmlAttribute(name = "sbomresourceref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sbomresourceref;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the baseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseid() {
        return baseid;
    }

    /**
     * Sets the value of the baseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseid(String value) {
        this.baseid = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the sbomtaskref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbomtaskref() {
        return sbomtaskref;
    }

    /**
     * Sets the value of the sbomtaskref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbomtaskref(String value) {
        this.sbomtaskref = value;
    }

    /**
     * Gets the value of the costformularef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostformularef() {
        return costformularef;
    }

    /**
     * Sets the value of the costformularef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostformularef(String value) {
        this.costformularef = value;
    }

    /**
     * Gets the value of the costcenterref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostcenterref() {
        return costcenterref;
    }

    /**
     * Sets the value of the costcenterref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostcenterref(String value) {
        this.costcenterref = value;
    }

    /**
     * Gets the value of the sbomresourceref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbomresourceref() {
        return sbomresourceref;
    }

    /**
     * Sets the value of the sbomresourceref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbomresourceref(String value) {
        this.sbomresourceref = value;
    }

}
