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
@XmlRootElement(name = "designsharedoverbraidusage")
public class Designsharedoverbraidusage {

    @XmlAttribute(name = "sharedoverbraid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sharedoverbraid;
    @XmlAttribute(name = "cableoverbraid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cableoverbraid;

    /**
     * Gets the value of the sharedoverbraid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedoverbraid() {
        return sharedoverbraid;
    }

    /**
     * Sets the value of the sharedoverbraid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedoverbraid(String value) {
        this.sharedoverbraid = value;
    }

    /**
     * Gets the value of the cableoverbraid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableoverbraid() {
        return cableoverbraid;
    }

    /**
     * Sets the value of the cableoverbraid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableoverbraid(String value) {
        this.cableoverbraid = value;
    }

}