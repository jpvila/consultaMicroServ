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
 * <p>Clase Java para FacturaDUCWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaDUCWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcionEstadoDUC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcionTipoDUC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroFacturaDUC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vencimientoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaDUCWS", namespace = "http://consultaFacturasDuc.entities.webservices.ct.telecom.com.ar", propOrder = {
    "descripcionEstadoDUC",
    "descripcionTipoDUC",
    "idDocumento",
    "numeroFacturaDUC",
    "vencimientoFactura",
    "importe"
})
public class FacturaDUCWS {

    @XmlElement(required = true, nillable = true)
    protected String descripcionEstadoDUC;
    @XmlElement(required = true, nillable = true)
    protected String descripcionTipoDUC;
    @XmlElement(required = true, nillable = true)
    protected String idDocumento;
    @XmlElement(required = true, nillable = true)
    protected String numeroFacturaDUC;
    @XmlElement(required = true, nillable = true)
    protected String vencimientoFactura;
    protected double importe;

    /**
     * Obtiene el valor de la propiedad descripcionEstadoDUC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoDUC() {
        return descripcionEstadoDUC;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoDUC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoDUC(String value) {
        this.descripcionEstadoDUC = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTipoDUC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTipoDUC() {
        return descripcionTipoDUC;
    }

    /**
     * Define el valor de la propiedad descripcionTipoDUC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTipoDUC(String value) {
        this.descripcionTipoDUC = value;
    }

    /**
     * Obtiene el valor de la propiedad idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Define el valor de la propiedad idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFacturaDUC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFacturaDUC() {
        return numeroFacturaDUC;
    }

    /**
     * Define el valor de la propiedad numeroFacturaDUC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFacturaDUC(String value) {
        this.numeroFacturaDUC = value;
    }

    /**
     * Obtiene el valor de la propiedad vencimientoFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimientoFactura() {
        return vencimientoFactura;
    }

    /**
     * Define el valor de la propiedad vencimientoFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimientoFactura(String value) {
        this.vencimientoFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

}
