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
    "designoptions",
    "platformoptions",
    "designnamemgr",
    "connectivity",
    "topodiagram",
    "topoplane",
    "designsignature",
    "linkcontainer",
    "customdesigndata"
})
@XmlRootElement(name = "planedesign")
public class Planedesign {

    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "shortdescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shortdescription;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "analysissubsystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String analysissubsystem;
    @XmlAttribute(name = "releaselevelref")
    @XmlIDREF
    protected Object releaselevelref;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "created")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String created;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "symbolsdeduplicated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String symbolsdeduplicated;
    protected List<Property> property;
    protected Designoptions designoptions;
    protected Platformoptions platformoptions;
    protected Designnamemgr designnamemgr;
    @XmlElement(required = true)
    protected Connectivity connectivity;
    protected List<Topodiagram> topodiagram;
    @XmlElement(required = true)
    protected Topoplane topoplane;
    protected List<Designsignature> designsignature;
    protected Linkcontainer linkcontainer;
    protected List<Customdesigndata> customdesigndata;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the analysissubsystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysissubsystem() {
        return analysissubsystem;
    }

    /**
     * Sets the value of the analysissubsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysissubsystem(String value) {
        this.analysissubsystem = value;
    }

    /**
     * Gets the value of the releaselevelref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReleaselevelref() {
        return releaselevelref;
    }

    /**
     * Sets the value of the releaselevelref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReleaselevelref(Object value) {
        this.releaselevelref = value;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
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
     * Gets the value of the symbolsdeduplicated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolsdeduplicated() {
        if (symbolsdeduplicated == null) {
            return "false";
        } else {
            return symbolsdeduplicated;
        }
    }

    /**
     * Sets the value of the symbolsdeduplicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolsdeduplicated(String value) {
        this.symbolsdeduplicated = value;
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
     * Gets the value of the designoptions property.
     * 
     * @return
     *     possible object is
     *     {@link Designoptions }
     *     
     */
    public Designoptions getDesignoptions() {
        return designoptions;
    }

    /**
     * Sets the value of the designoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designoptions }
     *     
     */
    public void setDesignoptions(Designoptions value) {
        this.designoptions = value;
    }

    /**
     * Gets the value of the platformoptions property.
     * 
     * @return
     *     possible object is
     *     {@link Platformoptions }
     *     
     */
    public Platformoptions getPlatformoptions() {
        return platformoptions;
    }

    /**
     * Sets the value of the platformoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platformoptions }
     *     
     */
    public void setPlatformoptions(Platformoptions value) {
        this.platformoptions = value;
    }

    /**
     * Gets the value of the designnamemgr property.
     * 
     * @return
     *     possible object is
     *     {@link Designnamemgr }
     *     
     */
    public Designnamemgr getDesignnamemgr() {
        return designnamemgr;
    }

    /**
     * Sets the value of the designnamemgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designnamemgr }
     *     
     */
    public void setDesignnamemgr(Designnamemgr value) {
        this.designnamemgr = value;
    }

    /**
     * Gets the value of the connectivity property.
     * 
     * @return
     *     possible object is
     *     {@link Connectivity }
     *     
     */
    public Connectivity getConnectivity() {
        return connectivity;
    }

    /**
     * Sets the value of the connectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connectivity }
     *     
     */
    public void setConnectivity(Connectivity value) {
        this.connectivity = value;
    }

    /**
     * Gets the value of the topodiagram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topodiagram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopodiagram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Topodiagram }
     * 
     * 
     */
    public List<Topodiagram> getTopodiagram() {
        if (topodiagram == null) {
            topodiagram = new ArrayList<Topodiagram>();
        }
        return this.topodiagram;
    }

    /**
     * Gets the value of the topoplane property.
     * 
     * @return
     *     possible object is
     *     {@link Topoplane }
     *     
     */
    public Topoplane getTopoplane() {
        return topoplane;
    }

    /**
     * Sets the value of the topoplane property.
     * 
     * @param value
     *     allowed object is
     *     {@link Topoplane }
     *     
     */
    public void setTopoplane(Topoplane value) {
        this.topoplane = value;
    }

    /**
     * Gets the value of the designsignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designsignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignsignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Designsignature }
     * 
     * 
     */
    public List<Designsignature> getDesignsignature() {
        if (designsignature == null) {
            designsignature = new ArrayList<Designsignature>();
        }
        return this.designsignature;
    }

    /**
     * Gets the value of the linkcontainer property.
     * 
     * @return
     *     possible object is
     *     {@link Linkcontainer }
     *     
     */
    public Linkcontainer getLinkcontainer() {
        return linkcontainer;
    }

    /**
     * Sets the value of the linkcontainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkcontainer }
     *     
     */
    public void setLinkcontainer(Linkcontainer value) {
        this.linkcontainer = value;
    }

    /**
     * Gets the value of the customdesigndata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customdesigndata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomdesigndata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customdesigndata }
     * 
     * 
     */
    public List<Customdesigndata> getCustomdesigndata() {
        if (customdesigndata == null) {
            customdesigndata = new ArrayList<Customdesigndata>();
        }
        return this.customdesigndata;
    }

}
