package com.vsr.main.service.clientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "userClient", url = "http://localhost:8081/api/v1", fallback = UserClientFallback.class)
public interface UserClient {
    @GetMapping("/user-service")
    ResponseEntity<String> getData();
}
