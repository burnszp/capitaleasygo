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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryOperatorList"
})
@XmlRootElement(name = "concat")
public class Concat {

    @XmlAttribute(name = "operatorName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String operatorName;
    @XmlElement(required = true)
    protected QueryOperatorList queryOperatorList;

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Gets the value of the queryOperatorList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOperatorList }
     *     
     */
    public QueryOperatorList getQueryOperatorList() {
        return queryOperatorList;
    }

    /**
     * Sets the value of the queryOperatorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOperatorList }
     *     
     */
    public void setQueryOperatorList(QueryOperatorList value) {
        this.queryOperatorList = value;
    }

}
