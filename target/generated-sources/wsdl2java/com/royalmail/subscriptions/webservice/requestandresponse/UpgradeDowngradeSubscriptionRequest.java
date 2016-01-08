
package com.royalmail.subscriptions.webservice.requestandresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.royalmailgroup.integration.core.v1.IntegrationHeader;


/**
 * Overall definition for a Subscription Upgrade or Downgrade request.
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
 *         &lt;element name="upgradeDowngradeSubscriptionRequestDetails" type="{http://com/royalmail/subscriptions/webservice/requestAndResponse}upgradeDowngradeSubscriptionRequestDetailsType"/&gt;
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
    "upgradeDowngradeSubscriptionRequestDetails"
})
@XmlRootElement(name = "upgradeDowngradeSubscriptionRequest")
public class UpgradeDowngradeSubscriptionRequest {

    @XmlElement(namespace = "http://www.royalmailgroup.com/integration/core/V1", required = true)
    protected IntegrationHeader integrationHeader;
    @XmlElement(required = true)
    protected UpgradeDowngradeSubscriptionRequestDetailsType upgradeDowngradeSubscriptionRequestDetails;

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
     * Gets the value of the upgradeDowngradeSubscriptionRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpgradeDowngradeSubscriptionRequestDetailsType }
     *     
     */
    public UpgradeDowngradeSubscriptionRequestDetailsType getUpgradeDowngradeSubscriptionRequestDetails() {
        return upgradeDowngradeSubscriptionRequestDetails;
    }

    /**
     * Sets the value of the upgradeDowngradeSubscriptionRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpgradeDowngradeSubscriptionRequestDetailsType }
     *     
     */
    public void setUpgradeDowngradeSubscriptionRequestDetails(UpgradeDowngradeSubscriptionRequestDetailsType value) {
        this.upgradeDowngradeSubscriptionRequestDetails = value;
    }

}
