
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RotationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RotationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RT_NoRotation"/&gt;
 *     &lt;enumeration value="RT_Automatic"/&gt;
 *     &lt;enumeration value="RT_Clockwise"/&gt;
 *     &lt;enumeration value="RT_Counterclockwise"/&gt;
 *     &lt;enumeration value="RT_Upsidedown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RotationTypeEnum")
@XmlEnum
public enum RotationTypeEnum {

    @XmlEnumValue("RT_NoRotation")
    RT_NO_ROTATION("RT_NoRotation"),
    @XmlEnumValue("RT_Automatic")
    RT_AUTOMATIC("RT_Automatic"),
    @XmlEnumValue("RT_Clockwise")
    RT_CLOCKWISE("RT_Clockwise"),
    @XmlEnumValue("RT_Counterclockwise")
    RT_COUNTERCLOCKWISE("RT_Counterclockwise"),
    @XmlEnumValue("RT_Upsidedown")
    RT_UPSIDEDOWN("RT_Upsidedown");
    private final String value;

    RotationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RotationTypeEnum fromValue(String v) {
        for (RotationTypeEnum c: RotationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
