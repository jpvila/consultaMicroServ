package com.demo.teco.webservices.client;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.xml.transform.StringSource;

import com.demo.teco.controller.RoleController;
import com.demo.teco.webservices.ConsultaFacturasMIC;
import com.demo.teco.webservices.ConsultaFacturasMICResponse;
import com.demo.teco.webservices.ObtenerInformacionOrdenRequest;
import com.demo.teco.webservices.ObtenerInformacionOrdenResponse;


@Service
public class SoapCobranzaElectronicaCliente {

	@Autowired
	private Jaxb2Marshaller marshaller;
	private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);
	private WebServiceTemplate template;
	
	@Value("${opifan.wsdl.request.header}")
	private String opiFanRequestHeader;
	
	private String username;
	private String password;
	private String header;

	public ConsultaFacturasMICResponse consultaFacturasMIC(String tipo, String value1, String value2, String token, String timeStamp, String idAplicativo) {
		template = new WebServiceTemplate(marshaller);
		ConsultaFacturasMIC consultaFacturasMIC = new ConsultaFacturasMIC();
		consultaFacturasMIC.setTipo(tipo);
		consultaFacturasMIC.setIdAplicativo("IVR");
		ConsultaFacturasMICResponse consultaFacturasMICResponse = (ConsultaFacturasMICResponse) template.marshalSendAndReceive("http://10.249.40.28:9080/CTWebServices/services/CobranzaTarjeta", consultaFacturasMIC);
		return consultaFacturasMICResponse;
	}
/*
	public ObtenerInformacionOrdenResponse obtenerInformacion(String codOrden, String tipoOperacion, String usuario) {
		template = new WebServiceTemplate(marshaller);
		ObtenerInformacionOrdenRequest obtenerInformacionOrdenRequest = new ObtenerInformacionOrdenRequest();
		obtenerInformacionOrdenRequest.setCodOrden(codOrden);
		obtenerInformacionOrdenRequest.setTipoOperacion(tipoOperacion);
		obtenerInformacionOrdenRequest.setUsuario(usuario);
		template.marshalSendAndReceive("http://mdwtpbusu2.telecom.com.ar:8701/obtenerInformacionOrden", obtenerInformacionOrdenRequest);
		return null;
	}
	*/
	public ObtenerInformacionOrdenResponse obtenerInformacion(String codOrden, String tipoOperacion, String usuario){
		template = new WebServiceTemplate(marshaller);
		ObtenerInformacionOrdenRequest obtenerInformacionOrdenRequest = new ObtenerInformacionOrdenRequest();
		obtenerInformacionOrdenRequest.setCodOrden(codOrden);
		obtenerInformacionOrdenRequest.setTipoOperacion(tipoOperacion);
		
		System.out.println(opiFanRequestHeader);
		
		obtenerInformacionOrdenRequest.setUsuario(usuario);
		JAXBElement res = null;
		try {
			res = (JAXBElement) template.marshalSendAndReceive("http://mdwtpbusu2.telecom.com.ar:8701/obtenerInformacionOrden", obtenerInformacionOrdenRequest, new WebServiceMessageCallback() {

				@Override
				public void doWithMessage(WebServiceMessage message) {
					try {
						SoapHeader soapHeader = ((SoapMessage) message).getSoapHeader();					             
						
						StringSource headerSource = new StringSource(opiFanRequestHeader);
						Transformer transformer = TransformerFactory.newInstance().newTransformer();
						transformer.transform(headerSource, soapHeader.getResult());
						LOGGER.info("Marshalling of SOAP header success.");
					} catch (Exception e) {
						LOGGER.error("error during marshalling of the SOAP headers", e);
					}
				}
			});
		}catch (SoapFaultClientException e){
			LOGGER.error("Error while invoking session service : " + e.getMessage());
			return null;
		}
		 System.out.println(res.getValue());
		 return null;
	}
}
