package con.frank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        Java java = context.getBean(Java.class);
        java.getTeachingHours();
    }
}
