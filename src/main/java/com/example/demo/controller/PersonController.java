package com.example.demo.controller;


import com.example.demo.domain.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
@RequestMapping("/person")
*/

@RequestMapping("/")
@Controller
public class PersonController {

    /*
    @RequestMapping("")
    */
    @RequestMapping("personindex")
    public String index(Model model) {
        List<Person> people = new ArrayList<>();

        Person boy = new Person();
        boy.setId(1001);
        boy.setName("weber");
        boy.setSexy("男");

        Person girl = new Person();
        girl.setId(1002);
        girl.setName("Alice");
        girl.setSexy("女");

        people.add(boy);
        people.add(girl);
        model.addAttribute("people", people);
        return "index";
    }
}
