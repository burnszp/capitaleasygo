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
@XmlType(name = "", propOrder = {
    "color"
})
@XmlRootElement(name = "colordata")
public class Colordata {

    @XmlAttribute(name = "queryname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String queryname;
    @XmlAttribute(name = "colorpluginreference")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String colorpluginreference;
    @XmlAttribute(name = "attributequeryname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attributequeryname;
    @XmlAttribute(name = "default")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _default;
    protected Color color;

    /**
     * Gets the value of the queryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryname() {
        return queryname;
    }

    /**
     * Sets the value of the queryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryname(String value) {
        this.queryname = value;
    }

    /**
     * Gets the value of the colorpluginreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorpluginreference() {
        return colorpluginreference;
    }

    /**
     * Sets the value of the colorpluginreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorpluginreference(String value) {
        this.colorpluginreference = value;
    }

    /**
     * Gets the value of the attributequeryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributequeryname() {
        return attributequeryname;
    }

    /**
     * Sets the value of the attributequeryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributequeryname(String value) {
        this.attributequeryname = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        if (_default == null) {
            return "false";
        } else {
            return _default;
        }
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setColor(Color value) {
        this.color = value;
    }

}
