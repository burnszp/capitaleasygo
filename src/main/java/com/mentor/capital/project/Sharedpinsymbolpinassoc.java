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
@XmlRootElement(name = "sharedpinsymbolpinassoc")
public class Sharedpinsymbolpinassoc {

    @XmlAttribute(name = "sharedpinref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sharedpinref;
    @XmlAttribute(name = "symbolpinref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String symbolpinref;

    /**
     * Gets the value of the sharedpinref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedpinref() {
        return sharedpinref;
    }

    /**
     * Sets the value of the sharedpinref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedpinref(String value) {
        this.sharedpinref = value;
    }

    /**
     * Gets the value of the symbolpinref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolpinref() {
        return symbolpinref;
    }

    /**
     * Sets the value of the symbolpinref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolpinref(String value) {
        this.symbolpinref = value;
    }

}