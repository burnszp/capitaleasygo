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
    "sharedconductor",
    "sharedmulticore",
    "sharedhighway",
    "equivalenceset"
})
@XmlRootElement(name = "sharedconductormgr")
public class Sharedconductormgr {

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
    protected List<Sharedconductor> sharedconductor;
    protected List<Sharedmulticore> sharedmulticore;
    protected List<Sharedhighway> sharedhighway;
    protected List<Equivalenceset> equivalenceset;

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
     * Gets the value of the sharedconductor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedconductor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedconductor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sharedconductor }
     * 
     * 
     */
    public List<Sharedconductor> getSharedconductor() {
        if (sharedconductor == null) {
            sharedconductor = new ArrayList<Sharedconductor>();
        }
        return this.sharedconductor;
    }

    /**
     * Gets the value of the sharedmulticore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedmulticore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedmulticore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sharedmulticore }
     * 
     * 
     */
    public List<Sharedmulticore> getSharedmulticore() {
        if (sharedmulticore == null) {
            sharedmulticore = new ArrayList<Sharedmulticore>();
        }
        return this.sharedmulticore;
    }

    /**
     * Gets the value of the sharedhighway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedhighway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedhighway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sharedhighway }
     * 
     * 
     */
    public List<Sharedhighway> getSharedhighway() {
        if (sharedhighway == null) {
            sharedhighway = new ArrayList<Sharedhighway>();
        }
        return this.sharedhighway;
    }

    /**
     * Gets the value of the equivalenceset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivalenceset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivalenceset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equivalenceset }
     * 
     * 
     */
    public List<Equivalenceset> getEquivalenceset() {
        if (equivalenceset == null) {
            equivalenceset = new ArrayList<Equivalenceset>();
        }
        return this.equivalenceset;
    }

}
