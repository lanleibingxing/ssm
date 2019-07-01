package com.wg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wg.mapper.StudentMapper;
import com.wg.pojo.Student;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentMapper studentMapper;

    @Override
    public void studentRegister(Student student) {
        // TODO Auto-generated method stub
        studentMapper.studentRegister(student);
    }

}