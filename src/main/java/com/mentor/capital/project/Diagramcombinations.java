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
    "diagramcombination"
})
@XmlRootElement(name = "diagramcombinations")
public class Diagramcombinations {

    @XmlAttribute(name = "functionaldiagramref", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String functionaldiagramref;
    protected List<Diagramcombination> diagramcombination;

    /**
     * Gets the value of the functionaldiagramref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionaldiagramref() {
        return functionaldiagramref;
    }

    /**
     * Sets the value of the functionaldiagramref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionaldiagramref(String value) {
        this.functionaldiagramref = value;
    }

    /**
     * Gets the value of the diagramcombination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagramcombination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagramcombination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Diagramcombination }
     * 
     * 
     */
    public List<Diagramcombination> getDiagramcombination() {
        if (diagramcombination == null) {
            diagramcombination = new ArrayList<Diagramcombination>();
        }
        return this.diagramcombination;
    }

}
