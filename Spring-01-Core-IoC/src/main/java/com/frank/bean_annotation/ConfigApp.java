package com.frank.bean_annotation;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }
}
