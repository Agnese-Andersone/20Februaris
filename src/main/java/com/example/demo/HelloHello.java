package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class HelloHello implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is the real HELLO!");
    }
}
