
package com.royalmailgroup.cm.common.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure for the component parts of a Postcode
 * 
 * <p>Java class for postcodeSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postcodeSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inward" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier" minOccurs="0"/&gt;
 *         &lt;element name="outward" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postcodeSegment", propOrder = {
    "inward",
    "outward"
})
public class PostcodeSegment {

    protected String inward;
    protected String outward;

    /**
     * Gets the value of the inward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInward() {
        return inward;
    }

    /**
     * Sets the value of the inward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInward(String value) {
        this.inward = value;
    }

    /**
     * Gets the value of the outward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutward() {
        return outward;
    }

    /**
     * Sets the value of the outward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutward(String value) {
        this.outward = value;
    }

}
