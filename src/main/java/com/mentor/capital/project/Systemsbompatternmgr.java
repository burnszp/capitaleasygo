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
    "sbomdatamgr",
    "sbomtaskmgr",
    "costformulamgr",
    "workbooktemplatemgr",
    "sbompattern"
})
@XmlRootElement(name = "systemsbompatternmgr")
public class Systemsbompatternmgr {

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
    @XmlElement(required = true)
    protected Sbomdatamgr sbomdatamgr;
    @XmlElement(required = true)
    protected Sbomtaskmgr sbomtaskmgr;
    @XmlElement(required = true)
    protected Costformulamgr costformulamgr;
    @XmlElement(required = true)
    protected Workbooktemplatemgr workbooktemplatemgr;
    protected List<Sbompattern> sbompattern;

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
     * Gets the value of the sbomdatamgr property.
     * 
     * @return
     *     possible object is
     *     {@link Sbomdatamgr }
     *     
     */
    public Sbomdatamgr getSbomdatamgr() {
        return sbomdatamgr;
    }

    /**
     * Sets the value of the sbomdatamgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sbomdatamgr }
     *     
     */
    public void setSbomdatamgr(Sbomdatamgr value) {
        this.sbomdatamgr = value;
    }

    /**
     * Gets the value of the sbomtaskmgr property.
     * 
     * @return
     *     possible object is
     *     {@link Sbomtaskmgr }
     *     
     */
    public Sbomtaskmgr getSbomtaskmgr() {
        return sbomtaskmgr;
    }

    /**
     * Sets the value of the sbomtaskmgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sbomtaskmgr }
     *     
     */
    public void setSbomtaskmgr(Sbomtaskmgr value) {
        this.sbomtaskmgr = value;
    }

    /**
     * Gets the value of the costformulamgr property.
     * 
     * @return
     *     possible object is
     *     {@link Costformulamgr }
     *     
     */
    public Costformulamgr getCostformulamgr() {
        return costformulamgr;
    }

    /**
     * Sets the value of the costformulamgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Costformulamgr }
     *     
     */
    public void setCostformulamgr(Costformulamgr value) {
        this.costformulamgr = value;
    }

    /**
     * Gets the value of the workbooktemplatemgr property.
     * 
     * @return
     *     possible object is
     *     {@link Workbooktemplatemgr }
     *     
     */
    public Workbooktemplatemgr getWorkbooktemplatemgr() {
        return workbooktemplatemgr;
    }

    /**
     * Sets the value of the workbooktemplatemgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Workbooktemplatemgr }
     *     
     */
    public void setWorkbooktemplatemgr(Workbooktemplatemgr value) {
        this.workbooktemplatemgr = value;
    }

    /**
     * Gets the value of the sbompattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbompattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbompattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sbompattern }
     * 
     * 
     */
    public List<Sbompattern> getSbompattern() {
        if (sbompattern == null) {
            sbompattern = new ArrayList<Sbompattern>();
        }
        return this.sbompattern;
    }

}
