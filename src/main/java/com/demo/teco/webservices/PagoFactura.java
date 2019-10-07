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
 *         &lt;element name="idSession" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoSeguridad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idAplicativo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "idSession",
    "idDocumento",
    "codigoSeguridad",
    "nroTarjeta",
    "fechaVencimiento",
    "documento",
    "ani",
    "token",
    "timeStamp",
    "idAplicativo"
})
@XmlRootElement(name = "pagoFactura")
public class PagoFactura {

    @XmlElement(required = true, nillable = true)
    protected String idSession;
    @XmlElement(required = true, nillable = true)
    protected String idDocumento;
    @XmlElement(required = true, nillable = true)
    protected String codigoSeguridad;
    @XmlElement(required = true, nillable = true)
    protected String nroTarjeta;
    @XmlElement(required = true, nillable = true)
    protected String fechaVencimiento;
    @XmlElement(required = true, nillable = true)
    protected String documento;
    @XmlElement(required = true, nillable = true)
    protected String ani;
    @XmlElement(required = true, nillable = true)
    protected String token;
    @XmlElement(required = true, nillable = true)
    protected String timeStamp;
    @XmlElement(required = true, nillable = true)
    protected String idAplicativo;

    /**
     * Obtiene el valor de la propiedad idSession.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSession() {
        return idSession;
    }

    /**
     * Define el valor de la propiedad idSession.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSession(String value) {
        this.idSession = value;
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
     * Obtiene el valor de la propiedad codigoSeguridad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    /**
     * Define el valor de la propiedad codigoSeguridad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSeguridad(String value) {
        this.codigoSeguridad = value;
    }

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
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad ani.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAni() {
        return ani;
    }

    /**
     * Define el valor de la propiedad ani.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAni(String value) {
        this.ani = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define el valor de la propiedad timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad idAplicativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAplicativo() {
        return idAplicativo;
    }

    /**
     * Define el valor de la propiedad idAplicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAplicativo(String value) {
        this.idAplicativo = value;
    }

}
