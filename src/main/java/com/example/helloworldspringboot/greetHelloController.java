package com.example.helloworldspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class greetHelloController {

    @GetMapping ("/hello")
    public String hello() {
        return "<h1>Hello from server!</h1>";
    }

    @GetMapping ("/hi")
    public String hi() {
        return "<h1>Hi from server!</h1>";
    }
}
