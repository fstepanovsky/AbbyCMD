
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageColorModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageColorModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ICM_AsIs"/&gt;
 *     &lt;enumeration value="ICM_Color"/&gt;
 *     &lt;enumeration value="ICM_Gray"/&gt;
 *     &lt;enumeration value="ICM_BlackAndWhite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageColorModeEnum")
@XmlEnum
public enum ImageColorModeEnum {

    @XmlEnumValue("ICM_AsIs")
    ICM_AS_IS("ICM_AsIs"),
    @XmlEnumValue("ICM_Color")
    ICM_COLOR("ICM_Color"),
    @XmlEnumValue("ICM_Gray")
    ICM_GRAY("ICM_Gray"),
    @XmlEnumValue("ICM_BlackAndWhite")
    ICM_BLACK_AND_WHITE("ICM_BlackAndWhite");
    private final String value;

    ImageColorModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageColorModeEnum fromValue(String v) {
        for (ImageColorModeEnum c: ImageColorModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
