//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:30 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountIdentification3Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountIdentification3Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="IBAN" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}IBANIdentifier"/&gt;
 *         &lt;element name="BBAN" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}BBANIdentifier"/&gt;
 *         &lt;element name="UPIC" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}UPICIdentifier"/&gt;
 *         &lt;element name="PrtryAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}SimpleIdentificationInformation2"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification3Choice", propOrder = {
    "iban",
    "bban",
    "upic",
    "prtryAcct"
})
public class AccountIdentification3Choice {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "UPIC")
    protected String upic;
    @XmlElement(name = "PrtryAcct")
    protected SimpleIdentificationInformation2 prtryAcct;

    /**
     * Obtiene el valor de la propiedad iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Define el valor de la propiedad iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Obtiene el valor de la propiedad bban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBAN() {
        return bban;
    }

    /**
     * Define el valor de la propiedad bban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBAN(String value) {
        this.bban = value;
    }

    /**
     * Obtiene el valor de la propiedad upic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPIC() {
        return upic;
    }

    /**
     * Define el valor de la propiedad upic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPIC(String value) {
        this.upic = value;
    }

    /**
     * Obtiene el valor de la propiedad prtryAcct.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation2 }
     *     
     */
    public SimpleIdentificationInformation2 getPrtryAcct() {
        return prtryAcct;
    }

    /**
     * Define el valor de la propiedad prtryAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation2 }
     *     
     */
    public void setPrtryAcct(SimpleIdentificationInformation2 value) {
        this.prtryAcct = value;
    }

}
