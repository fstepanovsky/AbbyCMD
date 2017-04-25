
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AltoExportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltoExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFormatSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TextCoordinatesParticularity" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}TextCoordinatesParticularityEnum"/&gt;
 *         &lt;element name="FontFormattingMode" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}FontFormattingModeEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltoExportSettings", propOrder = {
    "textCoordinatesParticularity",
    "fontFormattingMode"
})
public class AltoExportSettings
    extends OutputFormatSettings
{

    @XmlElement(name = "TextCoordinatesParticularity", required = true)
    @XmlSchemaType(name = "string")
    protected TextCoordinatesParticularityEnum textCoordinatesParticularity;
    @XmlElement(name = "FontFormattingMode", required = true)
    @XmlSchemaType(name = "string")
    protected FontFormattingModeEnum fontFormattingMode;

    /**
     * Gets the value of the textCoordinatesParticularity property.
     * 
     * @return
     *     possible object is
     *     {@link TextCoordinatesParticularityEnum }
     *     
     */
    public TextCoordinatesParticularityEnum getTextCoordinatesParticularity() {
        return textCoordinatesParticularity;
    }

    /**
     * Sets the value of the textCoordinatesParticularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextCoordinatesParticularityEnum }
     *     
     */
    public void setTextCoordinatesParticularity(TextCoordinatesParticularityEnum value) {
        this.textCoordinatesParticularity = value;
    }

    /**
     * Gets the value of the fontFormattingMode property.
     * 
     * @return
     *     possible object is
     *     {@link FontFormattingModeEnum }
     *     
     */
    public FontFormattingModeEnum getFontFormattingMode() {
        return fontFormattingMode;
    }

    /**
     * Sets the value of the fontFormattingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontFormattingModeEnum }
     *     
     */
    public void setFontFormattingMode(FontFormattingModeEnum value) {
        this.fontFormattingMode = value;
    }

}
