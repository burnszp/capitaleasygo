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
@XmlRootElement(name = "libwidgetconfiguration")
public class Libwidgetconfiguration {

    @XmlAttribute(name = "libwidgetconfiguration_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libwidgetconfigurationId;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "rowindex", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowindex;
    @XmlAttribute(name = "columnindex", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnindex;
    @XmlAttribute(name = "configurationtype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String configurationtype;

    /**
     * Gets the value of the libwidgetconfigurationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibwidgetconfigurationId() {
        return libwidgetconfigurationId;
    }

    /**
     * Sets the value of the libwidgetconfigurationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibwidgetconfigurationId(String value) {
        this.libwidgetconfigurationId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rowindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowindex() {
        return rowindex;
    }

    /**
     * Sets the value of the rowindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowindex(String value) {
        this.rowindex = value;
    }

    /**
     * Gets the value of the columnindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnindex() {
        return columnindex;
    }

    /**
     * Sets the value of the columnindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnindex(String value) {
        this.columnindex = value;
    }

    /**
     * Gets the value of the configurationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationtype() {
        return configurationtype;
    }

    /**
     * Sets the value of the configurationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationtype(String value) {
        this.configurationtype = value;
    }

}
