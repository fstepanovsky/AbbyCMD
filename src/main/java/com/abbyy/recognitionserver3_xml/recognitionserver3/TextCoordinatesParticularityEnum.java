
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextCoordinatesParticularityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextCoordinatesParticularityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TCP_Lines"/&gt;
 *     &lt;enumeration value="TCP_Words"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TextCoordinatesParticularityEnum")
@XmlEnum
public enum TextCoordinatesParticularityEnum {

    @XmlEnumValue("TCP_Lines")
    TCP_LINES("TCP_Lines"),
    @XmlEnumValue("TCP_Words")
    TCP_WORDS("TCP_Words");
    private final String value;

    TextCoordinatesParticularityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextCoordinatesParticularityEnum fromValue(String v) {
        for (TextCoordinatesParticularityEnum c: TextCoordinatesParticularityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
