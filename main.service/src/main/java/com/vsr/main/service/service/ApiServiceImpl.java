package com.vsr.main.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vsr.main.service.clientservice.UserClient;

@Service
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	private UserClient client;

	@Override
	public ResponseEntity<String> getData() {
		
		return client.getData();
		//return "WELCOME TO MAIN_SERVICE";
	}

}
