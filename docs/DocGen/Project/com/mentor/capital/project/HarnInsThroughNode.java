//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:46:37 AM CST 
//


package com.mentor.capital.project;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "harn_ins_through_node")
public class HarnInsThroughNode {

    @XmlAttribute(name = "node_id", required = true)
    @XmlIDREF
    protected Object nodeId;
    @XmlAttribute(name = "through_order")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String throughOrder;
    @XmlAttribute(name = "isthrough")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isthrough;
    @XmlAttribute(name = "through_route")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String throughRoute;
    @XmlAttribute(name = "through_node")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String throughNode;
    @XmlAttribute(name = "optionexpression")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optionexpression;
    @XmlAttribute(name = "coption")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String coption;
    @XmlAttribute(name = "node1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String node1;
    @XmlAttribute(name = "route1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String route1;
    @XmlAttribute(name = "node2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String node2;
    @XmlAttribute(name = "route2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String route2;
    @XmlAttribute(name = "layer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layer;
    @XmlAttribute(name = "join_number")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String joinNumber;

    /**
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNodeId(Object value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the throughOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThroughOrder() {
        return throughOrder;
    }

    /**
     * Sets the value of the throughOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThroughOrder(String value) {
        this.throughOrder = value;
    }

    /**
     * Gets the value of the isthrough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsthrough() {
        if (isthrough == null) {
            return "0";
        } else {
            return isthrough;
        }
    }

    /**
     * Sets the value of the isthrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsthrough(String value) {
        this.isthrough = value;
    }

    /**
     * Gets the value of the throughRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThroughRoute() {
        return throughRoute;
    }

    /**
     * Sets the value of the throughRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThroughRoute(String value) {
        this.throughRoute = value;
    }

    /**
     * Gets the value of the throughNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThroughNode() {
        return throughNode;
    }

    /**
     * Sets the value of the throughNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThroughNode(String value) {
        this.throughNode = value;
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
     * Gets the value of the coption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoption() {
        return coption;
    }

    /**
     * Sets the value of the coption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoption(String value) {
        this.coption = value;
    }

    /**
     * Gets the value of the node1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode1() {
        return node1;
    }

    /**
     * Sets the value of the node1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode1(String value) {
        this.node1 = value;
    }

    /**
     * Gets the value of the route1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute1() {
        return route1;
    }

    /**
     * Sets the value of the route1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute1(String value) {
        this.route1 = value;
    }

    /**
     * Gets the value of the node2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode2() {
        return node2;
    }

    /**
     * Sets the value of the node2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode2(String value) {
        this.node2 = value;
    }

    /**
     * Gets the value of the route2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute2() {
        return route2;
    }

    /**
     * Sets the value of the route2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute2(String value) {
        this.route2 = value;
    }

    /**
     * Gets the value of the layer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayer() {
        return layer;
    }

    /**
     * Sets the value of the layer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayer(String value) {
        this.layer = value;
    }

    /**
     * Gets the value of the joinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinNumber() {
        return joinNumber;
    }

    /**
     * Sets the value of the joinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinNumber(String value) {
        this.joinNumber = value;
    }

}
