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
 * <p>Clase Java para EntidadTarjetaCreditoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntidadTarjetaCreditoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}EntidadFinancieraType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}codEntidadTC"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0}nombreEntidadTC"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadTarjetaCreditoType", namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", propOrder = {
    "codEntidadTC",
    "nombreEntidadTC"
})
public class EntidadTarjetaCreditoType
    extends EntidadFinancieraType
{

    @XmlElement(required = true)
    protected String codEntidadTC;
    @XmlElement(required = true)
    protected String nombreEntidadTC;

    /**
     * Obtiene el valor de la propiedad codEntidadTC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEntidadTC() {
        return codEntidadTC;
    }

    /**
     * Define el valor de la propiedad codEntidadTC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEntidadTC(String value) {
        this.codEntidadTC = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEntidadTC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidadTC() {
        return nombreEntidadTC;
    }

    /**
     * Define el valor de la propiedad nombreEntidadTC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidadTC(String value) {
        this.nombreEntidadTC = value;
    }

}
