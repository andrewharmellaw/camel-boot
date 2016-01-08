
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes if scan is inbound or outbound processing (unless we can tell always with Event ID)
 * 
 * <p>Java class for processingFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processingFunctionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processingFunctionCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processingFunctionType", propOrder = {
    "processingFunctionCode"
})
public class ProcessingFunctionType {

    @XmlElement(required = true)
    protected ReferenceDataType processingFunctionCode;

    /**
     * Gets the value of the processingFunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getProcessingFunctionCode() {
        return processingFunctionCode;
    }

    /**
     * Sets the value of the processingFunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setProcessingFunctionCode(ReferenceDataType value) {
        this.processingFunctionCode = value;
    }

}
