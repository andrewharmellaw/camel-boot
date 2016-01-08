
package com.royalmail.subscriptions.webservice.requestandresponse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.royalmailgroup.cm.common.v5.DigitalAddress;


/**
 * Details of a CreateSubscription Request.
 * 
 * <p>Java class for createSubscriptionRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSubscriptionRequestDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="electronicAddress" type="{http://www.royalmailgroup.com/cm/common/V5}digitalAddress"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="appOrderId" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier"/&gt;
 *         &lt;element name="subscriptionSpec" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}subscriptionSpecType"/&gt;
 *         &lt;element name="billingAddress" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}addressType" minOccurs="0"/&gt;
 *         &lt;element name="checkoutCompleteUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="updateOrderUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSubscriptionRequestDetailsType", propOrder = {
    "guid",
    "electronicAddress",
    "productId",
    "appOrderId",
    "subscriptionSpec",
    "billingAddress",
    "checkoutCompleteUrl",
    "updateOrderUrl"
})
public class CreateSubscriptionRequestDetailsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger guid;
    @XmlElement(required = true)
    protected DigitalAddress electronicAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger productId;
    @XmlElement(required = true)
    protected String appOrderId;
    @XmlElement(required = true)
    protected SubscriptionSpecType subscriptionSpec;
    protected AddressType billingAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String checkoutCompleteUrl;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String updateOrderUrl;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGuid(BigInteger value) {
        this.guid = value;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAddress }
     *     
     */
    public DigitalAddress getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * Sets the value of the electronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAddress }
     *     
     */
    public void setElectronicAddress(DigitalAddress value) {
        this.electronicAddress = value;
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
     * Gets the value of the appOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppOrderId() {
        return appOrderId;
    }

    /**
     * Sets the value of the appOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppOrderId(String value) {
        this.appOrderId = value;
    }

    /**
     * Gets the value of the subscriptionSpec property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionSpecType }
     *     
     */
    public SubscriptionSpecType getSubscriptionSpec() {
        return subscriptionSpec;
    }

    /**
     * Sets the value of the subscriptionSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionSpecType }
     *     
     */
    public void setSubscriptionSpec(SubscriptionSpecType value) {
        this.subscriptionSpec = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBillingAddress(AddressType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the checkoutCompleteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutCompleteUrl() {
        return checkoutCompleteUrl;
    }

    /**
     * Sets the value of the checkoutCompleteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutCompleteUrl(String value) {
        this.checkoutCompleteUrl = value;
    }

    /**
     * Gets the value of the updateOrderUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateOrderUrl() {
        return updateOrderUrl;
    }

    /**
     * Sets the value of the updateOrderUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateOrderUrl(String value) {
        this.updateOrderUrl = value;
    }

}
