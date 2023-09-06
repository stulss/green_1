package com.example.demo.Controllre;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("../templates/Hong")
    public String Hong(){

        return "../templates/Hong";
    }


}
