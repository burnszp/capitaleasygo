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
@XmlRootElement(name = "projectanalysismgr")
public class Projectanalysismgr {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "analysissubsystemid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String analysissubsystemid;
    @XmlAttribute(name = "platformDescriptorPath")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String platformDescriptorPath;
    @XmlAttribute(name = "legacyanalysis")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String legacyanalysis;

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
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        if (modified == null) {
            return "0";
        } else {
            return modified;
        }
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
    }

    /**
     * Gets the value of the analysissubsystemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysissubsystemid() {
        return analysissubsystemid;
    }

    /**
     * Sets the value of the analysissubsystemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysissubsystemid(String value) {
        this.analysissubsystemid = value;
    }

    /**
     * Gets the value of the platformDescriptorPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformDescriptorPath() {
        return platformDescriptorPath;
    }

    /**
     * Sets the value of the platformDescriptorPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformDescriptorPath(String value) {
        this.platformDescriptorPath = value;
    }

    /**
     * Gets the value of the legacyanalysis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyanalysis() {
        if (legacyanalysis == null) {
            return "false";
        } else {
            return legacyanalysis;
        }
    }

    /**
     * Sets the value of the legacyanalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyanalysis(String value) {
        this.legacyanalysis = value;
    }

}
