package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 11/29/19
 * Time      : 9:28 AM
 * Filename  : ThangGaController
 */
@RestController
@RequestMapping("/test")
public class ThangGaController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}
