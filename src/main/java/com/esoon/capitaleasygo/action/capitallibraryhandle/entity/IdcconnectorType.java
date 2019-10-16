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
 * <p>idcconnectorType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="idcconnectorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryPartBaseType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="libraryconnectordetails" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryconnectordetailsType"/>
 *         &lt;element name="librarysinglewirefitscavity" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarysinglewirefitscavityType"/>
 *         &lt;element name="librarymultiplewirecavities" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarymultiplewirecavitiesType"/>
 *         &lt;element name="librarycavity" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarycavityType"/>
 *         &lt;element name="librarymating" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarymatingType"/>
 *         &lt;element name="librarysingletermination" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarysingleterminationType"/>
 *         &lt;element name="librarymultipletermination" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarymultipleterminationType"/>
 *         &lt;element name="libraryidccavities" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryidccavitiesType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idcconnectorType", propOrder = {
    "libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities"
})
public class IdcconnectorType
    extends LibraryPartBaseType
{

    @XmlElements({
        @XmlElement(name = "libraryconnectordetails", type = LibraryconnectordetailsType.class),
        @XmlElement(name = "librarysinglewirefitscavity", type = LibrarysinglewirefitscavityType.class),
        @XmlElement(name = "librarymultiplewirecavities", type = LibrarymultiplewirecavitiesType.class),
        @XmlElement(name = "librarycavity", type = LibrarycavityType.class),
        @XmlElement(name = "librarymating", type = LibrarymatingType.class),
        @XmlElement(name = "librarysingletermination", type = LibrarysingleterminationType.class),
        @XmlElement(name = "librarymultipletermination", type = LibrarymultipleterminationType.class),
        @XmlElement(name = "libraryidccavities", type = LibraryidccavitiesType.class)
    })
    protected List<Object> libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities;

    /**
     * Gets the value of the libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryconnectordetailsType }
     * {@link LibrarysinglewirefitscavityType }
     * {@link LibrarymultiplewirecavitiesType }
     * {@link LibrarycavityType }
     * {@link LibrarymatingType }
     * {@link LibrarysingleterminationType }
     * {@link LibrarymultipleterminationType }
     * {@link LibraryidccavitiesType }
     * 
     * 
     */
    public List<Object> getLibraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities() {
        if (libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities == null) {
            libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities = new ArrayList<Object>();
        }
        return this.libraryconnectordetailsOrLibrarysinglewirefitscavityOrLibrarymultiplewirecavities;
    }

}
