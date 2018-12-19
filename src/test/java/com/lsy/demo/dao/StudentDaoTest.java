package com.lsy.demo.dao;

import com.lsy.demo.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class StudentDaoTest extends BaseDaoTest{

    @Autowired
    private StudentDao studentDao;
    @Test
    public void getStudent() {
        Student student = new Student();
        student.setName("jack");
        Student result = studentDao.getStudent(student);
        System.out.println(result);
    }
}