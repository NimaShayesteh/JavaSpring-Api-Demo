package com.example.demo.domain.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class student {
    @Id
    @SequenceGenerator(
            name = "student_Sequence",
            sequenceName = "student_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_Sequence"
    )
    private Integer age;
    private Long id;
    private String Name;
    private String Fam;
    private LocalDate dob;


    public student() {
    }

    public student(Integer age, Long id, String name, String fam, LocalDate dob) {
        this.age = age;
        this.id = id;
        Name = name;
        Fam = fam;
        this.dob = dob;
    }

    public student(Integer age, String name, String fam, LocalDate dob) {
        this.age = age;
        Name = name;
        Fam = fam;
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFam() {
        return Fam;
    }

    public void setFam(String fam) {
        Fam = fam;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", id=" + id +
                ", Name='" + Name + '\'' +
                ", Fam='" + Fam + '\'' +
                ", dob=" + dob +
                '}';
    }
}
