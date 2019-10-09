//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 07:23:35 PM GFT 
//


package com.demo.teco.webservices;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}importePago"/&gt;
 *         &lt;element name="cantidadTarjetas" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="medioDePago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0}cantidadCuotasTarjeta"/&gt;
 *         &lt;element name="idCliente1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idCliente2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0}codTarjeta"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}codBanco"/&gt;
 *         &lt;element name="equipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineaDeProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planDePago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/Moneda/v1.0}codMoneda"/&gt;
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
    "importePago",
    "cantidadTarjetas",
    "medioDePago",
    "cantidadCuotasTarjeta",
    "idCliente1",
    "idCliente2",
    "codTarjeta",
    "codBanco",
    "equipo",
    "lineaDeProducto",
    "planDePago",
    "codMoneda"
})
@XmlRootElement(name = "ObtenerInformacionOrdenResponse", namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0")
public class ObtenerInformacionOrdenResponse {

    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", required = true)
    protected String codOrden;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", required = true)
    protected String importePago;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0", required = true)
    protected BigInteger cantidadTarjetas;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0", required = true)
    protected String medioDePago;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", required = true)
    protected BigInteger cantidadCuotasTarjeta;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0", required = true)
    protected String idCliente1;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0", required = true)
    protected String idCliente2;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", required = true)
    protected String codTarjeta;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", required = true)
    protected String codBanco;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0")
    protected String equipo;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0", required = true)
    protected String lineaDeProducto;
    @XmlElement(namespace = "http://www.personal.com.ar/ESB/ObtenerInformacionOrden/v1.0", required = true)
    protected String planDePago;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Moneda/v1.0", required = true)
    protected String codMoneda;

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
     * Obtiene el valor de la propiedad importePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportePago() {
        return importePago;
    }

    /**
     * Define el valor de la propiedad importePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportePago(String value) {
        this.importePago = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadTarjetas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadTarjetas() {
        return cantidadTarjetas;
    }

    /**
     * Define el valor de la propiedad cantidadTarjetas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadTarjetas(BigInteger value) {
        this.cantidadTarjetas = value;
    }

    /**
     * Obtiene el valor de la propiedad medioDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioDePago() {
        return medioDePago;
    }

    /**
     * Define el valor de la propiedad medioDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioDePago(String value) {
        this.medioDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadCuotasTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadCuotasTarjeta() {
        return cantidadCuotasTarjeta;
    }

    /**
     * Define el valor de la propiedad cantidadCuotasTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadCuotasTarjeta(BigInteger value) {
        this.cantidadCuotasTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente1() {
        return idCliente1;
    }

    /**
     * Define el valor de la propiedad idCliente1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente1(String value) {
        this.idCliente1 = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente2() {
        return idCliente2;
    }

    /**
     * Define el valor de la propiedad idCliente2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente2(String value) {
        this.idCliente2 = value;
    }

    /**
     * Obtiene el valor de la propiedad codTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTarjeta() {
        return codTarjeta;
    }

    /**
     * Define el valor de la propiedad codTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTarjeta(String value) {
        this.codTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad codBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBanco() {
        return codBanco;
    }

    /**
     * Define el valor de la propiedad codBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBanco(String value) {
        this.codBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad equipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * Define el valor de la propiedad equipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipo(String value) {
        this.equipo = value;
    }

    /**
     * Obtiene el valor de la propiedad lineaDeProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineaDeProducto() {
        return lineaDeProducto;
    }

    /**
     * Define el valor de la propiedad lineaDeProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineaDeProducto(String value) {
        this.lineaDeProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad planDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanDePago() {
        return planDePago;
    }

    /**
     * Define el valor de la propiedad planDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanDePago(String value) {
        this.planDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad codMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMoneda() {
        return codMoneda;
    }

    /**
     * Define el valor de la propiedad codMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMoneda(String value) {
        this.codMoneda = value;
    }

}
