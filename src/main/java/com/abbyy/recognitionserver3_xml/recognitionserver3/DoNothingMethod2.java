
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stub" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}StubDocumentAttributesCollection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stub"
})
@XmlRootElement(name = "DoNothingMethod2")
public class DoNothingMethod2 {

    protected StubDocumentAttributesCollection stub;

    /**
     * Gets the value of the stub property.
     * 
     * @return
     *     possible object is
     *     {@link StubDocumentAttributesCollection }
     *     
     */
    public StubDocumentAttributesCollection getStub() {
        return stub;
    }

    /**
     * Sets the value of the stub property.
     * 
     * @param value
     *     allowed object is
     *     {@link StubDocumentAttributesCollection }
     *     
     */
    public void setStub(StubDocumentAttributesCollection value) {
        this.stub = value;
    }

}
