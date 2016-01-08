
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the type of dimension recorded for the Mail Item
 *  0 – Not Declared
 *  1 – Exact
 *  2 – Best Fit
 *  3 – Approximate
 * More values will be added with future requirements.
 * 
 * <p>Java class for dimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dimensionCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimensionType", propOrder = {
    "dimensionCode"
})
public class DimensionType {

    @XmlElement(required = true)
    protected ReferenceDataType dimensionCode;

    /**
     * Gets the value of the dimensionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getDimensionCode() {
        return dimensionCode;
    }

    /**
     * Sets the value of the dimensionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setDimensionCode(ReferenceDataType value) {
        this.dimensionCode = value;
    }

}
