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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicableproperty"
})
@XmlRootElement(name = "objecttyperelation")
public class Objecttyperelation {

    @XmlAttribute(name = "sourceobjectname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sourceobjectname;
    @XmlAttribute(name = "sourceobjectrevision")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sourceobjectrevision;
    @XmlAttribute(name = "targetobjectname", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String targetobjectname;
    @XmlAttribute(name = "targetobjectrevision")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String targetobjectrevision;
    protected List<Applicableproperty> applicableproperty;

    /**
     * Gets the value of the sourceobjectname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceobjectname() {
        return sourceobjectname;
    }

    /**
     * Sets the value of the sourceobjectname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceobjectname(String value) {
        this.sourceobjectname = value;
    }

    /**
     * Gets the value of the sourceobjectrevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceobjectrevision() {
        return sourceobjectrevision;
    }

    /**
     * Sets the value of the sourceobjectrevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceobjectrevision(String value) {
        this.sourceobjectrevision = value;
    }

    /**
     * Gets the value of the targetobjectname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetobjectname() {
        return targetobjectname;
    }

    /**
     * Sets the value of the targetobjectname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetobjectname(String value) {
        this.targetobjectname = value;
    }

    /**
     * Gets the value of the targetobjectrevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetobjectrevision() {
        return targetobjectrevision;
    }

    /**
     * Sets the value of the targetobjectrevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetobjectrevision(String value) {
        this.targetobjectrevision = value;
    }

    /**
     * Gets the value of the applicableproperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableproperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableproperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Applicableproperty }
     * 
     * 
     */
    public List<Applicableproperty> getApplicableproperty() {
        if (applicableproperty == null) {
            applicableproperty = new ArrayList<Applicableproperty>();
        }
        return this.applicableproperty;
    }

}
