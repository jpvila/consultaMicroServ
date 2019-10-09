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
 *         &lt;element name="consultaClienteReturn" type="{http://consultaCliente.entities.webservices.ct.telecom.com.ar}ConsultaClienteResult"/&gt;
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
    "consultaClienteReturn"
})
@XmlRootElement(name = "consultaClienteResponse")
public class ConsultaClienteResponse {

    @XmlElement(required = true, nillable = true)
    protected ConsultaClienteResult consultaClienteReturn;

    /**
     * Obtiene el valor de la propiedad consultaClienteReturn.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaClienteResult }
     *     
     */
    public ConsultaClienteResult getConsultaClienteReturn() {
        return consultaClienteReturn;
    }

    /**
     * Define el valor de la propiedad consultaClienteReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaClienteResult }
     *     
     */
    public void setConsultaClienteReturn(ConsultaClienteResult value) {
        this.consultaClienteReturn = value;
    }

}
