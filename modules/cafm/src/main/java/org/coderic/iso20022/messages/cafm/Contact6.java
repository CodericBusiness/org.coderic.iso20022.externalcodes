//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:50 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Contact6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contact6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HomePhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="BizPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="MobPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="OthrPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="PrsnlEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="BizEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="OthrEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="HomeFaxNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="BizFaxNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}LanguageCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact6", propOrder = {
    "homePhneNb",
    "bizPhneNb",
    "mobPhneNb",
    "othrPhneNb",
    "prsnlEmailAdr",
    "bizEmailAdr",
    "othrEmailAdr",
    "homeFaxNb",
    "bizFaxNb",
    "urlAdr",
    "lang"
})
public class Contact6 {

    @XmlElement(name = "HomePhneNb")
    protected String homePhneNb;
    @XmlElement(name = "BizPhneNb")
    protected String bizPhneNb;
    @XmlElement(name = "MobPhneNb")
    protected String mobPhneNb;
    @XmlElement(name = "OthrPhneNb")
    protected String othrPhneNb;
    @XmlElement(name = "PrsnlEmailAdr")
    protected String prsnlEmailAdr;
    @XmlElement(name = "BizEmailAdr")
    protected String bizEmailAdr;
    @XmlElement(name = "OthrEmailAdr")
    protected String othrEmailAdr;
    @XmlElement(name = "HomeFaxNb")
    protected String homeFaxNb;
    @XmlElement(name = "BizFaxNb")
    protected String bizFaxNb;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "Lang")
    protected String lang;

    /**
     * Obtiene el valor de la propiedad homePhneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhneNb() {
        return homePhneNb;
    }

    /**
     * Define el valor de la propiedad homePhneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhneNb(String value) {
        this.homePhneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad bizPhneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPhneNb() {
        return bizPhneNb;
    }

    /**
     * Define el valor de la propiedad bizPhneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizPhneNb(String value) {
        this.bizPhneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad mobPhneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobPhneNb() {
        return mobPhneNb;
    }

    /**
     * Define el valor de la propiedad mobPhneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobPhneNb(String value) {
        this.mobPhneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad othrPhneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPhneNb() {
        return othrPhneNb;
    }

    /**
     * Define el valor de la propiedad othrPhneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPhneNb(String value) {
        this.othrPhneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad prsnlEmailAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlEmailAdr() {
        return prsnlEmailAdr;
    }

    /**
     * Define el valor de la propiedad prsnlEmailAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrsnlEmailAdr(String value) {
        this.prsnlEmailAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad bizEmailAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizEmailAdr() {
        return bizEmailAdr;
    }

    /**
     * Define el valor de la propiedad bizEmailAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizEmailAdr(String value) {
        this.bizEmailAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad othrEmailAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrEmailAdr() {
        return othrEmailAdr;
    }

    /**
     * Define el valor de la propiedad othrEmailAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrEmailAdr(String value) {
        this.othrEmailAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad homeFaxNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeFaxNb() {
        return homeFaxNb;
    }

    /**
     * Define el valor de la propiedad homeFaxNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeFaxNb(String value) {
        this.homeFaxNb = value;
    }

    /**
     * Obtiene el valor de la propiedad bizFaxNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizFaxNb() {
        return bizFaxNb;
    }

    /**
     * Define el valor de la propiedad bizFaxNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizFaxNb(String value) {
        this.bizFaxNb = value;
    }

    /**
     * Obtiene el valor de la propiedad urlAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Define el valor de la propiedad urlAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
