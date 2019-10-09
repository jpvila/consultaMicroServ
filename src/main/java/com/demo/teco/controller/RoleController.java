package com.demo.teco.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.demo.teco.entity.Role;
import com.demo.teco.service.IRolService;
import com.demo.teco.webservices.ConsultaFacturasMIC;
import com.demo.teco.webservices.ConsultaFacturasMICResponse;
import com.demo.teco.webservices.ObtenerInformacionOrdenRequest;
import com.demo.teco.webservices.client.SoapCobranzaElectronicaCliente;



@RestController
@RequestMapping("teco")
public class RoleController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);
	@Autowired
	private SoapCobranzaElectronicaCliente clinet;
	
	@Autowired
	private IRolService roleService;

	@PostMapping("/consultaMIC")
	public ConsultaFacturasMICResponse invokeSoapClientToGetLoanStatus(@RequestBody ConsultaFacturasMIC request) {
		return clinet.consultaFacturasMIC(request.getTipo(), request.getValue1(), request.getValue2(), "pruab", "", "");
	}
	
	@PostMapping("/obtenerInformacionOrden")
	public String obtenerInformacion(@RequestBody ObtenerInformacionOrdenRequest request) {
		
		clinet.obtenerInformacion(request.getCodOrden(), request.getTipoOperacion(), request.getUsuario());
		return "hola";
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public List<Role> listar(Model model) {
		LOGGER.trace("Texto TRACE");
		LOGGER.info("Texto info");
		
		List<Role> roles = roleService.findAll();
		
		LOGGER.error("Texto error");
		return roles;
	}
	
	public void consumirWebServicePrueba() {
		
	}

}