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

import com.telusko.students.model.Course;
import com.telusko.students.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService cservice;
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return cservice.getCourses();
	}
	
	@GetMapping("/courses/{courseName}")
   public Course getCourseByName(@PathVariable String courseName) {
	    return cservice.getCourseByName(courseName);
   }
	@PostMapping("/courses")
   public void addCourse(@RequestBody Course course) {
	   cservice.addCourse(course);
   }
	
	@PutMapping("/courses")
	public void updateCourse(@RequestBody Course course) {
		cservice.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseName}")
	public void deleteCourse(@PathVariable String courseName) {
		cservice.deleteCourse(courseName);
	}
	
	

}
