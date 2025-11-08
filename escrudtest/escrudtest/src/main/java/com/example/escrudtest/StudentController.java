package com.example.escrudtest;


import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;




    @PostMapping("/student")
    public @ResponseBody StudentEntity NewStudent(@RequestBody StudentEntity student){
        return studentRepository.save(student);
    }

    @GetMapping("/getList")
    public @ResponseBody List<StudentEntity> getList(){
        return studentRepository.findAll();
    }

    @GetMapping("/getStudent{id}")
    public @ResponseBody StudentEntity getStudent(@PathVariable Long id){
        Optional<StudentEntity> student = studentRepository.findById(id);
        if (student.isPresent()){
            return student.get();
        } else {
            return null;
        }
    }

    @PutMapping("/updateKey{id}")
    public void updateKey(@PathVariable Long id, @RequestBody @NotNull StudentEntity student){
        student.setId(id);
        studentRepository.save(student);

    }

    @PutMapping("/updateWorking{id}")
    public void updateWorking(@PathVariable Long id, @PathVariable boolean isWorking){
        studentService.setWorking(id, isWorking);
    }

    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable Long id){
        studentRepository.deleteById(id);
    }


}
