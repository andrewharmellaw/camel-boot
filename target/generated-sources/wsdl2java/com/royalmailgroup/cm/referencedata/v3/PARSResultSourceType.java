
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies if Mail Piece has been address keyed or OCR or combination
 * 
 * <p>Java class for PARSResultSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PARSResultSourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PARSResultSourceCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PARSResultSourceType", propOrder = {
    "parsResultSourceCode"
})
public class PARSResultSourceType {

    @XmlElement(name = "PARSResultSourceCode", required = true)
    protected ReferenceDataType parsResultSourceCode;

    /**
     * Gets the value of the parsResultSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getPARSResultSourceCode() {
        return parsResultSourceCode;
    }

    /**
     * Sets the value of the parsResultSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setPARSResultSourceCode(ReferenceDataType value) {
        this.parsResultSourceCode = value;
    }

}
