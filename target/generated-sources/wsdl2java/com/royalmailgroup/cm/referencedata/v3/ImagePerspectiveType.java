
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the image used to resolve the address for the item, in the range 1 -6
 * 
 * <p>Java class for imagePerspectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imagePerspectiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imagePerspectiveCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagePerspectiveType", propOrder = {
    "imagePerspectiveCode"
})
public class ImagePerspectiveType {

    @XmlElement(required = true)
    protected ReferenceDataType imagePerspectiveCode;

    /**
     * Gets the value of the imagePerspectiveCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getImagePerspectiveCode() {
        return imagePerspectiveCode;
    }

    /**
     * Sets the value of the imagePerspectiveCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setImagePerspectiveCode(ReferenceDataType value) {
        this.imagePerspectiveCode = value;
    }

}
