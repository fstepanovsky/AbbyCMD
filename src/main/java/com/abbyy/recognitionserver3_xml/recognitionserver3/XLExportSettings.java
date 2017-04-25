
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XLExportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XLExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFormatSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConvertNumericValuesToNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IgnoreTextOutsideTables" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLExportSettings", propOrder = {
    "convertNumericValuesToNumbers",
    "ignoreTextOutsideTables"
})
public class XLExportSettings
    extends OutputFormatSettings
{

    @XmlElement(name = "ConvertNumericValuesToNumbers")
    protected boolean convertNumericValuesToNumbers;
    @XmlElement(name = "IgnoreTextOutsideTables")
    protected boolean ignoreTextOutsideTables;

    /**
     * Gets the value of the convertNumericValuesToNumbers property.
     * 
     */
    public boolean isConvertNumericValuesToNumbers() {
        return convertNumericValuesToNumbers;
    }

    /**
     * Sets the value of the convertNumericValuesToNumbers property.
     * 
     */
    public void setConvertNumericValuesToNumbers(boolean value) {
        this.convertNumericValuesToNumbers = value;
    }

    /**
     * Gets the value of the ignoreTextOutsideTables property.
     * 
     */
    public boolean isIgnoreTextOutsideTables() {
        return ignoreTextOutsideTables;
    }

    /**
     * Sets the value of the ignoreTextOutsideTables property.
     * 
     */
    public void setIgnoreTextOutsideTables(boolean value) {
        this.ignoreTextOutsideTables = value;
    }

}
