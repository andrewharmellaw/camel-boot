
package com.royalmailgroup.cm.common.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.royalmailgroup.cm.referencedata.v3.LocationType;


/**
 * A location that can have a name or address or geo-spatial position or any combination of these.
 * 
 * <p>Java class for location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoFenceRadius" type="{http://www.royalmailgroup.com/cm/common/V5}dimension" minOccurs="0"/&gt;
 *         &lt;element name="geoSpatialPosition" type="{http://www.royalmailgroup.com/cm/common/V5}geoSpatialPosition" minOccurs="0"/&gt;
 *         &lt;element name="localName" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}name" minOccurs="0"/&gt;
 *         &lt;element name="locationAddress" type="{http://www.royalmailgroup.com/cm/common/V5}address" minOccurs="0"/&gt;
 *         &lt;element name="locationIdentifier" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}identifier" minOccurs="0"/&gt;
 *         &lt;element name="locationName" type="{http://www.royalmailgroup.com/cm/rmDatatypes/V1}name" minOccurs="0"/&gt;
 *         &lt;element name="locationType" type="{http://www.royalmailgroup.com/cm/referenceData/V3}locationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "location", propOrder = {
    "geoFenceRadius",
    "geoSpatialPosition",
    "localName",
    "locationAddress",
    "locationIdentifier",
    "locationName",
    "locationType"
})
public class Location {

    protected Dimension geoFenceRadius;
    protected GeoSpatialPosition geoSpatialPosition;
    protected String localName;
    protected Address locationAddress;
    protected String locationIdentifier;
    protected String locationName;
    protected LocationType locationType;

    /**
     * Gets the value of the geoFenceRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getGeoFenceRadius() {
        return geoFenceRadius;
    }

    /**
     * Sets the value of the geoFenceRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setGeoFenceRadius(Dimension value) {
        this.geoFenceRadius = value;
    }

    /**
     * Gets the value of the geoSpatialPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GeoSpatialPosition }
     *     
     */
    public GeoSpatialPosition getGeoSpatialPosition() {
        return geoSpatialPosition;
    }

    /**
     * Sets the value of the geoSpatialPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoSpatialPosition }
     *     
     */
    public void setGeoSpatialPosition(GeoSpatialPosition value) {
        this.geoSpatialPosition = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Gets the value of the locationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getLocationAddress() {
        return locationAddress;
    }

    /**
     * Sets the value of the locationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setLocationAddress(Address value) {
        this.locationAddress = value;
    }

    /**
     * Gets the value of the locationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Sets the value of the locationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIdentifier(String value) {
        this.locationIdentifier = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocationType(LocationType value) {
        this.locationType = value;
    }

}
