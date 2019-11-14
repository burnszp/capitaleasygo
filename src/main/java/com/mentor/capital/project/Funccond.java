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
    "connection",
    "property"
})
@XmlRootElement(name = "funccond")
public class Funccond {

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
    @XmlAttribute(name = "sharedconductor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sharedconductor;
    @XmlAttribute(name = "optionexpression")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optionexpression;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "funccondtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String funccondtype;
    @XmlAttribute(name = "funccondimpltype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String funccondimpltype;
    @XmlAttribute(name = "bitsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String bitsize;
    @XmlAttribute(name = "frequency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String frequency;
    @XmlAttribute(name = "latency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String latency;
    @XmlAttribute(name = "maxage")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxage;
    @XmlAttribute(name = "multiplexed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String multiplexed;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    protected List<Advnameidx> advnameidx;
    protected List<Connection> connection;
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
     * Gets the value of the sharedconductor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedconductor() {
        return sharedconductor;
    }

    /**
     * Sets the value of the sharedconductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedconductor(String value) {
        this.sharedconductor = value;
    }

    /**
     * Gets the value of the optionexpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionexpression() {
        return optionexpression;
    }

    /**
     * Sets the value of the optionexpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionexpression(String value) {
        this.optionexpression = value;
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
     * Gets the value of the funccondtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunccondtype() {
        if (funccondtype == null) {
            return "NotSet";
        } else {
            return funccondtype;
        }
    }

    /**
     * Sets the value of the funccondtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunccondtype(String value) {
        this.funccondtype = value;
    }

    /**
     * Gets the value of the funccondimpltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunccondimpltype() {
        if (funccondimpltype == null) {
            return "NotSet";
        } else {
            return funccondimpltype;
        }
    }

    /**
     * Sets the value of the funccondimpltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunccondimpltype(String value) {
        this.funccondimpltype = value;
    }

    /**
     * Gets the value of the bitsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitsize() {
        return bitsize;
    }

    /**
     * Sets the value of the bitsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitsize(String value) {
        this.bitsize = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the latency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatency() {
        return latency;
    }

    /**
     * Sets the value of the latency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatency(String value) {
        this.latency = value;
    }

    /**
     * Gets the value of the maxage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxage() {
        return maxage;
    }

    /**
     * Sets the value of the maxage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxage(String value) {
        this.maxage = value;
    }

    /**
     * Gets the value of the multiplexed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplexed() {
        return multiplexed;
    }

    /**
     * Sets the value of the multiplexed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplexed(String value) {
        this.multiplexed = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        if (modified == null) {
            return "0";
        } else {
            return modified;
        }
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
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
     * Gets the value of the connection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * 
     * 
     */
    public List<Connection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<Connection>();
        }
        return this.connection;
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