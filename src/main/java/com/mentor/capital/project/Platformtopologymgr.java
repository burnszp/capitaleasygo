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
    "functionallogicdesignref",
    "platformfunctionalref"
})
@XmlRootElement(name = "platformtopologymgr")
public class Platformtopologymgr {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "buildlistref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String buildlistref;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "sharedpinliststimestamp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sharedpinliststimestamp;
    @XmlAttribute(name = "sharedconductorstimestamp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sharedconductorstimestamp;
    protected List<Functionallogicdesignref> functionallogicdesignref;
    protected Platformfunctionalref platformfunctionalref;

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
     * Gets the value of the buildlistref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildlistref() {
        return buildlistref;
    }

    /**
     * Sets the value of the buildlistref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildlistref(String value) {
        this.buildlistref = value;
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
     * Gets the value of the sharedpinliststimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedpinliststimestamp() {
        return sharedpinliststimestamp;
    }

    /**
     * Sets the value of the sharedpinliststimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedpinliststimestamp(String value) {
        this.sharedpinliststimestamp = value;
    }

    /**
     * Gets the value of the sharedconductorstimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedconductorstimestamp() {
        return sharedconductorstimestamp;
    }

    /**
     * Sets the value of the sharedconductorstimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedconductorstimestamp(String value) {
        this.sharedconductorstimestamp = value;
    }

    /**
     * Gets the value of the functionallogicdesignref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionallogicdesignref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionallogicdesignref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Functionallogicdesignref }
     * 
     * 
     */
    public List<Functionallogicdesignref> getFunctionallogicdesignref() {
        if (functionallogicdesignref == null) {
            functionallogicdesignref = new ArrayList<Functionallogicdesignref>();
        }
        return this.functionallogicdesignref;
    }

    /**
     * Gets the value of the platformfunctionalref property.
     * 
     * @return
     *     possible object is
     *     {@link Platformfunctionalref }
     *     
     */
    public Platformfunctionalref getPlatformfunctionalref() {
        return platformfunctionalref;
    }

    /**
     * Sets the value of the platformfunctionalref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platformfunctionalref }
     *     
     */
    public void setPlatformfunctionalref(Platformfunctionalref value) {
        this.platformfunctionalref = value;
    }

}
