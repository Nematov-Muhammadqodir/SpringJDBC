package com.kevin.springbootjdbcex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kevin.springbootjdbcex.model.Student;
import com.kevin.springbootjdbcex.service.StudentService;

@SpringBootApplication
public class SpringbootjdbcexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootjdbcexApplication.class, args);

		StudentService studentService = context.getBean(StudentService.class);

		Student student1 = context.getBean(Student.class);
		student1.setMarks(58);
		student1.setName("Ortigaliyev");
		student1.setRollNum(104);

		studentService.create(student1);
		System.out.println(studentService.getAllStudents());

	}

}
