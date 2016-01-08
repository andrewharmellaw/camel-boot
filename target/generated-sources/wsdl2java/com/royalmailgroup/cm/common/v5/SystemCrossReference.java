
package com.royalmailgroup.cm.common.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.royalmailgroup.cm.referencedata.v3.SystemNameType;


/**
 * This class is used to manage cross reference keys between systems. For example an entity will be known by one identifier in the source system and have another in the target system so these keys are used so that the target system can identify the appropriate entity within its own system. 
 * 
 * <p>Java class for systemCrossReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemCrossReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audit" type="{http://www.royalmailgroup.com/cm/common/V5}audit" minOccurs="0"/&gt;
 *         &lt;element name="sourceCrossReferenceAttribute" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}name"/&gt;
 *         &lt;element name="sourceCrossReferenceValue" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}string"/&gt;
 *         &lt;element name="sourceSystemCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}systemNameType"/&gt;
 *         &lt;element name="status" type="{http://www.royalmailgroup.com/cm/common/V5}status" minOccurs="0"/&gt;
 *         &lt;element name="targetCrossReferenceAttribute" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}name"/&gt;
 *         &lt;element name="targetCrossReferenceValue" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}string"/&gt;
 *         &lt;element name="targetSystemCode" type="{http://www.royalmailgroup.com/cm/referenceData/V3}systemNameType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemCrossReference", propOrder = {
    "audit",
    "sourceCrossReferenceAttribute",
    "sourceCrossReferenceValue",
    "sourceSystemCode",
    "status",
    "targetCrossReferenceAttribute",
    "targetCrossReferenceValue",
    "targetSystemCode"
})
public class SystemCrossReference {

    protected Audit audit;
    @XmlElement(required = true)
    protected String sourceCrossReferenceAttribute;
    @XmlElement(required = true)
    protected String sourceCrossReferenceValue;
    @XmlElement(required = true)
    protected SystemNameType sourceSystemCode;
    protected Status status;
    @XmlElement(required = true)
    protected String targetCrossReferenceAttribute;
    @XmlElement(required = true)
    protected String targetCrossReferenceValue;
    @XmlElement(required = true)
    protected SystemNameType targetSystemCode;

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
     * Gets the value of the sourceCrossReferenceAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCrossReferenceAttribute() {
        return sourceCrossReferenceAttribute;
    }

    /**
     * Sets the value of the sourceCrossReferenceAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCrossReferenceAttribute(String value) {
        this.sourceCrossReferenceAttribute = value;
    }

    /**
     * Gets the value of the sourceCrossReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCrossReferenceValue() {
        return sourceCrossReferenceValue;
    }

    /**
     * Sets the value of the sourceCrossReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCrossReferenceValue(String value) {
        this.sourceCrossReferenceValue = value;
    }

    /**
     * Gets the value of the sourceSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link SystemNameType }
     *     
     */
    public SystemNameType getSourceSystemCode() {
        return sourceSystemCode;
    }

    /**
     * Sets the value of the sourceSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemNameType }
     *     
     */
    public void setSourceSystemCode(SystemNameType value) {
        this.sourceSystemCode = value;
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

    /**
     * Gets the value of the targetCrossReferenceAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCrossReferenceAttribute() {
        return targetCrossReferenceAttribute;
    }

    /**
     * Sets the value of the targetCrossReferenceAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCrossReferenceAttribute(String value) {
        this.targetCrossReferenceAttribute = value;
    }

    /**
     * Gets the value of the targetCrossReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCrossReferenceValue() {
        return targetCrossReferenceValue;
    }

    /**
     * Sets the value of the targetCrossReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCrossReferenceValue(String value) {
        this.targetCrossReferenceValue = value;
    }

    /**
     * Gets the value of the targetSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link SystemNameType }
     *     
     */
    public SystemNameType getTargetSystemCode() {
        return targetSystemCode;
    }

    /**
     * Sets the value of the targetSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemNameType }
     *     
     */
    public void setTargetSystemCode(SystemNameType value) {
        this.targetSystemCode = value;
    }

}
