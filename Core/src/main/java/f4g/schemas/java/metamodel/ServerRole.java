//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.metamodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServerRole"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HPC_COMPUTE_NODE"/&gt;
 *     &lt;enumeration value="HPC_RESOURCE_MANAGEMENT"/&gt;
 *     &lt;enumeration value="CLOUD_CONTROLLER"/&gt;
 *     &lt;enumeration value="CLOUD_CLUSTER_CONTROLLER"/&gt;
 *     &lt;enumeration value="CLOUD_NODE_CONTROLLER"/&gt;
 *     &lt;enumeration value="TRADITIONAL_HOST"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServerRole")
@XmlEnum
public enum ServerRole {

    HPC_COMPUTE_NODE,
    HPC_RESOURCE_MANAGEMENT,
    CLOUD_CONTROLLER,
    CLOUD_CLUSTER_CONTROLLER,
    CLOUD_NODE_CONTROLLER,
    TRADITIONAL_HOST,
    OTHER;

    public String value() {
        return name();
    }

    public static ServerRole fromValue(String v) {
        return valueOf(v);
    }

}
