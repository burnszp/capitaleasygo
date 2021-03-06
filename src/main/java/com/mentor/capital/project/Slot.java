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
    "rule",
    "connectivity",
    "connectorref",
    "hole",
    "deviceslotelementOrSpliceslotelementOrProperty",
    "toposlot"
})
@XmlRootElement(name = "slot")
public class Slot {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "nameindex")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nameindex;
    @XmlAttribute(name = "physicaltargetref")
    @XmlIDREF
    protected Object physicaltargetref;
    @XmlAttribute(name = "optionexpression")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optionexpression;
    @XmlAttribute(name = "slottype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String slottype;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "integralharness")
    @XmlIDREF
    protected Object integralharness;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    protected Rule rule;
    protected Connectivity connectivity;
    protected List<Connectorref> connectorref;
    protected List<Hole> hole;
    @XmlElements({
        @XmlElement(name = "deviceslotelement", type = Deviceslotelement.class),
        @XmlElement(name = "spliceslotelement", type = Spliceslotelement.class),
        @XmlElement(name = "property", type = Property.class)
    })
    protected List<Object> deviceslotelementOrSpliceslotelementOrProperty;
    @XmlElement(required = true)
    protected List<Toposlot> toposlot;

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
     * Gets the value of the physicaltargetref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPhysicaltargetref() {
        return physicaltargetref;
    }

    /**
     * Sets the value of the physicaltargetref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPhysicaltargetref(Object value) {
        this.physicaltargetref = value;
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
     * Gets the value of the slottype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlottype() {
        if (slottype == null) {
            return "normal";
        } else {
            return slottype;
        }
    }

    /**
     * Sets the value of the slottype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlottype(String value) {
        this.slottype = value;
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
     * Gets the value of the integralharness property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIntegralharness() {
        return integralharness;
    }

    /**
     * Sets the value of the integralharness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIntegralharness(Object value) {
        this.integralharness = value;
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
     * Gets the value of the connectorref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectorref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectorref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connectorref }
     * 
     * 
     */
    public List<Connectorref> getConnectorref() {
        if (connectorref == null) {
            connectorref = new ArrayList<Connectorref>();
        }
        return this.connectorref;
    }

    /**
     * Gets the value of the hole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hole }
     * 
     * 
     */
    public List<Hole> getHole() {
        if (hole == null) {
            hole = new ArrayList<Hole>();
        }
        return this.hole;
    }

    /**
     * Gets the value of the deviceslotelementOrSpliceslotelementOrProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceslotelementOrSpliceslotelementOrProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceslotelementOrSpliceslotelementOrProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deviceslotelement }
     * {@link Spliceslotelement }
     * {@link Property }
     * 
     * 
     */
    public List<Object> getDeviceslotelementOrSpliceslotelementOrProperty() {
        if (deviceslotelementOrSpliceslotelementOrProperty == null) {
            deviceslotelementOrSpliceslotelementOrProperty = new ArrayList<Object>();
        }
        return this.deviceslotelementOrSpliceslotelementOrProperty;
    }

    /**
     * Gets the value of the toposlot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toposlot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToposlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Toposlot }
     * 
     * 
     */
    public List<Toposlot> getToposlot() {
        if (toposlot == null) {
            toposlot = new ArrayList<Toposlot>();
        }
        return this.toposlot;
    }

}
