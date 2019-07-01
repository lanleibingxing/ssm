package com.wg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wg.pojo.Student;
import com.wg.service.StudentService;

@Controller
public class StudentController {
    @Autowired
    public StudentService studentService;

    @RequestMapping("/test/register.do")
    public String register(Student student) {
        System.out.println("public String register(Student student)");
        studentService.studentRegister(student);
        return "success";

    }

}