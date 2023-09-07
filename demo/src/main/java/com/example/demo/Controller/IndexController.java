package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/songhanol.html")
    public String Songhanol()
    {
        return "songhanol.html";
    }
    @GetMapping("/Hong.html")
    public String Hong()
    {
        return "Hong.html";
    }
    @GetMapping("/psj.html")
    public String Psj()
    {
        return "psj.html";
    }
    @GetMapping("/bjh.html")
    public String Bjh()
    {
        return "bjh.html";
    }
}

