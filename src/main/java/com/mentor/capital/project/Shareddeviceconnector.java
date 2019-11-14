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
    "advnameidx",
    "sharedpinOrPropertyOrDcpinmap",
    "svmodelmapping"
})
@XmlRootElement(name = "shareddeviceconnector")
public class Shareddeviceconnector {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "shortdescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shortdescription;
    @XmlAttribute(name = "libraryref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String libraryref;
    @XmlAttribute(name = "partnumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partnumber;
    @XmlAttribute(name = "partrevision")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partrevision;
    @XmlAttribute(name = "customerpartnumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customerpartnumber;
    @XmlAttribute(name = "customername")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customername;
    @XmlAttribute(name = "supplierpartnumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String supplierpartnumber;
    @XmlAttribute(name = "suppliername")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String suppliername;
    @XmlAttribute(name = "incbom")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String incbom;
    @XmlAttribute(name = "optionexpression")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optionexpression;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "analysismodel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String analysismodel;
    @XmlAttribute(name = "analysisfunctionrealiser")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String analysisfunctionrealiser;
    @XmlAttribute(name = "generatedname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String generatedname;
    @XmlAttribute(name = "harness")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String harness;
    @XmlAttribute(name = "connectorusage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String connectorusage;
    @XmlAttribute(name = "weight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String weight;
    @XmlAttribute(name = "architecturalcost")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String architecturalcost;
    @XmlAttribute(name = "termmatref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String termmatref;
    @XmlAttribute(name = "issealed")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issealed;
    @XmlAttribute(name = "isplugged")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isplugged;
    @XmlAttribute(name = "isgreased")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isgreased;
    @XmlAttribute(name = "partdesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partdesc;
    @XmlAttribute(name = "colorcode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String colorcode;
    @XmlAttribute(name = "colordesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String colordesc;
    @XmlAttribute(name = "unitofmeasure")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unitofmeasure;
    @XmlAttribute(name = "materialcode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String materialcode;
    @XmlAttribute(name = "matcodedesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String matcodedesc;
    @XmlAttribute(name = "typecode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typecode;
    @XmlAttribute(name = "typecodedesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typecodedesc;
    @XmlAttribute(name = "groupname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String groupname;
    @XmlAttribute(name = "overriddenanalysisinterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String overriddenanalysisinterface;
    @XmlAttribute(name = "overriddenanalysisfailuremode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String overriddenanalysisfailuremode;
    protected List<Advnameidx> advnameidx;
    @XmlElements({
        @XmlElement(name = "sharedpin", type = Sharedpin.class),
        @XmlElement(name = "property", type = Property.class),
        @XmlElement(name = "dcpinmap", type = Dcpinmap.class)
    })
    protected List<Object> sharedpinOrPropertyOrDcpinmap;
    protected List<Svmodelmapping> svmodelmapping;

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
     * Gets the value of the libraryref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryref() {
        return libraryref;
    }

    /**
     * Sets the value of the libraryref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryref(String value) {
        this.libraryref = value;
    }

    /**
     * Gets the value of the partnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnumber() {
        return partnumber;
    }

    /**
     * Sets the value of the partnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnumber(String value) {
        this.partnumber = value;
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
     * Gets the value of the customerpartnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerpartnumber() {
        return customerpartnumber;
    }

    /**
     * Sets the value of the customerpartnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerpartnumber(String value) {
        this.customerpartnumber = value;
    }

    /**
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomername(String value) {
        this.customername = value;
    }

    /**
     * Gets the value of the supplierpartnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierpartnumber() {
        return supplierpartnumber;
    }

    /**
     * Sets the value of the supplierpartnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierpartnumber(String value) {
        this.supplierpartnumber = value;
    }

    /**
     * Gets the value of the suppliername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppliername() {
        return suppliername;
    }

    /**
     * Sets the value of the suppliername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppliername(String value) {
        this.suppliername = value;
    }

    /**
     * Gets the value of the incbom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncbom() {
        return incbom;
    }

    /**
     * Sets the value of the incbom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncbom(String value) {
        this.incbom = value;
    }

    /**
     * Gets the value of the optionexpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionexpression() {
        return optionexpression;
    }

    /**
     * Sets the value of the optionexpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionexpression(String value) {
        this.optionexpression = value;
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
     * Gets the value of the analysismodel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysismodel() {
        return analysismodel;
    }

    /**
     * Sets the value of the analysismodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysismodel(String value) {
        this.analysismodel = value;
    }

    /**
     * Gets the value of the analysisfunctionrealiser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisfunctionrealiser() {
        return analysisfunctionrealiser;
    }

    /**
     * Sets the value of the analysisfunctionrealiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisfunctionrealiser(String value) {
        this.analysisfunctionrealiser = value;
    }

    /**
     * Gets the value of the generatedname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratedname() {
        return generatedname;
    }

    /**
     * Sets the value of the generatedname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratedname(String value) {
        this.generatedname = value;
    }

    /**
     * Gets the value of the harness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarness() {
        return harness;
    }

    /**
     * Sets the value of the harness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarness(String value) {
        this.harness = value;
    }

    /**
     * Gets the value of the connectorusage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorusage() {
        return connectorusage;
    }

    /**
     * Sets the value of the connectorusage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorusage(String value) {
        this.connectorusage = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        if (weight == null) {
            return "0";
        } else {
            return weight;
        }
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the architecturalcost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecturalcost() {
        if (architecturalcost == null) {
            return "0";
        } else {
            return architecturalcost;
        }
    }

    /**
     * Sets the value of the architecturalcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecturalcost(String value) {
        this.architecturalcost = value;
    }

    /**
     * Gets the value of the termmatref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermmatref() {
        return termmatref;
    }

    /**
     * Sets the value of the termmatref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermmatref(String value) {
        this.termmatref = value;
    }

    /**
     * Gets the value of the issealed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssealed() {
        if (issealed == null) {
            return "false";
        } else {
            return issealed;
        }
    }

    /**
     * Sets the value of the issealed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssealed(String value) {
        this.issealed = value;
    }

    /**
     * Gets the value of the isplugged property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsplugged() {
        if (isplugged == null) {
            return "false";
        } else {
            return isplugged;
        }
    }

    /**
     * Sets the value of the isplugged property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsplugged(String value) {
        this.isplugged = value;
    }

    /**
     * Gets the value of the isgreased property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsgreased() {
        if (isgreased == null) {
            return "false";
        } else {
            return isgreased;
        }
    }

    /**
     * Sets the value of the isgreased property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsgreased(String value) {
        this.isgreased = value;
    }

    /**
     * Gets the value of the partdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartdesc() {
        return partdesc;
    }

    /**
     * Sets the value of the partdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartdesc(String value) {
        this.partdesc = value;
    }

    /**
     * Gets the value of the colorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorcode() {
        return colorcode;
    }

    /**
     * Sets the value of the colorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorcode(String value) {
        this.colorcode = value;
    }

    /**
     * Gets the value of the colordesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColordesc() {
        return colordesc;
    }

    /**
     * Sets the value of the colordesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColordesc(String value) {
        this.colordesc = value;
    }

    /**
     * Gets the value of the unitofmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofmeasure() {
        return unitofmeasure;
    }

    /**
     * Sets the value of the unitofmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofmeasure(String value) {
        this.unitofmeasure = value;
    }

    /**
     * Gets the value of the materialcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialcode() {
        return materialcode;
    }

    /**
     * Sets the value of the materialcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialcode(String value) {
        this.materialcode = value;
    }

    /**
     * Gets the value of the matcodedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatcodedesc() {
        return matcodedesc;
    }

    /**
     * Sets the value of the matcodedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatcodedesc(String value) {
        this.matcodedesc = value;
    }

    /**
     * Gets the value of the typecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypecode() {
        return typecode;
    }

    /**
     * Sets the value of the typecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypecode(String value) {
        this.typecode = value;
    }

    /**
     * Gets the value of the typecodedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypecodedesc() {
        return typecodedesc;
    }

    /**
     * Sets the value of the typecodedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypecodedesc(String value) {
        this.typecodedesc = value;
    }

    /**
     * Gets the value of the groupname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * Sets the value of the groupname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupname(String value) {
        this.groupname = value;
    }

    /**
     * Gets the value of the overriddenanalysisinterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverriddenanalysisinterface() {
        return overriddenanalysisinterface;
    }

    /**
     * Sets the value of the overriddenanalysisinterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverriddenanalysisinterface(String value) {
        this.overriddenanalysisinterface = value;
    }

    /**
     * Gets the value of the overriddenanalysisfailuremode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverriddenanalysisfailuremode() {
        return overriddenanalysisfailuremode;
    }

    /**
     * Sets the value of the overriddenanalysisfailuremode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverriddenanalysisfailuremode(String value) {
        this.overriddenanalysisfailuremode = value;
    }

    /**
     * Gets the value of the advnameidx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advnameidx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvnameidx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Advnameidx }
     * 
     * 
     */
    public List<Advnameidx> getAdvnameidx() {
        if (advnameidx == null) {
            advnameidx = new ArrayList<Advnameidx>();
        }
        return this.advnameidx;
    }

    /**
     * Gets the value of the sharedpinOrPropertyOrDcpinmap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedpinOrPropertyOrDcpinmap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedpinOrPropertyOrDcpinmap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sharedpin }
     * {@link Property }
     * {@link Dcpinmap }
     * 
     * 
     */
    public List<Object> getSharedpinOrPropertyOrDcpinmap() {
        if (sharedpinOrPropertyOrDcpinmap == null) {
            sharedpinOrPropertyOrDcpinmap = new ArrayList<Object>();
        }
        return this.sharedpinOrPropertyOrDcpinmap;
    }

    /**
     * Gets the value of the svmodelmapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svmodelmapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvmodelmapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Svmodelmapping }
     * 
     * 
     */
    public List<Svmodelmapping> getSvmodelmapping() {
        if (svmodelmapping == null) {
            svmodelmapping = new ArrayList<Svmodelmapping>();
        }
        return this.svmodelmapping;
    }

}
