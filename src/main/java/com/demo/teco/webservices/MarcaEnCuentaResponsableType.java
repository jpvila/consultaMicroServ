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
 * <p>Clase Java para MarcaEnCuentaResponsableType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MarcaEnCuentaResponsableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}codMarcaEnCtaResp"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}descripcionMarcaEnCtaResp"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaHastaMarcaEnCtaResp"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaDesdeMarcaEnCtaResp"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}marcaEnCtaResp"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}motivoMarcaEnCtaResp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarcaEnCuentaResponsableType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", propOrder = {
    "codMarcaEnCtaResp",
    "descripcionMarcaEnCtaResp",
    "fechaHastaMarcaEnCtaResp",
    "fechaDesdeMarcaEnCtaResp",
    "marcaEnCtaResp",
    "motivoMarcaEnCtaResp"
})
public class MarcaEnCuentaResponsableType {

    @XmlElement(required = true)
    protected String codMarcaEnCtaResp;
    @XmlElement(required = true)
    protected String descripcionMarcaEnCtaResp;
    @XmlElement(required = true)
    protected String fechaHastaMarcaEnCtaResp;
    @XmlElement(required = true)
    protected String fechaDesdeMarcaEnCtaResp;
    protected boolean marcaEnCtaResp;
    @XmlElement(required = true)
    protected String motivoMarcaEnCtaResp;

    /**
     * Obtiene el valor de la propiedad codMarcaEnCtaResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMarcaEnCtaResp() {
        return codMarcaEnCtaResp;
    }

    /**
     * Define el valor de la propiedad codMarcaEnCtaResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMarcaEnCtaResp(String value) {
        this.codMarcaEnCtaResp = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMarcaEnCtaResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMarcaEnCtaResp() {
        return descripcionMarcaEnCtaResp;
    }

    /**
     * Define el valor de la propiedad descripcionMarcaEnCtaResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMarcaEnCtaResp(String value) {
        this.descripcionMarcaEnCtaResp = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHastaMarcaEnCtaResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHastaMarcaEnCtaResp() {
        return fechaHastaMarcaEnCtaResp;
    }

    /**
     * Define el valor de la propiedad fechaHastaMarcaEnCtaResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHastaMarcaEnCtaResp(String value) {
        this.fechaHastaMarcaEnCtaResp = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesdeMarcaEnCtaResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesdeMarcaEnCtaResp() {
        return fechaDesdeMarcaEnCtaResp;
    }

    /**
     * Define el valor de la propiedad fechaDesdeMarcaEnCtaResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesdeMarcaEnCtaResp(String value) {
        this.fechaDesdeMarcaEnCtaResp = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaEnCtaResp.
     * 
     */
    public boolean isMarcaEnCtaResp() {
        return marcaEnCtaResp;
    }

    /**
     * Define el valor de la propiedad marcaEnCtaResp.
     * 
     */
    public void setMarcaEnCtaResp(boolean value) {
        this.marcaEnCtaResp = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoMarcaEnCtaResp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoMarcaEnCtaResp() {
        return motivoMarcaEnCtaResp;
    }

    /**
     * Define el valor de la propiedad motivoMarcaEnCtaResp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoMarcaEnCtaResp(String value) {
        this.motivoMarcaEnCtaResp = value;
    }

}
