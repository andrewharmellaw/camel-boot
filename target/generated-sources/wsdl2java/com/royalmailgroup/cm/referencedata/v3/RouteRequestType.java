
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This message is used to request route manifest, walk map or a hazard list. The delivery hazard list is not currently used.
 * 
 * <p>Java class for routeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routeRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeRequestCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeRequestType", propOrder = {
    "routeRequestCode"
})
public class RouteRequestType {

    protected ReferenceDataType routeRequestCode;

    /**
     * Gets the value of the routeRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getRouteRequestCode() {
        return routeRequestCode;
    }

    /**
     * Sets the value of the routeRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setRouteRequestCode(ReferenceDataType value) {
        this.routeRequestCode = value;
    }

}
