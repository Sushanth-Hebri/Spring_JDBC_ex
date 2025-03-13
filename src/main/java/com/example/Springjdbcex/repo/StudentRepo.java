package com.example.Springjdbcex.repo;

import com.example.Springjdbcex.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo{

    public void save(Student s) {
        System.out.println("Added (inside repo)");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}