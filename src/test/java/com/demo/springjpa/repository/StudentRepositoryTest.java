package com.demo.springjpa.repository;

import com.demo.springjpa.entity.Guardian;
import com.demo.springjpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("mosesa@gmail.co.ke")
                .firstName("moses")
                .lastName("oketch")
               // .guardianName("james")
               // .guardianEmail("james@gmail.co.ke")
               // .guardianMobile("073387987")
                .build();
        studentRepository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
    }
    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("guardian@gmail.co.ke")
                .name("john")
                .mobile("0568878")
                .build();

        Student student = Student.builder()
                .emailId("ken@gmail.co.ke")
                .firstName("ken")
                .lastName("oketch")
                .guardian(guardian)
                .build();
        studentRepository.save(student);

    }

}