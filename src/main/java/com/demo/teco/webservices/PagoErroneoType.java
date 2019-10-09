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
 * <p>Clase Java para PagoErroneoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PagoErroneoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}PagoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}codErrorPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}descripcionErrorPago"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagoErroneoType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", propOrder = {
    "codErrorPago",
    "descripcionErrorPago"
})
public class PagoErroneoType
    extends PagoType
{

    @XmlElement(required = true)
    protected String codErrorPago;
    @XmlElement(required = true)
    protected String descripcionErrorPago;

    /**
     * Obtiene el valor de la propiedad codErrorPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodErrorPago() {
        return codErrorPago;
    }

    /**
     * Define el valor de la propiedad codErrorPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodErrorPago(String value) {
        this.codErrorPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionErrorPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionErrorPago() {
        return descripcionErrorPago;
    }

    /**
     * Define el valor de la propiedad descripcionErrorPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionErrorPago(String value) {
        this.descripcionErrorPago = value;
    }

}
