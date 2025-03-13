package com.example.Springjdbcex.service;

import com.example.Springjdbcex.model.Student;
import com.example.Springjdbcex.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService{

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
@Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
       repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}