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
@XmlRootElement(name = "printregioninfo")
public class Printregioninfo {

    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "printregionbaseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String printregionbaseid;
    @XmlAttribute(name = "framenumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String framenumber;
    @XmlAttribute(name = "decorationid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decorationid;
    @XmlAttribute(name = "componentid")
    @XmlIDREF
    protected Object componentid;
    @XmlAttribute(name = "printregionref", required = true)
    @XmlIDREF
    protected Object printregionref;

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
     * Gets the value of the printregionbaseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintregionbaseid() {
        return printregionbaseid;
    }

    /**
     * Sets the value of the printregionbaseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintregionbaseid(String value) {
        this.printregionbaseid = value;
    }

    /**
     * Gets the value of the framenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramenumber() {
        return framenumber;
    }

    /**
     * Sets the value of the framenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramenumber(String value) {
        this.framenumber = value;
    }

    /**
     * Gets the value of the decorationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecorationid() {
        return decorationid;
    }

    /**
     * Sets the value of the decorationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecorationid(String value) {
        this.decorationid = value;
    }

    /**
     * Gets the value of the componentid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComponentid() {
        return componentid;
    }

    /**
     * Sets the value of the componentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComponentid(Object value) {
        this.componentid = value;
    }

    /**
     * Gets the value of the printregionref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrintregionref() {
        return printregionref;
    }

    /**
     * Sets the value of the printregionref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrintregionref(Object value) {
        this.printregionref = value;
    }

}
