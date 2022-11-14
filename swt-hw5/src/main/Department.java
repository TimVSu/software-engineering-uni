package main;

public class Department {
    public String name;
    public Employee[] employee;
    // @Invariant chair != null
    public Professor chair;
    public Course[] courses;

    public Department(String name, Employee[] employee, Professor chair, Course[] courses) {
        this.name = name;
        this.employee = employee;
        this.chair = chair;
        this.courses = courses;
    }
}

