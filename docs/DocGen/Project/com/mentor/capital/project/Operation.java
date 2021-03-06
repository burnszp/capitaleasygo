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
    "operationfiltercondition",
    "operationadditionalcomponent",
    "operationpostfiltercondition",
    "sbomtaskinstancelist",
    "workbooktemplateinstanlist"
})
@XmlRootElement(name = "operation")
public class Operation {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "index", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String index;
    @XmlAttribute(name = "enabled")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String enabled;
    @XmlAttribute(name = "pluginref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pluginref;
    @XmlAttribute(name = "pluginver", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pluginver;
    @XmlAttribute(name = "params")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String params;
    @XmlAttribute(name = "iskit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iskit;
    @XmlAttribute(name = "shouldincludenonbomobject")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shouldincludenonbomobject;
    protected List<Operationfiltercondition> operationfiltercondition;
    protected List<Operationadditionalcomponent> operationadditionalcomponent;
    protected List<Operationpostfiltercondition> operationpostfiltercondition;
    protected Sbomtaskinstancelist sbomtaskinstancelist;
    protected Workbooktemplateinstanlist workbooktemplateinstanlist;

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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the pluginref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginref() {
        return pluginref;
    }

    /**
     * Sets the value of the pluginref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginref(String value) {
        this.pluginref = value;
    }

    /**
     * Gets the value of the pluginver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluginver() {
        return pluginver;
    }

    /**
     * Sets the value of the pluginver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluginver(String value) {
        this.pluginver = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParams(String value) {
        this.params = value;
    }

    /**
     * Gets the value of the iskit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIskit() {
        if (iskit == null) {
            return "false";
        } else {
            return iskit;
        }
    }

    /**
     * Sets the value of the iskit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIskit(String value) {
        this.iskit = value;
    }

    /**
     * Gets the value of the shouldincludenonbomobject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShouldincludenonbomobject() {
        if (shouldincludenonbomobject == null) {
            return "false";
        } else {
            return shouldincludenonbomobject;
        }
    }

    /**
     * Sets the value of the shouldincludenonbomobject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShouldincludenonbomobject(String value) {
        this.shouldincludenonbomobject = value;
    }

    /**
     * Gets the value of the operationfiltercondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationfiltercondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationfiltercondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operationfiltercondition }
     * 
     * 
     */
    public List<Operationfiltercondition> getOperationfiltercondition() {
        if (operationfiltercondition == null) {
            operationfiltercondition = new ArrayList<Operationfiltercondition>();
        }
        return this.operationfiltercondition;
    }

    /**
     * Gets the value of the operationadditionalcomponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationadditionalcomponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationadditionalcomponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operationadditionalcomponent }
     * 
     * 
     */
    public List<Operationadditionalcomponent> getOperationadditionalcomponent() {
        if (operationadditionalcomponent == null) {
            operationadditionalcomponent = new ArrayList<Operationadditionalcomponent>();
        }
        return this.operationadditionalcomponent;
    }

    /**
     * Gets the value of the operationpostfiltercondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationpostfiltercondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationpostfiltercondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operationpostfiltercondition }
     * 
     * 
     */
    public List<Operationpostfiltercondition> getOperationpostfiltercondition() {
        if (operationpostfiltercondition == null) {
            operationpostfiltercondition = new ArrayList<Operationpostfiltercondition>();
        }
        return this.operationpostfiltercondition;
    }

    /**
     * Gets the value of the sbomtaskinstancelist property.
     * 
     * @return
     *     possible object is
     *     {@link Sbomtaskinstancelist }
     *     
     */
    public Sbomtaskinstancelist getSbomtaskinstancelist() {
        return sbomtaskinstancelist;
    }

    /**
     * Sets the value of the sbomtaskinstancelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sbomtaskinstancelist }
     *     
     */
    public void setSbomtaskinstancelist(Sbomtaskinstancelist value) {
        this.sbomtaskinstancelist = value;
    }

    /**
     * Gets the value of the workbooktemplateinstanlist property.
     * 
     * @return
     *     possible object is
     *     {@link Workbooktemplateinstanlist }
     *     
     */
    public Workbooktemplateinstanlist getWorkbooktemplateinstanlist() {
        return workbooktemplateinstanlist;
    }

    /**
     * Sets the value of the workbooktemplateinstanlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Workbooktemplateinstanlist }
     *     
     */
    public void setWorkbooktemplateinstanlist(Workbooktemplateinstanlist value) {
        this.workbooktemplateinstanlist = value;
    }

}
