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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "overridesymbolstyling")
public class Overridesymbolstyling {

    @XmlAttribute(name = "value")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "overrideonlystyleddecorations")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String overrideonlystyleddecorations;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        if (value == null) {
            return "true";
        } else {
            return value;
        }
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the overrideonlystyleddecorations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideonlystyleddecorations() {
        if (overrideonlystyleddecorations == null) {
            return "false";
        } else {
            return overrideonlystyleddecorations;
        }
    }

    /**
     * Sets the value of the overrideonlystyleddecorations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideonlystyleddecorations(String value) {
        this.overrideonlystyleddecorations = value;
    }

}