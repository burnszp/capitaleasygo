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
@XmlType(name = "")
@XmlRootElement(name = "operationfiltercondition")
public class Operationfiltercondition {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "cardinalnumber", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cardinalnumber;
    @XmlAttribute(name = "cardinalitytype", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cardinalitytype;
    @XmlAttribute(name = "match", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String match;
    @XmlAttribute(name = "queryname")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String queryname;
    @XmlAttribute(name = "querytype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String querytype;

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
     * Gets the value of the cardinalnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinalnumber() {
        return cardinalnumber;
    }

    /**
     * Sets the value of the cardinalnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinalnumber(String value) {
        this.cardinalnumber = value;
    }

    /**
     * Gets the value of the cardinalitytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinalitytype() {
        return cardinalitytype;
    }

    /**
     * Sets the value of the cardinalitytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinalitytype(String value) {
        this.cardinalitytype = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatch(String value) {
        this.match = value;
    }

    /**
     * Gets the value of the queryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryname() {
        return queryname;
    }

    /**
     * Sets the value of the queryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryname(String value) {
        this.queryname = value;
    }

    /**
     * Gets the value of the querytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuerytype() {
        return querytype;
    }

    /**
     * Sets the value of the querytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuerytype(String value) {
        this.querytype = value;
    }

}
