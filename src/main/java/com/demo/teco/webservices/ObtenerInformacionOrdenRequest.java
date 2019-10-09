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
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0}codOrden"/&gt;
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0}nroCuponTarjeta" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaPago" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "codOrden",
    "tipoOperacion",
    "nroCuponTarjeta",
    "fechaPago",
    "usuario"
})
@XmlRootElement(name = "ObtenerInformacionOrdenRequest", namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0")
public class ObtenerInformacionOrdenRequest {

    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", required = true)
    protected String codOrden;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0", required = true)
    protected String tipoOperacion;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0")
    protected String nroCuponTarjeta;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0")
    protected String fechaPago;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0", required = true)
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad codOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrden() {
        return codOrden;
    }

    /**
     * Define el valor de la propiedad codOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrden(String value) {
        this.codOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nroCuponTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCuponTarjeta() {
        return nroCuponTarjeta;
    }

    /**
     * Define el valor de la propiedad nroCuponTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCuponTarjeta(String value) {
        this.nroCuponTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
