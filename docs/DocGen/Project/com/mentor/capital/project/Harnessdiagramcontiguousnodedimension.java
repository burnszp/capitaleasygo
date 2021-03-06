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
    "property",
    "harnessdiagramnestednodedimension"
})
@XmlRootElement(name = "harnessdiagramcontiguousnodedimension")
public class Harnessdiagramcontiguousnodedimension {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "start_node", required = true)
    @XmlIDREF
    protected Object startNode;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "attributeref")
    @XmlIDREF
    protected Object attributeref;
    @XmlAttribute(name = "isexcludefromapplystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isexcludefromapplystyle;
    protected List<Property> property;
    protected List<Harnessdiagramnestednodedimension> harnessdiagramnestednodedimension;

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
     * Gets the value of the startNode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStartNode() {
        return startNode;
    }

    /**
     * Sets the value of the startNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStartNode(Object value) {
        this.startNode = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        if (height == null) {
            return "0";
        } else {
            return height;
        }
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        if (visibility == null) {
            return "true";
        } else {
            return visibility;
        }
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the attributeref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttributeref() {
        return attributeref;
    }

    /**
     * Sets the value of the attributeref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttributeref(Object value) {
        this.attributeref = value;
    }

    /**
     * Gets the value of the isexcludefromapplystyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsexcludefromapplystyle() {
        if (isexcludefromapplystyle == null) {
            return "false";
        } else {
            return isexcludefromapplystyle;
        }
    }

    /**
     * Sets the value of the isexcludefromapplystyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsexcludefromapplystyle(String value) {
        this.isexcludefromapplystyle = value;
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

    /**
     * Gets the value of the harnessdiagramnestednodedimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the harnessdiagramnestednodedimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHarnessdiagramnestednodedimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Harnessdiagramnestednodedimension }
     * 
     * 
     */
    public List<Harnessdiagramnestednodedimension> getHarnessdiagramnestednodedimension() {
        if (harnessdiagramnestednodedimension == null) {
            harnessdiagramnestednodedimension = new ArrayList<Harnessdiagramnestednodedimension>();
        }
        return this.harnessdiagramnestednodedimension;
    }

}
