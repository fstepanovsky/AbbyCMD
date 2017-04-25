
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSVExportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSVExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFormatSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodePage" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}CodePageEnum"/&gt;
 *         &lt;element name="EncodingType" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}TextEncodingTypeEnum"/&gt;
 *         &lt;element name="TabSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreTextOutsideTables" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UsePageBreaks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSVExportSettings", propOrder = {
    "codePage",
    "encodingType",
    "tabSeparator",
    "ignoreTextOutsideTables",
    "usePageBreaks"
})
public class CSVExportSettings
    extends OutputFormatSettings
{

    @XmlElement(name = "CodePage", required = true)
    @XmlSchemaType(name = "string")
    protected CodePageEnum codePage;
    @XmlElement(name = "EncodingType", required = true)
    @XmlSchemaType(name = "string")
    protected TextEncodingTypeEnum encodingType;
    @XmlElement(name = "TabSeparator")
    protected String tabSeparator;
    @XmlElement(name = "IgnoreTextOutsideTables")
    protected boolean ignoreTextOutsideTables;
    @XmlElement(name = "UsePageBreaks")
    protected boolean usePageBreaks;

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

    /**
     * Gets the value of the tabSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabSeparator() {
        return tabSeparator;
    }

    /**
     * Sets the value of the tabSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabSeparator(String value) {
        this.tabSeparator = value;
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

    /**
     * Gets the value of the usePageBreaks property.
     * 
     */
    public boolean isUsePageBreaks() {
        return usePageBreaks;
    }

    /**
     * Sets the value of the usePageBreaks property.
     * 
     */
    public void setUsePageBreaks(boolean value) {
        this.usePageBreaks = value;
    }

}
