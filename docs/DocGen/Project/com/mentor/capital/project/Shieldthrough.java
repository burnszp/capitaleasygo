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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shieldThroughNode"
})
@XmlRootElement(name = "shieldthrough")
public class Shieldthrough {

    @XmlAttribute(name = "shield_id", required = true)
    @XmlIDREF
    protected Object shieldId;
    @XmlAttribute(name = "signalref")
    @XmlIDREF
    protected Object signalref;
    @XmlElement(name = "shield_through_node")
    protected List<ShieldThroughNode> shieldThroughNode;

    /**
     * Gets the value of the shieldId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getShieldId() {
        return shieldId;
    }

    /**
     * Sets the value of the shieldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setShieldId(Object value) {
        this.shieldId = value;
    }

    /**
     * Gets the value of the signalref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSignalref() {
        return signalref;
    }

    /**
     * Sets the value of the signalref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSignalref(Object value) {
        this.signalref = value;
    }

    /**
     * Gets the value of the shieldThroughNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shieldThroughNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShieldThroughNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShieldThroughNode }
     * 
     * 
     */
    public List<ShieldThroughNode> getShieldThroughNode() {
        if (shieldThroughNode == null) {
            shieldThroughNode = new ArrayList<ShieldThroughNode>();
        }
        return this.shieldThroughNode;
    }

}
