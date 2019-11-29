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
 * Time      : 9:25 AM
 * Filename  : HelloController
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("Hello Spring", HttpStatus.OK);
    }
}
