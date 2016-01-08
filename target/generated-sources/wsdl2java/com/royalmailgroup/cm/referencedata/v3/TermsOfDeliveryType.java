
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * International Commercial Terms, 3 Letter Trade Terms, Commercial Invoice Purposes
 * 
 * <p>Java class for termsOfDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="termsOfDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="termsOfDeliveryCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termsOfDeliveryType", propOrder = {
    "termsOfDeliveryCode"
})
public class TermsOfDeliveryType {

    @XmlElement(required = true)
    protected ReferenceDataType termsOfDeliveryCode;

    /**
     * Gets the value of the termsOfDeliveryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getTermsOfDeliveryCode() {
        return termsOfDeliveryCode;
    }

    /**
     * Sets the value of the termsOfDeliveryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setTermsOfDeliveryCode(ReferenceDataType value) {
        this.termsOfDeliveryCode = value;
    }

}
