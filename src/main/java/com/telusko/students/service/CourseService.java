package com.telusko.students.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.students.model.Course;

@Service
public class CourseService {
	

	
	private List<Course> c=new ArrayList<>(Arrays.asList(
			new Course("Java Spring Boot","Naveen","45 days",5000),
			new Course("React JS","Kiran","30 Days", 4000),
			new Course("MySQL", "Priya", "20 Days",3000)
			));
	



	public List<Course> getCourses() {
		return c;
		
	}

    public Course getCourseByName(String courseName) {
    	for(int i=0;i<c.size();i++) {
    		if(c.get(i).getCourseName().equalsIgnoreCase(courseName)) {
    			return c.get(i);
    		}
    		
    	}
    	return null;
    }

	public void addCourse(Course course) {
		c.add(course);
		
	}

	public void updateCourse(Course course2) {
		for(int i=0;i<c.size();i++) {
			if(c.get(i).getCourseName().equalsIgnoreCase(course2.getCourseName())) {
				c.set(i,course2);
				return ;
			}
		}
		
	}

	public void deleteCourse(String courseName) {
		for(int i=0;i<c.size();i++) {
			if(c.get(i).getCourseName().equalsIgnoreCase(courseName)) {
				c.remove(i);
				return;
			}
		}
	}


	
	

}
