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
    "sourceinterconnect",
    "interconnecttodoitem",
    "interconnectconnectorderivation",
    "interconnectconductorderivation"
})
@XmlRootElement(name = "interconnectsourceinfo")
public class Interconnectsourceinfo {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "diagramid", required = true)
    @XmlIDREF
    protected Object diagramid;
    @XmlAttribute(name = "sourcedesignid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sourcedesignid;
    @XmlAttribute(name = "sourcediagramid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sourcediagramid;
    @XmlAttribute(name = "sourcediagramname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sourcediagramname;
    @XmlElement(required = true)
    protected List<Sourceinterconnect> sourceinterconnect;
    protected List<Interconnecttodoitem> interconnecttodoitem;
    @XmlElement(required = true)
    protected List<Interconnectconnectorderivation> interconnectconnectorderivation;
    protected List<Interconnectconductorderivation> interconnectconductorderivation;

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
     * Gets the value of the diagramid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDiagramid() {
        return diagramid;
    }

    /**
     * Sets the value of the diagramid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDiagramid(Object value) {
        this.diagramid = value;
    }

    /**
     * Gets the value of the sourcedesignid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcedesignid() {
        return sourcedesignid;
    }

    /**
     * Sets the value of the sourcedesignid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcedesignid(String value) {
        this.sourcedesignid = value;
    }

    /**
     * Gets the value of the sourcediagramid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcediagramid() {
        return sourcediagramid;
    }

    /**
     * Sets the value of the sourcediagramid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcediagramid(String value) {
        this.sourcediagramid = value;
    }

    /**
     * Gets the value of the sourcediagramname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcediagramname() {
        return sourcediagramname;
    }

    /**
     * Sets the value of the sourcediagramname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcediagramname(String value) {
        this.sourcediagramname = value;
    }

    /**
     * Gets the value of the sourceinterconnect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceinterconnect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceinterconnect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sourceinterconnect }
     * 
     * 
     */
    public List<Sourceinterconnect> getSourceinterconnect() {
        if (sourceinterconnect == null) {
            sourceinterconnect = new ArrayList<Sourceinterconnect>();
        }
        return this.sourceinterconnect;
    }

    /**
     * Gets the value of the interconnecttodoitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interconnecttodoitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterconnecttodoitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interconnecttodoitem }
     * 
     * 
     */
    public List<Interconnecttodoitem> getInterconnecttodoitem() {
        if (interconnecttodoitem == null) {
            interconnecttodoitem = new ArrayList<Interconnecttodoitem>();
        }
        return this.interconnecttodoitem;
    }

    /**
     * Gets the value of the interconnectconnectorderivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interconnectconnectorderivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterconnectconnectorderivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interconnectconnectorderivation }
     * 
     * 
     */
    public List<Interconnectconnectorderivation> getInterconnectconnectorderivation() {
        if (interconnectconnectorderivation == null) {
            interconnectconnectorderivation = new ArrayList<Interconnectconnectorderivation>();
        }
        return this.interconnectconnectorderivation;
    }

    /**
     * Gets the value of the interconnectconductorderivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interconnectconductorderivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterconnectconductorderivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interconnectconductorderivation }
     * 
     * 
     */
    public List<Interconnectconductorderivation> getInterconnectconductorderivation() {
        if (interconnectconductorderivation == null) {
            interconnectconductorderivation = new ArrayList<Interconnectconductorderivation>();
        }
        return this.interconnectconductorderivation;
    }

}
