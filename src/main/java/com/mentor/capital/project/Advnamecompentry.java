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
@XmlRootElement(name = "advnamecompentry")
public class Advnamecompentry {

    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "object")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String object;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "multi")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String multi;
    @XmlAttribute(name = "prefix")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String prefix;
    @XmlAttribute(name = "suffix")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String suffix;
    @XmlAttribute(name = "delim")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String delim;
    @XmlAttribute(name = "queryRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String queryRef;
    @XmlAttribute(name = "isPluginQuery")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isPluginQuery;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
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
     * Gets the value of the multi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulti() {
        return multi;
    }

    /**
     * Sets the value of the multi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulti(String value) {
        this.multi = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the delim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelim() {
        return delim;
    }

    /**
     * Sets the value of the delim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelim(String value) {
        this.delim = value;
    }

    /**
     * Gets the value of the queryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryRef() {
        return queryRef;
    }

    /**
     * Sets the value of the queryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryRef(String value) {
        this.queryRef = value;
    }

    /**
     * Gets the value of the isPluginQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPluginQuery() {
        return isPluginQuery;
    }

    /**
     * Sets the value of the isPluginQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPluginQuery(String value) {
        this.isPluginQuery = value;
    }

}
