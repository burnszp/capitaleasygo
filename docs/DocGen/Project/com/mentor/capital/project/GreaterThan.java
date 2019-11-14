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
    "andOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket"
})
@XmlRootElement(name = "greaterThan")
public class GreaterThan {

    @XmlAttribute(name = "operatorName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String operatorName;
    @XmlElements({
        @XmlElement(name = "and", type = And.class),
        @XmlElement(name = "or", type = Or.class),
        @XmlElement(name = "not", type = Not.class),
        @XmlElement(name = "contains", type = Contains.class),
        @XmlElement(name = "derivedFrom", type = DerivedFrom.class),
        @XmlElement(name = "equals", type = Equals.class),
        @XmlElement(name = "matchesOptions", type = MatchesOptions.class),
        @XmlElement(name = "valueExists", type = ValueExists.class),
        @XmlElement(name = "lessThan", type = LessThan.class),
        @XmlElement(name = "greaterThan", type = GreaterThan.class),
        @XmlElement(name = "lessThanEqual", type = LessThanEqual.class),
        @XmlElement(name = "greaterThanEqual", type = GreaterThanEqual.class),
        @XmlElement(name = "notEqual", type = NotEqual.class),
        @XmlElement(name = "attributeVariable", type = AttributeVariable.class),
        @XmlElement(name = "propertyVariable", type = PropertyVariable.class),
        @XmlElement(name = "stringConstant", type = StringConstant.class),
        @XmlElement(name = "integerConstant", type = IntegerConstant.class),
        @XmlElement(name = "doubleConstant", type = DoubleConstant.class),
        @XmlElement(name = "classConstant", type = ClassConstant.class),
        @XmlElement(name = "booleanConstant", type = BooleanConstant.class),
        @XmlElement(name = "objectConstant", type = ObjectConstant.class),
        @XmlElement(name = "objectOperand", type = ObjectOperand.class),
        @XmlElement(name = "classOperand", type = ClassOperand.class),
        @XmlElement(name = "count", type = Count.class),
        @XmlElement(name = "ifAny", type = IfAny.class),
        @XmlElement(name = "ifAll", type = IfAll.class),
        @XmlElement(name = "sum", type = Sum.class),
        @XmlElement(name = "multiply", type = Multiply.class),
        @XmlElement(name = "divide", type = Divide.class),
        @XmlElement(name = "subtract", type = Subtract.class),
        @XmlElement(name = "apply", type = Apply.class),
        @XmlElement(name = "filter", type = Filter.class),
        @XmlElement(name = "related", type = Related.class),
        @XmlElement(name = "nullOperator", type = NullOperator.class),
        @XmlElement(name = "filterContext", type = FilterContext.class),
        @XmlElement(name = "like", type = Like.class),
        @XmlElement(name = "concat", type = Concat.class),
        @XmlElement(name = "applyOnFirst", type = ApplyOnFirst.class),
        @XmlElement(name = "nthelement", type = Nthelement.class),
        @XmlElement(name = "union", type = Union.class),
        @XmlElement(name = "except", type = Except.class),
        @XmlElement(name = "queryRef", type = QueryRef.class),
        @XmlElement(name = "valueQueryRef", type = ValueQueryRef.class),
        @XmlElement(name = "bracket", type = Bracket.class)
    })
    protected List<Object> andOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket;

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
     * Gets the value of the andOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the andOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAndOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link And }
     * {@link Or }
     * {@link Not }
     * {@link Contains }
     * {@link DerivedFrom }
     * {@link Equals }
     * {@link MatchesOptions }
     * {@link ValueExists }
     * {@link LessThan }
     * {@link GreaterThan }
     * {@link LessThanEqual }
     * {@link GreaterThanEqual }
     * {@link NotEqual }
     * {@link AttributeVariable }
     * {@link PropertyVariable }
     * {@link StringConstant }
     * {@link IntegerConstant }
     * {@link DoubleConstant }
     * {@link ClassConstant }
     * {@link BooleanConstant }
     * {@link ObjectConstant }
     * {@link ObjectOperand }
     * {@link ClassOperand }
     * {@link Count }
     * {@link IfAny }
     * {@link IfAll }
     * {@link Sum }
     * {@link Multiply }
     * {@link Divide }
     * {@link Subtract }
     * {@link Apply }
     * {@link Filter }
     * {@link Related }
     * {@link NullOperator }
     * {@link FilterContext }
     * {@link Like }
     * {@link Concat }
     * {@link ApplyOnFirst }
     * {@link Nthelement }
     * {@link Union }
     * {@link Except }
     * {@link QueryRef }
     * {@link ValueQueryRef }
     * {@link Bracket }
     * 
     * 
     */
    public List<Object> getAndOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket() {
        if (andOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket == null) {
            andOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket = new ArrayList<Object>();
        }
        return this.andOrOrOrNotOrContainsOrDerivedFromOrEqualsOrMatchesOptionsOrValueExistsOrLessThanOrGreaterThanOrLessThanEqualOrGreaterThanEqualOrNotEqualOrAttributeVariableOrPropertyVariableOrStringConstantOrIntegerConstantOrDoubleConstantOrClassConstantOrBooleanConstantOrObjectConstantOrObjectOperandOrClassOperandOrCountOrIfAnyOrIfAllOrSumOrMultiplyOrDivideOrSubtractOrApplyOrFilterOrRelatedOrNullOperatorOrFilterContextOrLikeOrConcatOrApplyOnFirstOrNthelementOrUnionOrExceptOrQueryRefOrValueQueryRefOrBracket;
    }

}
