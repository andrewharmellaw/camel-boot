
package com.royalmail.subscriptions.webservice.requestandresponse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Parameters required when requesting a Subscription be created.
 * 
 * <p>Java class for subscriptionSpecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscriptionSpecType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfSubscription"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier"&gt;
 *               &lt;enumeration value="withInitialPayment"/&gt;
 *               &lt;enumeration value="notWithInitialPayment"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="initialPriceInformation" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}priceInformationType" minOccurs="0"/&gt;
 *         &lt;element name="recurringPriceInformation" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}priceInformationType"/&gt;
 *         &lt;element name="finalPriceInformation" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}priceInformationType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPayments" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}ordinal" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}date"/&gt;
 *         &lt;element name="endDate" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}date" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}keyValuePairsType" minOccurs="0"/&gt;
 *         &lt;element name="summary" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}keyValuePairsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriptionSpecType", propOrder = {
    "typeOfSubscription",
    "frequency",
    "initialPriceInformation",
    "recurringPriceInformation",
    "finalPriceInformation",
    "numberOfPayments",
    "startDate",
    "endDate",
    "data",
    "summary"
})
public class SubscriptionSpecType {

    @XmlElement(required = true)
    protected String typeOfSubscription;
    @XmlElement(required = true)
    protected String frequency;
    protected PriceInformationType initialPriceInformation;
    @XmlElement(required = true)
    protected PriceInformationType recurringPriceInformation;
    protected PriceInformationType finalPriceInformation;
    protected BigInteger numberOfPayments;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    protected KeyValuePairsType data;
    protected KeyValuePairsType summary;

    /**
     * Gets the value of the typeOfSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfSubscription() {
        return typeOfSubscription;
    }

    /**
     * Sets the value of the typeOfSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfSubscription(String value) {
        this.typeOfSubscription = value;
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
     * Gets the value of the initialPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformationType }
     *     
     */
    public PriceInformationType getInitialPriceInformation() {
        return initialPriceInformation;
    }

    /**
     * Sets the value of the initialPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformationType }
     *     
     */
    public void setInitialPriceInformation(PriceInformationType value) {
        this.initialPriceInformation = value;
    }

    /**
     * Gets the value of the recurringPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformationType }
     *     
     */
    public PriceInformationType getRecurringPriceInformation() {
        return recurringPriceInformation;
    }

    /**
     * Sets the value of the recurringPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformationType }
     *     
     */
    public void setRecurringPriceInformation(PriceInformationType value) {
        this.recurringPriceInformation = value;
    }

    /**
     * Gets the value of the finalPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformationType }
     *     
     */
    public PriceInformationType getFinalPriceInformation() {
        return finalPriceInformation;
    }

    /**
     * Sets the value of the finalPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformationType }
     *     
     */
    public void setFinalPriceInformation(PriceInformationType value) {
        this.finalPriceInformation = value;
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

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePairsType }
     *     
     */
    public KeyValuePairsType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePairsType }
     *     
     */
    public void setData(KeyValuePairsType value) {
        this.data = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePairsType }
     *     
     */
    public KeyValuePairsType getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePairsType }
     *     
     */
    public void setSummary(KeyValuePairsType value) {
        this.summary = value;
    }

}
