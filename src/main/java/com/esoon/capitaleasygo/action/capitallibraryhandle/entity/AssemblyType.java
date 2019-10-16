//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>assemblyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="assemblyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryPartBaseType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="libraryassembly" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryassemblyType"/>
 *         &lt;element name="librarysinglewirefitscavity" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarysinglewirefitscavityType"/>
 *         &lt;element name="librarymultiplewirecavities" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarymultiplewirecavitiesType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assemblyType", propOrder = {
    "libraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities"
})
public class AssemblyType
    extends LibraryPartBaseType
{

    @XmlElements({
        @XmlElement(name = "libraryassembly", type = LibraryassemblyType.class),
        @XmlElement(name = "librarysinglewirefitscavity", type = LibrarysinglewirefitscavityType.class),
        @XmlElement(name = "librarymultiplewirecavities", type = LibrarymultiplewirecavitiesType.class)
    })
    protected List<Object> libraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities;

    /**
     * Gets the value of the libraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryassemblyType }
     * {@link LibrarysinglewirefitscavityType }
     * {@link LibrarymultiplewirecavitiesType }
     * 
     * 
     */
    public List<Object> getLibraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities() {
        if (libraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities == null) {
            libraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities = new ArrayList<Object>();
        }
        return this.libraryassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities;
    }

}
