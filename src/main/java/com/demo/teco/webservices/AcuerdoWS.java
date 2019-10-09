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
 * <p>Clase Java para AcuerdoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcuerdoWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domicilioFacturacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lineaCabecera" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroAcuerdo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcuerdoWS", namespace = "http://consultaCliente.entities.webservices.ct.telecom.com.ar", propOrder = {
    "domicilioFacturacion",
    "lineaCabecera",
    "nombreCuenta",
    "numeroAcuerdo"
})
public class AcuerdoWS {

    @XmlElement(required = true, nillable = true)
    protected String domicilioFacturacion;
    @XmlElement(required = true, nillable = true)
    protected String lineaCabecera;
    @XmlElement(required = true, nillable = true)
    protected String nombreCuenta;
    @XmlElement(required = true, nillable = true)
    protected String numeroAcuerdo;

    /**
     * Obtiene el valor de la propiedad domicilioFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioFacturacion() {
        return domicilioFacturacion;
    }

    /**
     * Define el valor de la propiedad domicilioFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioFacturacion(String value) {
        this.domicilioFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad lineaCabecera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineaCabecera() {
        return lineaCabecera;
    }

    /**
     * Define el valor de la propiedad lineaCabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineaCabecera(String value) {
        this.lineaCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    /**
     * Define el valor de la propiedad nombreCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCuenta(String value) {
        this.nombreCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAcuerdo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAcuerdo() {
        return numeroAcuerdo;
    }

    /**
     * Define el valor de la propiedad numeroAcuerdo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAcuerdo(String value) {
        this.numeroAcuerdo = value;
    }

}
