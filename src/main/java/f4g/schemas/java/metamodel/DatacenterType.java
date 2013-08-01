//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 04:14:30 PM CEST 
//


package java.metamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatacenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatacenterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="computingStyle" type="{java/MetaModel}DCComputingStyleType"/>
 *         &lt;element ref="{java/MetaModel}ApplicationBenchmark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="computedPower" type="{java/MetaModel}PowerType" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}Rack" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}TowerServer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}BoxRouter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}BoxSwitch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}FrameworkCapabilities" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{java/MetaModel}NetworkLoad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterType", propOrder = {
    "name",
    "computingStyle",
    "applicationBenchmark",
    "computedPower",
    "rack",
    "towerServer",
    "boxRouter",
    "boxSwitch",
    "frameworkCapabilities",
    "networkLoad"
})
public class DatacenterType {

    protected String name;
    @XmlElement(required = true)
    protected DCComputingStyleType computingStyle;
    @XmlElement(name = "ApplicationBenchmark", namespace = "java/MetaModel")
    protected List<ApplicationBenchmarkType> applicationBenchmark;
    protected PowerType computedPower;
    @XmlElement(name = "Rack", namespace = "java/MetaModel")
    protected List<RackType> rack;
    @XmlElement(name = "TowerServer", namespace = "java/MetaModel")
    protected List<TowerServerType> towerServer;
    @XmlElement(name = "BoxRouter", namespace = "java/MetaModel")
    protected List<BoxRouterType> boxRouter;
    @XmlElement(name = "BoxSwitch", namespace = "java/MetaModel")
    protected List<BoxSwitchType> boxSwitch;
    @XmlElement(name = "FrameworkCapabilities", namespace = "java/MetaModel")
    protected List<FrameworkCapabilitiesType> frameworkCapabilities;
    @XmlElement(name = "NetworkLoad", namespace = "java/MetaModel")
    protected NetworkLoadType networkLoad;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the computingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link DCComputingStyleType }
     *     
     */
    public DCComputingStyleType getComputingStyle() {
        return computingStyle;
    }

    /**
     * Sets the value of the computingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCComputingStyleType }
     *     
     */
    public void setComputingStyle(DCComputingStyleType value) {
        this.computingStyle = value;
    }

    /**
     * Gets the value of the applicationBenchmark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationBenchmark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationBenchmark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationBenchmarkType }
     * 
     * 
     */
    public List<ApplicationBenchmarkType> getApplicationBenchmark() {
        if (applicationBenchmark == null) {
            applicationBenchmark = new ArrayList<ApplicationBenchmarkType>();
        }
        return this.applicationBenchmark;
    }

    /**
     * Gets the value of the computedPower property.
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getComputedPower() {
        return computedPower;
    }

    /**
     * Sets the value of the computedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setComputedPower(PowerType value) {
        this.computedPower = value;
    }

    /**
     * Gets the value of the rack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RackType }
     * 
     * 
     */
    public List<RackType> getRack() {
        if (rack == null) {
            rack = new ArrayList<RackType>();
        }
        return this.rack;
    }

    /**
     * Gets the value of the towerServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the towerServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTowerServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TowerServerType }
     * 
     * 
     */
    public List<TowerServerType> getTowerServer() {
        if (towerServer == null) {
            towerServer = new ArrayList<TowerServerType>();
        }
        return this.towerServer;
    }

    /**
     * Gets the value of the boxRouter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxRouter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxRouter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxRouterType }
     * 
     * 
     */
    public List<BoxRouterType> getBoxRouter() {
        if (boxRouter == null) {
            boxRouter = new ArrayList<BoxRouterType>();
        }
        return this.boxRouter;
    }

    /**
     * Gets the value of the boxSwitch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxSwitch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxSwitchType }
     * 
     * 
     */
    public List<BoxSwitchType> getBoxSwitch() {
        if (boxSwitch == null) {
            boxSwitch = new ArrayList<BoxSwitchType>();
        }
        return this.boxSwitch;
    }

    /**
     * Gets the value of the frameworkCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameworkCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrameworkCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrameworkCapabilitiesType }
     * 
     * 
     */
    public List<FrameworkCapabilitiesType> getFrameworkCapabilities() {
        if (frameworkCapabilities == null) {
            frameworkCapabilities = new ArrayList<FrameworkCapabilitiesType>();
        }
        return this.frameworkCapabilities;
    }

    /**
     * Gets the value of the networkLoad property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkLoadType }
     *     
     */
    public NetworkLoadType getNetworkLoad() {
        return networkLoad;
    }

    /**
     * Sets the value of the networkLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkLoadType }
     *     
     */
    public void setNetworkLoad(NetworkLoadType value) {
        this.networkLoad = value;
    }

}