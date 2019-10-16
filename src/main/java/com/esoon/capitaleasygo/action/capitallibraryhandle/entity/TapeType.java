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
 * <p>tapeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tapeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryPartBaseType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="librarytape" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarytapeType" maxOccurs="unbounded"/>
 *         &lt;element name="librarytapeselection" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarytapeselectionType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tapeType", propOrder = {
    "librarytapeOrLibrarytapeselection"
})
public class TapeType
    extends LibraryPartBaseType
{

    @XmlElements({
        @XmlElement(name = "librarytape", type = LibrarytapeType.class),
        @XmlElement(name = "librarytapeselection", type = LibrarytapeselectionType.class)
    })
    protected List<Object> librarytapeOrLibrarytapeselection;

    /**
     * Gets the value of the librarytapeOrLibrarytapeselection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librarytapeOrLibrarytapeselection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrarytapeOrLibrarytapeselection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibrarytapeType }
     * {@link LibrarytapeselectionType }
     * 
     * 
     */
    public List<Object> getLibrarytapeOrLibrarytapeselection() {
        if (librarytapeOrLibrarytapeselection == null) {
            librarytapeOrLibrarytapeselection = new ArrayList<Object>();
        }
        return this.librarytapeOrLibrarytapeselection;
    }

}
