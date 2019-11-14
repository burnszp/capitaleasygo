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
    "rule",
    "property",
    "designoptions",
    "designtags",
    "designnamemgr",
    "designsharedusagemgr",
    "designwideusagemgr",
    "connectivity",
    "diagram",
    "interconnectsourceinfo",
    "generationsourceinfomgr",
    "scopecode",
    "designsignature",
    "linkcontainer",
    "customdesigndata"
})
@XmlRootElement(name = "functiondesign")
public class Functiondesign {

    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "shortdescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shortdescription;
    @XmlAttribute(name = "analysissubsystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String analysissubsystem;
    @XmlAttribute(name = "description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "releaselevelref", required = true)
    @XmlIDREF
    protected Object releaselevelref;
    @XmlAttribute(name = "designabstraction")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String designabstraction;
    @XmlAttribute(name = "created")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String created;
    @XmlAttribute(name = "author")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String author;
    @XmlAttribute(name = "modificationtimestamp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modificationtimestamp;
    @XmlAttribute(name = "modificationuser")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modificationuser;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "generated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String generated;
    @XmlAttribute(name = "optionexpression")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optionexpression;
    @XmlAttribute(name = "domainref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String domainref;
    @XmlAttribute(name = "domainname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String domainname;
    @XmlAttribute(name = "allowschemlessconnectivity")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String allowschemlessconnectivity;
    @XmlAttribute(name = "symbolsdeduplicated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String symbolsdeduplicated;
    @XmlAttribute(name = "evaluationcriteria")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String evaluationcriteria;
    @XmlAttribute(name = "folderpath")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String folderpath;
    @XmlAttribute(name = "importtimestamp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String importtimestamp;
    @XmlAttribute(name = "dtdversion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dtdversion;
    protected Rule rule;
    protected List<Property> property;
    protected Designoptions designoptions;
    protected Designtags designtags;
    protected Designnamemgr designnamemgr;
    protected Designsharedusagemgr designsharedusagemgr;
    protected Designwideusagemgr designwideusagemgr;
    @XmlElement(required = true)
    protected Connectivity connectivity;
    protected List<Diagram> diagram;
    protected Interconnectsourceinfo interconnectsourceinfo;
    protected Generationsourceinfomgr generationsourceinfomgr;
    protected List<Scopecode> scopecode;
    protected List<Designsignature> designsignature;
    protected Linkcontainer linkcontainer;
    protected List<Customdesigndata> customdesigndata;

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
     * Gets the value of the analysissubsystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysissubsystem() {
        return analysissubsystem;
    }

    /**
     * Sets the value of the analysissubsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysissubsystem(String value) {
        this.analysissubsystem = value;
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
     * Gets the value of the releaselevelref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReleaselevelref() {
        return releaselevelref;
    }

    /**
     * Sets the value of the releaselevelref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReleaselevelref(Object value) {
        this.releaselevelref = value;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the modificationtimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationtimestamp() {
        return modificationtimestamp;
    }

    /**
     * Sets the value of the modificationtimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationtimestamp(String value) {
        this.modificationtimestamp = value;
    }

    /**
     * Gets the value of the modificationuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationuser() {
        return modificationuser;
    }

    /**
     * Sets the value of the modificationuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationuser(String value) {
        this.modificationuser = value;
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
     * Gets the value of the generated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerated() {
        if (generated == null) {
            return "false";
        } else {
            return generated;
        }
    }

    /**
     * Sets the value of the generated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerated(String value) {
        this.generated = value;
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
     * Gets the value of the domainref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainref() {
        return domainref;
    }

    /**
     * Sets the value of the domainref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainref(String value) {
        this.domainref = value;
    }

    /**
     * Gets the value of the domainname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainname() {
        return domainname;
    }

    /**
     * Sets the value of the domainname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainname(String value) {
        this.domainname = value;
    }

    /**
     * Gets the value of the allowschemlessconnectivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowschemlessconnectivity() {
        if (allowschemlessconnectivity == null) {
            return "false";
        } else {
            return allowschemlessconnectivity;
        }
    }

    /**
     * Sets the value of the allowschemlessconnectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowschemlessconnectivity(String value) {
        this.allowschemlessconnectivity = value;
    }

    /**
     * Gets the value of the symbolsdeduplicated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolsdeduplicated() {
        if (symbolsdeduplicated == null) {
            return "false";
        } else {
            return symbolsdeduplicated;
        }
    }

    /**
     * Sets the value of the symbolsdeduplicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolsdeduplicated(String value) {
        this.symbolsdeduplicated = value;
    }

    /**
     * Gets the value of the evaluationcriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationcriteria() {
        return evaluationcriteria;
    }

    /**
     * Sets the value of the evaluationcriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationcriteria(String value) {
        this.evaluationcriteria = value;
    }

    /**
     * Gets the value of the folderpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderpath() {
        return folderpath;
    }

    /**
     * Sets the value of the folderpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderpath(String value) {
        this.folderpath = value;
    }

    /**
     * Gets the value of the importtimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporttimestamp() {
        return importtimestamp;
    }

    /**
     * Sets the value of the importtimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporttimestamp(String value) {
        this.importtimestamp = value;
    }

    /**
     * Gets the value of the dtdversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtdversion() {
        return dtdversion;
    }

    /**
     * Sets the value of the dtdversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtdversion(String value) {
        this.dtdversion = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link Rule }
     *     
     */
    public Rule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rule }
     *     
     */
    public void setRule(Rule value) {
        this.rule = value;
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
     * Gets the value of the designoptions property.
     * 
     * @return
     *     possible object is
     *     {@link Designoptions }
     *     
     */
    public Designoptions getDesignoptions() {
        return designoptions;
    }

    /**
     * Sets the value of the designoptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designoptions }
     *     
     */
    public void setDesignoptions(Designoptions value) {
        this.designoptions = value;
    }

    /**
     * Gets the value of the designtags property.
     * 
     * @return
     *     possible object is
     *     {@link Designtags }
     *     
     */
    public Designtags getDesigntags() {
        return designtags;
    }

    /**
     * Sets the value of the designtags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designtags }
     *     
     */
    public void setDesigntags(Designtags value) {
        this.designtags = value;
    }

    /**
     * Gets the value of the designnamemgr property.
     * 
     * @return
     *     possible object is
     *     {@link Designnamemgr }
     *     
     */
    public Designnamemgr getDesignnamemgr() {
        return designnamemgr;
    }

    /**
     * Sets the value of the designnamemgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designnamemgr }
     *     
     */
    public void setDesignnamemgr(Designnamemgr value) {
        this.designnamemgr = value;
    }

    /**
     * Gets the value of the designsharedusagemgr property.
     * 
     * @return
     *     possible object is
     *     {@link Designsharedusagemgr }
     *     
     */
    public Designsharedusagemgr getDesignsharedusagemgr() {
        return designsharedusagemgr;
    }

    /**
     * Sets the value of the designsharedusagemgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designsharedusagemgr }
     *     
     */
    public void setDesignsharedusagemgr(Designsharedusagemgr value) {
        this.designsharedusagemgr = value;
    }

    /**
     * Gets the value of the designwideusagemgr property.
     * 
     * @return
     *     possible object is
     *     {@link Designwideusagemgr }
     *     
     */
    public Designwideusagemgr getDesignwideusagemgr() {
        return designwideusagemgr;
    }

    /**
     * Sets the value of the designwideusagemgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Designwideusagemgr }
     *     
     */
    public void setDesignwideusagemgr(Designwideusagemgr value) {
        this.designwideusagemgr = value;
    }

    /**
     * Gets the value of the connectivity property.
     * 
     * @return
     *     possible object is
     *     {@link Connectivity }
     *     
     */
    public Connectivity getConnectivity() {
        return connectivity;
    }

    /**
     * Sets the value of the connectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connectivity }
     *     
     */
    public void setConnectivity(Connectivity value) {
        this.connectivity = value;
    }

    /**
     * Gets the value of the diagram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Diagram }
     * 
     * 
     */
    public List<Diagram> getDiagram() {
        if (diagram == null) {
            diagram = new ArrayList<Diagram>();
        }
        return this.diagram;
    }

    /**
     * Gets the value of the interconnectsourceinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Interconnectsourceinfo }
     *     
     */
    public Interconnectsourceinfo getInterconnectsourceinfo() {
        return interconnectsourceinfo;
    }

    /**
     * Sets the value of the interconnectsourceinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interconnectsourceinfo }
     *     
     */
    public void setInterconnectsourceinfo(Interconnectsourceinfo value) {
        this.interconnectsourceinfo = value;
    }

    /**
     * Gets the value of the generationsourceinfomgr property.
     * 
     * @return
     *     possible object is
     *     {@link Generationsourceinfomgr }
     *     
     */
    public Generationsourceinfomgr getGenerationsourceinfomgr() {
        return generationsourceinfomgr;
    }

    /**
     * Sets the value of the generationsourceinfomgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Generationsourceinfomgr }
     *     
     */
    public void setGenerationsourceinfomgr(Generationsourceinfomgr value) {
        this.generationsourceinfomgr = value;
    }

    /**
     * Gets the value of the scopecode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopecode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScopecode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scopecode }
     * 
     * 
     */
    public List<Scopecode> getScopecode() {
        if (scopecode == null) {
            scopecode = new ArrayList<Scopecode>();
        }
        return this.scopecode;
    }

    /**
     * Gets the value of the designsignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designsignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignsignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Designsignature }
     * 
     * 
     */
    public List<Designsignature> getDesignsignature() {
        if (designsignature == null) {
            designsignature = new ArrayList<Designsignature>();
        }
        return this.designsignature;
    }

    /**
     * Gets the value of the linkcontainer property.
     * 
     * @return
     *     possible object is
     *     {@link Linkcontainer }
     *     
     */
    public Linkcontainer getLinkcontainer() {
        return linkcontainer;
    }

    /**
     * Sets the value of the linkcontainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkcontainer }
     *     
     */
    public void setLinkcontainer(Linkcontainer value) {
        this.linkcontainer = value;
    }

    /**
     * Gets the value of the customdesigndata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customdesigndata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomdesigndata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customdesigndata }
     * 
     * 
     */
    public List<Customdesigndata> getCustomdesigndata() {
        if (customdesigndata == null) {
            customdesigndata = new ArrayList<Customdesigndata>();
        }
        return this.customdesigndata;
    }

}