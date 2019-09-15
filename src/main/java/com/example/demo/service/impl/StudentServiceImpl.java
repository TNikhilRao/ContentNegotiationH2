package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.processor.StudentProcessor;
import com.example.demo.request.StudentPojo;
import com.example.demo.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentProcessor processor;

	@Override
	public List<StudentPojo> getStudents() {

		return processor.getStudents();

	}

}
