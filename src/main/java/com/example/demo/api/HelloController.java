package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping ("/name")
    public String getName() {
        return "Agnese, Elīza, Jānis, Kristers";
    }
}
