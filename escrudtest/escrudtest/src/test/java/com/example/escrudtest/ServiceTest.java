package com.example.escrudtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@ActiveProfiles(value = "test")
public class ServiceTest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;


    @Test
    void checkSetWorking(){
        StudentEntity student = new StudentEntity();
        student.setWorking(true);
        student.setSurname("ncesco");
        student.setName("Fra");

        StudentEntity studentFromDb = studentRepository.save(student);
        assertThat(studentFromDb.getId()).isNotNull();

        String studentFromService = studentService.setWorking(student.getId(), false);
        assertThat(!studentFromService.isBlank());
    }
}
