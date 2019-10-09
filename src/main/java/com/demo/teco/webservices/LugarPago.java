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
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}oficinaComercialDePago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}numeroBancoDePago"/&gt;
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
    "oficinaComercialDePago",
    "numeroBancoDePago"
})
public class LugarPago {

    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0")
    protected OficinaComercialType oficinaComercialDePago;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0")
    protected NumeroBancoDePago numeroBancoDePago;

    /**
     * Obtiene el valor de la propiedad oficinaComercialDePago.
     * 
     * @return
     *     possible object is
     *     {@link OficinaComercialType }
     *     
     */
    public OficinaComercialType getOficinaComercialDePago() {
        return oficinaComercialDePago;
    }

    /**
     * Define el valor de la propiedad oficinaComercialDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link OficinaComercialType }
     *     
     */
    public void setOficinaComercialDePago(OficinaComercialType value) {
        this.oficinaComercialDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroBancoDePago.
     * 
     * @return
     *     possible object is
     *     {@link NumeroBancoDePago }
     *     
     */
    public NumeroBancoDePago getNumeroBancoDePago() {
        return numeroBancoDePago;
    }

    /**
     * Define el valor de la propiedad numeroBancoDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link NumeroBancoDePago }
     *     
     */
    public void setNumeroBancoDePago(NumeroBancoDePago value) {
        this.numeroBancoDePago = value;
    }

}
