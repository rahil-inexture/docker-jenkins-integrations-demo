package com.springboot.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/public-api")
    public ResponseEntity<String> getPublicresource(){
        return ResponseEntity.ok("This is a public Api");
    }
}
