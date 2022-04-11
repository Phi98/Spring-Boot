package com.example.Hello.rest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloRestController {
    @GetMapping("/")
    public String Hello() {
    	return "Hello world";
    }
}
