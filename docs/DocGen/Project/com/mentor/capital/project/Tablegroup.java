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
    "tableattributes",
    "supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle",
    "tablefamily",
    "formattedvalue"
})
@XmlRootElement(name = "tablegroup")
public class Tablegroup {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "dataref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dataref;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "maxcolumns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxcolumns;
    @XmlAttribute(name = "repeatedcolumns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String repeatedcolumns;
    @XmlAttribute(name = "hiddencolumns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hiddencolumns;
    @XmlAttribute(name = "columnorder")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnorder;
    @XmlAttribute(name = "sortcolumns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sortcolumns;
    @XmlAttribute(name = "columnwidthorder")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnwidthorder;
    @XmlAttribute(name = "columnwidthvalue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnwidthvalue;
    @XmlAttribute(name = "hoffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hoffset;
    @XmlAttribute(name = "voffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String voffset;
    @XmlAttribute(name = "hjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hjust;
    @XmlAttribute(name = "vjust")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vjust;
    @XmlAttribute(name = "decorationid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decorationid;
    @XmlAttribute(name = "decorationname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String decorationname;
    @XmlAttribute(name = "colsforemptychck")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String colsforemptychck;
    @XmlAttribute(name = "headerroworder")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String headerroworder;
    @XmlAttribute(name = "ispositionlocked")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ispositionlocked;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "layernum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layernum;
    @XmlAttribute(name = "attributeref")
    @XmlIDREF
    protected Object attributeref;
    @XmlAttribute(name = "lockeddecorationref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lockeddecorationref;
    @XmlAttribute(name = "isexcludefromapplystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isexcludefromapplystyle;
    @XmlAttribute(name = "userdefinedhoffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userdefinedhoffset;
    @XmlAttribute(name = "userdefinedvoffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userdefinedvoffset;
    @XmlAttribute(name = "istablesplit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String istablesplit;
    @XmlAttribute(name = "trimcolumnwidth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trimcolumnwidth;
    @XmlAttribute(name = "title")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String title;
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
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    protected Tableattributes tableattributes;
    @XmlElements({
        @XmlElement(name = "supplementarydecorationsetcolumnstyle", type = Supplementarydecorationsetcolumnstyle.class),
        @XmlElement(name = "supplementarycustomcolumnstyle", type = Supplementarycustomcolumnstyle.class),
        @XmlElement(name = "supplementarypropertycolumnstyle", type = Supplementarypropertycolumnstyle.class),
        @XmlElement(name = "columnstyle", type = Columnstyle.class)
    })
    protected List<Object> supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle;
    protected List<Tablefamily> tablefamily;
    protected Formattedvalue formattedvalue;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "basic";
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
     * Gets the value of the dataref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataref() {
        return dataref;
    }

    /**
     * Sets the value of the dataref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataref(String value) {
        this.dataref = value;
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
     * Gets the value of the maxcolumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxcolumns() {
        return maxcolumns;
    }

    /**
     * Sets the value of the maxcolumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxcolumns(String value) {
        this.maxcolumns = value;
    }

    /**
     * Gets the value of the repeatedcolumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatedcolumns() {
        return repeatedcolumns;
    }

    /**
     * Sets the value of the repeatedcolumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatedcolumns(String value) {
        this.repeatedcolumns = value;
    }

    /**
     * Gets the value of the hiddencolumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddencolumns() {
        return hiddencolumns;
    }

    /**
     * Sets the value of the hiddencolumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddencolumns(String value) {
        this.hiddencolumns = value;
    }

    /**
     * Gets the value of the columnorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnorder() {
        return columnorder;
    }

    /**
     * Sets the value of the columnorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnorder(String value) {
        this.columnorder = value;
    }

    /**
     * Gets the value of the sortcolumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortcolumns() {
        return sortcolumns;
    }

    /**
     * Sets the value of the sortcolumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortcolumns(String value) {
        this.sortcolumns = value;
    }

    /**
     * Gets the value of the columnwidthorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnwidthorder() {
        return columnwidthorder;
    }

    /**
     * Sets the value of the columnwidthorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnwidthorder(String value) {
        this.columnwidthorder = value;
    }

    /**
     * Gets the value of the columnwidthvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnwidthvalue() {
        return columnwidthvalue;
    }

    /**
     * Sets the value of the columnwidthvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnwidthvalue(String value) {
        this.columnwidthvalue = value;
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
     * Gets the value of the decorationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecorationid() {
        return decorationid;
    }

    /**
     * Sets the value of the decorationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecorationid(String value) {
        this.decorationid = value;
    }

    /**
     * Gets the value of the decorationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecorationname() {
        return decorationname;
    }

    /**
     * Sets the value of the decorationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecorationname(String value) {
        this.decorationname = value;
    }

    /**
     * Gets the value of the colsforemptychck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColsforemptychck() {
        return colsforemptychck;
    }

    /**
     * Sets the value of the colsforemptychck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColsforemptychck(String value) {
        this.colsforemptychck = value;
    }

    /**
     * Gets the value of the headerroworder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderroworder() {
        return headerroworder;
    }

    /**
     * Sets the value of the headerroworder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderroworder(String value) {
        this.headerroworder = value;
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
     * Gets the value of the lockeddecorationref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockeddecorationref() {
        return lockeddecorationref;
    }

    /**
     * Sets the value of the lockeddecorationref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockeddecorationref(String value) {
        this.lockeddecorationref = value;
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
     * Gets the value of the userdefinedhoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserdefinedhoffset() {
        return userdefinedhoffset;
    }

    /**
     * Sets the value of the userdefinedhoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserdefinedhoffset(String value) {
        this.userdefinedhoffset = value;
    }

    /**
     * Gets the value of the userdefinedvoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserdefinedvoffset() {
        return userdefinedvoffset;
    }

    /**
     * Sets the value of the userdefinedvoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserdefinedvoffset(String value) {
        this.userdefinedvoffset = value;
    }

    /**
     * Gets the value of the istablesplit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIstablesplit() {
        if (istablesplit == null) {
            return "false";
        } else {
            return istablesplit;
        }
    }

    /**
     * Sets the value of the istablesplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIstablesplit(String value) {
        this.istablesplit = value;
    }

    /**
     * Gets the value of the trimcolumnwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimcolumnwidth() {
        if (trimcolumnwidth == null) {
            return "false";
        } else {
            return trimcolumnwidth;
        }
    }

    /**
     * Sets the value of the trimcolumnwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimcolumnwidth(String value) {
        this.trimcolumnwidth = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the tableattributes property.
     * 
     * @return
     *     possible object is
     *     {@link Tableattributes }
     *     
     */
    public Tableattributes getTableattributes() {
        return tableattributes;
    }

    /**
     * Sets the value of the tableattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tableattributes }
     *     
     */
    public void setTableattributes(Tableattributes value) {
        this.tableattributes = value;
    }

    /**
     * Gets the value of the supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplementarydecorationsetcolumnstyle }
     * {@link Supplementarycustomcolumnstyle }
     * {@link Supplementarypropertycolumnstyle }
     * {@link Columnstyle }
     * 
     * 
     */
    public List<Object> getSupplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle() {
        if (supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle == null) {
            supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle = new ArrayList<Object>();
        }
        return this.supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle;
    }

    /**
     * Gets the value of the tablefamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tablefamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTablefamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tablefamily }
     * 
     * 
     */
    public List<Tablefamily> getTablefamily() {
        if (tablefamily == null) {
            tablefamily = new ArrayList<Tablefamily>();
        }
        return this.tablefamily;
    }

    /**
     * Gets the value of the formattedvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Formattedvalue }
     *     
     */
    public Formattedvalue getFormattedvalue() {
        return formattedvalue;
    }

    /**
     * Sets the value of the formattedvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formattedvalue }
     *     
     */
    public void setFormattedvalue(Formattedvalue value) {
        this.formattedvalue = value;
    }

}
