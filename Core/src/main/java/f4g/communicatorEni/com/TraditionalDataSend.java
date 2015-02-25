//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.26 at 09:08:25 AM CET 
//


package f4g.communicatorEni.com;

import java.io.Serializable;
import java.util.ArrayList;




public class TraditionalDataSend implements Serializable {

   
	  private static final long serialVersionUID = 1L;
		private Integer numberOfCPUs;
		private Double cpuUsage;
		private Double storageUsage;
		private Double diskIORate;
		private Double memoryUsage;
		private Double networkUsage;
		private String operation;
		private ArrayList<String> cluster;
		private Integer priority;

    /**
     * Gets the value of the numberOfCPUs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCPUs() {
        return numberOfCPUs;
    }

    /**
     * Sets the value of the numberOfCPUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCPUs(Integer value) {
        this.numberOfCPUs = value;
    }

    /**
     * Gets the value of the cpuUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPUUsage() {
        return cpuUsage;
    }

    /**
     * Sets the value of the cpuUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPUUsage(Double value) {
        this.cpuUsage = value;
    }

    /**
     * Gets the value of the storageUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStorageUsage() {
        return storageUsage;
    }

    /**
     * Sets the value of the storageUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStorageUsage(Double value) {
        this.storageUsage = value;
    }

    /**
     * Gets the value of the diskIORate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiskIORate() {
        return diskIORate;
    }

    /**
     * Sets the value of the diskIORate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiskIORate(Double value) {
        this.diskIORate = value;
    }

    /**
     * Gets the value of the memoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMemoryUsage() {
        return memoryUsage;
    }

    /**
     * Sets the value of the memoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMemoryUsage(Double value) {
        this.memoryUsage = value;
    }

    /**
     * Gets the value of the networkUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetworkUsage() {
        return networkUsage;
    }

    /**
     * Sets the value of the networkUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetworkUsage(Double value) {
        this.networkUsage = value;
    }
    
    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }
    
    /**
     * Gets the value of the cluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ArrayList<String> getCluster() {
        return cluster;
    }

    /**
     * Sets the value of the cluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCluster(ArrayList<String> cluster) {
        this.cluster = cluster;
    }
    
    /**
     * 
     * get the priority for the SLAs
     * 
     * @return
     *
     * @author jclegea
     */
    public Integer getPriority() {
    	return priority;
    }
    
    /**
     * 
     * set the priority for the SLAs
     * 
     * @param priority
     *
     * @author jclegea
     */
    public void setPriority(Integer priority) {
    	this.priority = priority; 
    }    

}