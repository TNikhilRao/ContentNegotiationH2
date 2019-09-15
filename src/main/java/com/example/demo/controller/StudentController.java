package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;

@Controller
public class StudentController {

	@GetMapping("/students")
	@Produces(value = "application/json")
	@Consumes(value = "application/json")
	@ResponseBody()
	public List<Student> getStudents() {

		System.out.println("FROM STUDENTS...");

		List<Student> students = new ArrayList<>();
		
		Student student = new Student();
		student.setsId(101);
		student.setsName("ABC");
		
		Student student1 = new Student();
		student1.setsId(102);
		student1.setsName("XYZ");
		
		students.add(student);
		students.add(student1);
		return students;
	}

}
