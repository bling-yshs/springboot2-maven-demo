package com.yshs.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yshs.demo.entity.Student;
import com.yshs.demo.mapper.StudentMapper;
import com.yshs.demo.service.StudentService;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService{

}
