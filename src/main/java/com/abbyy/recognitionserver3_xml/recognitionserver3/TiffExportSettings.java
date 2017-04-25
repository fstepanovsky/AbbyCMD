
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TiffExportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TiffExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFormatSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Compression" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}ImageCompressionTypeEnum"/&gt;
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ColorMode" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}ImageColorModeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TiffExportSettings", propOrder = {
    "compression",
    "resolution",
    "colorMode"
})
public class TiffExportSettings
    extends OutputFormatSettings
{

    @XmlElement(name = "Compression", required = true)
    @XmlSchemaType(name = "string")
    protected ImageCompressionTypeEnum compression;
    @XmlElement(name = "Resolution")
    protected int resolution;
    @XmlElement(name = "ColorMode", required = true)
    @XmlSchemaType(name = "string")
    protected ImageColorModeEnum colorMode;

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link ImageCompressionTypeEnum }
     *     
     */
    public ImageCompressionTypeEnum getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCompressionTypeEnum }
     *     
     */
    public void setCompression(ImageCompressionTypeEnum value) {
        this.compression = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     */
    public int getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     */
    public void setResolution(int value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the colorMode property.
     * 
     * @return
     *     possible object is
     *     {@link ImageColorModeEnum }
     *     
     */
    public ImageColorModeEnum getColorMode() {
        return colorMode;
    }

    /**
     * Sets the value of the colorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageColorModeEnum }
     *     
     */
    public void setColorMode(ImageColorModeEnum value) {
        this.colorMode = value;
    }

}
