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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype"
})
@XmlRootElement(name = "dynamictabletype")
public class Dynamictabletype {

    @XmlAttribute(name = "tablename", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tablename;
    @XmlAttribute(name = "hosttablename", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hosttablename;
    @XmlElements({
        @XmlElement(name = "supplementarydecorationsetcolumntype", type = Supplementarydecorationsetcolumntype.class),
        @XmlElement(name = "supplementarycustomcolumntype", type = Supplementarycustomcolumntype.class),
        @XmlElement(name = "supplementarypropertycolumntype", type = Supplementarypropertycolumntype.class)
    })
    protected List<Object> supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype;

    /**
     * Gets the value of the tablename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * Sets the value of the tablename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTablename(String value) {
        this.tablename = value;
    }

    /**
     * Gets the value of the hosttablename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHosttablename() {
        return hosttablename;
    }

    /**
     * Sets the value of the hosttablename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHosttablename(String value) {
        this.hosttablename = value;
    }

    /**
     * Gets the value of the supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplementarydecorationsetcolumntype }
     * {@link Supplementarycustomcolumntype }
     * {@link Supplementarypropertycolumntype }
     * 
     * 
     */
    public List<Object> getSupplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype() {
        if (supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype == null) {
            supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype = new ArrayList<Object>();
        }
        return this.supplementarydecorationsetcolumntypeOrSupplementarycustomcolumntypeOrSupplementarypropertycolumntype;
    }

}
