package com.frank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homepage(Model model){
        //model methods
        model.addAttribute("name","Frank");
        model.addAttribute("course","MVC");

        String subject = "Collection";
        model.addAttribute("subject", subject);

        int studentID = new Random().nextInt();
        model.addAttribute("id",studentID);

        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(0);
        number.add(2);
        number.add(5100);
        model.addAttribute("number", number);

        return "student/welcome";
    }

    @RequestMapping("/frank")
    public String homepage2(Model model){
        return "student/welcome";
    }
}
