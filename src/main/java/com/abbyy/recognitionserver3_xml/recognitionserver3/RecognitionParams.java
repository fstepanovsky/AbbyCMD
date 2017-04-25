
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecognitionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecognitionParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Languages" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="LookForBarcodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TextTypes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RecognitionQuality" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}RecognitionQualitySettingEnum"/&gt;
 *         &lt;element name="RecognitionMode" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}RecognitionModeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecognitionParams", propOrder = {
    "languages",
    "lookForBarcodes",
    "textTypes",
    "recognitionQuality",
    "recognitionMode"
})
public class RecognitionParams {

    @XmlElement(name = "Languages")
    protected ArrayOfString languages;
    @XmlElement(name = "LookForBarcodes")
    protected boolean lookForBarcodes;
    @XmlElement(name = "TextTypes")
    protected int textTypes;
    @XmlElement(name = "RecognitionQuality", required = true)
    @XmlSchemaType(name = "string")
    protected RecognitionQualitySettingEnum recognitionQuality;
    @XmlElement(name = "RecognitionMode", required = true)
    @XmlSchemaType(name = "string")
    protected RecognitionModeEnum recognitionMode;

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setLanguages(ArrayOfString value) {
        this.languages = value;
    }

    /**
     * Gets the value of the lookForBarcodes property.
     * 
     */
    public boolean isLookForBarcodes() {
        return lookForBarcodes;
    }

    /**
     * Sets the value of the lookForBarcodes property.
     * 
     */
    public void setLookForBarcodes(boolean value) {
        this.lookForBarcodes = value;
    }

    /**
     * Gets the value of the textTypes property.
     * 
     */
    public int getTextTypes() {
        return textTypes;
    }

    /**
     * Sets the value of the textTypes property.
     * 
     */
    public void setTextTypes(int value) {
        this.textTypes = value;
    }

    /**
     * Gets the value of the recognitionQuality property.
     * 
     * @return
     *     possible object is
     *     {@link RecognitionQualitySettingEnum }
     *     
     */
    public RecognitionQualitySettingEnum getRecognitionQuality() {
        return recognitionQuality;
    }

    /**
     * Sets the value of the recognitionQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecognitionQualitySettingEnum }
     *     
     */
    public void setRecognitionQuality(RecognitionQualitySettingEnum value) {
        this.recognitionQuality = value;
    }

    /**
     * Gets the value of the recognitionMode property.
     * 
     * @return
     *     possible object is
     *     {@link RecognitionModeEnum }
     *     
     */
    public RecognitionModeEnum getRecognitionMode() {
        return recognitionMode;
    }

    /**
     * Sets the value of the recognitionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecognitionModeEnum }
     *     
     */
    public void setRecognitionMode(RecognitionModeEnum value) {
        this.recognitionMode = value;
    }

}
