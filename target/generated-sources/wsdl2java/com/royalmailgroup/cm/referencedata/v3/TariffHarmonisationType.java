
package com.royalmailgroup.cm.referencedata.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Key Words, refers to the HS Tariff code and Descriptions, the Description bit
 * 
 * HS tariff code and Descriptions are the international standards of numbers and names to classify traded products
 * 
 * Used for International Shipments (EU and outside EU)
 * 
 * Sample
 * 
 * Live animals; animal products
 *  01
 * Live animals
 *  02
 * Meat and edible meat offal
 *  03
 * Fish and crustaceans, molluscs and other aquatic invertebrates
 *  04
 * Dairy produce; birds' eggs; natural honey; edible products of animal origin, not elsewhere specified or included
 *  05
 * Products of animal origin, not elsewhere specified or included
 * 
 * <p>Java class for tariffHarmonisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tariffHarmonisationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffHarmonisationCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}referenceDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tariffHarmonisationType", propOrder = {
    "tariffHarmonisationCode"
})
public class TariffHarmonisationType {

    @XmlElement(required = true)
    protected ReferenceDataType tariffHarmonisationCode;

    /**
     * Gets the value of the tariffHarmonisationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDataType }
     *     
     */
    public ReferenceDataType getTariffHarmonisationCode() {
        return tariffHarmonisationCode;
    }

    /**
     * Sets the value of the tariffHarmonisationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDataType }
     *     
     */
    public void setTariffHarmonisationCode(ReferenceDataType value) {
        this.tariffHarmonisationCode = value;
    }

}
