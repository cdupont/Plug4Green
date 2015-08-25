//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.metamodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import com.massfords.humantask.Named;
import com.massfords.humantask.Visitable;
import com.massfords.humantask.Visitor;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for RAID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RAID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="level" type="{f4g/schemas/java/MetaModel}RAIDLevel"/&gt;
 *         &lt;element name="computedPower" type="{f4g/schemas/java/MetaModel}Power" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}SolidStateDisk" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{f4g/schemas/java/MetaModel}HardDisk" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RAID", propOrder = {
    "level",
    "computedPower",
    "solidStateDisk",
    "hardDisk"
})
@XmlSeeAlso({
    SoftwareRAID.class,
    HardwareRAID.class
})
public class RAID implements Cloneable, Named, Visitable, CopyTo
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "int")
    protected RAIDLevel level;
    @XmlSchemaType(name = "double")
    protected Power computedPower;
    @XmlElement(name = "SolidStateDisk", namespace = "f4g/schemas/java/MetaModel")
    protected List<SolidStateDisk> solidStateDisk;
    @XmlElement(name = "HardDisk", namespace = "f4g/schemas/java/MetaModel")
    protected List<HardDisk> hardDisk;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlTransient
    private QName jaxbElementName;

    /**
     * Default no-arg constructor
     * 
     */
    public RAID() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RAID(final RAIDLevel level, final Power computedPower, final List<SolidStateDisk> solidStateDisk, final List<HardDisk> hardDisk, final String id, final QName jaxbElementName) {
        this.level = level;
        this.computedPower = computedPower;
        this.solidStateDisk = solidStateDisk;
        this.hardDisk = hardDisk;
        this.id = id;
        this.jaxbElementName = jaxbElementName;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link RAIDLevel }
     *     
     */
    public RAIDLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link RAIDLevel }
     *     
     */
    public void setLevel(RAIDLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the computedPower property.
     * 
     * @return
     *     possible object is
     *     {@link Power }
     *     
     */
    public Power getComputedPower() {
        return computedPower;
    }

    /**
     * Sets the value of the computedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Power }
     *     
     */
    public void setComputedPower(Power value) {
        this.computedPower = value;
    }

    /**
     * Gets the value of the solidStateDisk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solidStateDisk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolidStateDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SolidStateDisk }
     * 
     * 
     */
    public List<SolidStateDisk> getSolidStateDisk() {
        if (solidStateDisk == null) {
            solidStateDisk = new ArrayList<SolidStateDisk>();
        }
        return this.solidStateDisk;
    }

    /**
     * Gets the value of the hardDisk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardDisk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardDisk }
     * 
     * 
     */
    public List<HardDisk> getHardDisk() {
        if (hardDisk == null) {
            hardDisk = new ArrayList<HardDisk>();
        }
        return this.hardDisk;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public void setJAXBElementName(QName name) {
        this.jaxbElementName = name;
    }

    public QName getJAXBElementName() {
        return this.jaxbElementName;
    }

    public void afterUnmarshal(Unmarshaller u, Object parent) {
        if (parent instanceof JAXBElement) {
            this.jaxbElementName = ((JAXBElement) parent).getName();
        }
    }

    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof RAID) {
            final RAID copy = ((RAID) draftCopy);
            if (this.level!= null) {
                RAIDLevel sourceLevel;
                sourceLevel = this.getLevel();
                RAIDLevel copyLevel = ((RAIDLevel) strategy.copy(LocatorUtils.property(locator, "level", sourceLevel), sourceLevel));
                copy.setLevel(copyLevel);
            } else {
                copy.level = null;
            }
            if (this.computedPower!= null) {
                Power sourceComputedPower;
                sourceComputedPower = this.getComputedPower();
                Power copyComputedPower = ((Power) strategy.copy(LocatorUtils.property(locator, "computedPower", sourceComputedPower), sourceComputedPower));
                copy.setComputedPower(copyComputedPower);
            } else {
                copy.computedPower = null;
            }
            if ((this.solidStateDisk!= null)&&(!this.solidStateDisk.isEmpty())) {
                List<SolidStateDisk> sourceSolidStateDisk;
                sourceSolidStateDisk = (((this.solidStateDisk!= null)&&(!this.solidStateDisk.isEmpty()))?this.getSolidStateDisk():null);
                @SuppressWarnings("unchecked")
                List<SolidStateDisk> copySolidStateDisk = ((List<SolidStateDisk> ) strategy.copy(LocatorUtils.property(locator, "solidStateDisk", sourceSolidStateDisk), sourceSolidStateDisk));
                copy.solidStateDisk = null;
                if (copySolidStateDisk!= null) {
                    List<SolidStateDisk> uniqueSolidStateDiskl = copy.getSolidStateDisk();
                    uniqueSolidStateDiskl.addAll(copySolidStateDisk);
                }
            } else {
                copy.solidStateDisk = null;
            }
            if ((this.hardDisk!= null)&&(!this.hardDisk.isEmpty())) {
                List<HardDisk> sourceHardDisk;
                sourceHardDisk = (((this.hardDisk!= null)&&(!this.hardDisk.isEmpty()))?this.getHardDisk():null);
                @SuppressWarnings("unchecked")
                List<HardDisk> copyHardDisk = ((List<HardDisk> ) strategy.copy(LocatorUtils.property(locator, "hardDisk", sourceHardDisk), sourceHardDisk));
                copy.hardDisk = null;
                if (copyHardDisk!= null) {
                    List<HardDisk> uniqueHardDiskl = copy.getHardDisk();
                    uniqueHardDiskl.addAll(copyHardDisk);
                }
            } else {
                copy.hardDisk = null;
            }
            if (this.id!= null) {
                String sourceId;
                sourceId = this.getId();
                String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RAID();
    }

}