
package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Attribute complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Attribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attrType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attrValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attrFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attrFileId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attrFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="compTitle" type="{http://capital.acconsys.com/Component}CompTitle"/>
 *         &lt;element name="refDataValues" type="{http://capital.acconsys.com/CommonEntity}KeyValueSet"/>
 *         &lt;element name="capitalAttrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capitalAttr" type="{http://capital.acconsys.com/Component}CapitalAttr"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute", propOrder = {
    "attrId",
    "attrName",
    "fieldName",
    "attrType",
    "required",
    "attrValue",
    "attrFilePath",
    "attrFileId",
    "attrFileName",
    "rule",
    "compTitle",
    "refDataValues",
    "capitalAttrId",
    "capitalAttr"
})
public class Attribute {

    @XmlElement(required = true)
    protected String attrId;
    @XmlElement(required = true)
    protected String attrName;
    @XmlElement(required = true)
    protected String fieldName;
    protected int attrType;
    protected int required;
    @XmlElement(required = true)
    protected String attrValue;
    @XmlElement(required = true)
    protected String attrFilePath;
    @XmlElement(required = true)
    protected String attrFileId;
    @XmlElement(required = true)
    protected String attrFileName;
    @XmlElement(required = true)
    protected String rule;

    /**
     * ��ȡattrId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrId() {
        return attrId;
    }

    /**
     * ����attrId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrId(String value) {
        this.attrId = value;
    }

    /**
     * ��ȡattrName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * ����attrName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrName(String value) {
        this.attrName = value;
    }

    /**
     * ��ȡfieldName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * ����fieldName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * ��ȡattrType���Ե�ֵ��
     * 
     */
    public int getAttrType() {
        return attrType;
    }

    /**
     * ����attrType���Ե�ֵ��
     * 
     */
    public void setAttrType(int value) {
        this.attrType = value;
    }

    /**
     * ��ȡrequired���Ե�ֵ��
     * 
     */
    public int getRequired() {
        return required;
    }

    /**
     * ����required���Ե�ֵ��
     * 
     */
    public void setRequired(int value) {
        this.required = value;
    }

    /**
     * ��ȡattrValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * ����attrValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrValue(String value) {
        this.attrValue = value;
    }

    /**
     * ��ȡattrFilePath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrFilePath() {
        return attrFilePath;
    }

    /**
     * ����attrFilePath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrFilePath(String value) {
        this.attrFilePath = value;
    }

    /**
     * ��ȡattrFileId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrFileId() {
        return attrFileId;
    }

    /**
     * ����attrFileId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrFileId(String value) {
        this.attrFileId = value;
    }

    /**
     * ��ȡattrFileName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrFileName() {
        return attrFileName;
    }

    /**
     * ����attrFileName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrFileName(String value) {
        this.attrFileName = value;
    }

    /**
     * ��ȡrule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * ����rule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule(String value) {
        this.rule = value;
    }


}
