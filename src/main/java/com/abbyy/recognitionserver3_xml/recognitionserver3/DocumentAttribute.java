
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeType" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}AttributeTypeEnum"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAttribute", propOrder = {
    "attributeType",
    "name"
})
@XmlSeeAlso({
    BooleanDocumentAttribute.class,
    MultipleLinesDocumentAttribute.class,
    EnumerationDocumentAttribute.class,
    RegularExpressionDocumentAttribute.class,
    SingleLineDocumentAttribute.class
})
public abstract class DocumentAttribute {

    @XmlElement(name = "AttributeType", required = true)
    @XmlSchemaType(name = "string")
    protected AttributeTypeEnum attributeType;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeTypeEnum }
     *     
     */
    public AttributeTypeEnum getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeTypeEnum }
     *     
     */
    public void setAttributeType(AttributeTypeEnum value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
