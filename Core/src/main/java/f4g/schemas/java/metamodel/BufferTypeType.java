//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.metamodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BufferTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BufferTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Buffered"/&gt;
 *     &lt;enumeration value="Unbuffered"/&gt;
 *     &lt;enumeration value="Registered"/&gt;
 *     &lt;enumeration value="Fully Buffered"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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