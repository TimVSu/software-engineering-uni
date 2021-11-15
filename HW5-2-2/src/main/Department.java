package main;

public class Department {
	public String name;
	public Employee[] employee;
	// @Invariant chair != null
	public Professor chair;
	public Course[] courses;
	
	
	public void department(String name, Employee[] employee, Professor prof, Course[] courses) {
		this.name = name;
		this.employee =employee;
		this.chair = prof;
		this.courses = courses;
		
	}
}
	
	


