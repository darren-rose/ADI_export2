//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 04:29:34 PM CET 
//


package cablelabs.md.xsd.content._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import cablelabs.md.xsd.core._3.AssetRefType;
import cablelabs.md.xsd.core._3.AssetType;
import cablelabs.md.xsd.core._3.EffectiveAssetRefType;


/**
 * <p>Java class for ContentAssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentAssetType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cablelabs:md:xsd:core:3.0}AssetType">
 *       &lt;sequence>
 *         &lt;element name="POGroupRef" type="{urn:cablelabs:md:xsd:core:3.0}EffectiveAssetRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SignalGroupRef" type="{urn:cablelabs:md:xsd:core:3.0}AssetRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SourceUrl" type="{urn:cablelabs:md:xsd:content:3.0}SourceUrlType" minOccurs="0"/>
 *         &lt;element name="ContentFileSize" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="ContentCheckSum" type="{urn:cablelabs:md:xsd:content:3.0}ChecksumType" minOccurs="0"/>
 *         &lt;element name="PropagationPriority" type="{urn:cablelabs:md:xsd:content:3.0}PropagationPriorityType" minOccurs="0"/>
 *         &lt;element name="ContentRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{urn:cablelabs:md:xsd:core:3.0}NonEmptyStringType" minOccurs="0"/>
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
@XmlType(name = "ContentAssetType", propOrder = {
    "poGroupRef",
    "signalGroupRef",
    "sourceUrl",
    "contentFileSize",
    "contentCheckSum",
    "propagationPriority",
    "contentRef",
    "mediaType"
})
@XmlSeeAlso({
    TrickType.class,
    StillImageAssetType.class,
    AudioVideoAssetType.class
})
public class ContentAssetType
    extends AssetType
{

    @XmlElement(name = "POGroupRef")
    protected List<EffectiveAssetRefType> poGroupRef;
    @XmlElement(name = "SignalGroupRef")
    protected List<AssetRefType> signalGroupRef;
    @XmlElement(name = "SourceUrl")
    protected String sourceUrl;
    @XmlElement(name = "ContentFileSize")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger contentFileSize;
    @XmlElement(name = "ContentCheckSum")
    protected String contentCheckSum;
    @XmlElement(name = "PropagationPriority")
    protected Integer propagationPriority;
    @XmlElement(name = "ContentRef")
    @XmlSchemaType(name = "anyURI")
    protected String contentRef;
    @XmlElement(name = "MediaType")
    protected String mediaType;

    /**
     * Gets the value of the poGroupRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poGroupRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOGroupRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectiveAssetRefType }
     * 
     * 
     */
    public List<EffectiveAssetRefType> getPOGroupRef() {
        if (poGroupRef == null) {
            poGroupRef = new ArrayList<EffectiveAssetRefType>();
        }
        return this.poGroupRef;
    }

    /**
     * Gets the value of the signalGroupRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signalGroupRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignalGroupRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetRefType }
     * 
     * 
     */
    public List<AssetRefType> getSignalGroupRef() {
        if (signalGroupRef == null) {
            signalGroupRef = new ArrayList<AssetRefType>();
        }
        return this.signalGroupRef;
    }

    /**
     * Gets the value of the sourceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Sets the value of the sourceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUrl(String value) {
        this.sourceUrl = value;
    }

    /**
     * Gets the value of the contentFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContentFileSize() {
        return contentFileSize;
    }

    /**
     * Sets the value of the contentFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContentFileSize(BigInteger value) {
        this.contentFileSize = value;
    }

    /**
     * Gets the value of the contentCheckSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentCheckSum() {
        return contentCheckSum;
    }

    /**
     * Sets the value of the contentCheckSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentCheckSum(String value) {
        this.contentCheckSum = value;
    }

    /**
     * Gets the value of the propagationPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropagationPriority() {
        return propagationPriority;
    }

    /**
     * Sets the value of the propagationPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropagationPriority(Integer value) {
        this.propagationPriority = value;
    }

    /**
     * Gets the value of the contentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentRef() {
        return contentRef;
    }

    /**
     * Sets the value of the contentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentRef(String value) {
        this.contentRef = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

}
