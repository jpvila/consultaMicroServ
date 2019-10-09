//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.07 a las 07:23:35 PM GFT 
//


package com.demo.teco.webservices;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.teco.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CodOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "codOrden");
    private final static QName _NroCuponTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "nroCuponTarjeta");
    private final static QName _FechaPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaPago");
    private final static QName _ImportePago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "importePago");
    private final static QName _CantidadCuotasTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "cantidadCuotasTarjeta");
    private final static QName _CodTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "codTarjeta");
    private final static QName _CodBanco_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codBanco");
    private final static QName _CodMoneda_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Moneda/v1.0", "codMoneda");
    private final static QName _IdSecuencial_QNAME = new QName("http://www.personal.com.ar/Common", "idSecuencial");
    private final static QName _SistemaGestor_QNAME = new QName("http://www.personal.com.ar/Common", "sistemaGestor");
    private final static QName _RequestHeader_QNAME = new QName("http://www.personal.com.ar/Common/RequestMessageHeader/v1.0", "requestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("http://www.personal.com.ar/Common/ResponseMessageHeader/v1.0", "responseHeader");
    private final static QName _NroOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "nroOrden");
    private final static QName _FechaAltaOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "fechaAltaOrden");
    private final static QName _FechaModificacionOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "fechaModificacionOrden");
    private final static QName _EstadoOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "estadoOrden");
    private final static QName _CodEstadoOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "codEstadoOrden");
    private final static QName _DescripcionEstadoOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "descripcionEstadoOrden");
    private final static QName _CodTipoOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "codTipoOrden");
    private final static QName _TipoOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "tipoOrden");
    private final static QName _DescripcionTipoOrden_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "descripcionTipoOrden");
    private final static QName _CodItem_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "codItem");
    private final static QName _EjecucionCambio_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "ejecucionCambio");
    private final static QName _FechaEjecucionCambio_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", "fechaEjecucionCambio");
    private final static QName _CodEntidadFinanciera_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codEntidadFinanciera");
    private final static QName _TipoEntidadFinanciera_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "tipoEntidadFinanciera");
    private final static QName _CodEntidadTC_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codEntidadTC");
    private final static QName _NombreEntidadTC_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "nombreEntidadTC");
    private final static QName _CodEnteRecaudador_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codEnteRecaudador");
    private final static QName _ComisionEnteRecaudador_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "comisionEnteRecaudador");
    private final static QName _DescripcionEnteRecaudador_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "descripcionEnteRecaudador");
    private final static QName _NombreBanco_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "nombreBanco");
    private final static QName _CodPagoFacil_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codPagoFacil");
    private final static QName _CodGIRE_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codGIRE");
    private final static QName _CodSucursalBanco_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codSucursalBanco");
    private final static QName _DescripcionSucursalBanco_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "descripcionSucursalBanco");
    private final static QName _CBU_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "CBU");
    private final static QName _FechaAltaCtaBancaria_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "fechaAltaCtaBancaria");
    private final static QName _NroCuentaBancaria_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "nroCuentaBancaria");
    private final static QName _CodEnteConcentrador_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codEnteConcentrador");
    private final static QName _NombreEntidadFinanciera_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "nombreEntidadFinanciera");
    private final static QName _CodSucursalEntidad_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "codSucursalEntidad");
    private final static QName _TipoCtaBancaria_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", "tipoCtaBancaria");
    private final static QName _CodPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "codPago");
    private final static QName _CodAjustePago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "codAjustePago");
    private final static QName _CodProcesamientoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "codProcesamientoPago");
    private final static QName _ComentarioPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "comentarioPago");
    private final static QName _FechaAnulacion_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaAnulacion");
    private final static QName _FechaAplicacionPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaAplicacionPago");
    private final static QName _FechaCambioEstadoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaCambioEstadoPago");
    private final static QName _FechaLecturaPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaLecturaPago");
    private final static QName _FechaPresentacion_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaPresentacion");
    private final static QName _FechaRegistroPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaRegistroPago");
    private final static QName _FechaValidacionPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaValidacionPago");
    private final static QName _FechaVencimientoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaVencimientoPago");
    private final static QName _ImporteComisionPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "importeComisionPago");
    private final static QName _MarcaCargoEnFactura_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "marcaCargoEnFactura");
    private final static QName _MontoValidadoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "montoValidadoPago");
    private final static QName _DescripcionMotivoCambioEstadoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "descripcionMotivoCambioEstadoPago");
    private final static QName _MotivoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "motivoPago");
    private final static QName _NombreArchivoPagoRecibido_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "nombreArchivoPagoRecibido");
    private final static QName _NroSecuencialPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "nroSecuencialPago");
    private final static QName _TipoLectura_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "tipoLectura");
    private final static QName _TipoTalon_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "tipoTalon");
    private final static QName _TipoTransaccionPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "tipoTransaccionPago");
    private final static QName _OficinaComercialDePago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "oficinaComercialDePago");
    private final static QName _LugarPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "lugarPago");
    private final static QName _BancoConcentrador_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "bancoConcentrador");
    private final static QName _PagoFacil_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "pagoFacil");
    private final static QName _GIRE_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "GIRE");
    private final static QName _EnteConcentrador_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "enteConcentrador");
    private final static QName _MotivoCambioEstadoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "motivoCambioEstadoPago");
    private final static QName _CuentaAsociadaPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "cuentaAsociadaPago");
    private final static QName _EstadoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "estadoPago");
    private final static QName _Moneda_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "moneda");
    private final static QName _CodErrorPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "codErrorPago");
    private final static QName _DescripcionErrorPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "descripcionErrorPago");
    private final static QName _DescripcionEstadoPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "descripcionEstadoPago");
    private final static QName _NroLineaPagoIVR_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "nroLineaPagoIVR");
    private final static QName _CodReintegro_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "codReintegro");
    private final static QName _FechaValorReintegro_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaValorReintegro");
    private final static QName _MontoReintegro_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "montoReintegro");
    private final static QName _CodAjusteFinanciero_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "codAjusteFinanciero");
    private final static QName _ImporteAjusteFinanciero_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "importeAjusteFinanciero");
    private final static QName _EstadoAjusteFinanciero_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "estadoAjusteFinanciero");
    private final static QName _NroReferenciaPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "nroReferenciaPago");
    private final static QName _TipoDeposito_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "tipoDeposito");
    private final static QName _MarcaPagoRevertido_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "marcaPagoRevertido");
    private final static QName _FechaPagoRevertido_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", "fechaPagoRevertido");
    private final static QName _DescripcionMoneda_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Moneda/v1.0", "descripcionMoneda");
    private final static QName _TasaDeCambio_QNAME = new QName("http://www.personal.com.ar/Common/Entities/NegocioComun/Moneda/v1.0", "tasaDeCambio");
    private final static QName _CodOficinaComercial_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "codOficinaComercial");
    private final static QName _DescripcionOficinaComercial_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "descripcionOficinaComercial");
    private final static QName _EstadoCaja_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "estadoCaja");
    private final static QName _CodCanalDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "codCanalDeVenta");
    private final static QName _CodCC_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "codCC");
    private final static QName _DescripcionCC_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "descripcionCC");
    private final static QName _CodPuntoDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "codPuntoDeVenta");
    private final static QName _DescripcionPuntoDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "descripcionPuntoDeVenta");
    private final static QName _FechaAltaPuntoDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "fechaAltaPuntoDeVenta");
    private final static QName _FechaBajaPuntoDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "fechaBajaPuntoDeVenta");
    private final static QName _FechaSuspensionPuntoDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "fechaSuspensionPuntoDeVenta");
    private final static QName _CodTipoCanalDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "codTipoCanalDeVenta");
    private final static QName _CodTipoPuntoDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "codTipoPuntoDeVenta");
    private final static QName _DescripcionTipoPuntoDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "descripcionTipoPuntoDeVenta");
    private final static QName _FechaSuspensionTipoPuntoDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "fechaSuspensionTipoPuntoDeVenta");
    private final static QName _CodSubCanalDeVenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "codSubCanalDeVenta");
    private final static QName _DiasVencimientoRendicion_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", "diasVencimientoRendicion");
    private final static QName _CodCanalCobranza_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeCobranza/v1.0", "codCanalCobranza");
    private final static QName _DescripcionCanalCobranza_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeCobranza/v1.0", "descripcionCanalCobranza");
    private final static QName _CodPlataformaPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Ventas/CanalDeCobranza/v1.0", "codPlataformaPago");
    private final static QName _MarcaFacturable_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "marcaFacturable");
    private final static QName _FechaUltimaFactura_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaUltimaFactura");
    private final static QName _MarcaResponsableDePago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "marcaResponsableDePago");
    private final static QName _BalanceCuenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "balanceCuenta");
    private final static QName _CantidadCiclosStopDebit_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "cantidadCiclosStopDebit");
    private final static QName _DiasGracia_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "diasGracia");
    private final static QName _FechaStopDebitDesde_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaStopDebitDesde");
    private final static QName _FechaStopDebitHasta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaStopDebitHasta");
    private final static QName _CodFormaPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "codFormaPago");
    private final static QName _DescripcionFormaPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "descripcionFormaPago");
    private final static QName _SaldoVencidoCuenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "saldoVencidoCuenta");
    private final static QName _SaldoNoVencidoCuenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "saldoNoVencidoCuenta");
    private final static QName _MarcaStopdebit_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "marcaStopdebit");
    private final static QName _CodMarcaEnCtaResp_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "codMarcaEnCtaResp");
    private final static QName _FechaDesdeMarcaEnCtaResp_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaDesdeMarcaEnCtaResp");
    private final static QName _FechaHastaMarcaEnCtaResp_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaHastaMarcaEnCtaResp");
    private final static QName _MarcaEnCtaResp_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "marcaEnCtaResp");
    private final static QName _DescripcionMarcaEnCtaResp_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "descripcionMarcaEnCtaResp");
    private final static QName _MotivoMarcaEnCtaResp_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "motivoMarcaEnCtaResp");
    private final static QName _MarcaMorosidad_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "marcaMorosidad");
    private final static QName _FechaMorosidad_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaMorosidad");
    private final static QName _MontoDeudaInicial_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "montoDeudaInicial");
    private final static QName _MontoInteresDeudaInicial_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "montoInteresDeudaInicial");
    private final static QName _MontoTotalDeudaInicial_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "montoTotalDeudaInicial");
    private final static QName _FechaDesinterrupcionProcMora_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaDesinterrupcionProcMora");
    private final static QName _FechaFinInterrupcionProcMora_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaFinInterrupcionProcMora");
    private final static QName _FechaInicioInterrupcionProcMora_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaInicioInterrupcionProcMora");
    private final static QName _MotivoDesinterrupcionProcMora_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "motivoDesinterrupcionProcMora");
    private final static QName _MotivoInterrupcionProcMora_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "motivoInterrupcionProcMora");
    private final static QName _FechaFinMorosidad_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "fechaFinMorosidad");
    private final static QName _EstadoMorosidad_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "estadoMorosidad");
    private final static QName _MotivoCierreProcMora_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "motivoCierreProcMora");
    private final static QName _MarcaCargoTardio_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "marcaCargoTardio");
    private final static QName _MarcaControlLimite_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "marcaControlLimite");
    private final static QName _ClaseCuenta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", "claseCuenta");
    private final static QName _CodMedioPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "codMedioPago");
    private final static QName _DescripcionMedioPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "descripcionMedioPago");
    private final static QName _CodCheque_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "codCheque");
    private final static QName _EstadoCheque_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "estadoCheque");
    private final static QName _MotivoEstadoCheque_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "motivoEstadoCheque");
    private final static QName _FechaDiferida_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaDiferida");
    private final static QName _FechaEmisionCheque_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaEmisionCheque");
    private final static QName _FechaVencimientoCheque_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaVencimientoCheque");
    private final static QName _FechaVencimientoComp_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaVencimientoComp");
    private final static QName _NroCheque_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "nroCheque");
    private final static QName _CodAutorizacion_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "codAutorizacion");
    private final static QName _NroComercio_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "nroComercio");
    private final static QName _NroLoteTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "nroLoteTarjeta");
    private final static QName _NroTransaccionTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "nroTransaccionTarjeta");
    private final static QName _TipoCuponTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "tipoCuponTarjeta");
    private final static QName _NroTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "nroTarjeta");
    private final static QName _FechaVencimientoTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaVencimientoTarjeta");
    private final static QName _FechaEmisionTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaEmisionTarjeta");
    private final static QName _CodSeguridadTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "codSeguridadTarjeta");
    private final static QName _FechaAltaDebitoAutomatico_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaAltaDebitoAutomatico");
    private final static QName _FechaBajaDebitoAutomatico_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaBajaDebitoAutomatico");
    private final static QName _FechaModificacionDebitoAutomatico_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaModificacionDebitoAutomatico");
    private final static QName _FechaAltaDebitoDirecto_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaAltaDebitoDirecto");
    private final static QName _FechaBajaDebitoDirecto_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaBajaDebitoDirecto");
    private final static QName _FechaModificacionDebitoDirecto_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaModificacionDebitoDirecto");
    private final static QName _TrackTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "trackTarjeta");
    private final static QName _NroTarjetaEncriptado_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "nroTarjetaEncriptado");
    private final static QName _UltimosDigitosTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "ultimosDigitosTarjeta");
    private final static QName _FechaCuponTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "fechaCuponTarjeta");
    private final static QName _CodFormaDePago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "codFormaDePago");
    private final static QName _DiaImputacionPago_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "diaImputacionPago");
    private final static QName _MontoMaximoDebito_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "montoMaximoDebito");
    private final static QName _MarcaTarjetaActiva_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "marcaTarjetaActiva");
    private final static QName _NombreTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "nombreTarjeta");
    private final static QName _MesVtoTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "mesVtoTarjeta");
    private final static QName _AnioVtoTarjeta_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "anioVtoTarjeta");
    private final static QName _MarcaTarjetaPrincipal_QNAME = new QName("http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", "marcaTarjetaPrincipal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.teco.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseHeader }
     * 
     */
    public ResponseHeader createResponseHeader() {
        return new ResponseHeader();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link RequestHeader.Consumer }
     * 
     */
    public RequestHeader.Consumer createRequestHeaderConsumer() {
        return new RequestHeader.Consumer();
    }

    /**
     * Create an instance of {@link ConsultaFacturasMIC }
     * 
     */
    public ConsultaFacturasMIC createConsultaFacturasMIC() {
        return new ConsultaFacturasMIC();
    }

    /**
     * Create an instance of {@link ConsultaFacturasMICResponse }
     * 
     */
    public ConsultaFacturasMICResponse createConsultaFacturasMICResponse() {
        return new ConsultaFacturasMICResponse();
    }

    /**
     * Create an instance of {@link ConsultaFacturasMICResult }
     * 
     */
    public ConsultaFacturasMICResult createConsultaFacturasMICResult() {
        return new ConsultaFacturasMICResult();
    }

    /**
     * Create an instance of {@link ConsultaFacturasDEIMON }
     * 
     */
    public ConsultaFacturasDEIMON createConsultaFacturasDEIMON() {
        return new ConsultaFacturasDEIMON();
    }

    /**
     * Create an instance of {@link ConsultaFacturasDEIMONResponse }
     * 
     */
    public ConsultaFacturasDEIMONResponse createConsultaFacturasDEIMONResponse() {
        return new ConsultaFacturasDEIMONResponse();
    }

    /**
     * Create an instance of {@link ConsultaFacturasDEIMONResult }
     * 
     */
    public ConsultaFacturasDEIMONResult createConsultaFacturasDEIMONResult() {
        return new ConsultaFacturasDEIMONResult();
    }

    /**
     * Create an instance of {@link ConsultaCliente }
     * 
     */
    public ConsultaCliente createConsultaCliente() {
        return new ConsultaCliente();
    }

    /**
     * Create an instance of {@link ConsultaClienteResponse }
     * 
     */
    public ConsultaClienteResponse createConsultaClienteResponse() {
        return new ConsultaClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultaClienteResult }
     * 
     */
    public ConsultaClienteResult createConsultaClienteResult() {
        return new ConsultaClienteResult();
    }

    /**
     * Create an instance of {@link PagoFactura }
     * 
     */
    public PagoFactura createPagoFactura() {
        return new PagoFactura();
    }

    /**
     * Create an instance of {@link PagoFacturaResponse }
     * 
     */
    public PagoFacturaResponse createPagoFacturaResponse() {
        return new PagoFacturaResponse();
    }

    /**
     * Create an instance of {@link PagoFacturaResult }
     * 
     */
    public PagoFacturaResult createPagoFacturaResult() {
        return new PagoFacturaResult();
    }

    /**
     * Create an instance of {@link ConsultaFacturasDUC }
     * 
     */
    public ConsultaFacturasDUC createConsultaFacturasDUC() {
        return new ConsultaFacturasDUC();
    }

    /**
     * Create an instance of {@link ConsultaFacturasDUCResponse }
     * 
     */
    public ConsultaFacturasDUCResponse createConsultaFacturasDUCResponse() {
        return new ConsultaFacturasDUCResponse();
    }

    /**
     * Create an instance of {@link ConsultaFacturasDUCResult }
     * 
     */
    public ConsultaFacturasDUCResult createConsultaFacturasDUCResult() {
        return new ConsultaFacturasDUCResult();
    }

    /**
     * Create an instance of {@link FacturaWS }
     * 
     */
    public FacturaWS createFacturaWS() {
        return new FacturaWS();
    }

    /**
     * Create an instance of {@link FacturaDeimonWS }
     * 
     */
    public FacturaDeimonWS createFacturaDeimonWS() {
        return new FacturaDeimonWS();
    }

    /**
     * Create an instance of {@link ClienteWS }
     * 
     */
    public ClienteWS createClienteWS() {
        return new ClienteWS();
    }

    /**
     * Create an instance of {@link AcuerdoWS }
     * 
     */
    public AcuerdoWS createAcuerdoWS() {
        return new AcuerdoWS();
    }

    /**
     * Create an instance of {@link TramiteCMSWS }
     * 
     */
    public TramiteCMSWS createTramiteCMSWS() {
        return new TramiteCMSWS();
    }

    /**
     * Create an instance of {@link FacturaDUCWS }
     * 
     */
    public FacturaDUCWS createFacturaDUCWS() {
        return new FacturaDUCWS();
    }

    /**
     * Create an instance of {@link ObtenerInformacionOrdenRequest }
     * 
     */
    public ObtenerInformacionOrdenRequest createObtenerInformacionOrdenRequest() {
        return new ObtenerInformacionOrdenRequest();
    }

    /**
     * Create an instance of {@link ObtenerInformacionOrdenResponse }
     * 
     */
    public ObtenerInformacionOrdenResponse createObtenerInformacionOrdenResponse() {
        return new ObtenerInformacionOrdenResponse();
    }

    /**
     * Create an instance of {@link ErrorDetail }
     * 
     */
    public ErrorDetail createErrorDetail() {
        return new ErrorDetail();
    }

    /**
     * Create an instance of {@link SucursalBancoType }
     * 
     */
    public SucursalBancoType createSucursalBancoType() {
        return new SucursalBancoType();
    }

    /**
     * Create an instance of {@link CuentaBancariaType }
     * 
     */
    public CuentaBancariaType createCuentaBancariaType() {
        return new CuentaBancariaType();
    }

    /**
     * Create an instance of {@link EntidadFinancieraType }
     * 
     */
    public EntidadFinancieraType createEntidadFinancieraType() {
        return new EntidadFinancieraType();
    }

    /**
     * Create an instance of {@link EntidadTarjetaCreditoType }
     * 
     */
    public EntidadTarjetaCreditoType createEntidadTarjetaCreditoType() {
        return new EntidadTarjetaCreditoType();
    }

    /**
     * Create an instance of {@link EnteRecaudadorType }
     * 
     */
    public EnteRecaudadorType createEnteRecaudadorType() {
        return new EnteRecaudadorType();
    }

    /**
     * Create an instance of {@link BancoType }
     * 
     */
    public BancoType createBancoType() {
        return new BancoType();
    }

    /**
     * Create an instance of {@link PagoFacilType }
     * 
     */
    public PagoFacilType createPagoFacilType() {
        return new PagoFacilType();
    }

    /**
     * Create an instance of {@link GireType }
     * 
     */
    public GireType createGireType() {
        return new GireType();
    }

    /**
     * Create an instance of {@link NumeroBancoDePago }
     * 
     */
    public NumeroBancoDePago createNumeroBancoDePago() {
        return new NumeroBancoDePago();
    }

    /**
     * Create an instance of {@link OficinaComercialType }
     * 
     */
    public OficinaComercialType createOficinaComercialType() {
        return new OficinaComercialType();
    }

    /**
     * Create an instance of {@link LugarPago }
     * 
     */
    public LugarPago createLugarPago() {
        return new LugarPago();
    }

    /**
     * Create an instance of {@link EnteConcentrador }
     * 
     */
    public EnteConcentrador createEnteConcentrador() {
        return new EnteConcentrador();
    }

    /**
     * Create an instance of {@link CuentaResponsableType }
     * 
     */
    public CuentaResponsableType createCuentaResponsableType() {
        return new CuentaResponsableType();
    }

    /**
     * Create an instance of {@link MonedaType }
     * 
     */
    public MonedaType createMonedaType() {
        return new MonedaType();
    }

    /**
     * Create an instance of {@link PagoType }
     * 
     */
    public PagoType createPagoType() {
        return new PagoType();
    }

    /**
     * Create an instance of {@link PagoErroneoType }
     * 
     */
    public PagoErroneoType createPagoErroneoType() {
        return new PagoErroneoType();
    }

    /**
     * Create an instance of {@link AjusteFinancieroType }
     * 
     */
    public AjusteFinancieroType createAjusteFinancieroType() {
        return new AjusteFinancieroType();
    }

    /**
     * Create an instance of {@link CanalVentasType }
     * 
     */
    public CanalVentasType createCanalVentasType() {
        return new CanalVentasType();
    }

    /**
     * Create an instance of {@link PerfilCuentaType }
     * 
     */
    public PerfilCuentaType createPerfilCuentaType() {
        return new PerfilCuentaType();
    }

    /**
     * Create an instance of {@link CuentaNoFacturableType }
     * 
     */
    public CuentaNoFacturableType createCuentaNoFacturableType() {
        return new CuentaNoFacturableType();
    }

    /**
     * Create an instance of {@link CuentaFacturableType }
     * 
     */
    public CuentaFacturableType createCuentaFacturableType() {
        return new CuentaFacturableType();
    }

    /**
     * Create an instance of {@link CuentaNoResponsableType }
     * 
     */
    public CuentaNoResponsableType createCuentaNoResponsableType() {
        return new CuentaNoResponsableType();
    }

    /**
     * Create an instance of {@link MarcaEnCuentaResponsableType }
     * 
     */
    public MarcaEnCuentaResponsableType createMarcaEnCuentaResponsableType() {
        return new MarcaEnCuentaResponsableType();
    }

    /**
     * Create an instance of {@link CuentaEstadoMorosidadType }
     * 
     */
    public CuentaEstadoMorosidadType createCuentaEstadoMorosidadType() {
        return new CuentaEstadoMorosidadType();
    }

    /**
     * Create an instance of {@link CuentaNoMorosaType }
     * 
     */
    public CuentaNoMorosaType createCuentaNoMorosaType() {
        return new CuentaNoMorosaType();
    }

    /**
     * Create an instance of {@link CuentaMorosaType }
     * 
     */
    public CuentaMorosaType createCuentaMorosaType() {
        return new CuentaMorosaType();
    }

    /**
     * Create an instance of {@link Tarjeta }
     * 
     */
    public Tarjeta createTarjeta() {
        return new Tarjeta();
    }

    /**
     * Create an instance of {@link ResponseHeader.Consumer }
     * 
     */
    public ResponseHeader.Consumer createResponseHeaderConsumer() {
        return new ResponseHeader.Consumer();
    }

    /**
     * Create an instance of {@link ResponseHeader.Message }
     * 
     */
    public ResponseHeader.Message createResponseHeaderMessage() {
        return new ResponseHeader.Message();
    }

    /**
     * Create an instance of {@link RequestHeader.Message }
     * 
     */
    public RequestHeader.Message createRequestHeaderMessage() {
        return new RequestHeader.Message();
    }

    /**
     * Create an instance of {@link RequestHeader.Consumer.Credentials }
     * 
     */
    public RequestHeader.Consumer.Credentials createRequestHeaderConsumerCredentials() {
        return new RequestHeader.Consumer.Credentials();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "codOrden")
    public JAXBElement<String> createCodOrden(String value) {
        return new JAXBElement<String>(_CodOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "nroCuponTarjeta")
    public JAXBElement<String> createNroCuponTarjeta(String value) {
        return new JAXBElement<String>(_NroCuponTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaPago")
    public JAXBElement<String> createFechaPago(String value) {
        return new JAXBElement<String>(_FechaPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "importePago")
    public JAXBElement<String> createImportePago(String value) {
        return new JAXBElement<String>(_ImportePago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "cantidadCuotasTarjeta")
    public JAXBElement<BigInteger> createCantidadCuotasTarjeta(BigInteger value) {
        return new JAXBElement<BigInteger>(_CantidadCuotasTarjeta_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "codTarjeta")
    public JAXBElement<String> createCodTarjeta(String value) {
        return new JAXBElement<String>(_CodTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codBanco")
    public JAXBElement<String> createCodBanco(String value) {
        return new JAXBElement<String>(_CodBanco_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Moneda/v1.0", name = "codMoneda")
    public JAXBElement<String> createCodMoneda(String value) {
        return new JAXBElement<String>(_CodMoneda_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common", name = "idSecuencial")
    public JAXBElement<BigInteger> createIdSecuencial(BigInteger value) {
        return new JAXBElement<BigInteger>(_IdSecuencial_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common", name = "sistemaGestor")
    public JAXBElement<String> createSistemaGestor(String value) {
        return new JAXBElement<String>(_SistemaGestor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/RequestMessageHeader/v1.0", name = "requestHeader")
    public JAXBElement<RequestHeader> createRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_RequestHeader_QNAME, RequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/ResponseMessageHeader/v1.0", name = "responseHeader")
    public JAXBElement<ResponseHeader> createResponseHeader(ResponseHeader value) {
        return new JAXBElement<ResponseHeader>(_ResponseHeader_QNAME, ResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "nroOrden")
    public JAXBElement<String> createNroOrden(String value) {
        return new JAXBElement<String>(_NroOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "fechaAltaOrden")
    public JAXBElement<String> createFechaAltaOrden(String value) {
        return new JAXBElement<String>(_FechaAltaOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "fechaModificacionOrden")
    public JAXBElement<String> createFechaModificacionOrden(String value) {
        return new JAXBElement<String>(_FechaModificacionOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "estadoOrden")
    public JAXBElement<String> createEstadoOrden(String value) {
        return new JAXBElement<String>(_EstadoOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "codEstadoOrden")
    public JAXBElement<String> createCodEstadoOrden(String value) {
        return new JAXBElement<String>(_CodEstadoOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "descripcionEstadoOrden")
    public JAXBElement<String> createDescripcionEstadoOrden(String value) {
        return new JAXBElement<String>(_DescripcionEstadoOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "codTipoOrden")
    public JAXBElement<String> createCodTipoOrden(String value) {
        return new JAXBElement<String>(_CodTipoOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "tipoOrden")
    public JAXBElement<String> createTipoOrden(String value) {
        return new JAXBElement<String>(_TipoOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "descripcionTipoOrden")
    public JAXBElement<String> createDescripcionTipoOrden(String value) {
        return new JAXBElement<String>(_DescripcionTipoOrden_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "codItem")
    public JAXBElement<String> createCodItem(String value) {
        return new JAXBElement<String>(_CodItem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "ejecucionCambio")
    public JAXBElement<String> createEjecucionCambio(String value) {
        return new JAXBElement<String>(_EjecucionCambio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Orden/v1.0", name = "fechaEjecucionCambio")
    public JAXBElement<String> createFechaEjecucionCambio(String value) {
        return new JAXBElement<String>(_FechaEjecucionCambio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codEntidadFinanciera")
    public JAXBElement<String> createCodEntidadFinanciera(String value) {
        return new JAXBElement<String>(_CodEntidadFinanciera_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "tipoEntidadFinanciera")
    public JAXBElement<String> createTipoEntidadFinanciera(String value) {
        return new JAXBElement<String>(_TipoEntidadFinanciera_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codEntidadTC")
    public JAXBElement<String> createCodEntidadTC(String value) {
        return new JAXBElement<String>(_CodEntidadTC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "nombreEntidadTC")
    public JAXBElement<String> createNombreEntidadTC(String value) {
        return new JAXBElement<String>(_NombreEntidadTC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codEnteRecaudador")
    public JAXBElement<String> createCodEnteRecaudador(String value) {
        return new JAXBElement<String>(_CodEnteRecaudador_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "comisionEnteRecaudador")
    public JAXBElement<String> createComisionEnteRecaudador(String value) {
        return new JAXBElement<String>(_ComisionEnteRecaudador_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "descripcionEnteRecaudador")
    public JAXBElement<String> createDescripcionEnteRecaudador(String value) {
        return new JAXBElement<String>(_DescripcionEnteRecaudador_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "nombreBanco")
    public JAXBElement<String> createNombreBanco(String value) {
        return new JAXBElement<String>(_NombreBanco_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codPagoFacil")
    public JAXBElement<String> createCodPagoFacil(String value) {
        return new JAXBElement<String>(_CodPagoFacil_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codGIRE")
    public JAXBElement<String> createCodGIRE(String value) {
        return new JAXBElement<String>(_CodGIRE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codSucursalBanco")
    public JAXBElement<String> createCodSucursalBanco(String value) {
        return new JAXBElement<String>(_CodSucursalBanco_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "descripcionSucursalBanco")
    public JAXBElement<String> createDescripcionSucursalBanco(String value) {
        return new JAXBElement<String>(_DescripcionSucursalBanco_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "CBU")
    public JAXBElement<String> createCBU(String value) {
        return new JAXBElement<String>(_CBU_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "fechaAltaCtaBancaria")
    public JAXBElement<String> createFechaAltaCtaBancaria(String value) {
        return new JAXBElement<String>(_FechaAltaCtaBancaria_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "nroCuentaBancaria")
    public JAXBElement<String> createNroCuentaBancaria(String value) {
        return new JAXBElement<String>(_NroCuentaBancaria_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codEnteConcentrador")
    public JAXBElement<String> createCodEnteConcentrador(String value) {
        return new JAXBElement<String>(_CodEnteConcentrador_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "nombreEntidadFinanciera")
    public JAXBElement<String> createNombreEntidadFinanciera(String value) {
        return new JAXBElement<String>(_NombreEntidadFinanciera_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "codSucursalEntidad")
    public JAXBElement<String> createCodSucursalEntidad(String value) {
        return new JAXBElement<String>(_CodSucursalEntidad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/EntidadFinanciera/v1.0", name = "tipoCtaBancaria")
    public JAXBElement<String> createTipoCtaBancaria(String value) {
        return new JAXBElement<String>(_TipoCtaBancaria_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "codPago")
    public JAXBElement<String> createCodPago(String value) {
        return new JAXBElement<String>(_CodPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "codAjustePago")
    public JAXBElement<String> createCodAjustePago(String value) {
        return new JAXBElement<String>(_CodAjustePago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "codProcesamientoPago")
    public JAXBElement<String> createCodProcesamientoPago(String value) {
        return new JAXBElement<String>(_CodProcesamientoPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "comentarioPago")
    public JAXBElement<String> createComentarioPago(String value) {
        return new JAXBElement<String>(_ComentarioPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaAnulacion")
    public JAXBElement<String> createFechaAnulacion(String value) {
        return new JAXBElement<String>(_FechaAnulacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaAplicacionPago")
    public JAXBElement<String> createFechaAplicacionPago(String value) {
        return new JAXBElement<String>(_FechaAplicacionPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaCambioEstadoPago")
    public JAXBElement<String> createFechaCambioEstadoPago(String value) {
        return new JAXBElement<String>(_FechaCambioEstadoPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaLecturaPago")
    public JAXBElement<String> createFechaLecturaPago(String value) {
        return new JAXBElement<String>(_FechaLecturaPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaPresentacion")
    public JAXBElement<String> createFechaPresentacion(String value) {
        return new JAXBElement<String>(_FechaPresentacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaRegistroPago")
    public JAXBElement<String> createFechaRegistroPago(String value) {
        return new JAXBElement<String>(_FechaRegistroPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaValidacionPago")
    public JAXBElement<String> createFechaValidacionPago(String value) {
        return new JAXBElement<String>(_FechaValidacionPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaVencimientoPago")
    public JAXBElement<String> createFechaVencimientoPago(String value) {
        return new JAXBElement<String>(_FechaVencimientoPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "importeComisionPago")
    public JAXBElement<String> createImporteComisionPago(String value) {
        return new JAXBElement<String>(_ImporteComisionPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "marcaCargoEnFactura")
    public JAXBElement<Boolean> createMarcaCargoEnFactura(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaCargoEnFactura_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "montoValidadoPago")
    public JAXBElement<String> createMontoValidadoPago(String value) {
        return new JAXBElement<String>(_MontoValidadoPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "descripcionMotivoCambioEstadoPago")
    public JAXBElement<String> createDescripcionMotivoCambioEstadoPago(String value) {
        return new JAXBElement<String>(_DescripcionMotivoCambioEstadoPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "motivoPago")
    public JAXBElement<String> createMotivoPago(String value) {
        return new JAXBElement<String>(_MotivoPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "nombreArchivoPagoRecibido")
    public JAXBElement<String> createNombreArchivoPagoRecibido(String value) {
        return new JAXBElement<String>(_NombreArchivoPagoRecibido_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "nroSecuencialPago")
    public JAXBElement<String> createNroSecuencialPago(String value) {
        return new JAXBElement<String>(_NroSecuencialPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "tipoLectura")
    public JAXBElement<String> createTipoLectura(String value) {
        return new JAXBElement<String>(_TipoLectura_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "tipoTalon")
    public JAXBElement<String> createTipoTalon(String value) {
        return new JAXBElement<String>(_TipoTalon_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "tipoTransaccionPago")
    public JAXBElement<String> createTipoTransaccionPago(String value) {
        return new JAXBElement<String>(_TipoTransaccionPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OficinaComercialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "oficinaComercialDePago")
    public JAXBElement<OficinaComercialType> createOficinaComercialDePago(OficinaComercialType value) {
        return new JAXBElement<OficinaComercialType>(_OficinaComercialDePago_QNAME, OficinaComercialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LugarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "lugarPago")
    public JAXBElement<LugarPago> createLugarPago(LugarPago value) {
        return new JAXBElement<LugarPago>(_LugarPago_QNAME, LugarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BancoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "bancoConcentrador")
    public JAXBElement<BancoType> createBancoConcentrador(BancoType value) {
        return new JAXBElement<BancoType>(_BancoConcentrador_QNAME, BancoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoFacilType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "pagoFacil")
    public JAXBElement<PagoFacilType> createPagoFacil(PagoFacilType value) {
        return new JAXBElement<PagoFacilType>(_PagoFacil_QNAME, PagoFacilType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GireType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "GIRE")
    public JAXBElement<GireType> createGIRE(GireType value) {
        return new JAXBElement<GireType>(_GIRE_QNAME, GireType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnteConcentrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "enteConcentrador")
    public JAXBElement<EnteConcentrador> createEnteConcentrador(EnteConcentrador value) {
        return new JAXBElement<EnteConcentrador>(_EnteConcentrador_QNAME, EnteConcentrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "motivoCambioEstadoPago")
    public JAXBElement<String> createMotivoCambioEstadoPago(String value) {
        return new JAXBElement<String>(_MotivoCambioEstadoPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaResponsableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "cuentaAsociadaPago")
    public JAXBElement<CuentaResponsableType> createCuentaAsociadaPago(CuentaResponsableType value) {
        return new JAXBElement<CuentaResponsableType>(_CuentaAsociadaPago_QNAME, CuentaResponsableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoPagoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "estadoPago")
    public JAXBElement<EstadoPagoType> createEstadoPago(EstadoPagoType value) {
        return new JAXBElement<EstadoPagoType>(_EstadoPago_QNAME, EstadoPagoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonedaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "moneda")
    public JAXBElement<MonedaType> createMoneda(MonedaType value) {
        return new JAXBElement<MonedaType>(_Moneda_QNAME, MonedaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "codErrorPago")
    public JAXBElement<String> createCodErrorPago(String value) {
        return new JAXBElement<String>(_CodErrorPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "descripcionErrorPago")
    public JAXBElement<String> createDescripcionErrorPago(String value) {
        return new JAXBElement<String>(_DescripcionErrorPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "descripcionEstadoPago")
    public JAXBElement<String> createDescripcionEstadoPago(String value) {
        return new JAXBElement<String>(_DescripcionEstadoPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "nroLineaPagoIVR")
    public JAXBElement<String> createNroLineaPagoIVR(String value) {
        return new JAXBElement<String>(_NroLineaPagoIVR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "codReintegro")
    public JAXBElement<String> createCodReintegro(String value) {
        return new JAXBElement<String>(_CodReintegro_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaValorReintegro")
    public JAXBElement<String> createFechaValorReintegro(String value) {
        return new JAXBElement<String>(_FechaValorReintegro_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "montoReintegro")
    public JAXBElement<String> createMontoReintegro(String value) {
        return new JAXBElement<String>(_MontoReintegro_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "codAjusteFinanciero")
    public JAXBElement<String> createCodAjusteFinanciero(String value) {
        return new JAXBElement<String>(_CodAjusteFinanciero_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "importeAjusteFinanciero")
    public JAXBElement<String> createImporteAjusteFinanciero(String value) {
        return new JAXBElement<String>(_ImporteAjusteFinanciero_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "estadoAjusteFinanciero")
    public JAXBElement<String> createEstadoAjusteFinanciero(String value) {
        return new JAXBElement<String>(_EstadoAjusteFinanciero_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "nroReferenciaPago")
    public JAXBElement<String> createNroReferenciaPago(String value) {
        return new JAXBElement<String>(_NroReferenciaPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "tipoDeposito")
    public JAXBElement<String> createTipoDeposito(String value) {
        return new JAXBElement<String>(_TipoDeposito_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "marcaPagoRevertido")
    public JAXBElement<Boolean> createMarcaPagoRevertido(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaPagoRevertido_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/Pago/v3.0", name = "fechaPagoRevertido")
    public JAXBElement<String> createFechaPagoRevertido(String value) {
        return new JAXBElement<String>(_FechaPagoRevertido_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Moneda/v1.0", name = "descripcionMoneda")
    public JAXBElement<String> createDescripcionMoneda(String value) {
        return new JAXBElement<String>(_DescripcionMoneda_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/NegocioComun/Moneda/v1.0", name = "tasaDeCambio")
    public JAXBElement<String> createTasaDeCambio(String value) {
        return new JAXBElement<String>(_TasaDeCambio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "codOficinaComercial")
    public JAXBElement<String> createCodOficinaComercial(String value) {
        return new JAXBElement<String>(_CodOficinaComercial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "descripcionOficinaComercial")
    public JAXBElement<String> createDescripcionOficinaComercial(String value) {
        return new JAXBElement<String>(_DescripcionOficinaComercial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "estadoCaja")
    public JAXBElement<String> createEstadoCaja(String value) {
        return new JAXBElement<String>(_EstadoCaja_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "codCanalDeVenta")
    public JAXBElement<String> createCodCanalDeVenta(String value) {
        return new JAXBElement<String>(_CodCanalDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "codCC")
    public JAXBElement<String> createCodCC(String value) {
        return new JAXBElement<String>(_CodCC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "descripcionCC")
    public JAXBElement<String> createDescripcionCC(String value) {
        return new JAXBElement<String>(_DescripcionCC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "codPuntoDeVenta")
    public JAXBElement<String> createCodPuntoDeVenta(String value) {
        return new JAXBElement<String>(_CodPuntoDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "descripcionPuntoDeVenta")
    public JAXBElement<String> createDescripcionPuntoDeVenta(String value) {
        return new JAXBElement<String>(_DescripcionPuntoDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "fechaAltaPuntoDeVenta")
    public JAXBElement<String> createFechaAltaPuntoDeVenta(String value) {
        return new JAXBElement<String>(_FechaAltaPuntoDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "fechaBajaPuntoDeVenta")
    public JAXBElement<String> createFechaBajaPuntoDeVenta(String value) {
        return new JAXBElement<String>(_FechaBajaPuntoDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "fechaSuspensionPuntoDeVenta")
    public JAXBElement<String> createFechaSuspensionPuntoDeVenta(String value) {
        return new JAXBElement<String>(_FechaSuspensionPuntoDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "codTipoCanalDeVenta")
    public JAXBElement<String> createCodTipoCanalDeVenta(String value) {
        return new JAXBElement<String>(_CodTipoCanalDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "codTipoPuntoDeVenta")
    public JAXBElement<String> createCodTipoPuntoDeVenta(String value) {
        return new JAXBElement<String>(_CodTipoPuntoDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "descripcionTipoPuntoDeVenta")
    public JAXBElement<String> createDescripcionTipoPuntoDeVenta(String value) {
        return new JAXBElement<String>(_DescripcionTipoPuntoDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "fechaSuspensionTipoPuntoDeVenta")
    public JAXBElement<String> createFechaSuspensionTipoPuntoDeVenta(String value) {
        return new JAXBElement<String>(_FechaSuspensionTipoPuntoDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "codSubCanalDeVenta")
    public JAXBElement<String> createCodSubCanalDeVenta(String value) {
        return new JAXBElement<String>(_CodSubCanalDeVenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeVentas/v1.0", name = "diasVencimientoRendicion")
    public JAXBElement<String> createDiasVencimientoRendicion(String value) {
        return new JAXBElement<String>(_DiasVencimientoRendicion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeCobranza/v1.0", name = "codCanalCobranza")
    public JAXBElement<String> createCodCanalCobranza(String value) {
        return new JAXBElement<String>(_CodCanalCobranza_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeCobranza/v1.0", name = "descripcionCanalCobranza")
    public JAXBElement<String> createDescripcionCanalCobranza(String value) {
        return new JAXBElement<String>(_DescripcionCanalCobranza_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Ventas/CanalDeCobranza/v1.0", name = "codPlataformaPago")
    public JAXBElement<String> createCodPlataformaPago(String value) {
        return new JAXBElement<String>(_CodPlataformaPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "marcaFacturable")
    public JAXBElement<Boolean> createMarcaFacturable(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaFacturable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaUltimaFactura")
    public JAXBElement<String> createFechaUltimaFactura(String value) {
        return new JAXBElement<String>(_FechaUltimaFactura_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "marcaResponsableDePago")
    public JAXBElement<Boolean> createMarcaResponsableDePago(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaResponsableDePago_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "balanceCuenta")
    public JAXBElement<String> createBalanceCuenta(String value) {
        return new JAXBElement<String>(_BalanceCuenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "cantidadCiclosStopDebit")
    public JAXBElement<String> createCantidadCiclosStopDebit(String value) {
        return new JAXBElement<String>(_CantidadCiclosStopDebit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "diasGracia")
    public JAXBElement<String> createDiasGracia(String value) {
        return new JAXBElement<String>(_DiasGracia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaStopDebitDesde")
    public JAXBElement<String> createFechaStopDebitDesde(String value) {
        return new JAXBElement<String>(_FechaStopDebitDesde_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaStopDebitHasta")
    public JAXBElement<String> createFechaStopDebitHasta(String value) {
        return new JAXBElement<String>(_FechaStopDebitHasta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "codFormaPago")
    public JAXBElement<String> createCodFormaPago(String value) {
        return new JAXBElement<String>(_CodFormaPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "descripcionFormaPago")
    public JAXBElement<String> createDescripcionFormaPago(String value) {
        return new JAXBElement<String>(_DescripcionFormaPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "saldoVencidoCuenta")
    public JAXBElement<String> createSaldoVencidoCuenta(String value) {
        return new JAXBElement<String>(_SaldoVencidoCuenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "saldoNoVencidoCuenta")
    public JAXBElement<String> createSaldoNoVencidoCuenta(String value) {
        return new JAXBElement<String>(_SaldoNoVencidoCuenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "marcaStopdebit")
    public JAXBElement<Boolean> createMarcaStopdebit(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaStopdebit_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "codMarcaEnCtaResp")
    public JAXBElement<String> createCodMarcaEnCtaResp(String value) {
        return new JAXBElement<String>(_CodMarcaEnCtaResp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaDesdeMarcaEnCtaResp")
    public JAXBElement<String> createFechaDesdeMarcaEnCtaResp(String value) {
        return new JAXBElement<String>(_FechaDesdeMarcaEnCtaResp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaHastaMarcaEnCtaResp")
    public JAXBElement<String> createFechaHastaMarcaEnCtaResp(String value) {
        return new JAXBElement<String>(_FechaHastaMarcaEnCtaResp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "marcaEnCtaResp")
    public JAXBElement<Boolean> createMarcaEnCtaResp(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaEnCtaResp_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "descripcionMarcaEnCtaResp")
    public JAXBElement<String> createDescripcionMarcaEnCtaResp(String value) {
        return new JAXBElement<String>(_DescripcionMarcaEnCtaResp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "motivoMarcaEnCtaResp")
    public JAXBElement<String> createMotivoMarcaEnCtaResp(String value) {
        return new JAXBElement<String>(_MotivoMarcaEnCtaResp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "marcaMorosidad")
    public JAXBElement<Boolean> createMarcaMorosidad(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaMorosidad_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaMorosidad")
    public JAXBElement<String> createFechaMorosidad(String value) {
        return new JAXBElement<String>(_FechaMorosidad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "montoDeudaInicial")
    public JAXBElement<String> createMontoDeudaInicial(String value) {
        return new JAXBElement<String>(_MontoDeudaInicial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "montoInteresDeudaInicial")
    public JAXBElement<String> createMontoInteresDeudaInicial(String value) {
        return new JAXBElement<String>(_MontoInteresDeudaInicial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "montoTotalDeudaInicial")
    public JAXBElement<String> createMontoTotalDeudaInicial(String value) {
        return new JAXBElement<String>(_MontoTotalDeudaInicial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaDesinterrupcionProcMora")
    public JAXBElement<String> createFechaDesinterrupcionProcMora(String value) {
        return new JAXBElement<String>(_FechaDesinterrupcionProcMora_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaFinInterrupcionProcMora")
    public JAXBElement<String> createFechaFinInterrupcionProcMora(String value) {
        return new JAXBElement<String>(_FechaFinInterrupcionProcMora_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaInicioInterrupcionProcMora")
    public JAXBElement<String> createFechaInicioInterrupcionProcMora(String value) {
        return new JAXBElement<String>(_FechaInicioInterrupcionProcMora_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "motivoDesinterrupcionProcMora")
    public JAXBElement<String> createMotivoDesinterrupcionProcMora(String value) {
        return new JAXBElement<String>(_MotivoDesinterrupcionProcMora_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "motivoInterrupcionProcMora")
    public JAXBElement<String> createMotivoInterrupcionProcMora(String value) {
        return new JAXBElement<String>(_MotivoInterrupcionProcMora_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "fechaFinMorosidad")
    public JAXBElement<String> createFechaFinMorosidad(String value) {
        return new JAXBElement<String>(_FechaFinMorosidad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "estadoMorosidad")
    public JAXBElement<String> createEstadoMorosidad(String value) {
        return new JAXBElement<String>(_EstadoMorosidad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "motivoCierreProcMora")
    public JAXBElement<String> createMotivoCierreProcMora(String value) {
        return new JAXBElement<String>(_MotivoCierreProcMora_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "marcaCargoTardio")
    public JAXBElement<Boolean> createMarcaCargoTardio(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaCargoTardio_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "marcaControlLimite")
    public JAXBElement<Boolean> createMarcaControlLimite(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaControlLimite_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/PerfilCuenta/v2.0", name = "claseCuenta")
    public JAXBElement<String> createClaseCuenta(String value) {
        return new JAXBElement<String>(_ClaseCuenta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "codMedioPago")
    public JAXBElement<String> createCodMedioPago(String value) {
        return new JAXBElement<String>(_CodMedioPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "descripcionMedioPago")
    public JAXBElement<String> createDescripcionMedioPago(String value) {
        return new JAXBElement<String>(_DescripcionMedioPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "codCheque")
    public JAXBElement<String> createCodCheque(String value) {
        return new JAXBElement<String>(_CodCheque_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "estadoCheque")
    public JAXBElement<String> createEstadoCheque(String value) {
        return new JAXBElement<String>(_EstadoCheque_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "motivoEstadoCheque")
    public JAXBElement<String> createMotivoEstadoCheque(String value) {
        return new JAXBElement<String>(_MotivoEstadoCheque_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaDiferida")
    public JAXBElement<String> createFechaDiferida(String value) {
        return new JAXBElement<String>(_FechaDiferida_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaEmisionCheque")
    public JAXBElement<String> createFechaEmisionCheque(String value) {
        return new JAXBElement<String>(_FechaEmisionCheque_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaVencimientoCheque")
    public JAXBElement<String> createFechaVencimientoCheque(String value) {
        return new JAXBElement<String>(_FechaVencimientoCheque_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaVencimientoComp")
    public JAXBElement<String> createFechaVencimientoComp(String value) {
        return new JAXBElement<String>(_FechaVencimientoComp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "nroCheque")
    public JAXBElement<BigInteger> createNroCheque(BigInteger value) {
        return new JAXBElement<BigInteger>(_NroCheque_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "codAutorizacion")
    public JAXBElement<String> createCodAutorizacion(String value) {
        return new JAXBElement<String>(_CodAutorizacion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "nroComercio")
    public JAXBElement<String> createNroComercio(String value) {
        return new JAXBElement<String>(_NroComercio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "nroLoteTarjeta")
    public JAXBElement<String> createNroLoteTarjeta(String value) {
        return new JAXBElement<String>(_NroLoteTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "nroTransaccionTarjeta")
    public JAXBElement<String> createNroTransaccionTarjeta(String value) {
        return new JAXBElement<String>(_NroTransaccionTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "tipoCuponTarjeta")
    public JAXBElement<String> createTipoCuponTarjeta(String value) {
        return new JAXBElement<String>(_TipoCuponTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "nroTarjeta")
    public JAXBElement<String> createNroTarjeta(String value) {
        return new JAXBElement<String>(_NroTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaVencimientoTarjeta")
    public JAXBElement<String> createFechaVencimientoTarjeta(String value) {
        return new JAXBElement<String>(_FechaVencimientoTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaEmisionTarjeta")
    public JAXBElement<String> createFechaEmisionTarjeta(String value) {
        return new JAXBElement<String>(_FechaEmisionTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "codSeguridadTarjeta")
    public JAXBElement<String> createCodSeguridadTarjeta(String value) {
        return new JAXBElement<String>(_CodSeguridadTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaAltaDebitoAutomatico")
    public JAXBElement<String> createFechaAltaDebitoAutomatico(String value) {
        return new JAXBElement<String>(_FechaAltaDebitoAutomatico_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaBajaDebitoAutomatico")
    public JAXBElement<String> createFechaBajaDebitoAutomatico(String value) {
        return new JAXBElement<String>(_FechaBajaDebitoAutomatico_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaModificacionDebitoAutomatico")
    public JAXBElement<String> createFechaModificacionDebitoAutomatico(String value) {
        return new JAXBElement<String>(_FechaModificacionDebitoAutomatico_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaAltaDebitoDirecto")
    public JAXBElement<String> createFechaAltaDebitoDirecto(String value) {
        return new JAXBElement<String>(_FechaAltaDebitoDirecto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaBajaDebitoDirecto")
    public JAXBElement<String> createFechaBajaDebitoDirecto(String value) {
        return new JAXBElement<String>(_FechaBajaDebitoDirecto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaModificacionDebitoDirecto")
    public JAXBElement<String> createFechaModificacionDebitoDirecto(String value) {
        return new JAXBElement<String>(_FechaModificacionDebitoDirecto_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "trackTarjeta")
    public JAXBElement<String> createTrackTarjeta(String value) {
        return new JAXBElement<String>(_TrackTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "nroTarjetaEncriptado")
    public JAXBElement<String> createNroTarjetaEncriptado(String value) {
        return new JAXBElement<String>(_NroTarjetaEncriptado_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "ultimosDigitosTarjeta")
    public JAXBElement<String> createUltimosDigitosTarjeta(String value) {
        return new JAXBElement<String>(_UltimosDigitosTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "fechaCuponTarjeta")
    public JAXBElement<String> createFechaCuponTarjeta(String value) {
        return new JAXBElement<String>(_FechaCuponTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "codFormaDePago")
    public JAXBElement<String> createCodFormaDePago(String value) {
        return new JAXBElement<String>(_CodFormaDePago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "diaImputacionPago")
    public JAXBElement<String> createDiaImputacionPago(String value) {
        return new JAXBElement<String>(_DiaImputacionPago_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "montoMaximoDebito")
    public JAXBElement<String> createMontoMaximoDebito(String value) {
        return new JAXBElement<String>(_MontoMaximoDebito_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "marcaTarjetaActiva")
    public JAXBElement<Boolean> createMarcaTarjetaActiva(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaTarjetaActiva_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "nombreTarjeta")
    public JAXBElement<String> createNombreTarjeta(String value) {
        return new JAXBElement<String>(_NombreTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "mesVtoTarjeta")
    public JAXBElement<String> createMesVtoTarjeta(String value) {
        return new JAXBElement<String>(_MesVtoTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "anioVtoTarjeta")
    public JAXBElement<String> createAnioVtoTarjeta(String value) {
        return new JAXBElement<String>(_AnioVtoTarjeta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.personal.com.ar/Common/Entities/Cliente/MedioDePago/v2.0", name = "marcaTarjetaPrincipal")
    public JAXBElement<Boolean> createMarcaTarjetaPrincipal(Boolean value) {
        return new JAXBElement<Boolean>(_MarcaTarjetaPrincipal_QNAME, Boolean.class, null, value);
    }

}
