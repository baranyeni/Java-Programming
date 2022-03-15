package edu.tr.maltepe.oop.professor;
import edu.tr.maltepe.oop.Person.Person;

public class prof extends Person {
    private String lecture_name;

    public String getLecture_name() {
        return lecture_name;
    }

    public void setLecture_name(String lecture_name) {
        this.lecture_name = lecture_name;
    }

    public void write(String s) {
        System.out.println("Professor writes: " + s);
    }
}
