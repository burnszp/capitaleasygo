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


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "specializedconnectormating")
public class Specializedconnectormating {

    @XmlAttribute(name = "connector", required = true)
    @XmlIDREF
    protected Object connector;
    @XmlAttribute(name = "mate", required = true)
    @XmlIDREF
    protected Object mate;

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConnector(Object value) {
        this.connector = value;
    }

    /**
     * Gets the value of the mate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMate() {
        return mate;
    }

    /**
     * Sets the value of the mate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMate(Object value) {
        this.mate = value;
    }

}