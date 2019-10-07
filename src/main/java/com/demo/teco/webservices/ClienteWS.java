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
 * <p>Clase Java para ClienteWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClienteWS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="categoriaCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acuerdos" type="{http://consultaCliente.entities.webservices.ct.telecom.com.ar}AcuerdoWS" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClienteWS", namespace = "http://consultaCliente.entities.webservices.ct.telecom.com.ar", propOrder = {
    "apellido",
    "categoriaCliente",
    "nombre",
    "acuerdos"
})
public class ClienteWS {

    @XmlElement(required = true, nillable = true)
    protected String apellido;
    @XmlElement(required = true, nillable = true)
    protected String categoriaCliente;
    @XmlElement(required = true, nillable = true)
    protected String nombre;
    @XmlElement(required = true, nillable = true)
    protected List<AcuerdoWS> acuerdos;

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaCliente() {
        return categoriaCliente;
    }

    /**
     * Define el valor de la propiedad categoriaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaCliente(String value) {
        this.categoriaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the acuerdos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acuerdos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcuerdos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcuerdoWS }
     * 
     * 
     */
    public List<AcuerdoWS> getAcuerdos() {
        if (acuerdos == null) {
            acuerdos = new ArrayList<AcuerdoWS>();
        }
        return this.acuerdos;
    }

}
