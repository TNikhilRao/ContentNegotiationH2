package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.request.StudentPojo;

@Service(value = "studentService")
public interface IStudentService {

	/**
	 * @return
	 */
	List<StudentPojo> getStudents(); 
	
}
