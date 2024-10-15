package com.yshs.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HiController {
    @GetMapping("/hi")
    public String sayHi() {
        return "Hi, Spring Boot2!";
    }

    @RequestMapping("/hi2")
    public String sayHi2(String name, Integer age) {
        if (name != null && age != null) {
            return "Hi, Spring Boot2!";
        }
        return "Hi, Spring Boot2!";
    }

    @RequestMapping("/hi3")
    public void sayHi3() {
        log.info("Hi, Spring Boot2!");
    }
}
