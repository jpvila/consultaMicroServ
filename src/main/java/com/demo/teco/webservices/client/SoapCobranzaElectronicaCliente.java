package com.demo.teco.webservices.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.demo.teco.webservices.ConsultaFacturasMIC;
import com.demo.teco.webservices.ConsultaFacturasMICResponse;


@Service
public class SoapCobranzaElectronicaCliente {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public ConsultaFacturasMICResponse consultaFacturasMIC(String tipo, String value1, String value2, String token, String timeStamp, String idAplicativo) {
		template = new WebServiceTemplate(marshaller);
		ConsultaFacturasMIC consultaFacturasMIC = new ConsultaFacturasMIC();
		consultaFacturasMIC.setTipo(tipo);
		consultaFacturasMIC.setIdAplicativo("IVR");
		ConsultaFacturasMICResponse consultaFacturasMICResponse = (ConsultaFacturasMICResponse) template.marshalSendAndReceive("http://10.249.40.28:9080/CTWebServices/services/CobranzaTarjeta", consultaFacturasMIC);
		return consultaFacturasMICResponse;
	}

}
