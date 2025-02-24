//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:26 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CashAccountIdentification7Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CashAccountIdentification7Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="IBAN" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}IBAN2007Identifier"/&gt;
 *         &lt;element name="BBAN" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}BBANIdentifier"/&gt;
 *         &lt;element name="UPIC" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}UPICIdentifier"/&gt;
 *         &lt;element name="DmstAcct" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}SimpleIdentificationInformation4"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountIdentification7Choice", propOrder = {
    "iban",
    "bban",
    "upic",
    "dmstAcct"
})
public class CashAccountIdentification7Choice {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "UPIC")
    protected String upic;
    @XmlElement(name = "DmstAcct")
    protected SimpleIdentificationInformation4 dmstAcct;

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
     * Obtiene el valor de la propiedad dmstAcct.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation4 }
     *     
     */
    public SimpleIdentificationInformation4 getDmstAcct() {
        return dmstAcct;
    }

    /**
     * Define el valor de la propiedad dmstAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation4 }
     *     
     */
    public void setDmstAcct(SimpleIdentificationInformation4 value) {
        this.dmstAcct = value;
    }

}
