
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type of sort selection identified by the sort plan for the output the parcel was sorted to
 * 
 * <p>Java class for sortOutcomeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sortOutcomeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sortOutcomeCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortOutcomeType", propOrder = {
    "sortOutcomeCode"
})
public class SortOutcomeType {

    @XmlElement(required = true)
    protected ReferenceDataType sortOutcomeCode;

    /**
     * Gets the value of the sortOutcomeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getSortOutcomeCode() {
        return sortOutcomeCode;
    }

    /**
     * Sets the value of the sortOutcomeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setSortOutcomeCode(ReferenceDataType value) {
        this.sortOutcomeCode = value;
    }

}
