//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 03:50:23 PM GFT 
//


package com.demo.teco.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultaFacturasDEIMONResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaFacturasDEIMONResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idSession" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="facturaDeimon" type="{http://consultaFacturasDeimon.entities.webservices.ct.telecom.com.ar}FacturaDeimonWS" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaFacturasDEIMONResult", namespace = "http://consultaFacturasDeimon.entities.webservices.ct.telecom.com.ar", propOrder = {
    "codigoRespuesta",
    "idSession",
    "mensaje",
    "facturaDeimon"
})
public class ConsultaFacturasDEIMONResult {

    @XmlElement(required = true, nillable = true)
    protected String codigoRespuesta;
    @XmlElement(required = true, nillable = true)
    protected String idSession;
    @XmlElement(required = true, nillable = true)
    protected String mensaje;
    @XmlElement(required = true, nillable = true)
    protected List<FacturaDeimonWS> facturaDeimon;

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad idSession.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSession() {
        return idSession;
    }

    /**
     * Define el valor de la propiedad idSession.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSession(String value) {
        this.idSession = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the facturaDeimon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facturaDeimon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturaDeimon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaDeimonWS }
     * 
     * 
     */
    public List<FacturaDeimonWS> getFacturaDeimon() {
        if (facturaDeimon == null) {
            facturaDeimon = new ArrayList<FacturaDeimonWS>();
        }
        return this.facturaDeimon;
    }

}
