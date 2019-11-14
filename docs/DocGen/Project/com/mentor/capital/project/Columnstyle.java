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
@XmlRootElement(name = "columnstyle")
public class Columnstyle {

    @XmlAttribute(name = "columnname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnname;
    @XmlAttribute(name = "displayname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String displayname;
    @XmlAttribute(name = "repeated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String repeated;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "sorttype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sorttype;
    @XmlAttribute(name = "sortorder")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sortorder;
    @XmlAttribute(name = "displaywidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String displaywidth;
    @XmlAttribute(name = "decorationsetdisplaywidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decorationsetdisplaywidth;
    @XmlAttribute(name = "hideempty")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hideempty;
    @XmlAttribute(name = "justify")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String justify;
    @XmlAttribute(name = "displaywidtheditable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displaywidtheditable;
    @XmlAttribute(name = "roundingtype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String roundingtype;
    @XmlAttribute(name = "decimalplaces")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decimalplaces;
    @XmlAttribute(name = "customroundingvalue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customroundingvalue;
    @XmlAttribute(name = "decimaldelimiter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decimaldelimiter;

    /**
     * Gets the value of the columnname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnname() {
        return columnname;
    }

    /**
     * Sets the value of the columnname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnname(String value) {
        this.columnname = value;
    }

    /**
     * Gets the value of the displayname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * Sets the value of the displayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayname(String value) {
        this.displayname = value;
    }

    /**
     * Gets the value of the repeated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeated() {
        if (repeated == null) {
            return "false";
        } else {
            return repeated;
        }
    }

    /**
     * Sets the value of the repeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeated(String value) {
        this.repeated = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        if (visibility == null) {
            return "true";
        } else {
            return visibility;
        }
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the sorttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorttype() {
        if (sorttype == null) {
            return "NoSort";
        } else {
            return sorttype;
        }
    }

    /**
     * Sets the value of the sorttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorttype(String value) {
        this.sorttype = value;
    }

    /**
     * Gets the value of the sortorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortorder() {
        return sortorder;
    }

    /**
     * Sets the value of the sortorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortorder(String value) {
        this.sortorder = value;
    }

    /**
     * Gets the value of the displaywidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaywidth() {
        return displaywidth;
    }

    /**
     * Sets the value of the displaywidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaywidth(String value) {
        this.displaywidth = value;
    }

    /**
     * Gets the value of the decorationsetdisplaywidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecorationsetdisplaywidth() {
        return decorationsetdisplaywidth;
    }

    /**
     * Sets the value of the decorationsetdisplaywidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecorationsetdisplaywidth(String value) {
        this.decorationsetdisplaywidth = value;
    }

    /**
     * Gets the value of the hideempty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideempty() {
        if (hideempty == null) {
            return "false";
        } else {
            return hideempty;
        }
    }

    /**
     * Sets the value of the hideempty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideempty(String value) {
        this.hideempty = value;
    }

    /**
     * Gets the value of the justify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustify() {
        if (justify == null) {
            return "left";
        } else {
            return justify;
        }
    }

    /**
     * Sets the value of the justify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustify(String value) {
        this.justify = value;
    }

    /**
     * Gets the value of the displaywidtheditable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaywidtheditable() {
        if (displaywidtheditable == null) {
            return "true";
        } else {
            return displaywidtheditable;
        }
    }

    /**
     * Sets the value of the displaywidtheditable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaywidtheditable(String value) {
        this.displaywidtheditable = value;
    }

    /**
     * Gets the value of the roundingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundingtype() {
        return roundingtype;
    }

    /**
     * Sets the value of the roundingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundingtype(String value) {
        this.roundingtype = value;
    }

    /**
     * Gets the value of the decimalplaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalplaces() {
        return decimalplaces;
    }

    /**
     * Sets the value of the decimalplaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalplaces(String value) {
        this.decimalplaces = value;
    }

    /**
     * Gets the value of the customroundingvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomroundingvalue() {
        return customroundingvalue;
    }

    /**
     * Sets the value of the customroundingvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomroundingvalue(String value) {
        this.customroundingvalue = value;
    }

    /**
     * Gets the value of the decimaldelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimaldelimiter() {
        return decimaldelimiter;
    }

    /**
     * Sets the value of the decimaldelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimaldelimiter(String value) {
        this.decimaldelimiter = value;
    }

}