package com.yshs.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @GetMapping("/hi")
    public String sayHi() {
        return "Hi, Spring Boot233!";
    }

    @RequestMapping("/hi2")
    public String sayHi2() {
        return "Hi, Spring Boot2!";
    }

    @RequestMapping("/hi3")
    public String sayHi3() {
        return "Hi, Spring Boot2!";
    }
    @RequestMapping("/hi4")
    public String sayHi4() {
        return "Hi, Spring Boot2!";
    }
}
