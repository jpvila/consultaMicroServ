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
 *         &lt;element name="numeroCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "numeroCliente",
    "token",
    "timeStamp",
    "idAplicativo"
})
@XmlRootElement(name = "consultaCliente")
public class ConsultaCliente {

    @XmlElement(required = true, nillable = true)
    protected String numeroCliente;
    @XmlElement(required = true, nillable = true)
    protected String token;
    @XmlElement(required = true, nillable = true)
    protected String timeStamp;
    @XmlElement(required = true, nillable = true)
    protected String idAplicativo;

    /**
     * Obtiene el valor de la propiedad numeroCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCliente() {
        return numeroCliente;
    }

    /**
     * Define el valor de la propiedad numeroCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCliente(String value) {
        this.numeroCliente = value;
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
