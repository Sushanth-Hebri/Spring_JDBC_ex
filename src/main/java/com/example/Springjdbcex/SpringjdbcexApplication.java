package com.example.Springjdbcex;

import com.example.Springjdbcex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringjdbcexApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringjdbcexApplication.class, args);
		//creating a bean/object of Student that is 's' then assigning values to it
		Student s = context.getBean(Student.class);
		s.setRollno(227);
		s.setName("Sushanth");
		s.setMarks(90);

	}

}
