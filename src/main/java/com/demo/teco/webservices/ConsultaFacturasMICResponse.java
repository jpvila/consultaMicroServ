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
 *         &lt;element name="consultaFacturasMICReturn" type="{http://consultaFacturasMic.entities.webservices.ct.telecom.com.ar}ConsultaFacturasMICResult"/&gt;
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
    "consultaFacturasMICReturn"
})
@XmlRootElement(name = "consultaFacturasMICResponse")
public class ConsultaFacturasMICResponse {

    @XmlElement(required = true, nillable = true)
    protected ConsultaFacturasMICResult consultaFacturasMICReturn;

    /**
     * Obtiene el valor de la propiedad consultaFacturasMICReturn.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaFacturasMICResult }
     *     
     */
    public ConsultaFacturasMICResult getConsultaFacturasMICReturn() {
        return consultaFacturasMICReturn;
    }

    /**
     * Define el valor de la propiedad consultaFacturasMICReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaFacturasMICResult }
     *     
     */
    public void setConsultaFacturasMICReturn(ConsultaFacturasMICResult value) {
        this.consultaFacturasMICReturn = value;
    }

}
