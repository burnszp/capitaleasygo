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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "redsymbol"
})
@XmlRootElement(name = "redsymboldata")
public class Redsymboldata {

    protected List<Redsymbol> redsymbol;

    /**
     * Gets the value of the redsymbol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redsymbol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedsymbol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Redsymbol }
     * 
     * 
     */
    public List<Redsymbol> getRedsymbol() {
        if (redsymbol == null) {
            redsymbol = new ArrayList<Redsymbol>();
        }
        return this.redsymbol;
    }

}
