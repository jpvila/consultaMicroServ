package com.demo.teco;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.teco.webservices.ConsultaFacturasMIC;
import com.demo.teco.webservices.ConsultaFacturasMICResponse;
import com.demo.teco.webservices.client.SoapCobranzaElectronicaCliente;


@SpringBootApplication
@RestController
public class ConsultaMicroServApplication {
	@Autowired
	private SoapCobranzaElectronicaCliente clinet;
	
	private static final Logger LOGGER = LogManager.getLogger(ConsultaMicroServApplication.class);
	
	
	@PostMapping("/consultaMIC")
	public ConsultaFacturasMICResponse invokeSoapClientToGetLoanStatus(@RequestBody ConsultaFacturasMIC request) {
		return clinet.consultaFacturasMIC(request.getTipo(), request.getValue1(), request.getValue2(), "pruab", "", "");
	}
	
	public static void main(String[] args) {
	
		SpringApplication.run(ConsultaMicroServApplication.class, args);
		
	      LOGGER.info("Info level log message");
	        LOGGER.debug("Debug level log message");
	        LOGGER.error("Error level log message");
	}
	
	

}
