package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index2")
    public String index2() {
        return "index2";
    }

    /*
    @RequestMapping("/")
    public String hello(){
        return "hello Springboot";
    }
    */

}