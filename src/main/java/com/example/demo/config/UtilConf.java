package com.example.demo.config;

import com.example.demo.CountString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConf {

    @Bean
    public CountString countString(){
        return new CountString();
    }

}
