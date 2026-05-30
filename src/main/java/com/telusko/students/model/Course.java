package com.telusko.students.model;

public class Course {
	private String courseName;
	private String trainerName;
	private String duration;
	private int fee;
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", trainerName=" + trainerName + ", duration=" + duration + ", fee="
				+ fee + "]";
	}
	public Course(String courseName, String trainerName, String duration, int fee) {
		super();
		this.courseName = courseName;
		this.trainerName = trainerName;
		this.duration = duration;
		this.fee = fee;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	

}
