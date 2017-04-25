
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CreateTicketResult" type="{http://www.abbyy.com/RecognitionServer3_xml/RecognitionServer3.xml}XmlTicket" minOccurs="0"/&gt;
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
    "createTicketResult"
})
@XmlRootElement(name = "CreateTicketResponse")
public class CreateTicketResponse {

    @XmlElement(name = "CreateTicketResult")
    protected XmlTicket createTicketResult;

    /**
     * Gets the value of the createTicketResult property.
     * 
     * @return
     *     possible object is
     *     {@link XmlTicket }
     *     
     */
    public XmlTicket getCreateTicketResult() {
        return createTicketResult;
    }

    /**
     * Sets the value of the createTicketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlTicket }
     *     
     */
    public void setCreateTicketResult(XmlTicket value) {
        this.createTicketResult = value;
    }

}
