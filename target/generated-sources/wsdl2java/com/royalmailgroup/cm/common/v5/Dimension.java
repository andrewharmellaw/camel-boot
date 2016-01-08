
package com.royalmailgroup.cm.common.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.royalmailgroup.cm.referencedata.v3.DimensionType;
import com.royalmailgroup.cm.referencedata.v3.UnitOfMeasureType;


/**
 * A dimension is a measure of spatial extent. It is a physical property, such as mass, length, time, or a combination thereof, regarded as a fundamental measure or as one of a set of fundamental measures of a physical quantity. 
 * 
 * <p>Java class for dimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dimensionType" type="{http://www.royalmailgroup.com/cm/referenceData/V3}dimensionType" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.royalmailgroup.com/cm/referenceData/V3}unitOfMeasureType"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimension", propOrder = {
    "dimensionType",
    "unitOfMeasure",
    "value"
})
public class Dimension {

    protected DimensionType dimensionType;
    @XmlElement(required = true)
    protected UnitOfMeasureType unitOfMeasure;
    protected float value;

    /**
     * Gets the value of the dimensionType property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getDimensionType() {
        return dimensionType;
    }

    /**
     * Sets the value of the dimensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setDimensionType(DimensionType value) {
        this.dimensionType = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasureType value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

}
