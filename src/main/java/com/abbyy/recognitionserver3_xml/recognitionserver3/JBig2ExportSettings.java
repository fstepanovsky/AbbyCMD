
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JBig2ExportSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JBig2ExportSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFormatSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JBig2ExportSettings", propOrder = {
    "resolution"
})
public class JBig2ExportSettings
    extends OutputFormatSettings
{

    @XmlElement(name = "Resolution")
    protected int resolution;

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

}
