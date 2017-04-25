
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriorityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="P_Low"/&gt;
 *     &lt;enumeration value="P_BelowNormal"/&gt;
 *     &lt;enumeration value="P_Normal"/&gt;
 *     &lt;enumeration value="P_AboveNormal"/&gt;
 *     &lt;enumeration value="P_High"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriorityEnum")
@XmlEnum
public enum PriorityEnum {

    @XmlEnumValue("P_Low")
    P_LOW("P_Low"),
    @XmlEnumValue("P_BelowNormal")
    P_BELOW_NORMAL("P_BelowNormal"),
    @XmlEnumValue("P_Normal")
    P_NORMAL("P_Normal"),
    @XmlEnumValue("P_AboveNormal")
    P_ABOVE_NORMAL("P_AboveNormal"),
    @XmlEnumValue("P_High")
    P_HIGH("P_High");
    private final String value;

    PriorityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriorityEnum fromValue(String v) {
        for (PriorityEnum c: PriorityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
