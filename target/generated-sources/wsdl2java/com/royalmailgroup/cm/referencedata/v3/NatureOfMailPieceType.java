
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * “G” for Gift
 * “S” for Commercial Sample
 * "D" for Documents
 * "R" for Returned Goods
 * "O" for Other
 * 
 * <p>Java class for natureOfMailPieceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="natureOfMailPieceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="natureOfMailPieceCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "natureOfMailPieceType", propOrder = {
    "natureOfMailPieceCode"
})
public class NatureOfMailPieceType {

    @XmlElement(required = true)
    protected ReferenceDataType natureOfMailPieceCode;

    /**
     * Gets the value of the natureOfMailPieceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getNatureOfMailPieceCode() {
        return natureOfMailPieceCode;
    }

    /**
     * Sets the value of the natureOfMailPieceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setNatureOfMailPieceCode(ReferenceDataType value) {
        this.natureOfMailPieceCode = value;
    }

}
