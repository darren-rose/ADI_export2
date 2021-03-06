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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import cablelabs.md.xsd.core._3.AssetRefType;
import cablelabs.md.xsd.core._3.RatingType;
import cablelabs.md.xsd.core._3.TrickModeRestrictionType;


/**
 * <p>Java class for AudioVideoAssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioVideoAssetType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cablelabs:md:xsd:content:3.0}ContentAssetType">
 *       &lt;sequence>
 *         &lt;element name="AudioType" type="{urn:cablelabs:md:xsd:content:3.0}AudioTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScreenFormat" type="{urn:cablelabs:md:xsd:content:3.0}ScreenFormatType" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{urn:cablelabs:md:xsd:content:3.0}ResolutionType" minOccurs="0"/>
 *         &lt;element name="FrameRate" type="{urn:cablelabs:md:xsd:content:3.0}FrameRateType" minOccurs="0"/>
 *         &lt;element name="Codec" type="{urn:cablelabs:md:xsd:content:3.0}CodecType" minOccurs="0"/>
 *         &lt;element name="AVContainer" type="{urn:cablelabs:md:xsd:content:3.0}AVContainerType" minOccurs="0"/>
 *         &lt;element name="BitRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AlternateBitRateResolution" type="{urn:cablelabs:md:xsd:content:3.0}BitRateResolutionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:cablelabs:md:xsd:core:3.0}LanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubtitleLanguage" type="{urn:cablelabs:md:xsd:core:3.0}LanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DubbedLanguage" type="{urn:cablelabs:md:xsd:core:3.0}LanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rating" type="{urn:cablelabs:md:xsd:core:3.0}RatingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Audience" type="{urn:cablelabs:md:xsd:core:3.0}AudienceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EncryptionInfo" type="{urn:cablelabs:md:xsd:content:3.0}EncryptionInfoType" minOccurs="0"/>
 *         &lt;element name="CopyControlInfo" type="{urn:cablelabs:md:xsd:content:3.0}CopyControlInfoType" minOccurs="0"/>
 *         &lt;element name="IsResumeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TrickModesRestricted" type="{urn:cablelabs:md:xsd:core:3.0}TrickModeRestrictionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrickRef" type="{urn:cablelabs:md:xsd:core:3.0}AssetRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThreeDMode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "AudioVideoAssetType", propOrder = {
    "audioType",
    "screenFormat",
    "resolution",
    "frameRate",
    "codec",
    "avContainer",
    "bitRate",
    "alternateBitRateResolution",
    "duration",
    "language",
    "subtitleLanguage",
    "dubbedLanguage",
    "rating",
    "audience",
    "encryptionInfo",
    "copyControlInfo",
    "isResumeEnabled",
    "trickModesRestricted",
    "trickRef",
    "threeDMode"
})
@XmlSeeAlso({
    PreviewType.class,
    MovieType.class,
    BarkerType.class
})
public class AudioVideoAssetType
    extends ContentAssetType
{

    @XmlElement(name = "AudioType")
    protected List<String> audioType;
    @XmlElement(name = "ScreenFormat")
    protected String screenFormat;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "FrameRate")
    protected String frameRate;
    @XmlElement(name = "Codec")
    protected String codec;
    @XmlElement(name = "AVContainer")
    protected String avContainer;
    @XmlElement(name = "BitRate")
    protected BigInteger bitRate;
    @XmlElement(name = "AlternateBitRateResolution")
    protected List<BitRateResolutionType> alternateBitRateResolution;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> language;
    @XmlElement(name = "SubtitleLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> subtitleLanguage;
    @XmlElement(name = "DubbedLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> dubbedLanguage;
    @XmlElement(name = "Rating")
    protected List<RatingType> rating;
    @XmlElement(name = "Audience")
    protected List<String> audience;
    @XmlElement(name = "EncryptionInfo")
    protected EncryptionInfoType encryptionInfo;
    @XmlElement(name = "CopyControlInfo")
    protected CopyControlInfoType copyControlInfo;
    @XmlElement(name = "IsResumeEnabled")
    protected Boolean isResumeEnabled;
    @XmlElement(name = "TrickModesRestricted")
    protected List<TrickModeRestrictionType> trickModesRestricted;
    @XmlElement(name = "TrickRef")
    protected List<AssetRefType> trickRef;
    @XmlElement(name = "ThreeDMode")
    protected BigInteger threeDMode;

    /**
     * Gets the value of the audioType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudioType() {
        if (audioType == null) {
            audioType = new ArrayList<String>();
        }
        return this.audioType;
    }

    /**
     * Gets the value of the screenFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenFormat() {
        return screenFormat;
    }

    /**
     * Sets the value of the screenFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenFormat(String value) {
        this.screenFormat = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the frameRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameRate() {
        return frameRate;
    }

    /**
     * Sets the value of the frameRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameRate(String value) {
        this.frameRate = value;
    }

    /**
     * Gets the value of the codec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Sets the value of the codec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodec(String value) {
        this.codec = value;
    }

    /**
     * Gets the value of the avContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVContainer() {
        return avContainer;
    }

    /**
     * Sets the value of the avContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVContainer(String value) {
        this.avContainer = value;
    }

    /**
     * Gets the value of the bitRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBitRate() {
        return bitRate;
    }

    /**
     * Sets the value of the bitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBitRate(BigInteger value) {
        this.bitRate = value;
    }

    /**
     * Gets the value of the alternateBitRateResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateBitRateResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateBitRateResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BitRateResolutionType }
     * 
     * 
     */
    public List<BitRateResolutionType> getAlternateBitRateResolution() {
        if (alternateBitRateResolution == null) {
            alternateBitRateResolution = new ArrayList<BitRateResolutionType>();
        }
        return this.alternateBitRateResolution;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguage() {
        if (language == null) {
            language = new ArrayList<String>();
        }
        return this.language;
    }

    /**
     * Gets the value of the subtitleLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtitleLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtitleLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubtitleLanguage() {
        if (subtitleLanguage == null) {
            subtitleLanguage = new ArrayList<String>();
        }
        return this.subtitleLanguage;
    }

    /**
     * Gets the value of the dubbedLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dubbedLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDubbedLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDubbedLanguage() {
        if (dubbedLanguage == null) {
            dubbedLanguage = new ArrayList<String>();
        }
        return this.dubbedLanguage;
    }

    /**
     * Gets the value of the rating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingType }
     * 
     * 
     */
    public List<RatingType> getRating() {
        if (rating == null) {
            rating = new ArrayList<RatingType>();
        }
        return this.rating;
    }

    /**
     * Gets the value of the audience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudience() {
        if (audience == null) {
            audience = new ArrayList<String>();
        }
        return this.audience;
    }

    /**
     * Gets the value of the encryptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionInfoType }
     *     
     */
    public EncryptionInfoType getEncryptionInfo() {
        return encryptionInfo;
    }

    /**
     * Sets the value of the encryptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionInfoType }
     *     
     */
    public void setEncryptionInfo(EncryptionInfoType value) {
        this.encryptionInfo = value;
    }

    /**
     * Gets the value of the copyControlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CopyControlInfoType }
     *     
     */
    public CopyControlInfoType getCopyControlInfo() {
        return copyControlInfo;
    }

    /**
     * Sets the value of the copyControlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyControlInfoType }
     *     
     */
    public void setCopyControlInfo(CopyControlInfoType value) {
        this.copyControlInfo = value;
    }

    /**
     * Gets the value of the isResumeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResumeEnabled() {
        return isResumeEnabled;
    }

    /**
     * Sets the value of the isResumeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResumeEnabled(Boolean value) {
        this.isResumeEnabled = value;
    }

    /**
     * Gets the value of the trickModesRestricted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trickModesRestricted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrickModesRestricted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrickModeRestrictionType }
     * 
     * 
     */
    public List<TrickModeRestrictionType> getTrickModesRestricted() {
        if (trickModesRestricted == null) {
            trickModesRestricted = new ArrayList<TrickModeRestrictionType>();
        }
        return this.trickModesRestricted;
    }

    /**
     * Gets the value of the trickRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trickRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrickRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetRefType }
     * 
     * 
     */
    public List<AssetRefType> getTrickRef() {
        if (trickRef == null) {
            trickRef = new ArrayList<AssetRefType>();
        }
        return this.trickRef;
    }

    /**
     * Gets the value of the threeDMode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThreeDMode() {
        return threeDMode;
    }

    /**
     * Sets the value of the threeDMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThreeDMode(BigInteger value) {
        this.threeDMode = value;
    }

}
