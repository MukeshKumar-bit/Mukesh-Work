package com.testspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testspring.bean.Student;

@RestController
public class TestController {
	// This is a test controller for the Test Spring boot application
	
	//simple get mapping to test the application
	
	@GetMapping("/test")
	public String test() {
		return "Test spring boot application is running sucessfuly";	
	
	}
	@GetMapping("/students")
	public List<Student> getAllStudents(){
	List<Student> student=new ArrayList<Student>();
	student.add(new Student(1,"mukesh","Kumar"));
	return student;
	}
	

}
