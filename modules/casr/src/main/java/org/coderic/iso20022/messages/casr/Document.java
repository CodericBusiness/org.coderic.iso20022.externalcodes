//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:34 PM COT 
//


package org.coderic.iso20022.messages.casr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SttlmRptgRspn" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}SettlementReportingResponseV02"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmRptgRspn"
})
public class Document {

    @XmlElement(name = "SttlmRptgRspn", required = true)
    protected SettlementReportingResponseV02 sttlmRptgRspn;

    /**
     * Obtiene el valor de la propiedad sttlmRptgRspn.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingResponseV02 }
     *     
     */
    public SettlementReportingResponseV02 getSttlmRptgRspn() {
        return sttlmRptgRspn;
    }

    /**
     * Define el valor de la propiedad sttlmRptgRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingResponseV02 }
     *     
     */
    public void setSttlmRptgRspn(SettlementReportingResponseV02 value) {
        this.sttlmRptgRspn = value;
    }

}
