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
 * <p>Clase Java para OficinaComercialType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OficinaComercialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0}CanalVentasType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0}codOficinaComercial"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0}descripcionOficinaComercial"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OficinaComercialType", namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", propOrder = {
    "codOficinaComercial",
    "descripcionOficinaComercial"
})
public class OficinaComercialType
    extends CanalVentasType
{

    @XmlElement(required = true)
    protected String codOficinaComercial;
    @XmlElement(required = true, nillable = true)
    protected String descripcionOficinaComercial;

    /**
     * Obtiene el valor de la propiedad codOficinaComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOficinaComercial() {
        return codOficinaComercial;
    }

    /**
     * Define el valor de la propiedad codOficinaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOficinaComercial(String value) {
        this.codOficinaComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionOficinaComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionOficinaComercial() {
        return descripcionOficinaComercial;
    }

    /**
     * Define el valor de la propiedad descripcionOficinaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionOficinaComercial(String value) {
        this.descripcionOficinaComercial = value;
    }

}
