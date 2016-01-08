
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the format of the Service being offered. 
 * 
 * <p>Java class for serviceFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceFormatCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceFormatType", propOrder = {
    "serviceFormatCode"
})
public class ServiceFormatType {

    @XmlElement(required = true)
    protected ReferenceDataType serviceFormatCode;

    /**
     * Gets the value of the serviceFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getServiceFormatCode() {
        return serviceFormatCode;
    }

    /**
     * Sets the value of the serviceFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setServiceFormatCode(ReferenceDataType value) {
        this.serviceFormatCode = value;
    }

}
