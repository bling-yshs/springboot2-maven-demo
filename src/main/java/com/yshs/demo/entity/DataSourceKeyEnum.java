package com.yshs.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 数据源键枚举类
 * 用于定义听课证所需的各种数据字段
 */
@Getter
@AllArgsConstructor
public enum DataSourceKeyEnum {
    /**
     * 姓名字段
     */
    NAME("name"),
    /**
     * 身份证号字段
     */
    ID_CARD("idCard"),
    /**
     * 学号字段
     */
    STUDENT_NO("studentNo"),
    /**
     * 照片字段
     */
    PHOTO("photo");
    /**
     * 字段键值
     */
    private final String key;

}
