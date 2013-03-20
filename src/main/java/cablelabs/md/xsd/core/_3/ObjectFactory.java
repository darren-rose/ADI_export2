//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 04:29:34 PM CET 
//


package cablelabs.md.xsd.core._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cablelabs.md.xsd.core._3 package. 
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

    private final static QName _ErrorList_QNAME = new QName("urn:cablelabs:md:xsd:core:3.0", "ErrorList");
    private final static QName _BucketList_QNAME = new QName("urn:cablelabs:md:xsd:core:3.0", "BucketList");
    private final static QName _ADI3_QNAME = new QName("urn:cablelabs:md:xsd:core:3.0", "ADI3");
    private final static QName _Error_QNAME = new QName("urn:cablelabs:md:xsd:core:3.0", "Error");
    private final static QName _Bucket_QNAME = new QName("urn:cablelabs:md:xsd:core:3.0", "Bucket");
    private final static QName _StatusCode_QNAME = new QName("urn:cablelabs:md:xsd:core:3.0", "StatusCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cablelabs.md.xsd.core._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusCodeType }
     * 
     */
    public StatusCodeType createStatusCodeType() {
        return new StatusCodeType();
    }

    /**
     * Create an instance of {@link ADIContainerType }
     * 
     */
    public ADIContainerType createADIContainerType() {
        return new ADIContainerType();
    }

    /**
     * Create an instance of {@link BucketType }
     * 
     */
    public BucketType createBucketType() {
        return new BucketType();
    }

    /**
     * Create an instance of {@link BucketListType }
     * 
     */
    public BucketListType createBucketListType() {
        return new BucketListType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ErrorListType }
     * 
     */
    public ErrorListType createErrorListType() {
        return new ErrorListType();
    }

    /**
     * Create an instance of {@link AssetNameType }
     * 
     */
    public AssetNameType createAssetNameType() {
        return new AssetNameType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link ExtType }
     * 
     */
    public ExtType createExtType() {
        return new ExtType();
    }

    /**
     * Create an instance of {@link LocalizableStringType }
     * 
     */
    public LocalizableStringType createLocalizableStringType() {
        return new LocalizableStringType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link RatingType }
     * 
     */
    public RatingType createRatingType() {
        return new RatingType();
    }

    /**
     * Create an instance of {@link TrickModeExclusionType }
     * 
     */
    public TrickModeExclusionType createTrickModeExclusionType() {
        return new TrickModeExclusionType();
    }

    /**
     * Create an instance of {@link DeprecatedStringType }
     * 
     */
    public DeprecatedStringType createDeprecatedStringType() {
        return new DeprecatedStringType();
    }

    /**
     * Create an instance of {@link TrickModeRestrictionType }
     * 
     */
    public TrickModeRestrictionType createTrickModeRestrictionType() {
        return new TrickModeRestrictionType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link EffectiveAssetRefType }
     * 
     */
    public EffectiveAssetRefType createEffectiveAssetRefType() {
        return new EffectiveAssetRefType();
    }

    /**
     * Create an instance of {@link AlternateIdType }
     * 
     */
    public AlternateIdType createAlternateIdType() {
        return new AlternateIdType();
    }

    /**
     * Create an instance of {@link DateTimeRangeType }
     * 
     */
    public DateTimeRangeType createDateTimeRangeType() {
        return new DateTimeRangeType();
    }

    /**
     * Create an instance of {@link ArgRefType }
     * 
     */
    public ArgRefType createArgRefType() {
        return new ArgRefType();
    }

    /**
     * Create an instance of {@link AssetRefType }
     * 
     */
    public AssetRefType createAssetRefType() {
        return new AssetRefType();
    }

    /**
     * Create an instance of {@link ProcessRuleSelectorType }
     * 
     */
    public ProcessRuleSelectorType createProcessRuleSelectorType() {
        return new ProcessRuleSelectorType();
    }

    /**
     * Create an instance of {@link DeprecatedBooleanType }
     * 
     */
    public DeprecatedBooleanType createDeprecatedBooleanType() {
        return new DeprecatedBooleanType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:core:3.0", name = "ErrorList")
    public JAXBElement<ErrorListType> createErrorList(ErrorListType value) {
        return new JAXBElement<ErrorListType>(_ErrorList_QNAME, ErrorListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BucketListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:core:3.0", name = "BucketList")
    public JAXBElement<BucketListType> createBucketList(BucketListType value) {
        return new JAXBElement<BucketListType>(_BucketList_QNAME, BucketListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADIContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:core:3.0", name = "ADI3")
    public JAXBElement<ADIContainerType> createADI3(ADIContainerType value) {
        return new JAXBElement<ADIContainerType>(_ADI3_QNAME, ADIContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:core:3.0", name = "Error")
    public JAXBElement<ErrorType> createError(ErrorType value) {
        return new JAXBElement<ErrorType>(_Error_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BucketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:core:3.0", name = "Bucket")
    public JAXBElement<BucketType> createBucket(BucketType value) {
        return new JAXBElement<BucketType>(_Bucket_QNAME, BucketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:core:3.0", name = "StatusCode")
    public JAXBElement<StatusCodeType> createStatusCode(StatusCodeType value) {
        return new JAXBElement<StatusCodeType>(_StatusCode_QNAME, StatusCodeType.class, null, value);
    }

}