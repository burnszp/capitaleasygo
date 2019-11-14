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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport",
    "hportstylingxrefdetails",
    "vportstylingxrefdetails"
})
@XmlRootElement(name = "schemfunccond")
public class Schemfunccond {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "connref", required = true)
    @XmlIDREF
    protected Object connref;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "ishome")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ishome;
    @XmlAttribute(name = "attributeref")
    @XmlIDREF
    protected Object attributeref;
    @XmlAttribute(name = "isexcludefromapplystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isexcludefromapplystyle;
    @XmlElements({
        @XmlElement(name = "propertiedgraphic", type = Propertiedgraphic.class),
        @XmlElement(name = "attributetext", type = Attributetext.class),
        @XmlElement(name = "diagramtext", type = Diagramtext.class),
        @XmlElement(name = "compositetext", type = Compositetext.class),
        @XmlElement(name = "xreftextcontainer", type = Xreftextcontainer.class),
        @XmlElement(name = "proptext", type = Proptext.class),
        @XmlElement(name = "arc", type = Arc.class),
        @XmlElement(name = "circle", type = Circle.class),
        @XmlElement(name = "comment", type = Comment.class),
        @XmlElement(name = "curve", type = Curve.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "gfxgroup", type = Gfxgroup.class),
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "polygon", type = Polygon.class),
        @XmlElement(name = "polyline", type = Polyline.class),
        @XmlElement(name = "propertiedtext", type = Propertiedtext.class),
        @XmlElement(name = "rectangle", type = Rectangle.class),
        @XmlElement(name = "widtharc", type = Widtharc.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "tablegroup", type = Tablegroup.class),
        @XmlElement(name = "schemsegment", type = Schemsegment.class),
        @XmlElement(name = "schemport", type = Schemport.class)
    })
    protected List<Object> propertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport;
    protected Hportstylingxrefdetails hportstylingxrefdetails;
    protected Vportstylingxrefdetails vportstylingxrefdetails;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the connref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConnref() {
        return connref;
    }

    /**
     * Sets the value of the connref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConnref(Object value) {
        this.connref = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        if (visibility == null) {
            return "true";
        } else {
            return visibility;
        }
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the parentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * Sets the value of the parentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentid(String value) {
        this.parentid = value;
    }

    /**
     * Gets the value of the baseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseid() {
        return baseid;
    }

    /**
     * Sets the value of the baseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseid(String value) {
        this.baseid = value;
    }

    /**
     * Gets the value of the ishome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIshome() {
        if (ishome == null) {
            return "false";
        } else {
            return ishome;
        }
    }

    /**
     * Sets the value of the ishome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIshome(String value) {
        this.ishome = value;
    }

    /**
     * Gets the value of the attributeref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttributeref() {
        return attributeref;
    }

    /**
     * Sets the value of the attributeref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttributeref(Object value) {
        this.attributeref = value;
    }

    /**
     * Gets the value of the isexcludefromapplystyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsexcludefromapplystyle() {
        if (isexcludefromapplystyle == null) {
            return "false";
        } else {
            return isexcludefromapplystyle;
        }
    }

    /**
     * Sets the value of the isexcludefromapplystyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsexcludefromapplystyle(String value) {
        this.isexcludefromapplystyle = value;
    }

    /**
     * Gets the value of the propertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Propertiedgraphic }
     * {@link Attributetext }
     * {@link Diagramtext }
     * {@link Compositetext }
     * {@link Xreftextcontainer }
     * {@link Proptext }
     * {@link Arc }
     * {@link Circle }
     * {@link Comment }
     * {@link Curve }
     * {@link Image }
     * {@link Gfxgroup }
     * {@link Line }
     * {@link Polygon }
     * {@link Polyline }
     * {@link Propertiedtext }
     * {@link Rectangle }
     * {@link Widtharc }
     * {@link Table }
     * {@link Tablegroup }
     * {@link Schemsegment }
     * {@link Schemport }
     * 
     * 
     */
    public List<Object> getPropertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport() {
        if (propertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport == null) {
            propertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport = new ArrayList<Object>();
        }
        return this.propertiedgraphicOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrSchemsegmentOrSchemport;
    }

    /**
     * Gets the value of the hportstylingxrefdetails property.
     * 
     * @return
     *     possible object is
     *     {@link Hportstylingxrefdetails }
     *     
     */
    public Hportstylingxrefdetails getHportstylingxrefdetails() {
        return hportstylingxrefdetails;
    }

    /**
     * Sets the value of the hportstylingxrefdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hportstylingxrefdetails }
     *     
     */
    public void setHportstylingxrefdetails(Hportstylingxrefdetails value) {
        this.hportstylingxrefdetails = value;
    }

    /**
     * Gets the value of the vportstylingxrefdetails property.
     * 
     * @return
     *     possible object is
     *     {@link Vportstylingxrefdetails }
     *     
     */
    public Vportstylingxrefdetails getVportstylingxrefdetails() {
        return vportstylingxrefdetails;
    }

    /**
     * Sets the value of the vportstylingxrefdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vportstylingxrefdetails }
     *     
     */
    public void setVportstylingxrefdetails(Vportstylingxrefdetails value) {
        this.vportstylingxrefdetails = value;
    }

}
