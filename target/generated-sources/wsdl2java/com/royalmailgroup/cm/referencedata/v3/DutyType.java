
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a unique list of duty type codes that can be assigned to a type of duty. e.g. driver/vehicle duty or postie duty
 * 
 * <p>Java class for dutyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dutyTypeCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutyType", propOrder = {
    "dutyTypeCode"
})
public class DutyType {

    @XmlElement(required = true)
    protected ReferenceDataType dutyTypeCode;

    /**
     * Gets the value of the dutyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getDutyTypeCode() {
        return dutyTypeCode;
    }

    /**
     * Sets the value of the dutyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setDutyTypeCode(ReferenceDataType value) {
        this.dutyTypeCode = value;
    }

}
