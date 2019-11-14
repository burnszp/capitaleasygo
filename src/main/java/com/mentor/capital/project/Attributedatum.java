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
@XmlType(name = "")
@XmlRootElement(name = "attributedatum")
public class Attributedatum {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "nameindex")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameindex;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "objecttype", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String objecttype;
    @XmlAttribute(name = "attrname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attrname;
    @XmlAttribute(name = "datumsubtype", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datumsubtype;
    @XmlAttribute(name = "parentdatumref")
    @XmlIDREF
    protected Object parentdatumref;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameindex() {
        if (nameindex == null) {
            return "-1";
        } else {
            return nameindex;
        }
    }

    /**
     * Sets the value of the nameindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameindex(String value) {
        this.nameindex = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the objecttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjecttype() {
        return objecttype;
    }

    /**
     * Sets the value of the objecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjecttype(String value) {
        this.objecttype = value;
    }

    /**
     * Gets the value of the attrname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrname() {
        return attrname;
    }

    /**
     * Sets the value of the attrname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrname(String value) {
        this.attrname = value;
    }

    /**
     * Gets the value of the datumsubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumsubtype() {
        return datumsubtype;
    }

    /**
     * Sets the value of the datumsubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumsubtype(String value) {
        this.datumsubtype = value;
    }

    /**
     * Gets the value of the parentdatumref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParentdatumref() {
        return parentdatumref;
    }

    /**
     * Sets the value of the parentdatumref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParentdatumref(Object value) {
        this.parentdatumref = value;
    }

}
