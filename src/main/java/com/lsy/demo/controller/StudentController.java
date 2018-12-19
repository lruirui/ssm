package com.lsy.demo.controller;

import com.lsy.demo.common.Response;
import com.lsy.demo.dao.StudentDao;
import com.lsy.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lsy
 * @create 2018-12-19 21:16
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentDao dao;

    @ResponseBody
    @RequestMapping("/getStudent/{name}")
    public Student getStudent(@PathVariable String name) throws Exception {
        if(name.equals("jack")) {
            throw new Exception();
        }
        Student student = new Student();
        student.setName(name);
        return dao.getStudent(student);
    }
}
