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
    "deviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction",
    "netOrWireOrShieldOrInterconnectOrFunccond",
    "highway",
    "multicore",
    "assembly"
})
@XmlRootElement(name = "connectivity")
public class Connectivity {

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
    @XmlElements({
        @XmlElement(name = "device", type = Device.class),
        @XmlElement(name = "splice", type = Splice.class),
        @XmlElement(name = "connector", type = Connector.class),
        @XmlElement(name = "grounddevice", type = Grounddevice.class),
        @XmlElement(name = "blockdevice", type = Blockdevice.class),
        @XmlElement(name = "interconnectdevice", type = Interconnectdevice.class),
        @XmlElement(name = "terminalbar", type = Terminalbar.class),
        @XmlElement(name = "function", type = Function.class)
    })
    protected List<Object> deviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction;
    @XmlElements({
        @XmlElement(name = "net", type = Net.class),
        @XmlElement(name = "wire", type = Wire.class),
        @XmlElement(name = "shield", type = Shield.class),
        @XmlElement(name = "interconnect", type = Interconnect.class),
        @XmlElement(name = "funccond", type = Funccond.class)
    })
    protected List<Object> netOrWireOrShieldOrInterconnectOrFunccond;
    protected List<Highway> highway;
    protected List<Multicore> multicore;
    protected List<Assembly> assembly;

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
     * Gets the value of the deviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Device }
     * {@link Splice }
     * {@link Connector }
     * {@link Grounddevice }
     * {@link Blockdevice }
     * {@link Interconnectdevice }
     * {@link Terminalbar }
     * {@link Function }
     * 
     * 
     */
    public List<Object> getDeviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction() {
        if (deviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction == null) {
            deviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction = new ArrayList<Object>();
        }
        return this.deviceOrSpliceOrConnectorOrGrounddeviceOrBlockdeviceOrInterconnectdeviceOrTerminalbarOrFunction;
    }

    /**
     * Gets the value of the netOrWireOrShieldOrInterconnectOrFunccond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netOrWireOrShieldOrInterconnectOrFunccond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetOrWireOrShieldOrInterconnectOrFunccond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Net }
     * {@link Wire }
     * {@link Shield }
     * {@link Interconnect }
     * {@link Funccond }
     * 
     * 
     */
    public List<Object> getNetOrWireOrShieldOrInterconnectOrFunccond() {
        if (netOrWireOrShieldOrInterconnectOrFunccond == null) {
            netOrWireOrShieldOrInterconnectOrFunccond = new ArrayList<Object>();
        }
        return this.netOrWireOrShieldOrInterconnectOrFunccond;
    }

    /**
     * Gets the value of the highway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the highway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHighway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Highway }
     * 
     * 
     */
    public List<Highway> getHighway() {
        if (highway == null) {
            highway = new ArrayList<Highway>();
        }
        return this.highway;
    }

    /**
     * Gets the value of the multicore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multicore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMulticore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Multicore }
     * 
     * 
     */
    public List<Multicore> getMulticore() {
        if (multicore == null) {
            multicore = new ArrayList<Multicore>();
        }
        return this.multicore;
    }

    /**
     * Gets the value of the assembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assembly }
     * 
     * 
     */
    public List<Assembly> getAssembly() {
        if (assembly == null) {
            assembly = new ArrayList<Assembly>();
        }
        return this.assembly;
    }

}
