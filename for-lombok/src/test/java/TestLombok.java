import com.mjt.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/23
 */

@Slf4j
public class TestLombok {


    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1).setName("彭涛").setAge(22).setGender("男");
        log.info(student.toString());
    }
}
