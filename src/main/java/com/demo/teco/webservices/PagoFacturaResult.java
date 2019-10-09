//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 07:23:35 PM GFT 
//


package com.demo.teco.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PagoFacturaResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PagoFacturaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroCupon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tramites" type="{http://pagoFactura.entities.webservices.ct.telecom.com.ar}TramiteCMSWS" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagoFacturaResult", namespace = "http://pagoFactura.entities.webservices.ct.telecom.com.ar", propOrder = {
    "codigoRespuesta",
    "mensaje",
    "numeroAutorizacion",
    "numeroCupon",
    "tramites"
})
public class PagoFacturaResult {

    @XmlElement(required = true, nillable = true)
    protected String codigoRespuesta;
    @XmlElement(required = true, nillable = true)
    protected String mensaje;
    @XmlElement(required = true, nillable = true)
    protected String numeroAutorizacion;
    @XmlElement(required = true, nillable = true)
    protected String numeroCupon;
    @XmlElement(required = true, nillable = true)
    protected List<TramiteCMSWS> tramites;

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAutorizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    /**
     * Define el valor de la propiedad numeroAutorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacion(String value) {
        this.numeroAutorizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCupon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCupon() {
        return numeroCupon;
    }

    /**
     * Define el valor de la propiedad numeroCupon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCupon(String value) {
        this.numeroCupon = value;
    }

    /**
     * Gets the value of the tramites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tramites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTramites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TramiteCMSWS }
     * 
     * 
     */
    public List<TramiteCMSWS> getTramites() {
        if (tramites == null) {
            tramites = new ArrayList<TramiteCMSWS>();
        }
        return this.tramites;
    }

}
