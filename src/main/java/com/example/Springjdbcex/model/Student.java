package com.example.Springjdbcex.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //@Component → Tells Spring "Hey, manage this class as a bean!"
@Scope("prototype") //@Scope("prototype") → Ensures a new object is created every time it is needed. Without @Scope("prototype"), Spring would reuse the same object everywhere instead of creating a new one each time.
public class Student{
    private int rollno;
    private String name;
    private int marks;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}