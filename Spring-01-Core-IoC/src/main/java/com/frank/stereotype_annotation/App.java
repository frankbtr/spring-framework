package com.frank.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);
        context.getBean(JavaClass.class).getTeachingHours();
        context.getBean(Agile.class).getTeachingHours();
        //context.getBean(Selenium.class).getTeachingHours(); //We did not put @Component on Selenium class
    }
}
