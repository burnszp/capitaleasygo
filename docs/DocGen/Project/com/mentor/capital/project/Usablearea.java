//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:46:37 AM CST 
//


package com.mentor.capital.project;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paramextent"
})
@XmlRootElement(name = "usablearea")
public class Usablearea {

    @XmlElement(required = true)
    protected Paramextent paramextent;

    /**
     * Gets the value of the paramextent property.
     * 
     * @return
     *     possible object is
     *     {@link Paramextent }
     *     
     */
    public Paramextent getParamextent() {
        return paramextent;
    }

    /**
     * Sets the value of the paramextent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paramextent }
     *     
     */
    public void setParamextent(Paramextent value) {
        this.paramextent = value;
    }

}
