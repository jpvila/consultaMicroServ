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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0}nroTarjeta"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0}fechaVencimientoTarjeta"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0}fechaVencimientoCheque"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0}codSeguridadTarjeta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nroTarjeta",
    "fechaVencimientoTarjeta",
    "fechaVencimientoCheque",
    "codSeguridadTarjeta"
})
@XmlRootElement(name = "tarjeta", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0")
public class Tarjeta {

    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", required = true)
    protected String nroTarjeta;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", required = true)
    protected String fechaVencimientoTarjeta;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", required = true)
    protected String fechaVencimientoCheque;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", required = true)
    protected String codSeguridadTarjeta;

    /**
     * Obtiene el valor de la propiedad nroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * Define el valor de la propiedad nroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroTarjeta(String value) {
        this.nroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimientoTarjeta() {
        return fechaVencimientoTarjeta;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimientoTarjeta(String value) {
        this.fechaVencimientoTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimientoCheque() {
        return fechaVencimientoCheque;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimientoCheque(String value) {
        this.fechaVencimientoCheque = value;
    }

    /**
     * Obtiene el valor de la propiedad codSeguridadTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSeguridadTarjeta() {
        return codSeguridadTarjeta;
    }

    /**
     * Define el valor de la propiedad codSeguridadTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSeguridadTarjeta(String value) {
        this.codSeguridadTarjeta = value;
    }

}
