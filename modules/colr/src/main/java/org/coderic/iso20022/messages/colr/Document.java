//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:50 PM COT 
//


package org.coderic.iso20022.messages.colr;

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
 *         &lt;element name="TrptyCollAllgmtNtfctnCxlAdvc" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}TripartyCollateralAllegementNotificationCancellationAdviceV01"/&gt;
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
    "trptyCollAllgmtNtfctnCxlAdvc"
})
public class Document {

    @XmlElement(name = "TrptyCollAllgmtNtfctnCxlAdvc", required = true)
    protected TripartyCollateralAllegementNotificationCancellationAdviceV01 trptyCollAllgmtNtfctnCxlAdvc;

    /**
     * Obtiene el valor de la propiedad trptyCollAllgmtNtfctnCxlAdvc.
     * 
     * @return
     *     possible object is
     *     {@link TripartyCollateralAllegementNotificationCancellationAdviceV01 }
     *     
     */
    public TripartyCollateralAllegementNotificationCancellationAdviceV01 getTrptyCollAllgmtNtfctnCxlAdvc() {
        return trptyCollAllgmtNtfctnCxlAdvc;
    }

    /**
     * Define el valor de la propiedad trptyCollAllgmtNtfctnCxlAdvc.
     * 
     * @param value
     *     allowed object is
     *     {@link TripartyCollateralAllegementNotificationCancellationAdviceV01 }
     *     
     */
    public void setTrptyCollAllgmtNtfctnCxlAdvc(TripartyCollateralAllegementNotificationCancellationAdviceV01 value) {
        this.trptyCollAllgmtNtfctnCxlAdvc = value;
    }

}
