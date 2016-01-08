
package com.royalmailgroup.cm.common.v5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.royalmailgroup.cm.common.v5 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Duration_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "duration");
    private final static QName _Location_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "location");
    private final static QName _Registration_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "registration");
    private final static QName _Dimension_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "dimension");
    private final static QName _GeoSpatialPosition_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "geoSpatialPosition");
    private final static QName _Address_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "address");
    private final static QName _Audit_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "audit");
    private final static QName _Status_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "status");
    private final static QName _Postcode_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "postcode");
    private final static QName _SystemCrossReference_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "systemCrossReference");
    private final static QName _DigitalAddress_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "digitalAddress");
    private final static QName _FormatDatetime_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "formatDatetime");
    private final static QName _ContactMechanism_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "contactMechanism");
    private final static QName _PostcodeSegment_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "postcodeSegment");
    private final static QName _Amount_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "amount");
    private final static QName _TelephoneNumber_QNAME = new QName("http://www.royalmailgroup.com/cm/common/V5", "telephoneNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.royalmailgroup.cm.common.v5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link Dimension }
     * 
     */
    public Dimension createDimension() {
        return new Dimension();
    }

    /**
     * Create an instance of {@link GeoSpatialPosition }
     * 
     */
    public GeoSpatialPosition createGeoSpatialPosition() {
        return new GeoSpatialPosition();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Audit }
     * 
     */
    public Audit createAudit() {
        return new Audit();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Postcode }
     * 
     */
    public Postcode createPostcode() {
        return new Postcode();
    }

    /**
     * Create an instance of {@link SystemCrossReference }
     * 
     */
    public SystemCrossReference createSystemCrossReference() {
        return new SystemCrossReference();
    }

    /**
     * Create an instance of {@link DigitalAddress }
     * 
     */
    public DigitalAddress createDigitalAddress() {
        return new DigitalAddress();
    }

    /**
     * Create an instance of {@link FormatDatetime }
     * 
     */
    public FormatDatetime createFormatDatetime() {
        return new FormatDatetime();
    }

    /**
     * Create an instance of {@link ContactMechanism }
     * 
     */
    public ContactMechanism createContactMechanism() {
        return new ContactMechanism();
    }

    /**
     * Create an instance of {@link PostcodeSegment }
     * 
     */
    public PostcodeSegment createPostcodeSegment() {
        return new PostcodeSegment();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link TelephoneNumber }
     * 
     */
    public TelephoneNumber createTelephoneNumber() {
        return new TelephoneNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "registration")
    public JAXBElement<Registration> createRegistration(Registration value) {
        return new JAXBElement<Registration>(_Registration_QNAME, Registration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "dimension")
    public JAXBElement<Dimension> createDimension(Dimension value) {
        return new JAXBElement<Dimension>(_Dimension_QNAME, Dimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoSpatialPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "geoSpatialPosition")
    public JAXBElement<GeoSpatialPosition> createGeoSpatialPosition(GeoSpatialPosition value) {
        return new JAXBElement<GeoSpatialPosition>(_GeoSpatialPosition_QNAME, GeoSpatialPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Audit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "audit")
    public JAXBElement<Audit> createAudit(Audit value) {
        return new JAXBElement<Audit>(_Audit_QNAME, Audit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Postcode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "postcode")
    public JAXBElement<Postcode> createPostcode(Postcode value) {
        return new JAXBElement<Postcode>(_Postcode_QNAME, Postcode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemCrossReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "systemCrossReference")
    public JAXBElement<SystemCrossReference> createSystemCrossReference(SystemCrossReference value) {
        return new JAXBElement<SystemCrossReference>(_SystemCrossReference_QNAME, SystemCrossReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigitalAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "digitalAddress")
    public JAXBElement<DigitalAddress> createDigitalAddress(DigitalAddress value) {
        return new JAXBElement<DigitalAddress>(_DigitalAddress_QNAME, DigitalAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormatDatetime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "formatDatetime")
    public JAXBElement<FormatDatetime> createFormatDatetime(FormatDatetime value) {
        return new JAXBElement<FormatDatetime>(_FormatDatetime_QNAME, FormatDatetime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMechanism }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "contactMechanism")
    public JAXBElement<ContactMechanism> createContactMechanism(ContactMechanism value) {
        return new JAXBElement<ContactMechanism>(_ContactMechanism_QNAME, ContactMechanism.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostcodeSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "postcodeSegment")
    public JAXBElement<PostcodeSegment> createPostcodeSegment(PostcodeSegment value) {
        return new JAXBElement<PostcodeSegment>(_PostcodeSegment_QNAME, PostcodeSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "amount")
    public JAXBElement<Amount> createAmount(Amount value) {
        return new JAXBElement<Amount>(_Amount_QNAME, Amount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephoneNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.royalmailgroup.com/cm/common/V5", name = "telephoneNumber")
    public JAXBElement<TelephoneNumber> createTelephoneNumber(TelephoneNumber value) {
        return new JAXBElement<TelephoneNumber>(_TelephoneNumber_QNAME, TelephoneNumber.class, null, value);
    }

}
