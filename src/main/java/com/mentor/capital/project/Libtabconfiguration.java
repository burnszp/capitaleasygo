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
    "libtableconfigurationOrLibwidgetconfiguration"
})
@XmlRootElement(name = "libtabconfiguration")
public class Libtabconfiguration {

    @XmlAttribute(name = "libtabconfiguration_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libtabconfigurationId;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "order", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String order;
    @XmlAttribute(name = "configurationtype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String configurationtype;
    @XmlElements({
        @XmlElement(name = "libtableconfiguration", type = Libtableconfiguration.class),
        @XmlElement(name = "libwidgetconfiguration", type = Libwidgetconfiguration.class)
    })
    protected List<Object> libtableconfigurationOrLibwidgetconfiguration;

    /**
     * Gets the value of the libtabconfigurationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibtabconfigurationId() {
        return libtabconfigurationId;
    }

    /**
     * Sets the value of the libtabconfigurationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibtabconfigurationId(String value) {
        this.libtabconfigurationId = value;
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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the configurationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationtype() {
        return configurationtype;
    }

    /**
     * Sets the value of the configurationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationtype(String value) {
        this.configurationtype = value;
    }

    /**
     * Gets the value of the libtableconfigurationOrLibwidgetconfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libtableconfigurationOrLibwidgetconfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibtableconfigurationOrLibwidgetconfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Libtableconfiguration }
     * {@link Libwidgetconfiguration }
     * 
     * 
     */
    public List<Object> getLibtableconfigurationOrLibwidgetconfiguration() {
        if (libtableconfigurationOrLibwidgetconfiguration == null) {
            libtableconfigurationOrLibwidgetconfiguration = new ArrayList<Object>();
        }
        return this.libtableconfigurationOrLibwidgetconfiguration;
    }

}
