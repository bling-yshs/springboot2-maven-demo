package com.yshs.demo.entity;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class TestEntity {

    private static class InnerClass {
        private String a;
        private Student student;
    }

    @SneakyThrows
    public String test(String a) {
        //DataSourceKeyEnum name = DataSourceKeyEnum.valueOf("name");
        //System.out.println(name);
        DataSourceKeyEnum idCard = DataSourceKeyEnum.valueOf("NAME2");
        System.out.println(idCard);
        //InnerClass innerClass = new InnerClass();
        //innerClass.a = a;
        //Thread.sleep(2000);
        //
        //return innerClass.a;

        return "";
    }
}
