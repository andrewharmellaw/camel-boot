
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference data identifying the format of British Forces Posting Overseas Mail Items
 * 
 * <p>Java class for bFPOFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bFPOFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bFPOFormatCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bFPOFormatType", propOrder = {
    "bfpoFormatCode"
})
public class BFPOFormatType {

    @XmlElement(name = "bFPOFormatCode", required = true)
    protected ReferenceDataType bfpoFormatCode;

    /**
     * Gets the value of the bfpoFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getBFPOFormatCode() {
        return bfpoFormatCode;
    }

    /**
     * Sets the value of the bfpoFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setBFPOFormatCode(ReferenceDataType value) {
        this.bfpoFormatCode = value;
    }

}
