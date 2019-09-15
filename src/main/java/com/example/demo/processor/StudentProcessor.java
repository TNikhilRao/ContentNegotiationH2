
package com.example.demo.processor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.request.StudentPojo;

@Component
public class StudentProcessor {

	@Autowired
	StudentMapper mapper;

	@Autowired
	StudentRepository repo;

	public List<StudentPojo> getStudents() {
		List<Student> students = repo.findAll();
		List<StudentPojo> studentList = new ArrayList<>();

		for (Student student : students) {

			StudentPojo pojo = mapper.toStudentPojo(student);
			studentList.add(pojo);

		}
		return studentList;

	}

}
