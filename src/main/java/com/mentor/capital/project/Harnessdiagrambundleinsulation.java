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
    "symboldata",
    "parameters",
    "linestylesegmentOrArcstylesegment",
    "redsymboldata"
})
@XmlRootElement(name = "harnessdiagrambundleinsulation")
public class Harnessdiagrambundleinsulation {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "connref", required = true)
    @XmlIDREF
    protected Object connref;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;
    @XmlAttribute(name = "inslayerheight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inslayerheight;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "layernum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layernum;
    @XmlAttribute(name = "attributeref")
    @XmlIDREF
    protected Object attributeref;
    @XmlAttribute(name = "useOldRendering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useOldRendering;
    @XmlAttribute(name = "usedlinestylename")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String usedlinestylename;
    @XmlAttribute(name = "usedlinestylequeryname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String usedlinestylequeryname;
    @XmlAttribute(name = "islinestyleoverridden")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String islinestyleoverridden;
    @XmlAttribute(name = "isexcludefromapplystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isexcludefromapplystyle;
    @XmlAttribute(name = "trimatjunction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trimatjunction;
    @XmlAttribute(name = "overriddenSegmentOrigin")
    @XmlIDREF
    protected Object overriddenSegmentOrigin;
    protected Symboldata symboldata;
    protected List<Parameters> parameters;
    @XmlElements({
        @XmlElement(name = "linestylesegment", type = Linestylesegment.class),
        @XmlElement(name = "arcstylesegment", type = Arcstylesegment.class)
    })
    protected List<Object> linestylesegmentOrArcstylesegment;
    protected Redsymboldata redsymboldata;

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
     * Gets the value of the connref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConnref() {
        return connref;
    }

    /**
     * Sets the value of the connref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConnref(Object value) {
        this.connref = value;
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
        return height;
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
     * Gets the value of the inslayerheight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInslayerheight() {
        return inslayerheight;
    }

    /**
     * Sets the value of the inslayerheight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInslayerheight(String value) {
        this.inslayerheight = value;
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
     * Gets the value of the layernum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayernum() {
        return layernum;
    }

    /**
     * Sets the value of the layernum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayernum(String value) {
        this.layernum = value;
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
     * Gets the value of the useOldRendering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseOldRendering() {
        if (useOldRendering == null) {
            return "false";
        } else {
            return useOldRendering;
        }
    }

    /**
     * Sets the value of the useOldRendering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseOldRendering(String value) {
        this.useOldRendering = value;
    }

    /**
     * Gets the value of the usedlinestylename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedlinestylename() {
        return usedlinestylename;
    }

    /**
     * Sets the value of the usedlinestylename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedlinestylename(String value) {
        this.usedlinestylename = value;
    }

    /**
     * Gets the value of the usedlinestylequeryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedlinestylequeryname() {
        return usedlinestylequeryname;
    }

    /**
     * Sets the value of the usedlinestylequeryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedlinestylequeryname(String value) {
        this.usedlinestylequeryname = value;
    }

    /**
     * Gets the value of the islinestyleoverridden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslinestyleoverridden() {
        if (islinestyleoverridden == null) {
            return "false";
        } else {
            return islinestyleoverridden;
        }
    }

    /**
     * Sets the value of the islinestyleoverridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslinestyleoverridden(String value) {
        this.islinestyleoverridden = value;
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
     * Gets the value of the trimatjunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimatjunction() {
        if (trimatjunction == null) {
            return "true";
        } else {
            return trimatjunction;
        }
    }

    /**
     * Sets the value of the trimatjunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimatjunction(String value) {
        this.trimatjunction = value;
    }

    /**
     * Gets the value of the overriddenSegmentOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOverriddenSegmentOrigin() {
        return overriddenSegmentOrigin;
    }

    /**
     * Sets the value of the overriddenSegmentOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOverriddenSegmentOrigin(Object value) {
        this.overriddenSegmentOrigin = value;
    }

    /**
     * Gets the value of the symboldata property.
     * 
     * @return
     *     possible object is
     *     {@link Symboldata }
     *     
     */
    public Symboldata getSymboldata() {
        return symboldata;
    }

    /**
     * Sets the value of the symboldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Symboldata }
     *     
     */
    public void setSymboldata(Symboldata value) {
        this.symboldata = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameters }
     * 
     * 
     */
    public List<Parameters> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Parameters>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the linestylesegmentOrArcstylesegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linestylesegmentOrArcstylesegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinestylesegmentOrArcstylesegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linestylesegment }
     * {@link Arcstylesegment }
     * 
     * 
     */
    public List<Object> getLinestylesegmentOrArcstylesegment() {
        if (linestylesegmentOrArcstylesegment == null) {
            linestylesegmentOrArcstylesegment = new ArrayList<Object>();
        }
        return this.linestylesegmentOrArcstylesegment;
    }

    /**
     * Gets the value of the redsymboldata property.
     * 
     * @return
     *     possible object is
     *     {@link Redsymboldata }
     *     
     */
    public Redsymboldata getRedsymboldata() {
        return redsymboldata;
    }

    /**
     * Sets the value of the redsymboldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Redsymboldata }
     *     
     */
    public void setRedsymboldata(Redsymboldata value) {
        this.redsymboldata = value;
    }

}