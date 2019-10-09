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
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}codBanco"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}codSucursalBanco"/&gt;
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
    "codBanco",
    "codSucursalBanco"
})
@XmlRootElement(name = "numeroBancoDePago", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0")
public class NumeroBancoDePago {

    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", required = true)
    protected String codBanco;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", required = true)
    protected String codSucursalBanco;

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
     * Obtiene el valor de la propiedad codSucursalBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSucursalBanco() {
        return codSucursalBanco;
    }

    /**
     * Define el valor de la propiedad codSucursalBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSucursalBanco(String value) {
        this.codSucursalBanco = value;
    }

}
