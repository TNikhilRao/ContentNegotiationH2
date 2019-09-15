package com.example.demo.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.request.StudentPojo;
import com.example.demo.service.IStudentService;

@Controller
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@GetMapping("/students")
	@Produces(value = "application/json")
	@Consumes(value = "application/json")
	@ResponseBody()
	public List<StudentPojo> getStudents() {

		List<StudentPojo> students = studentService.getStudents();

		return students;
	}

}
