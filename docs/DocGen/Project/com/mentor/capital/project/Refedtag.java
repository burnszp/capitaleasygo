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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "refedtag")
public class Refedtag {

    @XmlAttribute(name = "tagref", required = true)
    @XmlIDREF
    protected Object tagref;
    @XmlAttribute(name = "tag_order")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tagOrder;

    /**
     * Gets the value of the tagref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTagref() {
        return tagref;
    }

    /**
     * Sets the value of the tagref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTagref(Object value) {
        this.tagref = value;
    }

    /**
     * Gets the value of the tagOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagOrder() {
        if (tagOrder == null) {
            return "-1";
        } else {
            return tagOrder;
        }
    }

    /**
     * Sets the value of the tagOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagOrder(String value) {
        this.tagOrder = value;
    }

}