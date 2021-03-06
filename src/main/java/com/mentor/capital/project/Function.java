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
    "symbolref",
    "funcpinOrProperty"
})
@XmlRootElement(name = "function")
public class Function {

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
    @XmlAttribute(name = "optionexpression")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String optionexpression;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "functiontype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String functiontype;
    @XmlAttribute(name = "functionimpltype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String functionimpltype;
    @XmlAttribute(name = "cpu")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cpu;
    @XmlAttribute(name = "csa")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String csa;
    @XmlAttribute(name = "flashsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flashsize;
    @XmlAttribute(name = "frequency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String frequency;
    @XmlAttribute(name = "maxlatency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxlatency;
    @XmlAttribute(name = "powerconsumption")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String powerconsumption;
    @XmlAttribute(name = "ramsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ramsize;
    @XmlAttribute(name = "role")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String role;
    @XmlAttribute(name = "romsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String romsize;
    @XmlAttribute(name = "runtime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String runtime;
    @XmlAttribute(name = "thermaloutput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String thermaloutput;
    @XmlAttribute(name = "volume")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String volume;
    @XmlAttribute(name = "architecturalcost")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String architecturalcost;
    @XmlAttribute(name = "weight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String weight;
    @XmlAttribute(name = "partnumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partnumber;
    @XmlAttribute(name = "partrevision")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String partrevision;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    protected List<Advnameidx> advnameidx;
    protected List<Symbolref> symbolref;
    @XmlElements({
        @XmlElement(name = "funcpin", type = Funcpin.class),
        @XmlElement(name = "property", type = Property.class)
    })
    protected List<Object> funcpinOrProperty;

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
     * Gets the value of the functiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctiontype() {
        if (functiontype == null) {
            return "NotSet";
        } else {
            return functiontype;
        }
    }

    /**
     * Sets the value of the functiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctiontype(String value) {
        this.functiontype = value;
    }

    /**
     * Gets the value of the functionimpltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionimpltype() {
        if (functionimpltype == null) {
            return "NotSet";
        } else {
            return functionimpltype;
        }
    }

    /**
     * Sets the value of the functionimpltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionimpltype(String value) {
        this.functionimpltype = value;
    }

    /**
     * Gets the value of the cpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpu(String value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the csa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsa() {
        return csa;
    }

    /**
     * Sets the value of the csa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsa(String value) {
        this.csa = value;
    }

    /**
     * Gets the value of the flashsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashsize() {
        return flashsize;
    }

    /**
     * Sets the value of the flashsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashsize(String value) {
        this.flashsize = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the maxlatency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxlatency() {
        return maxlatency;
    }

    /**
     * Sets the value of the maxlatency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxlatency(String value) {
        this.maxlatency = value;
    }

    /**
     * Gets the value of the powerconsumption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerconsumption() {
        return powerconsumption;
    }

    /**
     * Sets the value of the powerconsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerconsumption(String value) {
        this.powerconsumption = value;
    }

    /**
     * Gets the value of the ramsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamsize() {
        return ramsize;
    }

    /**
     * Sets the value of the ramsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamsize(String value) {
        this.ramsize = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the romsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRomsize() {
        return romsize;
    }

    /**
     * Sets the value of the romsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRomsize(String value) {
        this.romsize = value;
    }

    /**
     * Gets the value of the runtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * Sets the value of the runtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuntime(String value) {
        this.runtime = value;
    }

    /**
     * Gets the value of the thermaloutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThermaloutput() {
        return thermaloutput;
    }

    /**
     * Sets the value of the thermaloutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermaloutput(String value) {
        this.thermaloutput = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
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
        return architecturalcost;
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
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
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
     * Gets the value of the symbolref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symbolref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymbolref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Symbolref }
     * 
     * 
     */
    public List<Symbolref> getSymbolref() {
        if (symbolref == null) {
            symbolref = new ArrayList<Symbolref>();
        }
        return this.symbolref;
    }

    /**
     * Gets the value of the funcpinOrProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funcpinOrProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuncpinOrProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Funcpin }
     * {@link Property }
     * 
     * 
     */
    public List<Object> getFuncpinOrProperty() {
        if (funcpinOrProperty == null) {
            funcpinOrProperty = new ArrayList<Object>();
        }
        return this.funcpinOrProperty;
    }

}
