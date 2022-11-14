package main;

public class Project {
    public String name ;
    //@invariant members != null
    public Student[] members;
    public Course course;
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
}
