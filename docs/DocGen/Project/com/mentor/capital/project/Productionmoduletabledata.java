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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headervalues",
    "datacellvalues"
})
@XmlRootElement(name = "productionmoduletabledata")
public class Productionmoduletabledata {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "harnessdesignuid", required = true)
    @XmlIDREF
    protected Object harnessdesignuid;
    @XmlAttribute(name = "modulecodecout", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modulecodecout;
    @XmlAttribute(name = "numberofchildren", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String numberofchildren;
    @XmlAttribute(name = "rowcount", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowcount;
    @XmlAttribute(name = "columncount", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columncount;
    @XmlAttribute(name = "headercount", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String headercount;
    @XmlElement(required = true)
    protected Headervalues headervalues;
    @XmlElement(required = true)
    protected Datacellvalues datacellvalues;

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

    /**
     * Gets the value of the harnessdesignuid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHarnessdesignuid() {
        return harnessdesignuid;
    }

    /**
     * Sets the value of the harnessdesignuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHarnessdesignuid(Object value) {
        this.harnessdesignuid = value;
    }

    /**
     * Gets the value of the modulecodecout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulecodecout() {
        return modulecodecout;
    }

    /**
     * Sets the value of the modulecodecout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulecodecout(String value) {
        this.modulecodecout = value;
    }

    /**
     * Gets the value of the numberofchildren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberofchildren() {
        return numberofchildren;
    }

    /**
     * Sets the value of the numberofchildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberofchildren(String value) {
        this.numberofchildren = value;
    }

    /**
     * Gets the value of the rowcount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowcount() {
        return rowcount;
    }

    /**
     * Sets the value of the rowcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowcount(String value) {
        this.rowcount = value;
    }

    /**
     * Gets the value of the columncount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumncount() {
        return columncount;
    }

    /**
     * Sets the value of the columncount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumncount(String value) {
        this.columncount = value;
    }

    /**
     * Gets the value of the headercount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadercount() {
        return headercount;
    }

    /**
     * Sets the value of the headercount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadercount(String value) {
        this.headercount = value;
    }

    /**
     * Gets the value of the headervalues property.
     * 
     * @return
     *     possible object is
     *     {@link Headervalues }
     *     
     */
    public Headervalues getHeadervalues() {
        return headervalues;
    }

    /**
     * Sets the value of the headervalues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Headervalues }
     *     
     */
    public void setHeadervalues(Headervalues value) {
        this.headervalues = value;
    }

    /**
     * Gets the value of the datacellvalues property.
     * 
     * @return
     *     possible object is
     *     {@link Datacellvalues }
     *     
     */
    public Datacellvalues getDatacellvalues() {
        return datacellvalues;
    }

    /**
     * Sets the value of the datacellvalues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datacellvalues }
     *     
     */
    public void setDatacellvalues(Datacellvalues value) {
        this.datacellvalues = value;
    }

}
