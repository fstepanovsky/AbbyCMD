
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageCompressionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageCompressionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ICT_Uncompressed"/&gt;
 *     &lt;enumeration value="ICT_Zip"/&gt;
 *     &lt;enumeration value="ICT_Group3"/&gt;
 *     &lt;enumeration value="ICT_Group4"/&gt;
 *     &lt;enumeration value="ICT_PackBits"/&gt;
 *     &lt;enumeration value="ICT_Jpeg"/&gt;
 *     &lt;enumeration value="ICT_Lzw"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageCompressionTypeEnum")
@XmlEnum
public enum ImageCompressionTypeEnum {

    @XmlEnumValue("ICT_Uncompressed")
    ICT_UNCOMPRESSED("ICT_Uncompressed"),
    @XmlEnumValue("ICT_Zip")
    ICT_ZIP("ICT_Zip"),
    @XmlEnumValue("ICT_Group3")
    ICT_GROUP_3("ICT_Group3"),
    @XmlEnumValue("ICT_Group4")
    ICT_GROUP_4("ICT_Group4"),
    @XmlEnumValue("ICT_PackBits")
    ICT_PACK_BITS("ICT_PackBits"),
    @XmlEnumValue("ICT_Jpeg")
    ICT_JPEG("ICT_Jpeg"),
    @XmlEnumValue("ICT_Lzw")
    ICT_LZW("ICT_Lzw");
    private final String value;

    ImageCompressionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageCompressionTypeEnum fromValue(String v) {
        for (ImageCompressionTypeEnum c: ImageCompressionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
