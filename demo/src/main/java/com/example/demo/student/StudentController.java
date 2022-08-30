package com.example.demo.student;

import com.example.demo.jpa.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired ////////for dependency injection - step 1
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "hello")
    public List<student> SayHello(){
       return studentService.SayHello();
    }
}
