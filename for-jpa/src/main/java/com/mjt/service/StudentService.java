package com.mjt.service;

import com.mjt.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/25
 */
@Service
public interface StudentService {

//    public Student findStudentById(long id);

    public List<Student> getStudentList();
}
