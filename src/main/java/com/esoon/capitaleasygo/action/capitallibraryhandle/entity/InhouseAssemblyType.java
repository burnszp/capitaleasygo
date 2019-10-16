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
 * <p>inhouseAssemblyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="inhouseAssemblyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryPartBaseType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="libraryinhouseassembly" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryinhouseassemblyType" maxOccurs="unbounded"/>
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
@XmlType(name = "inhouseAssemblyType", propOrder = {
    "libraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities"
})
public class InhouseAssemblyType
    extends LibraryPartBaseType
{

    @XmlElements({
        @XmlElement(name = "libraryinhouseassembly", type = LibraryinhouseassemblyType.class),
        @XmlElement(name = "librarysinglewirefitscavity", type = LibrarysinglewirefitscavityType.class),
        @XmlElement(name = "librarymultiplewirecavities", type = LibrarymultiplewirecavitiesType.class)
    })
    protected List<Object> libraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities;

    /**
     * Gets the value of the libraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryinhouseassemblyType }
     * {@link LibrarysinglewirefitscavityType }
     * {@link LibrarymultiplewirecavitiesType }
     * 
     * 
     */
    public List<Object> getLibraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities() {
        if (libraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities == null) {
            libraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities = new ArrayList<Object>();
        }
        return this.libraryinhouseassemblyOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities;
    }

}
