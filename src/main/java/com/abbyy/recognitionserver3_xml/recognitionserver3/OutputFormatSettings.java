
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormatSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputFormatSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileFormat" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFileFormatEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputFormatSettings", propOrder = {
    "fileFormat"
})
@XmlSeeAlso({
    HTMLExportSettings.class,
    EpubExportSettings.class,
    AltoExportSettings.class,
    XLSXExportSettings.class,
    DOCXExportSettings.class,
    JBig2ExportSettings.class,
    Jpeg2KExportSettings.class,
    JpegExportSettings.class,
    TiffExportSettings.class,
    CSVExportSettings.class,
    XMLExportSettings.class,
    RTFExportSettings.class,
    XLExportSettings.class,
    MSWordExportSettings.class,
    TextExportSettings.class,
    PDFExportSettings.class,
    PDFAExportSettings.class,
    NoConversionExportSettings.class,
    InternalFormatSettings.class
})
public abstract class OutputFormatSettings {

    @XmlElement(name = "FileFormat", required = true)
    @XmlSchemaType(name = "string")
    protected OutputFileFormatEnum fileFormat;

    /**
     * Gets the value of the fileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFileFormatEnum }
     *     
     */
    public OutputFileFormatEnum getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets the value of the fileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFileFormatEnum }
     *     
     */
    public void setFileFormat(OutputFileFormatEnum value) {
        this.fileFormat = value;
    }

}
