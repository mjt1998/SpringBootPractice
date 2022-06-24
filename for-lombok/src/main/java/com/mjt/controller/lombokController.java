package com.mjt.controller;

import com.mjt.pojo.Student;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/23
 */

@RestController
@RequestMapping("/lombok")
@Slf4j
public class lombokController {

    @GetMapping("/insertStudent")
    public String insertStudent(int id, String name, int age, String gender){
        // 基于 lombok 的 @Builder 注解链式构建对象
        Student student1 = Student.builder().studentId(id).name(name).age(age).gender(gender).build();

        // 基于 lombok 的 @Accessors(chain = true) 注解链式构建对象
        Student student2 = new Student().setStudentId(id).setName(name).setAge(age).setGender(gender);


        // 基于 lombok 的 @Slf4j 注解在编译成字节码时生成日志对象。
        // 这样就不用手动创建日志对象：private static final Logger log = LoggerFactory.getLogger(lombokController.class);
        log.info(student1.toString());

        return (student1.toString() + student2.toString());
    }
}
