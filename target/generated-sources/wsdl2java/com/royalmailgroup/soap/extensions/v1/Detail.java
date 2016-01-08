
package com.royalmailgroup.soap.extensions.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element used to hold SOAP fault details
 * 
 * <p>Java class for detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exceptionDetails" type="{http://www.royalmailgroup.com/soap/extensions/V1}exceptionDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detail", propOrder = {
    "exceptionDetails"
})
public class Detail {

    @XmlElement(required = true)
    protected ExceptionDetails exceptionDetails;

    /**
     * Gets the value of the exceptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionDetails }
     *     
     */
    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }

    /**
     * Sets the value of the exceptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionDetails }
     *     
     */
    public void setExceptionDetails(ExceptionDetails value) {
        this.exceptionDetails = value;
    }

}
