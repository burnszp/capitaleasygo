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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textdecorationOrCompositetextdecorationOrSymboldecoration"
})
@XmlRootElement(name = "selfdecorationstyle")
public class Selfdecorationstyle {

    @XmlElements({
        @XmlElement(name = "textdecoration", type = Textdecoration.class),
        @XmlElement(name = "compositetextdecoration", type = Compositetextdecoration.class),
        @XmlElement(name = "symboldecoration", type = Symboldecoration.class)
    })
    protected List<Object> textdecorationOrCompositetextdecorationOrSymboldecoration;

    /**
     * Gets the value of the textdecorationOrCompositetextdecorationOrSymboldecoration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textdecorationOrCompositetextdecorationOrSymboldecoration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextdecorationOrCompositetextdecorationOrSymboldecoration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Textdecoration }
     * {@link Compositetextdecoration }
     * {@link Symboldecoration }
     * 
     * 
     */
    public List<Object> getTextdecorationOrCompositetextdecorationOrSymboldecoration() {
        if (textdecorationOrCompositetextdecorationOrSymboldecoration == null) {
            textdecorationOrCompositetextdecorationOrSymboldecoration = new ArrayList<Object>();
        }
        return this.textdecorationOrCompositetextdecorationOrSymboldecoration;
    }

}
