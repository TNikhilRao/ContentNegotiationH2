package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.request.StudentPojo;

@Component
public class StudentMapper {

	ModelMapper toEntity = new ModelMapper();

	ModelMapper fromEntity = new ModelMapper();

	public Student toStudentEntity(StudentPojo studentPojo) {
		Student student = toEntity.map(studentPojo, Student.class);
		return student;
	}

	public StudentPojo toStudentPojo(Student student) {

		StudentPojo pojo = fromEntity.map(student, StudentPojo.class);
		return pojo;

	}

}
