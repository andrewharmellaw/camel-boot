
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference data. A classification of the mail by the nature of its contents i.e.
 *  01 = DGZ
 *  02 = MER
 *  03= DOC
 * Indicative values, not in use at the moment)
 * 
 * <p>Java class for mailPieceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mailPieceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mailPieceCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailPieceType", propOrder = {
    "mailPieceCode"
})
public class MailPieceType {

    @XmlElement(required = true)
    protected ReferenceDataType mailPieceCode;

    /**
     * Gets the value of the mailPieceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getMailPieceCode() {
        return mailPieceCode;
    }

    /**
     * Sets the value of the mailPieceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setMailPieceCode(ReferenceDataType value) {
        this.mailPieceCode = value;
    }

}
