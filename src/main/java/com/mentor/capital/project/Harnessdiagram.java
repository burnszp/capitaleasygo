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
    "harnessdiagramcontent"
})
@XmlRootElement(name = "harnessdiagram")
public class Harnessdiagram {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "physicalmapping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String physicalmapping;
    @XmlAttribute(name = "physicalmappingunits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String physicalmappingunits;
    @XmlAttribute(name = "spacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String spacing;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "preferencesetname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String preferencesetname;
    @XmlAttribute(name = "toscale")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String toscale;
    @XmlAttribute(name = "attributeref")
    @XmlIDREF
    protected Object attributeref;
    @XmlAttribute(name = "fixturesetref")
    @XmlIDREF
    protected Object fixturesetref;
    @XmlAttribute(name = "fullscalebundlewidth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fullscalebundlewidth;
    @XmlAttribute(name = "modifyfirstsegment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String modifyfirstsegment;
    @XmlAttribute(name = "preservediagramedits")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String preservediagramedits;
    @XmlAttribute(name = "preservefullscalelength")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String preservefullscalelength;
    @XmlAttribute(name = "borderback")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String borderback;
    protected List<Property> property;
    @XmlElement(required = true)
    protected Harnessdiagramcontent harnessdiagramcontent;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "harnessdesign";
        } else {
            return type;
        }
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
     * Gets the value of the physicalmapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalmapping() {
        return physicalmapping;
    }

    /**
     * Sets the value of the physicalmapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalmapping(String value) {
        this.physicalmapping = value;
    }

    /**
     * Gets the value of the physicalmappingunits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalmappingunits() {
        return physicalmappingunits;
    }

    /**
     * Sets the value of the physicalmappingunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalmappingunits(String value) {
        this.physicalmappingunits = value;
    }

    /**
     * Gets the value of the spacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpacing() {
        if (spacing == null) {
            return "1";
        } else {
            return spacing;
        }
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpacing(String value) {
        this.spacing = value;
    }

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
     * Gets the value of the preferencesetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferencesetname() {
        return preferencesetname;
    }

    /**
     * Sets the value of the preferencesetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferencesetname(String value) {
        this.preferencesetname = value;
    }

    /**
     * Gets the value of the toscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToscale() {
        if (toscale == null) {
            return "false";
        } else {
            return toscale;
        }
    }

    /**
     * Sets the value of the toscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToscale(String value) {
        this.toscale = value;
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
     * Gets the value of the fixturesetref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFixturesetref() {
        return fixturesetref;
    }

    /**
     * Sets the value of the fixturesetref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFixturesetref(Object value) {
        this.fixturesetref = value;
    }

    /**
     * Gets the value of the fullscalebundlewidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullscalebundlewidth() {
        if (fullscalebundlewidth == null) {
            return "false";
        } else {
            return fullscalebundlewidth;
        }
    }

    /**
     * Sets the value of the fullscalebundlewidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullscalebundlewidth(String value) {
        this.fullscalebundlewidth = value;
    }

    /**
     * Gets the value of the modifyfirstsegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyfirstsegment() {
        if (modifyfirstsegment == null) {
            return "false";
        } else {
            return modifyfirstsegment;
        }
    }

    /**
     * Sets the value of the modifyfirstsegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyfirstsegment(String value) {
        this.modifyfirstsegment = value;
    }

    /**
     * Gets the value of the preservediagramedits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreservediagramedits() {
        if (preservediagramedits == null) {
            return "unprotectable";
        } else {
            return preservediagramedits;
        }
    }

    /**
     * Sets the value of the preservediagramedits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreservediagramedits(String value) {
        this.preservediagramedits = value;
    }

    /**
     * Gets the value of the preservefullscalelength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreservefullscalelength() {
        if (preservefullscalelength == null) {
            return "true";
        } else {
            return preservefullscalelength;
        }
    }

    /**
     * Sets the value of the preservefullscalelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreservefullscalelength(String value) {
        this.preservefullscalelength = value;
    }

    /**
     * Gets the value of the borderback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderback() {
        if (borderback == null) {
            return "false";
        } else {
            return borderback;
        }
    }

    /**
     * Sets the value of the borderback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderback(String value) {
        this.borderback = value;
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
     * Gets the value of the harnessdiagramcontent property.
     * 
     * @return
     *     possible object is
     *     {@link Harnessdiagramcontent }
     *     
     */
    public Harnessdiagramcontent getHarnessdiagramcontent() {
        return harnessdiagramcontent;
    }

    /**
     * Sets the value of the harnessdiagramcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Harnessdiagramcontent }
     *     
     */
    public void setHarnessdiagramcontent(Harnessdiagramcontent value) {
        this.harnessdiagramcontent = value;
    }

}