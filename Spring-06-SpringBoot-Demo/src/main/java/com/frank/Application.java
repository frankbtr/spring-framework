package com.frank;

import com.frank.model.Comment;
import com.frank.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.plaf.metal.MetalComboBoxUI;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");


        ApplicationContext context = SpringApplication.run(Application.class, args);

        CommentService cm = context.getBean(CommentService.class);
        cm.publishComment(comment);
    }

}
