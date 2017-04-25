
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFEncryptionLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PDFEncryptionLevelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PEL_Low"/&gt;
 *     &lt;enumeration value="PEL_High"/&gt;
 *     &lt;enumeration value="PEL_HighAES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PDFEncryptionLevelEnum")
@XmlEnum
public enum PDFEncryptionLevelEnum {

    @XmlEnumValue("PEL_Low")
    PEL_LOW("PEL_Low"),
    @XmlEnumValue("PEL_High")
    PEL_HIGH("PEL_High"),
    @XmlEnumValue("PEL_HighAES")
    PEL_HIGH_AES("PEL_HighAES");
    private final String value;

    PDFEncryptionLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDFEncryptionLevelEnum fromValue(String v) {
        for (PDFEncryptionLevelEnum c: PDFEncryptionLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
