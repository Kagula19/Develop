package com.example.escrudtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    public String setWorking(Long StudentId, boolean isWorking){
        Optional<StudentEntity> Student = studentRepository.findById(StudentId);
        Student.get().setWorking(isWorking);
        return String.valueOf(studentRepository.save(Student.get()));
    }


}
