
package com.abbyy.recognitionserver3_xml.recognitionserver3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFileFormatEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputFileFormatEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFF_MSWord"/&gt;
 *     &lt;enumeration value="OFF_MSExcel"/&gt;
 *     &lt;enumeration value="OFF_RTF"/&gt;
 *     &lt;enumeration value="OFF_XML"/&gt;
 *     &lt;enumeration value="OFF_PDF"/&gt;
 *     &lt;enumeration value="OFF_PDFA"/&gt;
 *     &lt;enumeration value="OFF_Text"/&gt;
 *     &lt;enumeration value="OFF_CSV"/&gt;
 *     &lt;enumeration value="OFF_HTML"/&gt;
 *     &lt;enumeration value="OFF_NoConversion"/&gt;
 *     &lt;enumeration value="OFF_TIFF"/&gt;
 *     &lt;enumeration value="OFF_JPG"/&gt;
 *     &lt;enumeration value="OFF_J2K"/&gt;
 *     &lt;enumeration value="OFF_InternalFormat"/&gt;
 *     &lt;enumeration value="OFF_DOCX"/&gt;
 *     &lt;enumeration value="OFF_XLSX"/&gt;
 *     &lt;enumeration value="OFF_JBIG2"/&gt;
 *     &lt;enumeration value="OFF_ALTO"/&gt;
 *     &lt;enumeration value="OFF_EPUB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutputFileFormatEnum")
@XmlEnum
public enum OutputFileFormatEnum {

    @XmlEnumValue("OFF_MSWord")
    OFF_MS_WORD("OFF_MSWord"),
    @XmlEnumValue("OFF_MSExcel")
    OFF_MS_EXCEL("OFF_MSExcel"),
    OFF_RTF("OFF_RTF"),
    OFF_XML("OFF_XML"),
    OFF_PDF("OFF_PDF"),
    OFF_PDFA("OFF_PDFA"),
    @XmlEnumValue("OFF_Text")
    OFF_TEXT("OFF_Text"),
    OFF_CSV("OFF_CSV"),
    OFF_HTML("OFF_HTML"),
    @XmlEnumValue("OFF_NoConversion")
    OFF_NO_CONVERSION("OFF_NoConversion"),
    OFF_TIFF("OFF_TIFF"),
    OFF_JPG("OFF_JPG"),
    @XmlEnumValue("OFF_J2K")
    OFF_J_2_K("OFF_J2K"),
    @XmlEnumValue("OFF_InternalFormat")
    OFF_INTERNAL_FORMAT("OFF_InternalFormat"),
    OFF_DOCX("OFF_DOCX"),
    OFF_XLSX("OFF_XLSX"),
    @XmlEnumValue("OFF_JBIG2")
    OFF_JBIG_2("OFF_JBIG2"),
    OFF_ALTO("OFF_ALTO"),
    OFF_EPUB("OFF_EPUB");
    private final String value;

    OutputFileFormatEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputFileFormatEnum fromValue(String v) {
        for (OutputFileFormatEnum c: OutputFileFormatEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
