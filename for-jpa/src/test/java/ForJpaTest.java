import com.mjt.pojo.Student;
import com.mjt.repository.StudentRepository;
import com.mjt.service.StudentService;
import com.mjt.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/25
 */

@SpringBootTest(classes = ForJpaTest.class)
@RunWith(SpringRunner.class)
@ComponentScan(basePackages = "com.mjt")
@Slf4j
public class ForJpaTest {

    @Autowired
    StudentService studentService;

    @Test
    public void findStudentAllTest(){
        List<Student> studentList = studentService.getStudentList();
        for (Student student : studentList) {
            log.info(student.toString());
        }
    }

//    @Test
//    public void findStudentByIdTest(){
//        StudentService studentService = new StudentServiceImpl();
//        Student student = studentService.findStudentById(2);
//        System.out.println(student.toString());
//    }

}
