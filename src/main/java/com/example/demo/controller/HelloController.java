package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by user on 10/13/17.
 * ref:
 * https://www.howieli.cn/
 * http://blog.csdn.net/howieli_1995
 */




/*
    @RestController
    @RequestMapping("/hellocontroller") //类级URL映射
*/

@RestController
public class HelloController {

    /**
     * 启动应用，浏览器打开http://localhost:8080/hello，会调用该方法，打印:Hello, Spring Boot.Request:GET.
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloGet() {
        return "Hello, Spring Boot.Request:GET";
    }

    /**
     * 启动应用后，通过模拟Http软件，以post方式请求http://localhost:8080/hello，会调用该方法，打印:Hello, Spring Boot.Request:POST.
     * HTTP模拟软件推荐postman。多平台支持。
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String helloPost() {
        return "Hello, Spring Boot.Request:POST";
    }

    /*
    @GetMapping("/hello")  //等同于@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloGet() {
        return "Hello, Spring Boot.Request.GET";
    }

    @PostMapping("hello")  //等同于@RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String helloPost() {
        return "Hello, Spring Boot.Request:POST";
    }
    */

    @RequestMapping(value = {"/twourl1", "/twourl2"}, method = RequestMethod.GET)
    public String twourl() {
        return "Hello, Spring Boot. twourl1/twour2";
    }



    /**
     * http://localhost:8080/say/5?name=howieli
     * 在URL映射的注解中，我们可以看到URL中被大括号括起来的id，这就代表我们要传递的数据
     * 在helloGet方法传入参数时使用@PathVariable注解，表示将URL中的id所代表的数据作为参数传入方法中
     * name这个参数，是通过参数的方式传入，此时可以使用@RequestParam注解，其实在这里注解可以省略不写，因为我们变量名是一样的
     * 比如我们参数是?name=howieli中的name与方法参数name是相同的，就可以省略注解。
     * @param id
     * @return
     */
    @GetMapping(value = "/say/{id}")
    public String helloGet(@PathVariable("id") int id, @RequestParam("name") String name) {
        return "id: " +  id + ",name:" + name;
    }




}