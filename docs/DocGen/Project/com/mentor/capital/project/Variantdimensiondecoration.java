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
    "decorationpropertycomp",
    "layoutdetails"
})
@XmlRootElement(name = "variantdimensiondecoration")
public class Variantdimensiondecoration {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "hjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hjust;
    @XmlAttribute(name = "vjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vjust;
    @XmlAttribute(name = "nominaloriginuid")
    @XmlIDREF
    protected Object nominaloriginuid;
    @XmlAttribute(name = "nominaloriginref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nominaloriginref;
    @XmlAttribute(name = "nominalorigintype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nominalorigintype;
    @XmlAttribute(name = "originhjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String originhjust;
    @XmlAttribute(name = "originvjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String originvjust;
    @XmlAttribute(name = "hoffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hoffset;
    @XmlAttribute(name = "voffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String voffset;
    @XmlAttribute(name = "originpropertyname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String originpropertyname;
    @XmlAttribute(name = "replaceoriginproperty")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String replaceoriginproperty;
    @XmlAttribute(name = "leaderlineoriginhjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaderlineoriginhjust;
    @XmlAttribute(name = "leaderlineoriginvjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaderlineoriginvjust;
    @XmlAttribute(name = "leaderlinedecorationhjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaderlinedecorationhjust;
    @XmlAttribute(name = "leaderlinedecorationvjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaderlinedecorationvjust;
    @XmlAttribute(name = "underlineside")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String underlineside;
    @XmlAttribute(name = "underlineoffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String underlineoffset;
    @XmlAttribute(name = "ispositionlocked")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ispositionlocked;
    @XmlAttribute(name = "usenominalsymbolorigin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usenominalsymbolorigin;
    @XmlAttribute(name = "usefirstframe")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usefirstframe;
    @XmlAttribute(name = "decorativename")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decorativename;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "orientationtype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orientationtype;
    @XmlAttribute(name = "boxing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String boxing;
    @XmlAttribute(name = "wrap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String wrap;
    @XmlAttribute(name = "recentreonflip")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recentreonflip;
    @XmlAttribute(name = "recenter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recenter;
    @XmlAttribute(name = "autoflip")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoflip;
    @XmlAttribute(name = "isvisible")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isvisible;
    @XmlAttribute(name = "isvisibilityoverridable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isvisibilityoverridable;
    @XmlAttribute(name = "visibilityqueryexpname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String visibilityqueryexpname;
    @XmlAttribute(name = "visibilityattributename")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String visibilityattributename;
    @XmlAttribute(name = "visibilitypluginreference")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String visibilitypluginreference;
    @XmlAttribute(name = "leaderlinestyleid")
    @XmlIDREF
    protected Object leaderlinestyleid;
    @XmlAttribute(name = "excludefromapplystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String excludefromapplystyle;
    @XmlAttribute(name = "roundingtype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String roundingtype;
    @XmlAttribute(name = "decimalplaces")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decimalplaces;
    @XmlAttribute(name = "customroundingvalue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customroundingvalue;
    @XmlAttribute(name = "decimaldelimiter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decimaldelimiter;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "fontstyleref")
    @XmlIDREF
    protected Object fontstyleref;
    @XmlAttribute(name = "editabletext")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String editabletext;
    @XmlAttribute(name = "showDefaultDimension")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String showDefaultDimension;
    @XmlAttribute(name = "showVariantBundleDimensions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String showVariantBundleDimensions;
    @XmlAttribute(name = "ballooningshape")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ballooningshape;
    @XmlAttribute(name = "balloonlinethickness")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String balloonlinethickness;
    protected List<Decorationpropertycomp> decorationpropertycomp;
    @XmlElement(required = true)
    protected Layoutdetails layoutdetails;

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
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        return modified;
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
     * Gets the value of the hjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHjust() {
        return hjust;
    }

    /**
     * Sets the value of the hjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHjust(String value) {
        this.hjust = value;
    }

    /**
     * Gets the value of the vjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVjust() {
        return vjust;
    }

    /**
     * Sets the value of the vjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVjust(String value) {
        this.vjust = value;
    }

    /**
     * Gets the value of the nominaloriginuid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNominaloriginuid() {
        return nominaloriginuid;
    }

    /**
     * Sets the value of the nominaloriginuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNominaloriginuid(Object value) {
        this.nominaloriginuid = value;
    }

    /**
     * Gets the value of the nominaloriginref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominaloriginref() {
        return nominaloriginref;
    }

    /**
     * Sets the value of the nominaloriginref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominaloriginref(String value) {
        this.nominaloriginref = value;
    }

    /**
     * Gets the value of the nominalorigintype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalorigintype() {
        return nominalorigintype;
    }

    /**
     * Sets the value of the nominalorigintype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalorigintype(String value) {
        this.nominalorigintype = value;
    }

    /**
     * Gets the value of the originhjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginhjust() {
        return originhjust;
    }

    /**
     * Sets the value of the originhjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginhjust(String value) {
        this.originhjust = value;
    }

    /**
     * Gets the value of the originvjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginvjust() {
        return originvjust;
    }

    /**
     * Sets the value of the originvjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginvjust(String value) {
        this.originvjust = value;
    }

    /**
     * Gets the value of the hoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoffset() {
        return hoffset;
    }

    /**
     * Sets the value of the hoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoffset(String value) {
        this.hoffset = value;
    }

    /**
     * Gets the value of the voffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoffset() {
        return voffset;
    }

    /**
     * Sets the value of the voffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoffset(String value) {
        this.voffset = value;
    }

    /**
     * Gets the value of the originpropertyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginpropertyname() {
        return originpropertyname;
    }

    /**
     * Sets the value of the originpropertyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginpropertyname(String value) {
        this.originpropertyname = value;
    }

    /**
     * Gets the value of the replaceoriginproperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceoriginproperty() {
        return replaceoriginproperty;
    }

    /**
     * Sets the value of the replaceoriginproperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceoriginproperty(String value) {
        this.replaceoriginproperty = value;
    }

    /**
     * Gets the value of the leaderlineoriginhjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderlineoriginhjust() {
        return leaderlineoriginhjust;
    }

    /**
     * Sets the value of the leaderlineoriginhjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderlineoriginhjust(String value) {
        this.leaderlineoriginhjust = value;
    }

    /**
     * Gets the value of the leaderlineoriginvjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderlineoriginvjust() {
        return leaderlineoriginvjust;
    }

    /**
     * Sets the value of the leaderlineoriginvjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderlineoriginvjust(String value) {
        this.leaderlineoriginvjust = value;
    }

    /**
     * Gets the value of the leaderlinedecorationhjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderlinedecorationhjust() {
        return leaderlinedecorationhjust;
    }

    /**
     * Sets the value of the leaderlinedecorationhjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderlinedecorationhjust(String value) {
        this.leaderlinedecorationhjust = value;
    }

    /**
     * Gets the value of the leaderlinedecorationvjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderlinedecorationvjust() {
        return leaderlinedecorationvjust;
    }

    /**
     * Sets the value of the leaderlinedecorationvjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderlinedecorationvjust(String value) {
        this.leaderlinedecorationvjust = value;
    }

    /**
     * Gets the value of the underlineside property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderlineside() {
        return underlineside;
    }

    /**
     * Sets the value of the underlineside property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderlineside(String value) {
        this.underlineside = value;
    }

    /**
     * Gets the value of the underlineoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderlineoffset() {
        return underlineoffset;
    }

    /**
     * Sets the value of the underlineoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderlineoffset(String value) {
        this.underlineoffset = value;
    }

    /**
     * Gets the value of the ispositionlocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIspositionlocked() {
        if (ispositionlocked == null) {
            return "false";
        } else {
            return ispositionlocked;
        }
    }

    /**
     * Sets the value of the ispositionlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIspositionlocked(String value) {
        this.ispositionlocked = value;
    }

    /**
     * Gets the value of the usenominalsymbolorigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsenominalsymbolorigin() {
        if (usenominalsymbolorigin == null) {
            return "false";
        } else {
            return usenominalsymbolorigin;
        }
    }

    /**
     * Sets the value of the usenominalsymbolorigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsenominalsymbolorigin(String value) {
        this.usenominalsymbolorigin = value;
    }

    /**
     * Gets the value of the usefirstframe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsefirstframe() {
        if (usefirstframe == null) {
            return "false";
        } else {
            return usefirstframe;
        }
    }

    /**
     * Sets the value of the usefirstframe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsefirstframe(String value) {
        this.usefirstframe = value;
    }

    /**
     * Gets the value of the decorativename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecorativename() {
        return decorativename;
    }

    /**
     * Sets the value of the decorativename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecorativename(String value) {
        this.decorativename = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the orientationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientationtype() {
        return orientationtype;
    }

    /**
     * Sets the value of the orientationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientationtype(String value) {
        this.orientationtype = value;
    }

    /**
     * Gets the value of the boxing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxing() {
        return boxing;
    }

    /**
     * Sets the value of the boxing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxing(String value) {
        this.boxing = value;
    }

    /**
     * Gets the value of the wrap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrap() {
        return wrap;
    }

    /**
     * Sets the value of the wrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrap(String value) {
        this.wrap = value;
    }

    /**
     * Gets the value of the recentreonflip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecentreonflip() {
        return recentreonflip;
    }

    /**
     * Sets the value of the recentreonflip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecentreonflip(String value) {
        this.recentreonflip = value;
    }

    /**
     * Gets the value of the recenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecenter() {
        return recenter;
    }

    /**
     * Sets the value of the recenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecenter(String value) {
        this.recenter = value;
    }

    /**
     * Gets the value of the autoflip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoflip() {
        if (autoflip == null) {
            return "true";
        } else {
            return autoflip;
        }
    }

    /**
     * Sets the value of the autoflip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoflip(String value) {
        this.autoflip = value;
    }

    /**
     * Gets the value of the isvisible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsvisible() {
        if (isvisible == null) {
            return "true";
        } else {
            return isvisible;
        }
    }

    /**
     * Sets the value of the isvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsvisible(String value) {
        this.isvisible = value;
    }

    /**
     * Gets the value of the isvisibilityoverridable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsvisibilityoverridable() {
        if (isvisibilityoverridable == null) {
            return "true";
        } else {
            return isvisibilityoverridable;
        }
    }

    /**
     * Sets the value of the isvisibilityoverridable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsvisibilityoverridable(String value) {
        this.isvisibilityoverridable = value;
    }

    /**
     * Gets the value of the visibilityqueryexpname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityqueryexpname() {
        return visibilityqueryexpname;
    }

    /**
     * Sets the value of the visibilityqueryexpname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityqueryexpname(String value) {
        this.visibilityqueryexpname = value;
    }

    /**
     * Gets the value of the visibilityattributename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityattributename() {
        return visibilityattributename;
    }

    /**
     * Sets the value of the visibilityattributename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityattributename(String value) {
        this.visibilityattributename = value;
    }

    /**
     * Gets the value of the visibilitypluginreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilitypluginreference() {
        return visibilitypluginreference;
    }

    /**
     * Sets the value of the visibilitypluginreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilitypluginreference(String value) {
        this.visibilitypluginreference = value;
    }

    /**
     * Gets the value of the leaderlinestyleid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLeaderlinestyleid() {
        return leaderlinestyleid;
    }

    /**
     * Sets the value of the leaderlinestyleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLeaderlinestyleid(Object value) {
        this.leaderlinestyleid = value;
    }

    /**
     * Gets the value of the excludefromapplystyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludefromapplystyle() {
        if (excludefromapplystyle == null) {
            return "false";
        } else {
            return excludefromapplystyle;
        }
    }

    /**
     * Sets the value of the excludefromapplystyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludefromapplystyle(String value) {
        this.excludefromapplystyle = value;
    }

    /**
     * Gets the value of the roundingtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundingtype() {
        return roundingtype;
    }

    /**
     * Sets the value of the roundingtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundingtype(String value) {
        this.roundingtype = value;
    }

    /**
     * Gets the value of the decimalplaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalplaces() {
        return decimalplaces;
    }

    /**
     * Sets the value of the decimalplaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalplaces(String value) {
        this.decimalplaces = value;
    }

    /**
     * Gets the value of the customroundingvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomroundingvalue() {
        return customroundingvalue;
    }

    /**
     * Sets the value of the customroundingvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomroundingvalue(String value) {
        this.customroundingvalue = value;
    }

    /**
     * Gets the value of the decimaldelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimaldelimiter() {
        return decimaldelimiter;
    }

    /**
     * Sets the value of the decimaldelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimaldelimiter(String value) {
        this.decimaldelimiter = value;
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
        return type;
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
     * Gets the value of the fontstyleref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFontstyleref() {
        return fontstyleref;
    }

    /**
     * Sets the value of the fontstyleref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFontstyleref(Object value) {
        this.fontstyleref = value;
    }

    /**
     * Gets the value of the editabletext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditabletext() {
        if (editabletext == null) {
            return "false";
        } else {
            return editabletext;
        }
    }

    /**
     * Sets the value of the editabletext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditabletext(String value) {
        this.editabletext = value;
    }

    /**
     * Gets the value of the showDefaultDimension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowDefaultDimension() {
        if (showDefaultDimension == null) {
            return "false";
        } else {
            return showDefaultDimension;
        }
    }

    /**
     * Sets the value of the showDefaultDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowDefaultDimension(String value) {
        this.showDefaultDimension = value;
    }

    /**
     * Gets the value of the showVariantBundleDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowVariantBundleDimensions() {
        if (showVariantBundleDimensions == null) {
            return "false";
        } else {
            return showVariantBundleDimensions;
        }
    }

    /**
     * Sets the value of the showVariantBundleDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowVariantBundleDimensions(String value) {
        this.showVariantBundleDimensions = value;
    }

    /**
     * Gets the value of the ballooningshape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBallooningshape() {
        if (ballooningshape == null) {
            return "NONE";
        } else {
            return ballooningshape;
        }
    }

    /**
     * Sets the value of the ballooningshape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBallooningshape(String value) {
        this.ballooningshape = value;
    }

    /**
     * Gets the value of the balloonlinethickness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalloonlinethickness() {
        return balloonlinethickness;
    }

    /**
     * Sets the value of the balloonlinethickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalloonlinethickness(String value) {
        this.balloonlinethickness = value;
    }

    /**
     * Gets the value of the decorationpropertycomp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decorationpropertycomp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecorationpropertycomp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decorationpropertycomp }
     * 
     * 
     */
    public List<Decorationpropertycomp> getDecorationpropertycomp() {
        if (decorationpropertycomp == null) {
            decorationpropertycomp = new ArrayList<Decorationpropertycomp>();
        }
        return this.decorationpropertycomp;
    }

    /**
     * Gets the value of the layoutdetails property.
     * 
     * @return
     *     possible object is
     *     {@link Layoutdetails }
     *     
     */
    public Layoutdetails getLayoutdetails() {
        return layoutdetails;
    }

    /**
     * Sets the value of the layoutdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layoutdetails }
     *     
     */
    public void setLayoutdetails(Layoutdetails value) {
        this.layoutdetails = value;
    }

}
