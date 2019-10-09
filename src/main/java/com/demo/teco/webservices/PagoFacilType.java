//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 07:23:35 PM GFT 
//


package com.demo.teco.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PagoFacilType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PagoFacilType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}codPagoFacil"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagoFacilType", namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", propOrder = {
    "codPagoFacil"
})
public class PagoFacilType {

    @XmlElement(required = true)
    protected String codPagoFacil;

    /**
     * Obtiene el valor de la propiedad codPagoFacil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPagoFacil() {
        return codPagoFacil;
    }

    /**
     * Define el valor de la propiedad codPagoFacil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPagoFacil(String value) {
        this.codPagoFacil = value;
    }

}
