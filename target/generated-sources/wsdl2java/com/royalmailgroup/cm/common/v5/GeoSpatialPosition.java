
package com.royalmailgroup.cm.common.v5;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.royalmailgroup.cm.referencedata.v3.GeospatialPositionType;
import com.royalmailgroup.cm.referencedata.v3.SystemNameType;


/**
 * defines the exact position according to a geo spatial system  
 * 
 * <p>Java class for geoSpatialPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoSpatialPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="altitude" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}decimal" minOccurs="0"/&gt;
 *         &lt;element name="geoDeticSystem" type="{http://www.royalmailgroup.com/cm/referenceData/V3}systemNameType" minOccurs="0"/&gt;
 *         &lt;element name="geoSpatialPositionType" type="{http://www.royalmailgroup.com/cm/referenceData/V3}geospatialPositionType" minOccurs="0"/&gt;
 *         &lt;element name="latitude" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}geoSpatial" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}geoSpatial" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoSpatialPosition", propOrder = {
    "altitude",
    "geoDeticSystem",
    "geoSpatialPositionType",
    "latitude",
    "longitude"
})
public class GeoSpatialPosition {

    protected BigDecimal altitude;
    protected SystemNameType geoDeticSystem;
    protected GeospatialPositionType geoSpatialPositionType;
    protected BigDecimal latitude;
    protected BigDecimal longitude;

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAltitude(BigDecimal value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the geoDeticSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemNameType }
     *     
     */
    public SystemNameType getGeoDeticSystem() {
        return geoDeticSystem;
    }

    /**
     * Sets the value of the geoDeticSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemNameType }
     *     
     */
    public void setGeoDeticSystem(SystemNameType value) {
        this.geoDeticSystem = value;
    }

    /**
     * Gets the value of the geoSpatialPositionType property.
     * 
     * @return
     *     possible object is
     *     {@link GeospatialPositionType }
     *     
     */
    public GeospatialPositionType getGeoSpatialPositionType() {
        return geoSpatialPositionType;
    }

    /**
     * Sets the value of the geoSpatialPositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeospatialPositionType }
     *     
     */
    public void setGeoSpatialPositionType(GeospatialPositionType value) {
        this.geoSpatialPositionType = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

}
