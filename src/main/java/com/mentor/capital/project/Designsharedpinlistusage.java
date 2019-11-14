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
    "schemzone"
})
@XmlRootElement(name = "designsharedpinlistusage")
public class Designsharedpinlistusage {

    @XmlAttribute(name = "sharedpinlist")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sharedpinlist;
    @XmlAttribute(name = "associateddesign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String associateddesign;
    @XmlAttribute(name = "diagram", required = true)
    @XmlIDREF
    protected Object diagram;
    @XmlAttribute(name = "symbol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String symbol;
    @XmlAttribute(name = "symbolinstnum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String symbolinstnum;
    @XmlAttribute(name = "block")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String block;
    @XmlAttribute(name = "schempinlist", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String schempinlist;
    @XmlAttribute(name = "logicdevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logicdevice;
    @XmlAttribute(name = "logicsplice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logicsplice;
    @XmlAttribute(name = "logicconnector")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logicconnector;
    @XmlAttribute(name = "grounddevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String grounddevice;
    @XmlAttribute(name = "interconndevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String interconndevice;
    @XmlAttribute(name = "logicblockdevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logicblockdevice;
    @XmlAttribute(name = "function")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String function;
    @XmlAttribute(name = "ishome")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ishome;
    @XmlAttribute(name = "reference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reference;
    @XmlAttribute(name = "diagramname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String diagramname;
    protected List<Schemzone> schemzone;

    /**
     * Gets the value of the sharedpinlist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedpinlist() {
        return sharedpinlist;
    }

    /**
     * Sets the value of the sharedpinlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedpinlist(String value) {
        this.sharedpinlist = value;
    }

    /**
     * Gets the value of the associateddesign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateddesign() {
        return associateddesign;
    }

    /**
     * Sets the value of the associateddesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateddesign(String value) {
        this.associateddesign = value;
    }

    /**
     * Gets the value of the diagram property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDiagram() {
        return diagram;
    }

    /**
     * Sets the value of the diagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDiagram(Object value) {
        this.diagram = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the symbolinstnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolinstnum() {
        return symbolinstnum;
    }

    /**
     * Sets the value of the symbolinstnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolinstnum(String value) {
        this.symbolinstnum = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the schempinlist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchempinlist() {
        return schempinlist;
    }

    /**
     * Sets the value of the schempinlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchempinlist(String value) {
        this.schempinlist = value;
    }

    /**
     * Gets the value of the logicdevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicdevice() {
        return logicdevice;
    }

    /**
     * Sets the value of the logicdevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicdevice(String value) {
        this.logicdevice = value;
    }

    /**
     * Gets the value of the logicsplice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicsplice() {
        return logicsplice;
    }

    /**
     * Sets the value of the logicsplice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicsplice(String value) {
        this.logicsplice = value;
    }

    /**
     * Gets the value of the logicconnector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicconnector() {
        return logicconnector;
    }

    /**
     * Sets the value of the logicconnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicconnector(String value) {
        this.logicconnector = value;
    }

    /**
     * Gets the value of the grounddevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrounddevice() {
        return grounddevice;
    }

    /**
     * Sets the value of the grounddevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrounddevice(String value) {
        this.grounddevice = value;
    }

    /**
     * Gets the value of the interconndevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterconndevice() {
        return interconndevice;
    }

    /**
     * Sets the value of the interconndevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterconndevice(String value) {
        this.interconndevice = value;
    }

    /**
     * Gets the value of the logicblockdevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicblockdevice() {
        return logicblockdevice;
    }

    /**
     * Sets the value of the logicblockdevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicblockdevice(String value) {
        this.logicblockdevice = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the ishome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIshome() {
        if (ishome == null) {
            return "false";
        } else {
            return ishome;
        }
    }

    /**
     * Sets the value of the ishome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIshome(String value) {
        this.ishome = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        if (reference == null) {
            return "false";
        } else {
            return reference;
        }
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the diagramname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagramname() {
        return diagramname;
    }

    /**
     * Sets the value of the diagramname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagramname(String value) {
        this.diagramname = value;
    }

    /**
     * Gets the value of the schemzone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schemzone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchemzone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schemzone }
     * 
     * 
     */
    public List<Schemzone> getSchemzone() {
        if (schemzone == null) {
            schemzone = new ArrayList<Schemzone>();
        }
        return this.schemzone;
    }

}
