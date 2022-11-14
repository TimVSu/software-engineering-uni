package main;

public class Exam {
    public int max_Value;
    public Course course;
    //@invariant questions != null
    public Question[] questions;
    public Student[] student;

    public Student[] getRegisteredStudents() {
        return this.student;
    }

    public void setMaxvalue(int max) {
        this.max_Value = max;
    }
}
