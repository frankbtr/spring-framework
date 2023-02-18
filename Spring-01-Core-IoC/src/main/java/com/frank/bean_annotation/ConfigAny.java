package com.frank.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {

    @Bean
    String str(){
        return "Developer";
    }

    @Bean
    int number(){
        return 100;
    }
}
