
package com.royalmailgroup.integration.core.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identificationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endUserId" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier" minOccurs="0"/&gt;
 *         &lt;element name="applicationId" type="{http://www.royalmailgroup.com/integration/core/V1}applicationId"/&gt;
 *         &lt;element name="intermediaryId" type="{http://www.royalmailgroup.com/integration/core/V1}applicationId" minOccurs="0"/&gt;
 *         &lt;element name="transactionId" type="{http://www.royalmailgroup.com/integration/core/V1}transactionId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificationStructure", propOrder = {
    "endUserId",
    "applicationId",
    "intermediaryId",
    "transactionId"
})
public class IdentificationStructure {

    protected String endUserId;
    @XmlElement(required = true)
    protected String applicationId;
    protected String intermediaryId;
    @XmlElement(required = true)
    protected String transactionId;

    /**
     * Gets the value of the endUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUserId() {
        return endUserId;
    }

    /**
     * Sets the value of the endUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUserId(String value) {
        this.endUserId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the intermediaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermediaryId() {
        return intermediaryId;
    }

    /**
     * Sets the value of the intermediaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermediaryId(String value) {
        this.intermediaryId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}
