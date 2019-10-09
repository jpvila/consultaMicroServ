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
 * <p>Clase Java para CuentaResponsableType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CuentaResponsableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}CuentaFacturableType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}balanceCuenta"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}cantidadCiclosStopDebit"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}diasGracia"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}marcaStopdebit"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaStopDebitDesde"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}fechaStopDebitHasta"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}codFormaPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}saldoVencidoCuenta"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0}saldoNoVencidoCuenta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuentaResponsableType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", propOrder = {
    "balanceCuenta",
    "cantidadCiclosStopDebit",
    "diasGracia",
    "marcaStopdebit",
    "fechaStopDebitDesde",
    "fechaStopDebitHasta",
    "codFormaPago",
    "saldoVencidoCuenta",
    "saldoNoVencidoCuenta"
})
public class CuentaResponsableType
    extends CuentaFacturableType
{

    @XmlElement(required = true)
    protected String balanceCuenta;
    @XmlElement(required = true)
    protected String cantidadCiclosStopDebit;
    @XmlElement(required = true)
    protected String diasGracia;
    protected boolean marcaStopdebit;
    @XmlElement(required = true)
    protected String fechaStopDebitDesde;
    @XmlElement(required = true)
    protected String fechaStopDebitHasta;
    @XmlElement(required = true)
    protected String codFormaPago;
    @XmlElement(required = true)
    protected String saldoVencidoCuenta;
    @XmlElement(required = true)
    protected String saldoNoVencidoCuenta;

    /**
     * Obtiene el valor de la propiedad balanceCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceCuenta() {
        return balanceCuenta;
    }

    /**
     * Define el valor de la propiedad balanceCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceCuenta(String value) {
        this.balanceCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadCiclosStopDebit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadCiclosStopDebit() {
        return cantidadCiclosStopDebit;
    }

    /**
     * Define el valor de la propiedad cantidadCiclosStopDebit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadCiclosStopDebit(String value) {
        this.cantidadCiclosStopDebit = value;
    }

    /**
     * Obtiene el valor de la propiedad diasGracia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiasGracia() {
        return diasGracia;
    }

    /**
     * Define el valor de la propiedad diasGracia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiasGracia(String value) {
        this.diasGracia = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaStopdebit.
     * 
     */
    public boolean isMarcaStopdebit() {
        return marcaStopdebit;
    }

    /**
     * Define el valor de la propiedad marcaStopdebit.
     * 
     */
    public void setMarcaStopdebit(boolean value) {
        this.marcaStopdebit = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaStopDebitDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaStopDebitDesde() {
        return fechaStopDebitDesde;
    }

    /**
     * Define el valor de la propiedad fechaStopDebitDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaStopDebitDesde(String value) {
        this.fechaStopDebitDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaStopDebitHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaStopDebitHasta() {
        return fechaStopDebitHasta;
    }

    /**
     * Define el valor de la propiedad fechaStopDebitHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaStopDebitHasta(String value) {
        this.fechaStopDebitHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad codFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFormaPago() {
        return codFormaPago;
    }

    /**
     * Define el valor de la propiedad codFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFormaPago(String value) {
        this.codFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoVencidoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoVencidoCuenta() {
        return saldoVencidoCuenta;
    }

    /**
     * Define el valor de la propiedad saldoVencidoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoVencidoCuenta(String value) {
        this.saldoVencidoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoNoVencidoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoNoVencidoCuenta() {
        return saldoNoVencidoCuenta;
    }

    /**
     * Define el valor de la propiedad saldoNoVencidoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoNoVencidoCuenta(String value) {
        this.saldoNoVencidoCuenta = value;
    }

}
