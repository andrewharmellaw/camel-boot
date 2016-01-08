
package com.royalmailgroup.cm.common.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A geospatial categorization of a geographically bounded area used to group and reference delivery and collection points.
 * 
 * <p>Java class for postcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postcode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audit" type="{http://www.royalmailgroup.com/cm/common/V5}audit" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier" minOccurs="0"/&gt;
 *         &lt;element name="postcodeIdentifier" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier" minOccurs="0"/&gt;
 *         &lt;element name="postcodeSegment" type="{http://www.royalmailgroup.com/cm/common/V5}postcodeSegment" minOccurs="0"/&gt;
 *         &lt;element name="postcodeSuffix" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.royalmailgroup.com/cm/common/V5}status" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postcode", propOrder = {
    "audit",
    "postcode",
    "postcodeIdentifier",
    "postcodeSegment",
    "postcodeSuffix",
    "status"
})
public class Postcode {

    protected Audit audit;
    protected String postcode;
    protected String postcodeIdentifier;
    protected PostcodeSegment postcodeSegment;
    protected String postcodeSuffix;
    protected Status status;

    /**
     * Gets the value of the audit property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAudit(Audit value) {
        this.audit = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the postcodeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeIdentifier() {
        return postcodeIdentifier;
    }

    /**
     * Sets the value of the postcodeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeIdentifier(String value) {
        this.postcodeIdentifier = value;
    }

    /**
     * Gets the value of the postcodeSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PostcodeSegment }
     *     
     */
    public PostcodeSegment getPostcodeSegment() {
        return postcodeSegment;
    }

    /**
     * Sets the value of the postcodeSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostcodeSegment }
     *     
     */
    public void setPostcodeSegment(PostcodeSegment value) {
        this.postcodeSegment = value;
    }

    /**
     * Gets the value of the postcodeSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeSuffix() {
        return postcodeSuffix;
    }

    /**
     * Sets the value of the postcodeSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeSuffix(String value) {
        this.postcodeSuffix = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

}
