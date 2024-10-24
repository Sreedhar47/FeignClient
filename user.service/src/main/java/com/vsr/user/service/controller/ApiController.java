package com.vsr.user.service.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vsr.user.service.service.ApiService;


@RestController
@RequestMapping("/api/v1")
public class ApiController {
	
	@Autowired
	private ApiService service;
	
	Logger log = LogManager.getLogger() ;
	
	
	@GetMapping("/user-service")
	public ResponseEntity<String> getData() {
		log.info("Inside getData method.(ApiControllerImpl)........!");
		String response = service.getData();
		return new ResponseEntity(response, HttpStatus.OK);
	}

}
