package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class Test {

    @RequestMapping("/hello")
    public String  helloword(){
            System.out.println("helloword");
            return  "index";
    }
}
