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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "interconnectconnectorderivation")
public class Interconnectconnectorderivation {

    @XmlAttribute(name = "connectorrefid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String connectorrefid;
    @XmlAttribute(name = "derivedrefid", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String derivedrefid;

    /**
     * Gets the value of the connectorrefid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorrefid() {
        return connectorrefid;
    }

    /**
     * Sets the value of the connectorrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorrefid(String value) {
        this.connectorrefid = value;
    }

    /**
     * Gets the value of the derivedrefid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedrefid() {
        return derivedrefid;
    }

    /**
     * Sets the value of the derivedrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedrefid(String value) {
        this.derivedrefid = value;
    }

}
