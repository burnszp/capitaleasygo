//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>spliceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="spliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryPartBaseType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="librarycavity" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarycavityType"/>
 *         &lt;element name="librarysplice" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryspliceType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spliceType", propOrder = {
    "librarycavityOrLibrarysplice"
})
public class SpliceType
    extends LibraryPartBaseType
{

    @XmlElements({
        @XmlElement(name = "librarycavity", type = LibrarycavityType.class),
        @XmlElement(name = "librarysplice", type = LibraryspliceType.class)
    })
    protected List<Object> librarycavityOrLibrarysplice;

    /**
     * Gets the value of the librarycavityOrLibrarysplice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librarycavityOrLibrarysplice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrarycavityOrLibrarysplice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibrarycavityType }
     * {@link LibraryspliceType }
     * 
     * 
     */
    public List<Object> getLibrarycavityOrLibrarysplice() {
        if (librarycavityOrLibrarysplice == null) {
            librarycavityOrLibrarysplice = new ArrayList<Object>();
        }
        return this.librarycavityOrLibrarysplice;
    }

}
