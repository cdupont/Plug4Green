//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 04:34:50 PM CEST 
//


package f4g.schemas.java.constraints.optimizerconstraints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.massfords.humantask.Visitable;
import com.massfords.humantask.Visitor;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for Gather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gather"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{f4g/schemas/java/constraints/OptimizerConstraints}PlacementConstraint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VMName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gather", propOrder = {
    "vmName"
})
public class Gather
    extends PlacementConstraint
    implements Cloneable, Visitable, CopyTo
{

    @XmlElement(name = "VMName", required = true)
    protected List<String> vmName;

    /**
     * Default no-arg constructor
     * 
     */
    public Gather() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Gather(final List<String> vmName) {
        super();
        this.vmName = vmName;
    }

    /**
     * Gets the value of the vmName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVMName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVMName() {
        if (vmName == null) {
            vmName = new ArrayList<String>();
        }
        return this.vmName;
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof Gather) {
            final Gather copy = ((Gather) draftCopy);
            if ((this.vmName!= null)&&(!this.vmName.isEmpty())) {
                List<String> sourceVMName;
                sourceVMName = (((this.vmName!= null)&&(!this.vmName.isEmpty()))?this.getVMName():null);
                @SuppressWarnings("unchecked")
                List<String> copyVMName = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "vmName", sourceVMName), sourceVMName));
                copy.vmName = null;
                if (copyVMName!= null) {
                    List<String> uniqueVMNamel = copy.getVMName();
                    uniqueVMNamel.addAll(copyVMName);
                }
            } else {
                copy.vmName = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Gather();
    }

}
