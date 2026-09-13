package com.example.helloworldspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class greetController {

    @GetMapping ("/hello")
    public String hello() {
        return "<h1>Hello from server!</h1>";
    }

    @GetMapping ("/hi")
    public String hi() {
        return "<h1>Hi from server!</h1>";
    }

    @GetMapping ("/bye")
    public String bye() {
        return "<h1>Bye, see you later!</h1>";
    }
}
