package com.mjt.controller;

import com.mjt.pojo.Student;
import com.mjt.service.StudentService;
import com.mjt.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/25
 */
@RestController
@RequestMapping("/forStudent")
@Slf4j
public class ForStudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/selectAllStudent")
    public String selectAllStudent(){
        List<Student> studentList = studentService.getStudentList();
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        return studentList.toString();
    }

}
