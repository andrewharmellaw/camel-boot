
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The category of the selected operational mailstream using data value from the operational mailstream file
 * 
 * <p>Java class for infeedOperationalMailstreamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infeedOperationalMailstreamType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infeedOperationalMailstreamCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infeedOperationalMailstreamType", propOrder = {
    "infeedOperationalMailstreamCode"
})
public class InfeedOperationalMailstreamType {

    @XmlElement(required = true)
    protected ReferenceDataType infeedOperationalMailstreamCode;

    /**
     * Gets the value of the infeedOperationalMailstreamCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getInfeedOperationalMailstreamCode() {
        return infeedOperationalMailstreamCode;
    }

    /**
     * Sets the value of the infeedOperationalMailstreamCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setInfeedOperationalMailstreamCode(ReferenceDataType value) {
        this.infeedOperationalMailstreamCode = value;
    }

}
