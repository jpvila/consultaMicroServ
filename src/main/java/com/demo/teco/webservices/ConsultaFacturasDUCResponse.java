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
 *         &lt;element name="consultaFacturasDUCReturn" type="{http://consultaFacturasDuc.entities.webservices.ct.telecom.com.ar}ConsultaFacturasDUCResult"/&gt;
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
    "consultaFacturasDUCReturn"
})
@XmlRootElement(name = "consultaFacturasDUCResponse")
public class ConsultaFacturasDUCResponse {

    @XmlElement(required = true, nillable = true)
    protected ConsultaFacturasDUCResult consultaFacturasDUCReturn;

    /**
     * Obtiene el valor de la propiedad consultaFacturasDUCReturn.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaFacturasDUCResult }
     *     
     */
    public ConsultaFacturasDUCResult getConsultaFacturasDUCReturn() {
        return consultaFacturasDUCReturn;
    }

    /**
     * Define el valor de la propiedad consultaFacturasDUCReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaFacturasDUCResult }
     *     
     */
    public void setConsultaFacturasDUCReturn(ConsultaFacturasDUCResult value) {
        this.consultaFacturasDUCReturn = value;
    }

}
