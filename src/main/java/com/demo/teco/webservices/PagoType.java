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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PagoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PagoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}cuentaAsociadaPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}codAjustePago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}codPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}codProcesamientoPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}comentarioPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}estadoPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaAplicacionPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaCambioEstadoPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaLecturaPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaPresentacion"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaRegistroPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaValidacionPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}fechaVencimientoPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}importeComisionPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}importePago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}lugarPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}marcaCargoEnFactura"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}montoValidadoPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}motivoCambioEstadoPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}motivoPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}nombreArchivoPagoRecibido"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}nroSecuencialPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}tipoLectura"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}tipoTalon"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}tipoTransaccionPago"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}enteConcentrador"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}moneda"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Ventas/CanalDeCobranza/v1.0}codCanalCobranza"/&gt;
 *         &lt;element ref="{http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0}descripcionEstadoPago"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagoType", namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", propOrder = {
    "cuentaAsociadaPago",
    "codAjustePago",
    "codPago",
    "codProcesamientoPago",
    "comentarioPago",
    "estadoPago",
    "fechaAplicacionPago",
    "fechaCambioEstadoPago",
    "fechaLecturaPago",
    "fechaPago",
    "fechaPresentacion",
    "fechaRegistroPago",
    "fechaValidacionPago",
    "fechaVencimientoPago",
    "importeComisionPago",
    "importePago",
    "lugarPago",
    "marcaCargoEnFactura",
    "montoValidadoPago",
    "motivoCambioEstadoPago",
    "motivoPago",
    "nombreArchivoPagoRecibido",
    "nroSecuencialPago",
    "tipoLectura",
    "tipoTalon",
    "tipoTransaccionPago",
    "enteConcentrador",
    "moneda",
    "codCanalCobranza",
    "descripcionEstadoPago"
})
@XmlSeeAlso({
    PagoErroneoType.class
})
public class PagoType {

    @XmlElement(required = true)
    protected CuentaResponsableType cuentaAsociadaPago;
    @XmlElement(required = true)
    protected String codAjustePago;
    @XmlElement(required = true)
    protected String codPago;
    @XmlElement(required = true)
    protected String codProcesamientoPago;
    @XmlElement(required = true)
    protected String comentarioPago;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EstadoPagoType estadoPago;
    @XmlElement(required = true)
    protected String fechaAplicacionPago;
    @XmlElement(required = true)
    protected String fechaCambioEstadoPago;
    @XmlElement(required = true)
    protected String fechaLecturaPago;
    @XmlElement(required = true)
    protected String fechaPago;
    @XmlElement(required = true)
    protected String fechaPresentacion;
    @XmlElement(required = true)
    protected String fechaRegistroPago;
    @XmlElement(required = true)
    protected String fechaValidacionPago;
    @XmlElement(required = true)
    protected String fechaVencimientoPago;
    @XmlElement(required = true)
    protected String importeComisionPago;
    @XmlElement(required = true)
    protected String importePago;
    @XmlElement(required = true, nillable = true)
    protected LugarPago lugarPago;
    protected boolean marcaCargoEnFactura;
    @XmlElement(required = true)
    protected String montoValidadoPago;
    @XmlElement(required = true)
    protected String motivoCambioEstadoPago;
    @XmlElement(required = true)
    protected String motivoPago;
    @XmlElement(required = true)
    protected String nombreArchivoPagoRecibido;
    @XmlElement(required = true)
    protected String nroSecuencialPago;
    @XmlElement(required = true)
    protected String tipoLectura;
    @XmlElement(required = true)
    protected String tipoTalon;
    @XmlElement(required = true)
    protected String tipoTransaccionPago;
    @XmlElement(required = true, nillable = true)
    protected EnteConcentrador enteConcentrador;
    @XmlElement(required = true)
    protected MonedaType moneda;
    @XmlElement(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeCobranza/v1.0", required = true)
    protected String codCanalCobranza;
    @XmlElement(required = true)
    protected String descripcionEstadoPago;

    /**
     * Obtiene el valor de la propiedad cuentaAsociadaPago.
     * 
     * @return
     *     possible object is
     *     {@link CuentaResponsableType }
     *     
     */
    public CuentaResponsableType getCuentaAsociadaPago() {
        return cuentaAsociadaPago;
    }

    /**
     * Define el valor de la propiedad cuentaAsociadaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaResponsableType }
     *     
     */
    public void setCuentaAsociadaPago(CuentaResponsableType value) {
        this.cuentaAsociadaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codAjustePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAjustePago() {
        return codAjustePago;
    }

    /**
     * Define el valor de la propiedad codAjustePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAjustePago(String value) {
        this.codAjustePago = value;
    }

    /**
     * Obtiene el valor de la propiedad codPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPago() {
        return codPago;
    }

    /**
     * Define el valor de la propiedad codPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPago(String value) {
        this.codPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codProcesamientoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProcesamientoPago() {
        return codProcesamientoPago;
    }

    /**
     * Define el valor de la propiedad codProcesamientoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProcesamientoPago(String value) {
        this.codProcesamientoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad comentarioPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioPago() {
        return comentarioPago;
    }

    /**
     * Define el valor de la propiedad comentarioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioPago(String value) {
        this.comentarioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoPago.
     * 
     * @return
     *     possible object is
     *     {@link EstadoPagoType }
     *     
     */
    public EstadoPagoType getEstadoPago() {
        return estadoPago;
    }

    /**
     * Define el valor de la propiedad estadoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoPagoType }
     *     
     */
    public void setEstadoPago(EstadoPagoType value) {
        this.estadoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAplicacionPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAplicacionPago() {
        return fechaAplicacionPago;
    }

    /**
     * Define el valor de la propiedad fechaAplicacionPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAplicacionPago(String value) {
        this.fechaAplicacionPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCambioEstadoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCambioEstadoPago() {
        return fechaCambioEstadoPago;
    }

    /**
     * Define el valor de la propiedad fechaCambioEstadoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCambioEstadoPago(String value) {
        this.fechaCambioEstadoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaLecturaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaLecturaPago() {
        return fechaLecturaPago;
    }

    /**
     * Define el valor de la propiedad fechaLecturaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaLecturaPago(String value) {
        this.fechaLecturaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPresentacion() {
        return fechaPresentacion;
    }

    /**
     * Define el valor de la propiedad fechaPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPresentacion(String value) {
        this.fechaPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistroPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistroPago() {
        return fechaRegistroPago;
    }

    /**
     * Define el valor de la propiedad fechaRegistroPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistroPago(String value) {
        this.fechaRegistroPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaValidacionPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaValidacionPago() {
        return fechaValidacionPago;
    }

    /**
     * Define el valor de la propiedad fechaValidacionPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaValidacionPago(String value) {
        this.fechaValidacionPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimientoPago() {
        return fechaVencimientoPago;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimientoPago(String value) {
        this.fechaVencimientoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad importeComisionPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteComisionPago() {
        return importeComisionPago;
    }

    /**
     * Define el valor de la propiedad importeComisionPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteComisionPago(String value) {
        this.importeComisionPago = value;
    }

    /**
     * Obtiene el valor de la propiedad importePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportePago() {
        return importePago;
    }

    /**
     * Define el valor de la propiedad importePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportePago(String value) {
        this.importePago = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarPago.
     * 
     * @return
     *     possible object is
     *     {@link LugarPago }
     *     
     */
    public LugarPago getLugarPago() {
        return lugarPago;
    }

    /**
     * Define el valor de la propiedad lugarPago.
     * 
     * @param value
     *     allowed object is
     *     {@link LugarPago }
     *     
     */
    public void setLugarPago(LugarPago value) {
        this.lugarPago = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaCargoEnFactura.
     * 
     */
    public boolean isMarcaCargoEnFactura() {
        return marcaCargoEnFactura;
    }

    /**
     * Define el valor de la propiedad marcaCargoEnFactura.
     * 
     */
    public void setMarcaCargoEnFactura(boolean value) {
        this.marcaCargoEnFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad montoValidadoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoValidadoPago() {
        return montoValidadoPago;
    }

    /**
     * Define el valor de la propiedad montoValidadoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoValidadoPago(String value) {
        this.montoValidadoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoCambioEstadoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoCambioEstadoPago() {
        return motivoCambioEstadoPago;
    }

    /**
     * Define el valor de la propiedad motivoCambioEstadoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoCambioEstadoPago(String value) {
        this.motivoCambioEstadoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoPago() {
        return motivoPago;
    }

    /**
     * Define el valor de la propiedad motivoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoPago(String value) {
        this.motivoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivoPagoRecibido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivoPagoRecibido() {
        return nombreArchivoPagoRecibido;
    }

    /**
     * Define el valor de la propiedad nombreArchivoPagoRecibido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivoPagoRecibido(String value) {
        this.nombreArchivoPagoRecibido = value;
    }

    /**
     * Obtiene el valor de la propiedad nroSecuencialPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSecuencialPago() {
        return nroSecuencialPago;
    }

    /**
     * Define el valor de la propiedad nroSecuencialPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSecuencialPago(String value) {
        this.nroSecuencialPago = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoLectura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLectura() {
        return tipoLectura;
    }

    /**
     * Define el valor de la propiedad tipoLectura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLectura(String value) {
        this.tipoLectura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTalon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTalon() {
        return tipoTalon;
    }

    /**
     * Define el valor de la propiedad tipoTalon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTalon(String value) {
        this.tipoTalon = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccionPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTransaccionPago() {
        return tipoTransaccionPago;
    }

    /**
     * Define el valor de la propiedad tipoTransaccionPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTransaccionPago(String value) {
        this.tipoTransaccionPago = value;
    }

    /**
     * Ente recaudador que debe ser informado en el caso de que el tipo de transacción del pago sea BATCH
     * 
     * @return
     *     possible object is
     *     {@link EnteConcentrador }
     *     
     */
    public EnteConcentrador getEnteConcentrador() {
        return enteConcentrador;
    }

    /**
     * Define el valor de la propiedad enteConcentrador.
     * 
     * @param value
     *     allowed object is
     *     {@link EnteConcentrador }
     *     
     */
    public void setEnteConcentrador(EnteConcentrador value) {
        this.enteConcentrador = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link MonedaType }
     *     
     */
    public MonedaType getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link MonedaType }
     *     
     */
    public void setMoneda(MonedaType value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad codCanalCobranza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCanalCobranza() {
        return codCanalCobranza;
    }

    /**
     * Define el valor de la propiedad codCanalCobranza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCanalCobranza(String value) {
        this.codCanalCobranza = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstadoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoPago() {
        return descripcionEstadoPago;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoPago(String value) {
        this.descripcionEstadoPago = value;
    }

}
