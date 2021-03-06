//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 04:28:53 PM CET 
//


package cablelabs.md.xsd.offer._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cablelabs.md.xsd.core._3.AssetRefType;
import cablelabs.md.xsd.core._3.AssetType;
import cablelabs.md.xsd.core._3.DeprecatedStringType;


/**
 * An asset type combining all of the components needed to display and deliver a VOD product; including presentation, terms and content.
 * 
 * <p>Java class for OfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cablelabs:md:xsd:core:3.0}AssetType">
 *       &lt;sequence>
 *         &lt;element name="Presentation" type="{urn:cablelabs:md:xsd:offer:3.0}PresentationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PromotionalContentGroupRef" type="{urn:cablelabs:md:xsd:core:3.0}AssetRefType"/>
 *         &lt;element name="ProviderContentTier" type="{urn:cablelabs:md:xsd:offer:3.0}ProviderContentTierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SourceMetadataSpecVersion" type="{urn:cablelabs:md:xsd:core:3.0}DeprecatedStringType" minOccurs="0"/>
 *         &lt;element name="BillingId" type="{urn:cablelabs:md:xsd:offer:3.0}BillingIdType"/>
 *         &lt;element name="TermsRef" type="{urn:cablelabs:md:xsd:core:3.0}AssetRefType"/>
 *         &lt;element name="ContentGroupRef" type="{urn:cablelabs:md:xsd:core:3.0}AssetRefType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "presentation",
    "promotionalContentGroupRef",
    "providerContentTier",
    "sourceMetadataSpecVersion",
    "billingId",
    "termsRef",
    "contentGroupRef"
})
public class OfferType
    extends AssetType
{

    @XmlElement(name = "Presentation")
    protected List<PresentationType> presentation;
    @XmlElement(name = "PromotionalContentGroupRef", required = true)
    protected AssetRefType promotionalContentGroupRef;
    @XmlElement(name = "ProviderContentTier")
    protected List<String> providerContentTier;
    @XmlElement(name = "SourceMetadataSpecVersion")
    protected DeprecatedStringType sourceMetadataSpecVersion;
    @XmlElement(name = "BillingId", required = true)
    protected String billingId;
    @XmlElement(name = "TermsRef", required = true)
    protected AssetRefType termsRef;
    @XmlElement(name = "ContentGroupRef", required = true)
    protected List<AssetRefType> contentGroupRef;

    /**
     * Gets the value of the presentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentationType }
     * 
     * 
     */
    public List<PresentationType> getPresentation() {
        if (presentation == null) {
            presentation = new ArrayList<PresentationType>();
        }
        return this.presentation;
    }

    /**
     * Gets the value of the promotionalContentGroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link AssetRefType }
     *     
     */
    public AssetRefType getPromotionalContentGroupRef() {
        return promotionalContentGroupRef;
    }

    /**
     * Sets the value of the promotionalContentGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetRefType }
     *     
     */
    public void setPromotionalContentGroupRef(AssetRefType value) {
        this.promotionalContentGroupRef = value;
    }

    /**
     * Gets the value of the providerContentTier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerContentTier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderContentTier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProviderContentTier() {
        if (providerContentTier == null) {
            providerContentTier = new ArrayList<String>();
        }
        return this.providerContentTier;
    }

    /**
     * Gets the value of the sourceMetadataSpecVersion property.
     * 
     * @return
     *     possible object is
     *     {@link DeprecatedStringType }
     *     
     */
    public DeprecatedStringType getSourceMetadataSpecVersion() {
        return sourceMetadataSpecVersion;
    }

    /**
     * Sets the value of the sourceMetadataSpecVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeprecatedStringType }
     *     
     */
    public void setSourceMetadataSpecVersion(DeprecatedStringType value) {
        this.sourceMetadataSpecVersion = value;
    }

    /**
     * Gets the value of the billingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingId() {
        return billingId;
    }

    /**
     * Sets the value of the billingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingId(String value) {
        this.billingId = value;
    }

    /**
     * Gets the value of the termsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AssetRefType }
     *     
     */
    public AssetRefType getTermsRef() {
        return termsRef;
    }

    /**
     * Sets the value of the termsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetRefType }
     *     
     */
    public void setTermsRef(AssetRefType value) {
        this.termsRef = value;
    }

    /**
     * Gets the value of the contentGroupRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentGroupRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentGroupRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetRefType }
     * 
     * 
     */
    public List<AssetRefType> getContentGroupRef() {
        if (contentGroupRef == null) {
            contentGroupRef = new ArrayList<AssetRefType>();
        }
        return this.contentGroupRef;
    }

}
