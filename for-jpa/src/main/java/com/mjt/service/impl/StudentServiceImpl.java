package com.mjt.service.impl;

import com.mjt.pojo.Student;
import com.mjt.repository.StudentRepository;
import com.mjt.service.StudentService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/25
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    // 注入对象
    @Autowired(required = false)
    private StudentRepository studentRepository;

//    @Override
//    public Student findStudentById(long id) {
//        log.info("根据编号查询指定学生信息！");
//        return studentRepository.findById(id);
//    }

    @Override
    public List<Student> getStudentList() {
        log.info("获取全部学生信息！");
        return studentRepository.findAll();
    }

}
