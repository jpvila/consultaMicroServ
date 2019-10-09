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
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}bancoConcentrador"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}pagoFacil"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}GIRE"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bancoConcentrador",
    "pagoFacil",
    "gire"
})
public class EnteConcentrador {

    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0")
    protected BancoType bancoConcentrador;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0")
    protected PagoFacilType pagoFacil;
    @XmlElement(name = "GIRE", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0")
    protected GireType gire;

    /**
     * Obtiene el valor de la propiedad bancoConcentrador.
     * 
     * @return
     *     possible object is
     *     {@link BancoType }
     *     
     */
    public BancoType getBancoConcentrador() {
        return bancoConcentrador;
    }

    /**
     * Define el valor de la propiedad bancoConcentrador.
     * 
     * @param value
     *     allowed object is
     *     {@link BancoType }
     *     
     */
    public void setBancoConcentrador(BancoType value) {
        this.bancoConcentrador = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoFacil.
     * 
     * @return
     *     possible object is
     *     {@link PagoFacilType }
     *     
     */
    public PagoFacilType getPagoFacil() {
        return pagoFacil;
    }

    /**
     * Define el valor de la propiedad pagoFacil.
     * 
     * @param value
     *     allowed object is
     *     {@link PagoFacilType }
     *     
     */
    public void setPagoFacil(PagoFacilType value) {
        this.pagoFacil = value;
    }

    /**
     * Obtiene el valor de la propiedad gire.
     * 
     * @return
     *     possible object is
     *     {@link GireType }
     *     
     */
    public GireType getGIRE() {
        return gire;
    }

    /**
     * Define el valor de la propiedad gire.
     * 
     * @param value
     *     allowed object is
     *     {@link GireType }
     *     
     */
    public void setGIRE(GireType value) {
        this.gire = value;
    }

}
