
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies whether this is a product/ service that requires a signature or for which ID is required.
 * S – Signature required
 * I – ID required (not in use, a future requirement)
 * 
 * <p>Java class for requiredAtDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requiredAtDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requiredAtDeliveryCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requiredAtDeliveryType", propOrder = {
    "requiredAtDeliveryCode"
})
public class RequiredAtDeliveryType {

    @XmlElement(required = true)
    protected ReferenceDataType requiredAtDeliveryCode;

    /**
     * Gets the value of the requiredAtDeliveryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getRequiredAtDeliveryCode() {
        return requiredAtDeliveryCode;
    }

    /**
     * Sets the value of the requiredAtDeliveryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setRequiredAtDeliveryCode(ReferenceDataType value) {
        this.requiredAtDeliveryCode = value;
    }

}
