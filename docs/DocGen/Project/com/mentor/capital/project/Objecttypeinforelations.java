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


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objecttyperelation"
})
@XmlRootElement(name = "objecttypeinforelations")
public class Objecttypeinforelations {

    @XmlAttribute(name = "sourceobjecttype", required = true)
    @XmlIDREF
    protected Object sourceobjecttype;
    @XmlAttribute(name = "targetobjecttype", required = true)
    @XmlIDREF
    protected Object targetobjecttype;
    protected List<Objecttyperelation> objecttyperelation;

    /**
     * Gets the value of the sourceobjecttype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSourceobjecttype() {
        return sourceobjecttype;
    }

    /**
     * Sets the value of the sourceobjecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceobjecttype(Object value) {
        this.sourceobjecttype = value;
    }

    /**
     * Gets the value of the targetobjecttype property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTargetobjecttype() {
        return targetobjecttype;
    }

    /**
     * Sets the value of the targetobjecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTargetobjecttype(Object value) {
        this.targetobjecttype = value;
    }

    /**
     * Gets the value of the objecttyperelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objecttyperelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjecttyperelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objecttyperelation }
     * 
     * 
     */
    public List<Objecttyperelation> getObjecttyperelation() {
        if (objecttyperelation == null) {
            objecttyperelation = new ArrayList<Objecttyperelation>();
        }
        return this.objecttyperelation;
    }

}