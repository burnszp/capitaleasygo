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
@XmlRootElement(name = "customoptiontakerate")
public class Customoptiontakerate {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "takerate", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String takerate;
    @XmlAttribute(name = "saleschannel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String saleschannel;
    @XmlAttribute(name = "optionexpression", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optionexpression;

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
     * Gets the value of the takerate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakerate() {
        return takerate;
    }

    /**
     * Sets the value of the takerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakerate(String value) {
        this.takerate = value;
    }

    /**
     * Gets the value of the saleschannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleschannel() {
        if (saleschannel == null) {
            return "FLEET";
        } else {
            return saleschannel;
        }
    }

    /**
     * Sets the value of the saleschannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleschannel(String value) {
        this.saleschannel = value;
    }

    /**
     * Gets the value of the optionexpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionexpression() {
        return optionexpression;
    }

    /**
     * Sets the value of the optionexpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionexpression(String value) {
        this.optionexpression = value;
    }

}
