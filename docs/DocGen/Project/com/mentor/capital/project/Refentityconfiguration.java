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
@XmlRootElement(name = "refentityconfiguration")
public class Refentityconfiguration {

    @XmlAttribute(name = "entityconfigurationref", required = true)
    @XmlIDREF
    protected Object entityconfigurationref;
    @XmlAttribute(name = "entityconfigurationtype", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String entityconfigurationtype;

    /**
     * Gets the value of the entityconfigurationref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEntityconfigurationref() {
        return entityconfigurationref;
    }

    /**
     * Sets the value of the entityconfigurationref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEntityconfigurationref(Object value) {
        this.entityconfigurationref = value;
    }

    /**
     * Gets the value of the entityconfigurationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityconfigurationtype() {
        return entityconfigurationtype;
    }

    /**
     * Sets the value of the entityconfigurationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityconfigurationtype(String value) {
        this.entityconfigurationtype = value;
    }

}