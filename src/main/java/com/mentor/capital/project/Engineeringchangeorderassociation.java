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
@XmlRootElement(name = "engineeringchangeorderassociation")
public class Engineeringchangeorderassociation {

    @XmlAttribute(name = "associatedid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String associatedid;
    @XmlAttribute(name = "completionstatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String completionstatus;
    @XmlAttribute(name = "associationtype", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String associationtype;

    /**
     * Gets the value of the associatedid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedid() {
        return associatedid;
    }

    /**
     * Sets the value of the associatedid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedid(String value) {
        this.associatedid = value;
    }

    /**
     * Gets the value of the completionstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionstatus() {
        return completionstatus;
    }

    /**
     * Sets the value of the completionstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionstatus(String value) {
        this.completionstatus = value;
    }

    /**
     * Gets the value of the associationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationtype() {
        return associationtype;
    }

    /**
     * Sets the value of the associationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationtype(String value) {
        this.associationtype = value;
    }

}