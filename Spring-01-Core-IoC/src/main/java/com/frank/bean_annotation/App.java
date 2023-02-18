package com.frank.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        // I create a container, let me go to the container and let bean create a Full time mentor to me
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        // Implement configAny
        String str = container.getBean(String.class);
        System.out.println(str);

    }
}
