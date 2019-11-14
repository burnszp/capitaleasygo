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
    "advnameidx",
    "sharedconductormember",
    "sharedmulticoremember",
    "sharedindicatortype",
    "property",
    "objtag",
    "svmodelmapping"
})
@XmlRootElement(name = "sharedmulticore")
public class Sharedmulticore {

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
    @XmlAttribute(name = "revision")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String revision;
    @XmlAttribute(name = "owner")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String owner;
    @XmlAttribute(name = "shield")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shield;
    @XmlAttribute(name = "isoverbraid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isoverbraid;
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
    @XmlAttribute(name = "optionexpression")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optionexpression;
    @XmlAttribute(name = "outsidediameter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String outsidediameter;
    @XmlAttribute(name = "osspec")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String osspec;
    @XmlAttribute(name = "oscol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String oscol;
    @XmlAttribute(name = "osmaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String osmaterial;
    @XmlAttribute(name = "sheathtype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sheathtype;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "isfrozen")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isfrozen;
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
    @XmlAttribute(name = "generationtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String generationtype;
    @XmlAttribute(name = "designabstraction")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String designabstraction;
    @XmlAttribute(name = "generatedname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String generatedname;
    @XmlAttribute(name = "harness")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String harness;
    @XmlAttribute(name = "module")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String module;
    @XmlAttribute(name = "weight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String weight;
    @XmlAttribute(name = "architecturalcost")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String architecturalcost;
    @XmlAttribute(name = "incbom")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String incbom;
    @XmlAttribute(name = "partdesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partdesc;
    @XmlAttribute(name = "colordesc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String colordesc;
    @XmlAttribute(name = "unitofmeasure")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unitofmeasure;
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
    @XmlAttribute(name = "multnote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String multnote;
    @XmlAttribute(name = "lengthc1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lengthc1;
    @XmlAttribute(name = "lengthc2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lengthc2;
    @XmlAttribute(name = "lenchty1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lenchty1;
    @XmlAttribute(name = "lenchty2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lenchty2;
    @XmlAttribute(name = "lengthch")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lengthch;
    @XmlAttribute(name = "lenchtyp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lenchtyp;
    @XmlAttribute(name = "inccut")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inccut;
    @XmlAttribute(name = "custmult")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String custmult;
    @XmlAttribute(name = "overriddenanalysisinterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String overriddenanalysisinterface;
    @XmlAttribute(name = "overriddenanalysisfailuremode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String overriddenanalysisfailuremode;
    protected List<Advnameidx> advnameidx;
    protected List<Sharedconductormember> sharedconductormember;
    protected List<Sharedmulticoremember> sharedmulticoremember;
    protected Sharedindicatortype sharedindicatortype;
    protected List<Property> property;
    protected List<Objtag> objtag;
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
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the shield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShield() {
        return shield;
    }

    /**
     * Sets the value of the shield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShield(String value) {
        this.shield = value;
    }

    /**
     * Gets the value of the isoverbraid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoverbraid() {
        if (isoverbraid == null) {
            return "false";
        } else {
            return isoverbraid;
        }
    }

    /**
     * Sets the value of the isoverbraid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoverbraid(String value) {
        this.isoverbraid = value;
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
     * Gets the value of the outsidediameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsidediameter() {
        if (outsidediameter == null) {
            return "0.0";
        } else {
            return outsidediameter;
        }
    }

    /**
     * Sets the value of the outsidediameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsidediameter(String value) {
        this.outsidediameter = value;
    }

    /**
     * Gets the value of the osspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsspec() {
        return osspec;
    }

    /**
     * Sets the value of the osspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsspec(String value) {
        this.osspec = value;
    }

    /**
     * Gets the value of the oscol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscol() {
        return oscol;
    }

    /**
     * Sets the value of the oscol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscol(String value) {
        this.oscol = value;
    }

    /**
     * Gets the value of the osmaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsmaterial() {
        return osmaterial;
    }

    /**
     * Sets the value of the osmaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsmaterial(String value) {
        this.osmaterial = value;
    }

    /**
     * Gets the value of the sheathtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheathtype() {
        return sheathtype;
    }

    /**
     * Sets the value of the sheathtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheathtype(String value) {
        this.sheathtype = value;
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
     * Gets the value of the isfrozen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsfrozen() {
        if (isfrozen == null) {
            return "false";
        } else {
            return isfrozen;
        }
    }

    /**
     * Sets the value of the isfrozen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsfrozen(String value) {
        this.isfrozen = value;
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
     * Gets the value of the generationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationtype() {
        if (generationtype == null) {
            return "userdefined";
        } else {
            return generationtype;
        }
    }

    /**
     * Sets the value of the generationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationtype(String value) {
        this.generationtype = value;
    }

    /**
     * Gets the value of the designabstraction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignabstraction() {
        return designabstraction;
    }

    /**
     * Sets the value of the designabstraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignabstraction(String value) {
        this.designabstraction = value;
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
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
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
     * Gets the value of the multnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultnote() {
        return multnote;
    }

    /**
     * Sets the value of the multnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultnote(String value) {
        this.multnote = value;
    }

    /**
     * Gets the value of the lengthc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthc1() {
        return lengthc1;
    }

    /**
     * Sets the value of the lengthc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthc1(String value) {
        this.lengthc1 = value;
    }

    /**
     * Gets the value of the lengthc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthc2() {
        return lengthc2;
    }

    /**
     * Sets the value of the lengthc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthc2(String value) {
        this.lengthc2 = value;
    }

    /**
     * Gets the value of the lenchty1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenchty1() {
        return lenchty1;
    }

    /**
     * Sets the value of the lenchty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenchty1(String value) {
        this.lenchty1 = value;
    }

    /**
     * Gets the value of the lenchty2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenchty2() {
        return lenchty2;
    }

    /**
     * Sets the value of the lenchty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenchty2(String value) {
        this.lenchty2 = value;
    }

    /**
     * Gets the value of the lengthch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthch() {
        return lengthch;
    }

    /**
     * Sets the value of the lengthch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthch(String value) {
        this.lengthch = value;
    }

    /**
     * Gets the value of the lenchtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenchtyp() {
        return lenchtyp;
    }

    /**
     * Sets the value of the lenchtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenchtyp(String value) {
        this.lenchtyp = value;
    }

    /**
     * Gets the value of the inccut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInccut() {
        return inccut;
    }

    /**
     * Sets the value of the inccut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInccut(String value) {
        this.inccut = value;
    }

    /**
     * Gets the value of the custmult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustmult() {
        return custmult;
    }

    /**
     * Sets the value of the custmult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustmult(String value) {
        this.custmult = value;
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
     * Gets the value of the sharedconductormember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedconductormember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedconductormember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sharedconductormember }
     * 
     * 
     */
    public List<Sharedconductormember> getSharedconductormember() {
        if (sharedconductormember == null) {
            sharedconductormember = new ArrayList<Sharedconductormember>();
        }
        return this.sharedconductormember;
    }

    /**
     * Gets the value of the sharedmulticoremember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedmulticoremember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedmulticoremember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sharedmulticoremember }
     * 
     * 
     */
    public List<Sharedmulticoremember> getSharedmulticoremember() {
        if (sharedmulticoremember == null) {
            sharedmulticoremember = new ArrayList<Sharedmulticoremember>();
        }
        return this.sharedmulticoremember;
    }

    /**
     * Gets the value of the sharedindicatortype property.
     * 
     * @return
     *     possible object is
     *     {@link Sharedindicatortype }
     *     
     */
    public Sharedindicatortype getSharedindicatortype() {
        return sharedindicatortype;
    }

    /**
     * Sets the value of the sharedindicatortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sharedindicatortype }
     *     
     */
    public void setSharedindicatortype(Sharedindicatortype value) {
        this.sharedindicatortype = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the objtag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objtag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjtag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objtag }
     * 
     * 
     */
    public List<Objtag> getObjtag() {
        if (objtag == null) {
            objtag = new ArrayList<Objtag>();
        }
        return this.objtag;
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