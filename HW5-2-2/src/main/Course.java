package main;

public class Course {
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof;
	public Student[] students;
	//@Invariant exam != null
	public Exam[] exam;
	
	
	public void course(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		this.prof = prof;
		
		
	}
	public void enroll(Student student) {
		
	}
	
	public void apply (TA ta) {
		
	}
	public Professor get_Prof() {
		return this.prof;
	}
	
	public void setTA(TA ta) {
		
	}
}
