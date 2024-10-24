package com.vsr.main.service.clientservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
@Component
public class UserClientFallback implements UserClient {

   // @Override
    public ResponseEntity<String> getData() {
        System.out.println("Fall back method called"); // This will print to the console
       return new ResponseEntity(" User service is currently unavailable.", HttpStatus.SERVICE_UNAVAILABLE);
    }

	

	
}
