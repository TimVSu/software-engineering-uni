package main;

public class Employee {
    public String name;
    public int eld;
    public int salary;
    public void employee(String name, int eld, int salary) {
        this.name = name;
        this.eld = eld;
        this.salary = salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return this.salary;
    }
}
