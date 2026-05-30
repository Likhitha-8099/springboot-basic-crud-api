package com.telusko.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.students.model.Student;
import com.telusko.students.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/students")
	public List<Student> allStudents(){
		return service.getStudents();
		
	}
	
	@GetMapping("/students/{studId}")
	public Student getStudentById(@PathVariable int studId) {
		return service.getStudentById(studId);
	}
	
	@PostMapping("/students")
	public void addStudents(@RequestBody Student student) {
		service.addStudents(student);
	}
	
	@PutMapping("/students")
	public void updateStudent(@RequestBody Student student) {
		service.updateStudents(student);
	}
	
	
	@DeleteMapping("/students/{studId}")
	public void deleteStudent(@PathVariable int studId) {
		service.deleteStudent(studId);
	}

}
