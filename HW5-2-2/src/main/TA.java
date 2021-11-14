package main;

public class TA extends Student{
	// @Invariant courses != null
	public Course[] courses; 
	public Student[] students;
	public Exam[] exam;
	
	public Course[] getCourses() {
		return this.courses;
	}
	
	public void SetName(String name) {
		this.name = name;
		
	}
}
