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
@XmlRootElement(name = "option")
public class Option {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "nameindex")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameindex;
    @XmlAttribute(name = "description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "isvariant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isvariant;
    @XmlAttribute(name = "obsolete")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String obsolete;

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
     * Gets the value of the nameindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameindex() {
        if (nameindex == null) {
            return "-1";
        } else {
            return nameindex;
        }
    }

    /**
     * Sets the value of the nameindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameindex(String value) {
        this.nameindex = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isvariant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsvariant() {
        if (isvariant == null) {
            return "false";
        } else {
            return isvariant;
        }
    }

    /**
     * Sets the value of the isvariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsvariant(String value) {
        this.isvariant = value;
    }

    /**
     * Gets the value of the obsolete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsolete() {
        if (obsolete == null) {
            return "false";
        } else {
            return obsolete;
        }
    }

    /**
     * Sets the value of the obsolete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsolete(String value) {
        this.obsolete = value;
    }

}
