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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
    "netinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface",
    "property"
})
@XmlRootElement(name = "highway")
public class Highway {

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
    @XmlAttribute(name = "sharedhighway_id")
    @XmlIDREF
    protected Object sharedhighwayId;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlElements({
        @XmlElement(name = "netinterface", type = Netinterface.class),
        @XmlElement(name = "wireinterface", type = Wireinterface.class),
        @XmlElement(name = "shieldinterface", type = Shieldinterface.class),
        @XmlElement(name = "signalinterface", type = Signalinterface.class),
        @XmlElement(name = "stackedpinnetinterface", type = Stackedpinnetinterface.class),
        @XmlElement(name = "stackedpinwireinterface", type = Stackedpinwireinterface.class),
        @XmlElement(name = "stackedpinshieldinterface", type = Stackedpinshieldinterface.class)
    })
    protected List<Object> netinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface;
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
     * Gets the value of the sharedhighwayId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSharedhighwayId() {
        return sharedhighwayId;
    }

    /**
     * Sets the value of the sharedhighwayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSharedhighwayId(Object value) {
        this.sharedhighwayId = value;
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
     * Gets the value of the netinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Netinterface }
     * {@link Wireinterface }
     * {@link Shieldinterface }
     * {@link Signalinterface }
     * {@link Stackedpinnetinterface }
     * {@link Stackedpinwireinterface }
     * {@link Stackedpinshieldinterface }
     * 
     * 
     */
    public List<Object> getNetinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface() {
        if (netinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface == null) {
            netinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface = new ArrayList<Object>();
        }
        return this.netinterfaceOrWireinterfaceOrShieldinterfaceOrSignalinterfaceOrStackedpinnetinterfaceOrStackedpinwireinterfaceOrStackedpinshieldinterface;
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