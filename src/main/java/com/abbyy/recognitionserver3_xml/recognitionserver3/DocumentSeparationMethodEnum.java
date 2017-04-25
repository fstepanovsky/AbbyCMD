
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSeparationMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentSeparationMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DSM_OneFilePerImage"/&gt;
 *     &lt;enumeration value="DSM_ByNumberOfPages"/&gt;
 *     &lt;enumeration value="DSM_ByBlankPages"/&gt;
 *     &lt;enumeration value="DSM_ByBarcode"/&gt;
 *     &lt;enumeration value="DSM_MergeIntoSingleFile"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentSeparationMethodEnum")
@XmlEnum
public enum DocumentSeparationMethodEnum {

    @XmlEnumValue("DSM_OneFilePerImage")
    DSM_ONE_FILE_PER_IMAGE("DSM_OneFilePerImage"),
    @XmlEnumValue("DSM_ByNumberOfPages")
    DSM_BY_NUMBER_OF_PAGES("DSM_ByNumberOfPages"),
    @XmlEnumValue("DSM_ByBlankPages")
    DSM_BY_BLANK_PAGES("DSM_ByBlankPages"),
    @XmlEnumValue("DSM_ByBarcode")
    DSM_BY_BARCODE("DSM_ByBarcode"),
    @XmlEnumValue("DSM_MergeIntoSingleFile")
    DSM_MERGE_INTO_SINGLE_FILE("DSM_MergeIntoSingleFile");
    private final String value;

    DocumentSeparationMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentSeparationMethodEnum fromValue(String v) {
        for (DocumentSeparationMethodEnum c: DocumentSeparationMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
