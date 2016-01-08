
package com.royalmail.subscriptions.webservice.requestandresponse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details of a Upgrade or Downgrade Subscription Request.
 * 
 * <p>Java class for upgradeDowngradeSubscriptionRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upgradeDowngradeSubscriptionRequestDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="recurringPriceInformation" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}priceInfoType"/&gt;
 *         &lt;element name="finalPriceInformation" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}priceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="frequency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier"&gt;
 *               &lt;enumeration value="weekly"/&gt;
 *               &lt;enumeration value="monthly"/&gt;
 *               &lt;enumeration value="quarterly"/&gt;
 *               &lt;enumeration value="yearly"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="endDate" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}date" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPayments" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}ordinal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upgradeDowngradeSubscriptionRequestDetailsType", propOrder = {
    "subscriptionId",
    "productId",
    "recurringPriceInformation",
    "finalPriceInformation",
    "frequency",
    "endDate",
    "numberOfPayments"
})
public class UpgradeDowngradeSubscriptionRequestDetailsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger subscriptionId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productId;
    @XmlElement(required = true)
    protected PriceInfoType recurringPriceInformation;
    protected PriceInfoType finalPriceInformation;
    @XmlElement(required = true)
    protected String frequency;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected BigInteger numberOfPayments;

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubscriptionId(BigInteger value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductId(BigInteger value) {
        this.productId = value;
    }

    /**
     * Gets the value of the recurringPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInfoType }
     *     
     */
    public PriceInfoType getRecurringPriceInformation() {
        return recurringPriceInformation;
    }

    /**
     * Sets the value of the recurringPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInfoType }
     *     
     */
    public void setRecurringPriceInformation(PriceInfoType value) {
        this.recurringPriceInformation = value;
    }

    /**
     * Gets the value of the finalPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInfoType }
     *     
     */
    public PriceInfoType getFinalPriceInformation() {
        return finalPriceInformation;
    }

    /**
     * Sets the value of the finalPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInfoType }
     *     
     */
    public void setFinalPriceInformation(PriceInfoType value) {
        this.finalPriceInformation = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the numberOfPayments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * Sets the value of the numberOfPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPayments(BigInteger value) {
        this.numberOfPayments = value;
    }

}
