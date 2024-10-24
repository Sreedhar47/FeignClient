package com.vsr.main.service.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vsr.main.service.service.ApiService;


@RestController
@RequestMapping("/api/v1")
public class ApiController {
	

	@Autowired
	private ApiService service;
	
	Logger log = LogManager.getLogger() ;
	
	
	@GetMapping("/main-service")
	public ResponseEntity<String> getData() {
		log.info("Inside getData method.(ApiControllerImpl)........!");
		return service.getData();
		//return new ResponseEntity(response, HttpStatus.OK);
	}


}
