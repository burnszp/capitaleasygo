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
import javax.xml.bind.annotation.XmlIDREF;
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
@XmlRootElement(name = "headerrowstyle")
public class Headerrowstyle {

    @XmlAttribute(name = "rowname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowname;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "rotationangle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rotationangle;
    @XmlAttribute(name = "fontstyleref")
    @XmlIDREF
    protected Object fontstyleref;

    /**
     * Gets the value of the rowname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowname() {
        return rowname;
    }

    /**
     * Sets the value of the rowname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowname(String value) {
        this.rowname = value;
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
     * Gets the value of the rotationangle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotationangle() {
        return rotationangle;
    }

    /**
     * Sets the value of the rotationangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotationangle(String value) {
        this.rotationangle = value;
    }

    /**
     * Gets the value of the fontstyleref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFontstyleref() {
        return fontstyleref;
    }

    /**
     * Sets the value of the fontstyleref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFontstyleref(Object value) {
        this.fontstyleref = value;
    }

}
