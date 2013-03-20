//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 04:28:53 PM CET 
//


package cablelabs.md.xsd.offer._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import cablelabs.md.xsd.core._3.AssetRefBaseType;
import cablelabs.md.xsd.core._3.AssetRefType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cablelabs.md.xsd.offer._3 package. 
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

    private final static QName _Category_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "Category");
    private final static QName _ContentGroup_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "ContentGroup");
    private final static QName _Offer_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "Offer");
    private final static QName _ContentGroupTypeContentRef_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "ContentRef");
    private final static QName _ContentGroupTypeThumbnailRef_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "ThumbnailRef");
    private final static QName _ContentGroupTypePreviewRef_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "PreviewRef");
    private final static QName _ContentGroupTypePosterRef_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "PosterRef");
    private final static QName _ContentGroupTypeMovieRef_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "MovieRef");
    private final static QName _ContentGroupTypeBoxCoverRef_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "BoxCoverRef");
    private final static QName _ContentGroupTypeBarkerRef_QNAME = new QName("urn:cablelabs:md:xsd:offer:3.0", "BarkerRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cablelabs.md.xsd.offer._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link OfferType }
     * 
     */
    public OfferType createOfferType() {
        return new OfferType();
    }

    /**
     * Create an instance of {@link ContentGroupType }
     * 
     */
    public ContentGroupType createContentGroupType() {
        return new ContentGroupType();
    }

    /**
     * Create an instance of {@link CategoryPathType }
     * 
     */
    public CategoryPathType createCategoryPathType() {
        return new CategoryPathType();
    }

    /**
     * Create an instance of {@link PresentationType }
     * 
     */
    public PresentationType createPresentationType() {
        return new PresentationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "Category")
    public JAXBElement<CategoryType> createCategory(CategoryType value) {
        return new JAXBElement<CategoryType>(_Category_QNAME, CategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "ContentGroup")
    public JAXBElement<ContentGroupType> createContentGroup(ContentGroupType value) {
        return new JAXBElement<ContentGroupType>(_ContentGroup_QNAME, ContentGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "Offer")
    public JAXBElement<OfferType> createOffer(OfferType value) {
        return new JAXBElement<OfferType>(_Offer_QNAME, OfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetRefBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "ContentRef", scope = ContentGroupType.class)
    public JAXBElement<AssetRefBaseType> createContentGroupTypeContentRef(AssetRefBaseType value) {
        return new JAXBElement<AssetRefBaseType>(_ContentGroupTypeContentRef_QNAME, AssetRefBaseType.class, ContentGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "ThumbnailRef", scope = ContentGroupType.class)
    public JAXBElement<AssetRefType> createContentGroupTypeThumbnailRef(AssetRefType value) {
        return new JAXBElement<AssetRefType>(_ContentGroupTypeThumbnailRef_QNAME, AssetRefType.class, ContentGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "PreviewRef", scope = ContentGroupType.class)
    public JAXBElement<AssetRefType> createContentGroupTypePreviewRef(AssetRefType value) {
        return new JAXBElement<AssetRefType>(_ContentGroupTypePreviewRef_QNAME, AssetRefType.class, ContentGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "PosterRef", scope = ContentGroupType.class)
    public JAXBElement<AssetRefType> createContentGroupTypePosterRef(AssetRefType value) {
        return new JAXBElement<AssetRefType>(_ContentGroupTypePosterRef_QNAME, AssetRefType.class, ContentGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "MovieRef", scope = ContentGroupType.class)
    public JAXBElement<AssetRefType> createContentGroupTypeMovieRef(AssetRefType value) {
        return new JAXBElement<AssetRefType>(_ContentGroupTypeMovieRef_QNAME, AssetRefType.class, ContentGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "BoxCoverRef", scope = ContentGroupType.class)
    public JAXBElement<AssetRefType> createContentGroupTypeBoxCoverRef(AssetRefType value) {
        return new JAXBElement<AssetRefType>(_ContentGroupTypeBoxCoverRef_QNAME, AssetRefType.class, ContentGroupType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssetRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cablelabs:md:xsd:offer:3.0", name = "BarkerRef", scope = ContentGroupType.class)
    public JAXBElement<AssetRefType> createContentGroupTypeBarkerRef(AssetRefType value) {
        return new JAXBElement<AssetRefType>(_ContentGroupTypeBarkerRef_QNAME, AssetRefType.class, ContentGroupType.class, value);
    }

}