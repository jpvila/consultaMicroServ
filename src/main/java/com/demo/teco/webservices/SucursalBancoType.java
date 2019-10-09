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
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}codSucursalBanco"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}descripcionSucursalBanco"/&gt;
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
    "codSucursalBanco",
    "descripcionSucursalBanco"
})
@XmlRootElement(name = "SucursalBancoType", namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0")
public class SucursalBancoType {

    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", required = true)
    protected String codSucursalBanco;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", required = true)
    protected String descripcionSucursalBanco;

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

    /**
     * Obtiene el valor de la propiedad descripcionSucursalBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionSucursalBanco() {
        return descripcionSucursalBanco;
    }

    /**
     * Define el valor de la propiedad descripcionSucursalBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionSucursalBanco(String value) {
        this.descripcionSucursalBanco = value;
    }

}
