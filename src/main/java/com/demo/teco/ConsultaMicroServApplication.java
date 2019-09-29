package com.demo.teco;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultaMicroServApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(ConsultaMicroServApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConsultaMicroServApplication.class, args);
		
	      LOGGER.info("Info level log message");
	      LOGGER.debug("Debug level log message");
	      LOGGER.error("Error level log message");
	}
	
	

}
