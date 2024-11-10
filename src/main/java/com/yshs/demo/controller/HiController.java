package com.yshs.demo.controller;

import com.yshs.demo.entity.St;
import com.yshs.demo.entity.TestEntity;
import com.yshs.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    private St st;

    @Autowired
    private TestEntity testEntity;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }

    @RequestMapping("/test")
    public void test() {
        st.test();
    }

    private void test(int foo, int bar) {
        System.out.println("test");
    }
}
