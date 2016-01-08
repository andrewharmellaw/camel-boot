
package com.royalmail.subscriptions.webservice.requestandresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.royalmailgroup.integration.core.v1.IntegrationHeader;


/**
 * Overall definition for a Subscription creation request.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.royalmailgroup.com/integration/core/V1}integrationHeader"/&gt;
 *         &lt;element name="createSubscriptionRequestDetails" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}createSubscriptionRequestDetailsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "integrationHeader",
    "createSubscriptionRequestDetails"
})
@XmlRootElement(name = "createSubscriptionRequest")
public class CreateSubscriptionRequest {

    @XmlElement(namespace = "http://www.royalmailgroup.com/integration/core/V1", required = true)
    protected IntegrationHeader integrationHeader;
    @XmlElement(required = true)
    protected CreateSubscriptionRequestDetailsType createSubscriptionRequestDetails;

    /**
     * Gets the value of the integrationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationHeader }
     *     
     */
    public IntegrationHeader getIntegrationHeader() {
        return integrationHeader;
    }

    /**
     * Sets the value of the integrationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationHeader }
     *     
     */
    public void setIntegrationHeader(IntegrationHeader value) {
        this.integrationHeader = value;
    }

    /**
     * Gets the value of the createSubscriptionRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSubscriptionRequestDetailsType }
     *     
     */
    public CreateSubscriptionRequestDetailsType getCreateSubscriptionRequestDetails() {
        return createSubscriptionRequestDetails;
    }

    /**
     * Sets the value of the createSubscriptionRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSubscriptionRequestDetailsType }
     *     
     */
    public void setCreateSubscriptionRequestDetails(CreateSubscriptionRequestDetailsType value) {
        this.createSubscriptionRequestDetails = value;
    }

}
