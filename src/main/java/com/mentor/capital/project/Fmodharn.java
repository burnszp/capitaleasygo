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
@XmlRootElement(name = "fmodharn")
public class Fmodharn {

    @XmlAttribute(name = "composite_designid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String compositeDesignid;
    @XmlAttribute(name = "module_designid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String moduleDesignid;
    @XmlAttribute(name = "desname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String desname;
    @XmlAttribute(name = "partnumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partnumber;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the compositeDesignid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeDesignid() {
        return compositeDesignid;
    }

    /**
     * Sets the value of the compositeDesignid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeDesignid(String value) {
        this.compositeDesignid = value;
    }

    /**
     * Gets the value of the moduleDesignid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleDesignid() {
        return moduleDesignid;
    }

    /**
     * Sets the value of the moduleDesignid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleDesignid(String value) {
        this.moduleDesignid = value;
    }

    /**
     * Gets the value of the desname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesname() {
        return desname;
    }

    /**
     * Sets the value of the desname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesname(String value) {
        this.desname = value;
    }

    /**
     * Gets the value of the partnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnumber() {
        return partnumber;
    }

    /**
     * Sets the value of the partnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnumber(String value) {
        this.partnumber = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
