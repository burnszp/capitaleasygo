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
    "supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype",
    "supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle",
    "headerrowstyle",
    "decorationpropertycomp"
})
@XmlRootElement(name = "dynamictablestyle")
public class Dynamictablestyle {

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
    @XmlAttribute(name = "tablename", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tablename;
    @XmlAttribute(name = "defaultconfiguration")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultconfiguration;
    @XmlAttribute(name = "celltextfontstyleref")
    @XmlIDREF
    protected Object celltextfontstyleref;
    @XmlAttribute(name = "headertextfontstyleref")
    @XmlIDREF
    protected Object headertextfontstyleref;
    @XmlAttribute(name = "columnheadershown")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String columnheadershown;
    @XmlAttribute(name = "maxrows")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxrows;
    @XmlAttribute(name = "maxcolumns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxcolumns;
    @XmlAttribute(name = "autoadjustrows")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoadjustrows;
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
    @XmlAttribute(name = "hideemptyrow")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hideemptyrow;
    @XmlAttribute(name = "referenceurl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String referenceurl;
    @XmlAttribute(name = "coftype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String coftype;
    @XmlAttribute(name = "tabledirection")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tabledirection;
    @XmlAttribute(name = "gridcolor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String gridcolor;
    @XmlAttribute(name = "titletextfontstyleref")
    @XmlIDREF
    protected Object titletextfontstyleref;
    @XmlAttribute(name = "titlejustification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String titlejustification;
    @XmlAttribute(name = "opaque")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String opaque;
    @XmlAttribute(name = "wraptitletext")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wraptitletext;
    @XmlAttribute(name = "maintainaspectratio")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String maintainaspectratio;
    @XmlElements({
        @XmlElement(name = "supplementarydecorationsetcolumntype", type = Supplementarydecorationsetcolumntype.class),
        @XmlElement(name = "supplementarycustomcolumntype", type = Supplementarycustomcolumntype.class),
        @XmlElement(name = "supplementarypropertycolumntype", type = Supplementarypropertycolumntype.class)
    })
    protected List<Object> supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype;
    @XmlElements({
        @XmlElement(name = "supplementarydecorationsetcolumnstyle", type = Supplementarydecorationsetcolumnstyle.class),
        @XmlElement(name = "supplementarycustomcolumnstyle", type = Supplementarycustomcolumnstyle.class),
        @XmlElement(name = "supplementarypropertycolumnstyle", type = Supplementarypropertycolumnstyle.class),
        @XmlElement(name = "columnstyle", type = Columnstyle.class)
    })
    protected List<Object> supplementarydecorationsetcolumnstyleOrSupplementarycustomcolumnstyleOrSupplementarypropertycolumnstyleOrColumnstyle;
    protected List<Headerrowstyle> headerrowstyle;
    protected Decorationpropertycomp decorationpropertycomp;

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
     * Gets the value of the tablename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * Sets the value of the tablename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTablename(String value) {
        this.tablename = value;
    }

    /**
     * Gets the value of the defaultconfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultconfiguration() {
        if (defaultconfiguration == null) {
            return "true";
        } else {
            return defaultconfiguration;
        }
    }

    /**
     * Sets the value of the defaultconfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultconfiguration(String value) {
        this.defaultconfiguration = value;
    }

    /**
     * Gets the value of the celltextfontstyleref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCelltextfontstyleref() {
        return celltextfontstyleref;
    }

    /**
     * Sets the value of the celltextfontstyleref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCelltextfontstyleref(Object value) {
        this.celltextfontstyleref = value;
    }

    /**
     * Gets the value of the headertextfontstyleref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHeadertextfontstyleref() {
        return headertextfontstyleref;
    }

    /**
     * Sets the value of the headertextfontstyleref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHeadertextfontstyleref(Object value) {
        this.headertextfontstyleref = value;
    }

    /**
     * Gets the value of the columnheadershown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnheadershown() {
        if (columnheadershown == null) {
            return "true";
        } else {
            return columnheadershown;
        }
    }

    /**
     * Sets the value of the columnheadershown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnheadershown(String value) {
        this.columnheadershown = value;
    }

    /**
     * Gets the value of the maxrows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxrows() {
        return maxrows;
    }

    /**
     * Sets the value of the maxrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxrows(String value) {
        this.maxrows = value;
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
     * Gets the value of the autoadjustrows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoadjustrows() {
        if (autoadjustrows == null) {
            return "false";
        } else {
            return autoadjustrows;
        }
    }

    /**
     * Sets the value of the autoadjustrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoadjustrows(String value) {
        this.autoadjustrows = value;
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
     * Gets the value of the hideemptyrow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideemptyrow() {
        if (hideemptyrow == null) {
            return "false";
        } else {
            return hideemptyrow;
        }
    }

    /**
     * Sets the value of the hideemptyrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideemptyrow(String value) {
        this.hideemptyrow = value;
    }

    /**
     * Gets the value of the referenceurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceurl() {
        return referenceurl;
    }

    /**
     * Sets the value of the referenceurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceurl(String value) {
        this.referenceurl = value;
    }

    /**
     * Gets the value of the coftype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoftype() {
        return coftype;
    }

    /**
     * Sets the value of the coftype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoftype(String value) {
        this.coftype = value;
    }

    /**
     * Gets the value of the tabledirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabledirection() {
        if (tabledirection == null) {
            return "true";
        } else {
            return tabledirection;
        }
    }

    /**
     * Sets the value of the tabledirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabledirection(String value) {
        this.tabledirection = value;
    }

    /**
     * Gets the value of the gridcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridcolor() {
        return gridcolor;
    }

    /**
     * Sets the value of the gridcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridcolor(String value) {
        this.gridcolor = value;
    }

    /**
     * Gets the value of the titletextfontstyleref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTitletextfontstyleref() {
        return titletextfontstyleref;
    }

    /**
     * Sets the value of the titletextfontstyleref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTitletextfontstyleref(Object value) {
        this.titletextfontstyleref = value;
    }

    /**
     * Gets the value of the titlejustification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlejustification() {
        return titlejustification;
    }

    /**
     * Sets the value of the titlejustification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlejustification(String value) {
        this.titlejustification = value;
    }

    /**
     * Gets the value of the opaque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpaque() {
        if (opaque == null) {
            return "false";
        } else {
            return opaque;
        }
    }

    /**
     * Sets the value of the opaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpaque(String value) {
        this.opaque = value;
    }

    /**
     * Gets the value of the wraptitletext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWraptitletext() {
        if (wraptitletext == null) {
            return "false";
        } else {
            return wraptitletext;
        }
    }

    /**
     * Sets the value of the wraptitletext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWraptitletext(String value) {
        this.wraptitletext = value;
    }

    /**
     * Gets the value of the maintainaspectratio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintainaspectratio() {
        if (maintainaspectratio == null) {
            return "true";
        } else {
            return maintainaspectratio;
        }
    }

    /**
     * Sets the value of the maintainaspectratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintainaspectratio(String value) {
        this.maintainaspectratio = value;
    }

    /**
     * Gets the value of the supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplementarydecorationsetcolumntype }
     * {@link Supplementarycustomcolumntype }
     * {@link Supplementarypropertycolumntype }
     * 
     * 
     */
    public List<Object> getSupplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype() {
        if (supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype == null) {
            supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype = new ArrayList<Object>();
        }
        return this.supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype;
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
     * Gets the value of the headerrowstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerrowstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderrowstyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Headerrowstyle }
     * 
     * 
     */
    public List<Headerrowstyle> getHeaderrowstyle() {
        if (headerrowstyle == null) {
            headerrowstyle = new ArrayList<Headerrowstyle>();
        }
        return this.headerrowstyle;
    }

    /**
     * Gets the value of the decorationpropertycomp property.
     * 
     * @return
     *     possible object is
     *     {@link Decorationpropertycomp }
     *     
     */
    public Decorationpropertycomp getDecorationpropertycomp() {
        return decorationpropertycomp;
    }

    /**
     * Sets the value of the decorationpropertycomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decorationpropertycomp }
     *     
     */
    public void setDecorationpropertycomp(Decorationpropertycomp value) {
        this.decorationpropertycomp = value;
    }

}
