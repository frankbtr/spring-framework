package com.frank.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        // I create a container, let me go to the container and let bean create a Full time mentor to me
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        //PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);
        PartTimeMentor pt_primary = container.getBean(PartTimeMentor.class);
        pt_primary.createAccount();

        //PartTimeMentor pt2 = container.getBean("p2",PartTimeMentor.class);
        //pt2.createAccount();

        // Implement configAny
        String str = container.getBean(String.class);
        System.out.println(str);

    }
}
