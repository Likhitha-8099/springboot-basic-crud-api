package com.telusko.students.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.students.model.Student;

@Service
public class StudentService {
	
	Student student;
	
	private List<Student> s=new ArrayList<>(Arrays.asList(
			new Student(1,"Maanvi","maanvi@gmail.com",18),
			new Student(2,"Sanju","sanju@gmail.com",17)));
			
	public List<Student> getStudents(){
		return s;
	}

    
	public Student getStudentById(int studId) {
		int index=0;
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getStudentId()==studId) {
				index=i;
			}
		}
		
		return s.get(index);
	}


	public void addStudents(Student student2) {
		s.add(student2);
		
	}


	public void updateStudents(Student student) {
		for(int i = 0; i < s.size(); i++) {
			if(s.get(i).getStudentId() == student.getStudentId()) {
				s.set(i, student);
				return;
			}
		}
	}


	public void deleteStudent(int studId) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getStudentId()==studId) {
				s.remove(i);
				return;
			}
		}
	}
			

}
