package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class HelloHello implements CommandLineRunner {


    private NameSurname nameSurname;
    private final PhoneNumber phoneNumber;
    private final CountString countString;

    public HelloHello(PhoneNumber phoneNumber, CountString countString) {
        this.phoneNumber = phoneNumber;
        this.countString = countString;
    }

    @Autowired
    public void setNameSurname(NameSurname nameSurname) {
        this.nameSurname = nameSurname;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is the real HELLO! " +
                nameSurname.run(" ") +
                phoneNumber.run(" "));

        System.out.println(countString.garums("Not an easy exercise but somehow works fine."));
    }
}
