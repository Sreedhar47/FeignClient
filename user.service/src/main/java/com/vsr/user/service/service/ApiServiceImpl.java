package com.vsr.user.service.service;

import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl implements ApiService{

	@Override
	public String getData() {
		
		return "WELCOME TO USER_SERVICE";
	}

}
