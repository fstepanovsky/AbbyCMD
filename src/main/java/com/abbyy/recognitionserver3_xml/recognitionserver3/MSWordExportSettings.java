
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSWordExportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSWordExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFormatSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RTFSynthesisMode" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}RTFSynthesisModeEnum"/&gt;
 *         &lt;element name="PaperWidth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PaperHeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ForceFixedPageSize" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WritePictures" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HighlightErrorsWithBackgroundColor" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSWordExportSettings", propOrder = {
    "rtfSynthesisMode",
    "paperWidth",
    "paperHeight",
    "forceFixedPageSize",
    "writePictures",
    "highlightErrorsWithBackgroundColor"
})
public class MSWordExportSettings
    extends OutputFormatSettings
{

    @XmlElement(name = "RTFSynthesisMode", required = true)
    @XmlSchemaType(name = "string")
    protected RTFSynthesisModeEnum rtfSynthesisMode;
    @XmlElement(name = "PaperWidth")
    protected int paperWidth;
    @XmlElement(name = "PaperHeight")
    protected int paperHeight;
    @XmlElement(name = "ForceFixedPageSize")
    protected boolean forceFixedPageSize;
    @XmlElement(name = "WritePictures")
    protected boolean writePictures;
    @XmlElement(name = "HighlightErrorsWithBackgroundColor")
    protected boolean highlightErrorsWithBackgroundColor;

    /**
     * Gets the value of the rtfSynthesisMode property.
     * 
     * @return
     *     possible object is
     *     {@link RTFSynthesisModeEnum }
     *     
     */
    public RTFSynthesisModeEnum getRTFSynthesisMode() {
        return rtfSynthesisMode;
    }

    /**
     * Sets the value of the rtfSynthesisMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTFSynthesisModeEnum }
     *     
     */
    public void setRTFSynthesisMode(RTFSynthesisModeEnum value) {
        this.rtfSynthesisMode = value;
    }

    /**
     * Gets the value of the paperWidth property.
     * 
     */
    public int getPaperWidth() {
        return paperWidth;
    }

    /**
     * Sets the value of the paperWidth property.
     * 
     */
    public void setPaperWidth(int value) {
        this.paperWidth = value;
    }

    /**
     * Gets the value of the paperHeight property.
     * 
     */
    public int getPaperHeight() {
        return paperHeight;
    }

    /**
     * Sets the value of the paperHeight property.
     * 
     */
    public void setPaperHeight(int value) {
        this.paperHeight = value;
    }

    /**
     * Gets the value of the forceFixedPageSize property.
     * 
     */
    public boolean isForceFixedPageSize() {
        return forceFixedPageSize;
    }

    /**
     * Sets the value of the forceFixedPageSize property.
     * 
     */
    public void setForceFixedPageSize(boolean value) {
        this.forceFixedPageSize = value;
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
     * Gets the value of the highlightErrorsWithBackgroundColor property.
     * 
     */
    public boolean isHighlightErrorsWithBackgroundColor() {
        return highlightErrorsWithBackgroundColor;
    }

    /**
     * Sets the value of the highlightErrorsWithBackgroundColor property.
     * 
     */
    public void setHighlightErrorsWithBackgroundColor(boolean value) {
        this.highlightErrorsWithBackgroundColor = value;
    }

}
