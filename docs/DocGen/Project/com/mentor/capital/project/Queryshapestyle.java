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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "queryshapestyle")
public class Queryshapestyle {

    @XmlAttribute(name = "queryname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String queryname;
    @XmlAttribute(name = "shapestyleref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shapestyleref;
    @XmlAttribute(name = "shapestylepluginreference")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shapestylepluginreference;
    @XmlAttribute(name = "attributename")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attributename;

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
     * Gets the value of the shapestyleref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShapestyleref() {
        return shapestyleref;
    }

    /**
     * Sets the value of the shapestyleref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShapestyleref(String value) {
        this.shapestyleref = value;
    }

    /**
     * Gets the value of the shapestylepluginreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShapestylepluginreference() {
        return shapestylepluginreference;
    }

    /**
     * Sets the value of the shapestylepluginreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShapestylepluginreference(String value) {
        this.shapestylepluginreference = value;
    }

    /**
     * Gets the value of the attributename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributename() {
        return attributename;
    }

    /**
     * Sets the value of the attributename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributename(String value) {
        this.attributename = value;
    }

}
