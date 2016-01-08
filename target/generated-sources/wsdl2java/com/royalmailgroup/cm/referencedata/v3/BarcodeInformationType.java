
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the RMG barcode payload for each product type. For example, ‘4’ - OLP-Consumer Services Channels
 * 
 * <p>Java class for barcodeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="barcodeInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barcodeInformationCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "barcodeInformationType", propOrder = {
    "barcodeInformationCode"
})
public class BarcodeInformationType {

    @XmlElement(required = true)
    protected ReferenceDataType barcodeInformationCode;

    /**
     * Gets the value of the barcodeInformationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getBarcodeInformationCode() {
        return barcodeInformationCode;
    }

    /**
     * Sets the value of the barcodeInformationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setBarcodeInformationCode(ReferenceDataType value) {
        this.barcodeInformationCode = value;
    }

}
