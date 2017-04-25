
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOutputFormatSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOutputFormatSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutputFormatSettings" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}OutputFormatSettings" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOutputFormatSettings", propOrder = {
    "outputFormatSettings"
})
public class ArrayOfOutputFormatSettings {

    @XmlElement(name = "OutputFormatSettings", nillable = true)
    protected List<OutputFormatSettings> outputFormatSettings;

    /**
     * Gets the value of the outputFormatSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputFormatSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputFormatSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputFormatSettings }
     * 
     * 
     */
    public List<OutputFormatSettings> getOutputFormatSettings() {
        if (outputFormatSettings == null) {
            outputFormatSettings = new ArrayList<OutputFormatSettings>();
        }
        return this.outputFormatSettings;
    }

}
