//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 07:23:35 PM GFT 
//


package com.demo.teco.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para estadoPagoType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="estadoPagoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANU"/&gt;
 *     &lt;enumeration value="MOD"/&gt;
 *     &lt;enumeration value="TRN"/&gt;
 *     &lt;enumeration value="IMP"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="ERR"/&gt;
 *     &lt;length value="3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "estadoPagoType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0")
@XmlEnum
public enum EstadoPagoType {


    /**
     * Anulado
     * 
     */
    ANU,

    /**
     * Modificado
     * 
     */
    MOD,

    /**
     * Transferido
     * 
     */
    TRN,

    /**
     * Imputado
     * 
     */
    IMP,

    /**
     * Pendiente de imputación
     * 
     */
    PEN,

    /**
     * Pago fallido. Payment failed
     * 
     */
    ERR;

    public String value() {
        return name();
    }

    public static EstadoPagoType fromValue(String v) {
        return valueOf(v);
    }

}
