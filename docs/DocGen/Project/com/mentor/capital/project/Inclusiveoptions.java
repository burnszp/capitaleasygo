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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refedoption"
})
@XmlRootElement(name = "inclusiveoptions")
public class Inclusiveoptions {

    @XmlAttribute(name = "optionref", required = true)
    @XmlIDREF
    protected Object optionref;
    @XmlElement(required = true)
    protected List<Refedoption> refedoption;

    /**
     * Gets the value of the optionref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOptionref() {
        return optionref;
    }

    /**
     * Sets the value of the optionref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOptionref(Object value) {
        this.optionref = value;
    }

    /**
     * Gets the value of the refedoption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refedoption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefedoption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Refedoption }
     * 
     * 
     */
    public List<Refedoption> getRefedoption() {
        if (refedoption == null) {
            refedoption = new ArrayList<Refedoption>();
        }
        return this.refedoption;
    }

}
