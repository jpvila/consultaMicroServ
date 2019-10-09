//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 07:23:35 PM GFT 
//


package com.demo.teco.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PerfilCuentaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PerfilCuentaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}marcaFacturable"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfilCuentaType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", propOrder = {
    "marcaFacturable"
})
@XmlSeeAlso({
    CuentaNoFacturableType.class,
    CuentaFacturableType.class
})
public class PerfilCuentaType {

    protected boolean marcaFacturable;

    /**
     * Obtiene el valor de la propiedad marcaFacturable.
     * 
     */
    public boolean isMarcaFacturable() {
        return marcaFacturable;
    }

    /**
     * Define el valor de la propiedad marcaFacturable.
     * 
     */
    public void setMarcaFacturable(boolean value) {
        this.marcaFacturable = value;
    }

}
