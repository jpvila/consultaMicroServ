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
 * <p>Clase Java para FacturaDeimonWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaDeimonWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cuotaConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estadoCuota" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nroFacturaLegal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroTramite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "FacturaDeimonWS", namespace = "http://consultaFacturasDeimon.entities.webservices.ct.telecom.com.ar", propOrder = {
    "cuotaConvenio",
    "estadoCuota",
    "fechaVencimiento",
    "idDocumento",
    "nroFacturaLegal",
    "numeroTramite",
    "tipoConvenio",
    "importe"
})
public class FacturaDeimonWS {

    @XmlElement(required = true, nillable = true)
    protected String cuotaConvenio;
    @XmlElement(required = true, nillable = true)
    protected String estadoCuota;
    @XmlElement(required = true, nillable = true)
    protected String fechaVencimiento;
    @XmlElement(required = true, nillable = true)
    protected String idDocumento;
    @XmlElement(required = true, nillable = true)
    protected String nroFacturaLegal;
    @XmlElement(required = true, nillable = true)
    protected String numeroTramite;
    @XmlElement(required = true, nillable = true)
    protected String tipoConvenio;
    protected double importe;

    /**
     * Obtiene el valor de la propiedad cuotaConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaConvenio() {
        return cuotaConvenio;
    }

    /**
     * Define el valor de la propiedad cuotaConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaConvenio(String value) {
        this.cuotaConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCuota() {
        return estadoCuota;
    }

    /**
     * Define el valor de la propiedad estadoCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCuota(String value) {
        this.estadoCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
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
     * Obtiene el valor de la propiedad nroFacturaLegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroFacturaLegal() {
        return nroFacturaLegal;
    }

    /**
     * Define el valor de la propiedad nroFacturaLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroFacturaLegal(String value) {
        this.nroFacturaLegal = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTramite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTramite() {
        return numeroTramite;
    }

    /**
     * Define el valor de la propiedad numeroTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTramite(String value) {
        this.numeroTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConvenio() {
        return tipoConvenio;
    }

    /**
     * Define el valor de la propiedad tipoConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConvenio(String value) {
        this.tipoConvenio = value;
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
