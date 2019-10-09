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
 * <p>Clase Java para AjusteFinancieroType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AjusteFinancieroType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}codAjusteFinanciero"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}importeAjusteFinanciero"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}estadoAjusteFinanciero"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AjusteFinancieroType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", propOrder = {
    "codAjusteFinanciero",
    "importeAjusteFinanciero",
    "estadoAjusteFinanciero"
})
public class AjusteFinancieroType {

    @XmlElement(required = true)
    protected String codAjusteFinanciero;
    @XmlElement(required = true)
    protected String importeAjusteFinanciero;
    @XmlElement(required = true)
    protected String estadoAjusteFinanciero;

    /**
     * Obtiene el valor de la propiedad codAjusteFinanciero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAjusteFinanciero() {
        return codAjusteFinanciero;
    }

    /**
     * Define el valor de la propiedad codAjusteFinanciero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAjusteFinanciero(String value) {
        this.codAjusteFinanciero = value;
    }

    /**
     * Obtiene el valor de la propiedad importeAjusteFinanciero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteAjusteFinanciero() {
        return importeAjusteFinanciero;
    }

    /**
     * Define el valor de la propiedad importeAjusteFinanciero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteAjusteFinanciero(String value) {
        this.importeAjusteFinanciero = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoAjusteFinanciero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoAjusteFinanciero() {
        return estadoAjusteFinanciero;
    }

    /**
     * Define el valor de la propiedad estadoAjusteFinanciero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoAjusteFinanciero(String value) {
        this.estadoAjusteFinanciero = value;
    }

}
