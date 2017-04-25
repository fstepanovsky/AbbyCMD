
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileContents" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="OpenPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileContainer", propOrder = {
    "fileContents",
    "openPassword",
    "locationPath"
})
public class FileContainer {

    @XmlElement(name = "FileContents")
    protected byte[] fileContents;
    @XmlElement(name = "OpenPassword")
    protected String openPassword;
    @XmlElement(name = "LocationPath")
    protected String locationPath;

    /**
     * Gets the value of the fileContents property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileContents() {
        return fileContents;
    }

    /**
     * Sets the value of the fileContents property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileContents(byte[] value) {
        this.fileContents = value;
    }

    /**
     * Gets the value of the openPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenPassword() {
        return openPassword;
    }

    /**
     * Sets the value of the openPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenPassword(String value) {
        this.openPassword = value;
    }

    /**
     * Gets the value of the locationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationPath() {
        return locationPath;
    }

    /**
     * Sets the value of the locationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationPath(String value) {
        this.locationPath = value;
    }

}
