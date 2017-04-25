
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HTMLExportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HTMLExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFormatSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodePage" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}CodePageEnum"/&gt;
 *         &lt;element name="HTMLSynthesisMode" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}HTMLSynthesisModeEnum"/&gt;
 *         &lt;element name="AllowCss" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WritePictures" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EncodingType" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}TextEncodingTypeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HTMLExportSettings", propOrder = {
    "codePage",
    "htmlSynthesisMode",
    "allowCss",
    "writePictures",
    "encodingType"
})
public class HTMLExportSettings
    extends OutputFormatSettings
{

    @XmlElement(name = "CodePage", required = true)
    @XmlSchemaType(name = "string")
    protected CodePageEnum codePage;
    @XmlElement(name = "HTMLSynthesisMode", required = true)
    @XmlSchemaType(name = "string")
    protected HTMLSynthesisModeEnum htmlSynthesisMode;
    @XmlElement(name = "AllowCss")
    protected boolean allowCss;
    @XmlElement(name = "WritePictures")
    protected boolean writePictures;
    @XmlElement(name = "EncodingType", required = true)
    @XmlSchemaType(name = "string")
    protected TextEncodingTypeEnum encodingType;

    /**
     * Gets the value of the codePage property.
     * 
     * @return
     *     possible object is
     *     {@link CodePageEnum }
     *     
     */
    public CodePageEnum getCodePage() {
        return codePage;
    }

    /**
     * Sets the value of the codePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodePageEnum }
     *     
     */
    public void setCodePage(CodePageEnum value) {
        this.codePage = value;
    }

    /**
     * Gets the value of the htmlSynthesisMode property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLSynthesisModeEnum }
     *     
     */
    public HTMLSynthesisModeEnum getHTMLSynthesisMode() {
        return htmlSynthesisMode;
    }

    /**
     * Sets the value of the htmlSynthesisMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLSynthesisModeEnum }
     *     
     */
    public void setHTMLSynthesisMode(HTMLSynthesisModeEnum value) {
        this.htmlSynthesisMode = value;
    }

    /**
     * Gets the value of the allowCss property.
     * 
     */
    public boolean isAllowCss() {
        return allowCss;
    }

    /**
     * Sets the value of the allowCss property.
     * 
     */
    public void setAllowCss(boolean value) {
        this.allowCss = value;
    }

    /**
     * Gets the value of the writePictures property.
     * 
     */
    public boolean isWritePictures() {
        return writePictures;
    }

    /**
     * Sets the value of the writePictures property.
     * 
     */
    public void setWritePictures(boolean value) {
        this.writePictures = value;
    }

    /**
     * Gets the value of the encodingType property.
     * 
     * @return
     *     possible object is
     *     {@link TextEncodingTypeEnum }
     *     
     */
    public TextEncodingTypeEnum getEncodingType() {
        return encodingType;
    }

    /**
     * Sets the value of the encodingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextEncodingTypeEnum }
     *     
     */
    public void setEncodingType(TextEncodingTypeEnum value) {
        this.encodingType = value;
    }

}
