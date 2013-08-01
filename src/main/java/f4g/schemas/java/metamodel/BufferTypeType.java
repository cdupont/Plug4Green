//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.metamodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BufferTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BufferTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Buffered"/>
 *     &lt;enumeration value="Unbuffered"/>
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Fully Buffered"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BufferTypeType")
@XmlEnum
public enum BufferTypeType {

    @XmlEnumValue("Buffered")
    BUFFERED("Buffered"),
    @XmlEnumValue("Unbuffered")
    UNBUFFERED("Unbuffered"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Fully Buffered")
    FULLY_BUFFERED("Fully Buffered"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BufferTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BufferTypeType fromValue(String v) {
        for (BufferTypeType c: BufferTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}