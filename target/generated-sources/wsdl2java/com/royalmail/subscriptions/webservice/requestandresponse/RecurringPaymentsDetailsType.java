
package com.royalmail.subscriptions.webservice.requestandresponse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.royalmailgroup.cm.common.v5.Amount;


/**
 * Details of a  Request Recurring Payments Response.
 *             
 * 
 * <p>Java class for recurringPaymentsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recurringPaymentsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="grossTotalPrice" type="{http://www.royalmailgroup.com/cm/common/V5}amount"/&gt;
 *         &lt;element name="netTotalPrice" type="{http://www.royalmailgroup.com/cm/common/V5}amount"/&gt;
 *         &lt;element name="vatTotalAmount" type="{http://www.royalmailgroup.com/cm/common/V5}amount"/&gt;
 *         &lt;element name="orderStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier"&gt;
 *               &lt;enumeration value="Cart"/&gt;
 *               &lt;enumeration value="Checkout"/&gt;
 *               &lt;enumeration value="PaymentPreAuthorisation"/&gt;
 *               &lt;enumeration value="PaymentPreAuthorisationFailed"/&gt;
 *               &lt;enumeration value="RecurringPaymentSetup"/&gt;
 *               &lt;enumeration value="Fulfilment"/&gt;
 *               &lt;enumeration value="FulfilmentFailed"/&gt;
 *               &lt;enumeration value="CancelFailed"/&gt;
 *               &lt;enumeration value="PaymentSettlement"/&gt;
 *               &lt;enumeration value="PaymentSettlementFailed"/&gt;
 *               &lt;enumeration value="Fulfilled"/&gt;
 *               &lt;enumeration value="FullRefund"/&gt;
 *               &lt;enumeration value="PartialRefund"/&gt;
 *               &lt;enumeration value="RefundRequested"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paymentDate" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recurringPaymentsDetailsType", propOrder = {
    "subscriptionId",
    "orderId",
    "grossTotalPrice",
    "netTotalPrice",
    "vatTotalAmount",
    "orderStatus",
    "paymentDate",
    "createdDate"
})
public class RecurringPaymentsDetailsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger subscriptionId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger orderId;
    @XmlElement(required = true)
    protected Amount grossTotalPrice;
    @XmlElement(required = true)
    protected Amount netTotalPrice;
    @XmlElement(required = true)
    protected Amount vatTotalAmount;
    @XmlElement(required = true)
    protected String orderStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;

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
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderId(BigInteger value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the grossTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getGrossTotalPrice() {
        return grossTotalPrice;
    }

    /**
     * Sets the value of the grossTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setGrossTotalPrice(Amount value) {
        this.grossTotalPrice = value;
    }

    /**
     * Gets the value of the netTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getNetTotalPrice() {
        return netTotalPrice;
    }

    /**
     * Sets the value of the netTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setNetTotalPrice(Amount value) {
        this.netTotalPrice = value;
    }

    /**
     * Gets the value of the vatTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getVatTotalAmount() {
        return vatTotalAmount;
    }

    /**
     * Sets the value of the vatTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setVatTotalAmount(Amount value) {
        this.vatTotalAmount = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

}
