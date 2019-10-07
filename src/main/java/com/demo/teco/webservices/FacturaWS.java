//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 03:50:23 PM GFT 
//


package com.demo.teco.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaPrimerVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaSegundoVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lugarDePago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "FacturaWS", namespace = "http://consultaFacturasMic.entities.webservices.ct.telecom.com.ar", propOrder = {
    "estado",
    "fechaPrimerVencimiento",
    "fechaSegundoVencimiento",
    "idDocumento",
    "lugarDePago",
    "numeroFactura",
    "importe"
})
public class FacturaWS {

    @XmlElement(required = true, nillable = true)
    protected String estado;
    @XmlElement(required = true, nillable = true)
    protected String fechaPrimerVencimiento;
    @XmlElement(required = true, nillable = true)
    protected String fechaSegundoVencimiento;
    @XmlElement(required = true, nillable = true)
    protected String idDocumento;
    @XmlElement(required = true, nillable = true)
    protected String lugarDePago;
    @XmlElement(required = true, nillable = true)
    protected String numeroFactura;
    protected double importe;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPrimerVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPrimerVencimiento() {
        return fechaPrimerVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaPrimerVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPrimerVencimiento(String value) {
        this.fechaPrimerVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSegundoVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSegundoVencimiento() {
        return fechaSegundoVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaSegundoVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSegundoVencimiento(String value) {
        this.fechaSegundoVencimiento = value;
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
     * Obtiene el valor de la propiedad lugarDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarDePago() {
        return lugarDePago;
    }

    /**
     * Define el valor de la propiedad lugarDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarDePago(String value) {
        this.lugarDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Define el valor de la propiedad numeroFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactura(String value) {
        this.numeroFactura = value;
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
