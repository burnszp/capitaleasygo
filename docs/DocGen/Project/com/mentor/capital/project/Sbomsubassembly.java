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
    "sbomsubassembly",
    "sbomtaskinstancelist"
})
@XmlRootElement(name = "sbomsubassembly")
public class Sbomsubassembly {

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
    @XmlAttribute(name = "parentsubid")
    @XmlIDREF
    protected Object parentsubid;
    @XmlAttribute(name = "internalid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String internalid;
    @XmlAttribute(name = "operationid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String operationid;
    @XmlAttribute(name = "cachedoperationname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cachedoperationname;
    @XmlAttribute(name = "sbomsubpartnumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sbomsubpartnumber;
    @XmlAttribute(name = "partrevision")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partrevision;
    @XmlAttribute(name = "object_id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String objectId;
    @XmlAttribute(name = "cachedobjecttype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cachedobjecttype;
    @XmlAttribute(name = "quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantity;
    @XmlAttribute(name = "edit_parentid")
    @XmlIDREF
    protected Object editParentid;
    @XmlAttribute(name = "edit_internalid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String editInternalid;
    @XmlAttribute(name = "edit_name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String editName;
    @XmlAttribute(name = "edit_deleted")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String editDeleted;
    @XmlAttribute(name = "edit_quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String editQuantity;
    @XmlAttribute(name = "sbompartnumberref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sbompartnumberref;
    @XmlAttribute(name = "iskit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iskit;
    @XmlAttribute(name = "edit_iskit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String editIskit;
    @XmlAttribute(name = "naturalpartnumberref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String naturalpartnumberref;
    @XmlAttribute(name = "rationalizedattrs")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rationalizedattrs;
    protected List<Sbomsubassembly> sbomsubassembly;
    protected Sbomtaskinstancelist sbomtaskinstancelist;

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
     * Gets the value of the parentsubid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParentsubid() {
        return parentsubid;
    }

    /**
     * Sets the value of the parentsubid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParentsubid(Object value) {
        this.parentsubid = value;
    }

    /**
     * Gets the value of the internalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalid() {
        return internalid;
    }

    /**
     * Sets the value of the internalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalid(String value) {
        this.internalid = value;
    }

    /**
     * Gets the value of the operationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationid() {
        return operationid;
    }

    /**
     * Sets the value of the operationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationid(String value) {
        this.operationid = value;
    }

    /**
     * Gets the value of the cachedoperationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCachedoperationname() {
        return cachedoperationname;
    }

    /**
     * Sets the value of the cachedoperationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCachedoperationname(String value) {
        this.cachedoperationname = value;
    }

    /**
     * Gets the value of the sbomsubpartnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbomsubpartnumber() {
        return sbomsubpartnumber;
    }

    /**
     * Sets the value of the sbomsubpartnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbomsubpartnumber(String value) {
        this.sbomsubpartnumber = value;
    }

    /**
     * Gets the value of the partrevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartrevision() {
        return partrevision;
    }

    /**
     * Sets the value of the partrevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartrevision(String value) {
        this.partrevision = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the cachedobjecttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCachedobjecttype() {
        return cachedobjecttype;
    }

    /**
     * Sets the value of the cachedobjecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCachedobjecttype(String value) {
        this.cachedobjecttype = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the editParentid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEditParentid() {
        return editParentid;
    }

    /**
     * Sets the value of the editParentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEditParentid(Object value) {
        this.editParentid = value;
    }

    /**
     * Gets the value of the editInternalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditInternalid() {
        return editInternalid;
    }

    /**
     * Sets the value of the editInternalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditInternalid(String value) {
        this.editInternalid = value;
    }

    /**
     * Gets the value of the editName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditName() {
        return editName;
    }

    /**
     * Sets the value of the editName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditName(String value) {
        this.editName = value;
    }

    /**
     * Gets the value of the editDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditDeleted() {
        if (editDeleted == null) {
            return "false";
        } else {
            return editDeleted;
        }
    }

    /**
     * Sets the value of the editDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditDeleted(String value) {
        this.editDeleted = value;
    }

    /**
     * Gets the value of the editQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditQuantity() {
        return editQuantity;
    }

    /**
     * Sets the value of the editQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditQuantity(String value) {
        this.editQuantity = value;
    }

    /**
     * Gets the value of the sbompartnumberref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbompartnumberref() {
        return sbompartnumberref;
    }

    /**
     * Sets the value of the sbompartnumberref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbompartnumberref(String value) {
        this.sbompartnumberref = value;
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
     * Gets the value of the editIskit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditIskit() {
        if (editIskit == null) {
            return "false";
        } else {
            return editIskit;
        }
    }

    /**
     * Sets the value of the editIskit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditIskit(String value) {
        this.editIskit = value;
    }

    /**
     * Gets the value of the naturalpartnumberref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalpartnumberref() {
        return naturalpartnumberref;
    }

    /**
     * Sets the value of the naturalpartnumberref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalpartnumberref(String value) {
        this.naturalpartnumberref = value;
    }

    /**
     * Gets the value of the rationalizedattrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRationalizedattrs() {
        return rationalizedattrs;
    }

    /**
     * Sets the value of the rationalizedattrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRationalizedattrs(String value) {
        this.rationalizedattrs = value;
    }

    /**
     * Gets the value of the sbomsubassembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbomsubassembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbomsubassembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sbomsubassembly }
     * 
     * 
     */
    public List<Sbomsubassembly> getSbomsubassembly() {
        if (sbomsubassembly == null) {
            sbomsubassembly = new ArrayList<Sbomsubassembly>();
        }
        return this.sbomsubassembly;
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

}