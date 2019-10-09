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
 * <p>Clase Java para CuentaFacturableType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CuentaFacturableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}PerfilCuentaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaUltimaFactura"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}marcaResponsableDePago"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuentaFacturableType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", propOrder = {
    "fechaUltimaFactura",
    "marcaResponsableDePago"
})
@XmlSeeAlso({
    CuentaResponsableType.class,
    CuentaNoResponsableType.class
})
public class CuentaFacturableType
    extends PerfilCuentaType
{

    @XmlElement(required = true)
    protected String fechaUltimaFactura;
    protected boolean marcaResponsableDePago;

    /**
     * Obtiene el valor de la propiedad fechaUltimaFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltimaFactura() {
        return fechaUltimaFactura;
    }

    /**
     * Define el valor de la propiedad fechaUltimaFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimaFactura(String value) {
        this.fechaUltimaFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaResponsableDePago.
     * 
     */
    public boolean isMarcaResponsableDePago() {
        return marcaResponsableDePago;
    }

    /**
     * Define el valor de la propiedad marcaResponsableDePago.
     * 
     */
    public void setMarcaResponsableDePago(boolean value) {
        this.marcaResponsableDePago = value;
    }

}
