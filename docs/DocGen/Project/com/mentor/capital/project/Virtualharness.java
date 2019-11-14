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
    "rule",
    "property",
    "giveawaygroup",
    "refedoption",
    "harnesslevel",
    "connectivity",
    "phd",
    "wireendnode",
    "harnwirethrough",
    "shieldthrough",
    "topoharness"
})
@XmlRootElement(name = "virtualharness")
public class Virtualharness {

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
    @XmlAttribute(name = "nameindex")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameindex;
    @XmlAttribute(name = "fulllevelcount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fulllevelcount;
    @XmlAttribute(name = "fullmetrictype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fullmetrictype;
    @XmlAttribute(name = "fullmetricvalue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fullmetricvalue;
    @XmlAttribute(name = "optimizedmetrictype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optimizedmetrictype;
    @XmlAttribute(name = "optimizedmetricvalue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optimizedmetricvalue;
    @XmlAttribute(name = "mcadid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mcadid;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "domainref")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String domainref;
    @XmlAttribute(name = "domainname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String domainname;
    @XmlAttribute(name = "giveawaymode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String giveawaymode;
    @XmlAttribute(name = "giveawayupperlimit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String giveawayupperlimit;
    @XmlAttribute(name = "managemodules")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String managemodules;
    protected Rule rule;
    protected List<Property> property;
    protected List<Giveawaygroup> giveawaygroup;
    protected List<Refedoption> refedoption;
    protected List<Harnesslevel> harnesslevel;
    @XmlElement(required = true)
    protected Connectivity connectivity;
    @XmlElement(required = true)
    protected Phd phd;
    protected List<Wireendnode> wireendnode;
    protected List<Harnwirethrough> harnwirethrough;
    protected List<Shieldthrough> shieldthrough;
    @XmlElement(required = true)
    protected List<Topoharness> topoharness;

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
     * Gets the value of the nameindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameindex() {
        if (nameindex == null) {
            return "-1";
        } else {
            return nameindex;
        }
    }

    /**
     * Sets the value of the nameindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameindex(String value) {
        this.nameindex = value;
    }

    /**
     * Gets the value of the fulllevelcount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulllevelcount() {
        return fulllevelcount;
    }

    /**
     * Sets the value of the fulllevelcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulllevelcount(String value) {
        this.fulllevelcount = value;
    }

    /**
     * Gets the value of the fullmetrictype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullmetrictype() {
        return fullmetrictype;
    }

    /**
     * Sets the value of the fullmetrictype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullmetrictype(String value) {
        this.fullmetrictype = value;
    }

    /**
     * Gets the value of the fullmetricvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullmetricvalue() {
        return fullmetricvalue;
    }

    /**
     * Sets the value of the fullmetricvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullmetricvalue(String value) {
        this.fullmetricvalue = value;
    }

    /**
     * Gets the value of the optimizedmetrictype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptimizedmetrictype() {
        return optimizedmetrictype;
    }

    /**
     * Sets the value of the optimizedmetrictype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptimizedmetrictype(String value) {
        this.optimizedmetrictype = value;
    }

    /**
     * Gets the value of the optimizedmetricvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptimizedmetricvalue() {
        return optimizedmetricvalue;
    }

    /**
     * Sets the value of the optimizedmetricvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptimizedmetricvalue(String value) {
        this.optimizedmetricvalue = value;
    }

    /**
     * Gets the value of the mcadid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcadid() {
        return mcadid;
    }

    /**
     * Sets the value of the mcadid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcadid(String value) {
        this.mcadid = value;
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
     * Gets the value of the giveawaymode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveawaymode() {
        if (giveawaymode == null) {
            return "MANUAL";
        } else {
            return giveawaymode;
        }
    }

    /**
     * Sets the value of the giveawaymode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveawaymode(String value) {
        this.giveawaymode = value;
    }

    /**
     * Gets the value of the giveawayupperlimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveawayupperlimit() {
        return giveawayupperlimit;
    }

    /**
     * Sets the value of the giveawayupperlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveawayupperlimit(String value) {
        this.giveawayupperlimit = value;
    }

    /**
     * Gets the value of the managemodules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagemodules() {
        return managemodules;
    }

    /**
     * Sets the value of the managemodules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagemodules(String value) {
        this.managemodules = value;
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
     * Gets the value of the giveawaygroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giveawaygroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiveawaygroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Giveawaygroup }
     * 
     * 
     */
    public List<Giveawaygroup> getGiveawaygroup() {
        if (giveawaygroup == null) {
            giveawaygroup = new ArrayList<Giveawaygroup>();
        }
        return this.giveawaygroup;
    }

    /**
     * Gets the value of the refedoption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refedoption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefedoption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Refedoption }
     * 
     * 
     */
    public List<Refedoption> getRefedoption() {
        if (refedoption == null) {
            refedoption = new ArrayList<Refedoption>();
        }
        return this.refedoption;
    }

    /**
     * Gets the value of the harnesslevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the harnesslevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHarnesslevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Harnesslevel }
     * 
     * 
     */
    public List<Harnesslevel> getHarnesslevel() {
        if (harnesslevel == null) {
            harnesslevel = new ArrayList<Harnesslevel>();
        }
        return this.harnesslevel;
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
     * Gets the value of the phd property.
     * 
     * @return
     *     possible object is
     *     {@link Phd }
     *     
     */
    public Phd getPhd() {
        return phd;
    }

    /**
     * Sets the value of the phd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phd }
     *     
     */
    public void setPhd(Phd value) {
        this.phd = value;
    }

    /**
     * Gets the value of the wireendnode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireendnode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireendnode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wireendnode }
     * 
     * 
     */
    public List<Wireendnode> getWireendnode() {
        if (wireendnode == null) {
            wireendnode = new ArrayList<Wireendnode>();
        }
        return this.wireendnode;
    }

    /**
     * Gets the value of the harnwirethrough property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the harnwirethrough property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHarnwirethrough().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Harnwirethrough }
     * 
     * 
     */
    public List<Harnwirethrough> getHarnwirethrough() {
        if (harnwirethrough == null) {
            harnwirethrough = new ArrayList<Harnwirethrough>();
        }
        return this.harnwirethrough;
    }

    /**
     * Gets the value of the shieldthrough property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shieldthrough property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShieldthrough().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shieldthrough }
     * 
     * 
     */
    public List<Shieldthrough> getShieldthrough() {
        if (shieldthrough == null) {
            shieldthrough = new ArrayList<Shieldthrough>();
        }
        return this.shieldthrough;
    }

    /**
     * Gets the value of the topoharness property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topoharness property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopoharness().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Topoharness }
     * 
     * 
     */
    public List<Topoharness> getTopoharness() {
        if (topoharness == null) {
            topoharness = new ArrayList<Topoharness>();
        }
        return this.topoharness;
    }

}
