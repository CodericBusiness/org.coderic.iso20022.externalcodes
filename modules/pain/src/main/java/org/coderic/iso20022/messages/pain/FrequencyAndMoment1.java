//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:02 PM COT 
//


package org.coderic.iso20022.messages.pain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FrequencyAndMoment1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FrequencyAndMoment1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Frequency6Code"/&gt;
 *         &lt;element name="PtInTm" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Exact2NumericText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyAndMoment1", propOrder = {
    "tp",
    "ptInTm"
})
public class FrequencyAndMoment1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency6Code tp;
    @XmlElement(name = "PtInTm", required = true)
    protected String ptInTm;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link Frequency6Code }
     *     
     */
    public Frequency6Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency6Code }
     *     
     */
    public void setTp(Frequency6Code value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad ptInTm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtInTm() {
        return ptInTm;
    }

    /**
     * Define el valor de la propiedad ptInTm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtInTm(String value) {
        this.ptInTm = value;
    }

}
