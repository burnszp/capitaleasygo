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
@XmlRootElement(name = "refedcavity")
public class Refedcavity {

    @XmlAttribute(name = "cavityref", required = true)
    @XmlIDREF
    protected Object cavityref;

    /**
     * Gets the value of the cavityref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCavityref() {
        return cavityref;
    }

    /**
     * Sets the value of the cavityref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCavityref(Object value) {
        this.cavityref = value;
    }

}
