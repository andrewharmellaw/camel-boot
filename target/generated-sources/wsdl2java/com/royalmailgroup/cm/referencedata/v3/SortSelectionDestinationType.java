
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The location to where the Parcel has been sorted to represented as an OBID
 * 
 * <p>Java class for sortSelectionDestinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sortSelectionDestinationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sortSelectionDestinationCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortSelectionDestinationType", propOrder = {
    "sortSelectionDestinationCode"
})
public class SortSelectionDestinationType {

    @XmlElement(required = true)
    protected ReferenceDataType sortSelectionDestinationCode;

    /**
     * Gets the value of the sortSelectionDestinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getSortSelectionDestinationCode() {
        return sortSelectionDestinationCode;
    }

    /**
     * Sets the value of the sortSelectionDestinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setSortSelectionDestinationCode(ReferenceDataType value) {
        this.sortSelectionDestinationCode = value;
    }

}
