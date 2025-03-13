package com.example.Springjdbcex.service;

import com.example.Springjdbcex.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService{

    public void addStudent(Student s) {
        System.out.println("Added");
    }
}