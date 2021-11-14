package main;

public class Student {
	public String name;
	public int StudentID;
	public Project[] projects;
	//@invariant courses != null
	public Course[] courses;
	public Exam[] exam;
	
	public String getName() {
		return this.name;
	}
	
	public Project[] getProjects() {
		return this.projects;
	}

}
