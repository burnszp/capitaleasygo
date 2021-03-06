//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:46:37 AM CST 
//


package com.mentor.capital.project;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "", propOrder = {
    "advnameidx",
    "property"
})
@XmlRootElement(name = "blockdevicepin")
public class Blockdevicepin {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "shortdescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shortdescription;
    @XmlAttribute(name = "nameindex")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameindex;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "connectedpin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String connectedpin;
    @XmlAttribute(name = "associatedobject")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String associatedobject;
    @XmlAttribute(name = "associatedpinname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String associatedpinname;
    @XmlAttribute(name = "associatedobjecttype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String associatedobjecttype;
    protected List<Advnameidx> advnameidx;
    protected List<Property> property;

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
     * Gets the value of the shortdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortdescription() {
        return shortdescription;
    }

    /**
     * Sets the value of the shortdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortdescription(String value) {
        this.shortdescription = value;
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
     * Gets the value of the parentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * Sets the value of the parentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentid(String value) {
        this.parentid = value;
    }

    /**
     * Gets the value of the baseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseid() {
        return baseid;
    }

    /**
     * Sets the value of the baseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseid(String value) {
        this.baseid = value;
    }

    /**
     * Gets the value of the connectedpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedpin() {
        return connectedpin;
    }

    /**
     * Sets the value of the connectedpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedpin(String value) {
        this.connectedpin = value;
    }

    /**
     * Gets the value of the associatedobject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedobject() {
        return associatedobject;
    }

    /**
     * Sets the value of the associatedobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedobject(String value) {
        this.associatedobject = value;
    }

    /**
     * Gets the value of the associatedpinname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedpinname() {
        return associatedpinname;
    }

    /**
     * Sets the value of the associatedpinname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedpinname(String value) {
        this.associatedpinname = value;
    }

    /**
     * Gets the value of the associatedobjecttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedobjecttype() {
        return associatedobjecttype;
    }

    /**
     * Sets the value of the associatedobjecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedobjecttype(String value) {
        this.associatedobjecttype = value;
    }

    /**
     * Gets the value of the advnameidx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advnameidx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvnameidx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Advnameidx }
     * 
     * 
     */
    public List<Advnameidx> getAdvnameidx() {
        if (advnameidx == null) {
            advnameidx = new ArrayList<Advnameidx>();
        }
        return this.advnameidx;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

}
