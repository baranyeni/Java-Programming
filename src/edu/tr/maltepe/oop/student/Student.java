package edu.tr.maltepe.oop.student;

import edu.tr.maltepe.oop.Person.Person;

public class Student extends Person {
    private double GPA;
    private String dept;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void talk(String s) {
        System.out.println("Student says: " + s);
    }
}
