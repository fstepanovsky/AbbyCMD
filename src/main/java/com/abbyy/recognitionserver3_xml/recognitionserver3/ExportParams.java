
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeparationMethod" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}DocumentSeparationMethodEnum"/&gt;
 *         &lt;element name="Formats" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}ArrayOfOutputFormatSettings" minOccurs="0"/&gt;
 *         &lt;element name="ResultLocationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportParams", propOrder = {
    "separationMethod",
    "formats",
    "resultLocationPath"
})
public class ExportParams {

    @XmlElement(name = "SeparationMethod", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentSeparationMethodEnum separationMethod;
    @XmlElement(name = "Formats")
    protected ArrayOfOutputFormatSettings formats;
    @XmlElement(name = "ResultLocationPath")
    protected String resultLocationPath;

    /**
     * Gets the value of the separationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSeparationMethodEnum }
     *     
     */
    public DocumentSeparationMethodEnum getSeparationMethod() {
        return separationMethod;
    }

    /**
     * Sets the value of the separationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSeparationMethodEnum }
     *     
     */
    public void setSeparationMethod(DocumentSeparationMethodEnum value) {
        this.separationMethod = value;
    }

    /**
     * Gets the value of the formats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutputFormatSettings }
     *     
     */
    public ArrayOfOutputFormatSettings getFormats() {
        return formats;
    }

    /**
     * Sets the value of the formats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutputFormatSettings }
     *     
     */
    public void setFormats(ArrayOfOutputFormatSettings value) {
        this.formats = value;
    }

    /**
     * Gets the value of the resultLocationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultLocationPath() {
        return resultLocationPath;
    }

    /**
     * Sets the value of the resultLocationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultLocationPath(String value) {
        this.resultLocationPath = value;
    }

}
