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
@XmlRootElement(name = "costformulagroup")
public class Costformulagroup {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "startindex", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String startindex;
    @XmlAttribute(name = "endindex", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String endindex;

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
     * Gets the value of the startindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartindex() {
        return startindex;
    }

    /**
     * Sets the value of the startindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartindex(String value) {
        this.startindex = value;
    }

    /**
     * Gets the value of the endindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndindex() {
        return endindex;
    }

    /**
     * Sets the value of the endindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndindex(String value) {
        this.endindex = value;
    }

}
