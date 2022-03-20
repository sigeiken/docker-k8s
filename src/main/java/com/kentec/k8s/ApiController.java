package com.kentec.k8s;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/k8s/")
public class ApiController {
    @GetMapping
    public ResponseEntity<?> hello(){
        Map<String, Object> response = new HashMap<>();
        response.put("ResponseCode", "00");
        response.put("ResponseMessage", "K8s App running...");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
