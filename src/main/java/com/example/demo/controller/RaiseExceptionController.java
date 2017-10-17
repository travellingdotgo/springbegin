package com.example.demo.controller;


import com.example.demo.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RaiseExceptionController {
    @RequestMapping("/raiseexception")
    public String json() throws MyException {
        throw new MyException("故意抛出的异常");
    }
}