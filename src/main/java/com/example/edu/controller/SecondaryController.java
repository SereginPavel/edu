package com.example.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondaryController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "test2";
    }
}
