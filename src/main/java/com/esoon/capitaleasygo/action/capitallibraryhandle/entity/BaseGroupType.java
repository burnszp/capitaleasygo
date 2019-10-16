//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BaseGroupType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BaseGroupType">
 *   &lt;restriction base="{http://www.mentor.com/harness/Schema/LibrarySchema}String20">
 *     &lt;enumeration value="Assembly"/>
 *     &lt;enumeration value="In-House Assembly"/>
 *     &lt;enumeration value="Backshell Plug"/>
 *     &lt;enumeration value="Backshell Seal"/>
 *     &lt;enumeration value="Cavity Group"/>
 *     &lt;enumeration value="Cavity Plug"/>
 *     &lt;enumeration value="Cavity Seal"/>
 *     &lt;enumeration value="Clip"/>
 *     &lt;enumeration value="Connector"/>
 *     &lt;enumeration value="Connector Seal"/>
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="Dressed Connector"/>
 *     &lt;enumeration value="Grommet"/>
 *     &lt;enumeration value="Heat Shrink Sleeve"/>
 *     &lt;enumeration value="IDC Connector"/>
 *     &lt;enumeration value="Multicore Wire"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Solder Sleeve"/>
 *     &lt;enumeration value="Splice"/>
 *     &lt;enumeration value="Tape"/>
 *     &lt;enumeration value="Terminal"/>
 *     &lt;enumeration value="Tube"/>
 *     &lt;enumeration value="Ultrasonic Weld"/>
 *     &lt;enumeration value="Wire"/>
 *     &lt;enumeration value="Backshell"/>
 *     &lt;enumeration value="Fixture"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaseGroupType")
@XmlEnum
public enum BaseGroupType implements Serializable{

    @XmlEnumValue("Assembly")
    ASSEMBLY("Assembly"),
    @XmlEnumValue("In-House Assembly")
    IN_HOUSE_ASSEMBLY("In-House Assembly"),
    @XmlEnumValue("Backshell Plug")
    BACKSHELL_PLUG("Backshell Plug"),
    @XmlEnumValue("Backshell Seal")
    BACKSHELL_SEAL("Backshell Seal"),
    @XmlEnumValue("Cavity Group")
    CAVITY_GROUP("Cavity Group"),
    @XmlEnumValue("Cavity Plug")
    CAVITY_PLUG("Cavity Plug"),
    @XmlEnumValue("Cavity Seal")
    CAVITY_SEAL("Cavity Seal"),
    @XmlEnumValue("Clip")
    CLIP("Clip"),
    @XmlEnumValue("Connector")
    CONNECTOR("Connector"),
    @XmlEnumValue("Connector Seal")
    CONNECTOR_SEAL("Connector Seal"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("Dressed Connector")
    DRESSED_CONNECTOR("Dressed Connector"),
    @XmlEnumValue("Grommet")
    GROMMET("Grommet"),
    @XmlEnumValue("Heat Shrink Sleeve")
    HEAT_SHRINK_SLEEVE("Heat Shrink Sleeve"),
    @XmlEnumValue("IDC Connector")
    IDC_CONNECTOR("IDC Connector"),
    @XmlEnumValue("Multicore Wire")
    MULTICORE_WIRE("Multicore Wire"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Solder Sleeve")
    SOLDER_SLEEVE("Solder Sleeve"),
    @XmlEnumValue("Splice")
    SPLICE("Splice"),
    @XmlEnumValue("Tape")
    TAPE("Tape"),
    @XmlEnumValue("Terminal")
    TERMINAL("Terminal"),
    @XmlEnumValue("Tube")
    TUBE("Tube"),
    @XmlEnumValue("Ultrasonic Weld")
    ULTRASONIC_WELD("Ultrasonic Weld"),
    @XmlEnumValue("Wire")
    WIRE("Wire"),
    @XmlEnumValue("Backshell")
    BACKSHELL("Backshell"),
    @XmlEnumValue("Fixture")
    FIXTURE("Fixture");
    private final String value;

    BaseGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaseGroupType fromValue(String v) {
        for (BaseGroupType c: BaseGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
