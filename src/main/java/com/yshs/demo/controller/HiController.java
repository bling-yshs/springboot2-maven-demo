package com.yshs.demo.controller;

import com.yshs.demo.entity.Student;
import com.yshs.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class HiController {

    private final StudentService studentService;

    @RequestMapping("/test")
    @SneakyThrows
    public void test() {
        Student student = new Student();
        student.setName("yshs");
        student.setAge(18);
        studentService.save(student);
        List<Student> list = studentService.list();
        log.info("※list的值为: {}", list);
    }

    @RequestMapping("/test2")
    @SneakyThrows
    public void test2() {
    }
}
