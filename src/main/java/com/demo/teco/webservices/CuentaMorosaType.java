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
 * <p>Clase Java para CuentaMorosaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CuentaMorosaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}CuentaEstadoMorosidadType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaMorosidad"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}montoDeudaInicial"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}montoInteresDeudaInicial"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}montoTotalDeudaInicial"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaDesinterrupcionProcMora"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaFinInterrupcionProcMora"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaInicioInterrupcionProcMora"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}motivoDesinterrupcionProcMora"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}motivoInterrupcionProcMora"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaFinMorosidad"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}estadoMorosidad"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}motivoCierreProcMora"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuentaMorosaType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", propOrder = {
    "fechaMorosidad",
    "montoDeudaInicial",
    "montoInteresDeudaInicial",
    "montoTotalDeudaInicial",
    "fechaDesinterrupcionProcMora",
    "fechaFinInterrupcionProcMora",
    "fechaInicioInterrupcionProcMora",
    "motivoDesinterrupcionProcMora",
    "motivoInterrupcionProcMora",
    "fechaFinMorosidad",
    "estadoMorosidad",
    "motivoCierreProcMora"
})
public class CuentaMorosaType
    extends CuentaEstadoMorosidadType
{

    @XmlElement(required = true)
    protected String fechaMorosidad;
    @XmlElement(required = true)
    protected String montoDeudaInicial;
    @XmlElement(required = true)
    protected String montoInteresDeudaInicial;
    @XmlElement(required = true)
    protected String montoTotalDeudaInicial;
    @XmlElement(required = true)
    protected String fechaDesinterrupcionProcMora;
    @XmlElement(required = true)
    protected String fechaFinInterrupcionProcMora;
    @XmlElement(required = true)
    protected String fechaInicioInterrupcionProcMora;
    @XmlElement(required = true)
    protected String motivoDesinterrupcionProcMora;
    @XmlElement(required = true)
    protected String motivoInterrupcionProcMora;
    @XmlElement(required = true)
    protected String fechaFinMorosidad;
    @XmlElement(required = true)
    protected String estadoMorosidad;
    @XmlElement(required = true)
    protected String motivoCierreProcMora;

    /**
     * Obtiene el valor de la propiedad fechaMorosidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaMorosidad() {
        return fechaMorosidad;
    }

    /**
     * Define el valor de la propiedad fechaMorosidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaMorosidad(String value) {
        this.fechaMorosidad = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDeudaInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoDeudaInicial() {
        return montoDeudaInicial;
    }

    /**
     * Define el valor de la propiedad montoDeudaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoDeudaInicial(String value) {
        this.montoDeudaInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad montoInteresDeudaInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoInteresDeudaInicial() {
        return montoInteresDeudaInicial;
    }

    /**
     * Define el valor de la propiedad montoInteresDeudaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoInteresDeudaInicial(String value) {
        this.montoInteresDeudaInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalDeudaInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotalDeudaInicial() {
        return montoTotalDeudaInicial;
    }

    /**
     * Define el valor de la propiedad montoTotalDeudaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotalDeudaInicial(String value) {
        this.montoTotalDeudaInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesinterrupcionProcMora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesinterrupcionProcMora() {
        return fechaDesinterrupcionProcMora;
    }

    /**
     * Define el valor de la propiedad fechaDesinterrupcionProcMora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesinterrupcionProcMora(String value) {
        this.fechaDesinterrupcionProcMora = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinInterrupcionProcMora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinInterrupcionProcMora() {
        return fechaFinInterrupcionProcMora;
    }

    /**
     * Define el valor de la propiedad fechaFinInterrupcionProcMora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinInterrupcionProcMora(String value) {
        this.fechaFinInterrupcionProcMora = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioInterrupcionProcMora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioInterrupcionProcMora() {
        return fechaInicioInterrupcionProcMora;
    }

    /**
     * Define el valor de la propiedad fechaInicioInterrupcionProcMora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioInterrupcionProcMora(String value) {
        this.fechaInicioInterrupcionProcMora = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDesinterrupcionProcMora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDesinterrupcionProcMora() {
        return motivoDesinterrupcionProcMora;
    }

    /**
     * Define el valor de la propiedad motivoDesinterrupcionProcMora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDesinterrupcionProcMora(String value) {
        this.motivoDesinterrupcionProcMora = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoInterrupcionProcMora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoInterrupcionProcMora() {
        return motivoInterrupcionProcMora;
    }

    /**
     * Define el valor de la propiedad motivoInterrupcionProcMora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoInterrupcionProcMora(String value) {
        this.motivoInterrupcionProcMora = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinMorosidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinMorosidad() {
        return fechaFinMorosidad;
    }

    /**
     * Define el valor de la propiedad fechaFinMorosidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinMorosidad(String value) {
        this.fechaFinMorosidad = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoMorosidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoMorosidad() {
        return estadoMorosidad;
    }

    /**
     * Define el valor de la propiedad estadoMorosidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoMorosidad(String value) {
        this.estadoMorosidad = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoCierreProcMora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoCierreProcMora() {
        return motivoCierreProcMora;
    }

    /**
     * Define el valor de la propiedad motivoCierreProcMora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoCierreProcMora(String value) {
        this.motivoCierreProcMora = value;
    }

}
