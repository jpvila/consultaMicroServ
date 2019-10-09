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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnteRecaudadorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnteRecaudadorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}EntidadFinancieraType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}codEnteRecaudador"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}comisionEnteRecaudador"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}descripcionEnteRecaudador"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnteRecaudadorType", namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", propOrder = {
    "codEnteRecaudador",
    "comisionEnteRecaudador",
    "descripcionEnteRecaudador"
})
@XmlSeeAlso({
    GireType.class
})
public class EnteRecaudadorType
    extends EntidadFinancieraType
{

    @XmlElement(required = true)
    protected String codEnteRecaudador;
    @XmlElement(required = true)
    protected String comisionEnteRecaudador;
    @XmlElement(required = true)
    protected String descripcionEnteRecaudador;

    /**
     * Obtiene el valor de la propiedad codEnteRecaudador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEnteRecaudador() {
        return codEnteRecaudador;
    }

    /**
     * Define el valor de la propiedad codEnteRecaudador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEnteRecaudador(String value) {
        this.codEnteRecaudador = value;
    }

    /**
     * Obtiene el valor de la propiedad comisionEnteRecaudador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComisionEnteRecaudador() {
        return comisionEnteRecaudador;
    }

    /**
     * Define el valor de la propiedad comisionEnteRecaudador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComisionEnteRecaudador(String value) {
        this.comisionEnteRecaudador = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEnteRecaudador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEnteRecaudador() {
        return descripcionEnteRecaudador;
    }

    /**
     * Define el valor de la propiedad descripcionEnteRecaudador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEnteRecaudador(String value) {
        this.descripcionEnteRecaudador = value;
    }

}
