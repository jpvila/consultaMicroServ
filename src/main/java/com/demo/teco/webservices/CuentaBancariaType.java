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
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}CBU"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}fechaAltaCtaBancaria"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}nroCuentaBancaria"/&gt;
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
    "cbu",
    "fechaAltaCtaBancaria",
    "nroCuentaBancaria"
})
@XmlRootElement(name = "CuentaBancariaType", namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0")
public class CuentaBancariaType {

    @XmlElement(name = "CBU", namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", required = true)
    protected String cbu;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", required = true)
    protected String fechaAltaCtaBancaria;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", required = true)
    protected String nroCuentaBancaria;

    /**
     * Obtiene el valor de la propiedad cbu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBU() {
        return cbu;
    }

    /**
     * Define el valor de la propiedad cbu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBU(String value) {
        this.cbu = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAltaCtaBancaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAltaCtaBancaria() {
        return fechaAltaCtaBancaria;
    }

    /**
     * Define el valor de la propiedad fechaAltaCtaBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAltaCtaBancaria(String value) {
        this.fechaAltaCtaBancaria = value;
    }

    /**
     * Obtiene el valor de la propiedad nroCuentaBancaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCuentaBancaria() {
        return nroCuentaBancaria;
    }

    /**
     * Define el valor de la propiedad nroCuentaBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCuentaBancaria(String value) {
        this.nroCuentaBancaria = value;
    }

}
