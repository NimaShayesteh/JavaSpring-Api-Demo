package com.example.demo.student;

import com.example.demo.jpa.entity.student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service ////set for dependency injection - step 2
public class StudentService {
    public List<student> SayHello() {
        return List.of(
                new student(10, 1L, "Nima", "fam", LocalDate.of(1994, Month.APRIL, 5))
        );
    }
}
