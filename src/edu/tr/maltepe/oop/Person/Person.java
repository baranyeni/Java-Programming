package edu.tr.maltepe.oop.Person;

public class Person {
    public enum person_type {
        PROFESSOR,
        STUDENT
    }

    public String name = "default person name";
    public int    ID   = 0001;
    public person_type type;


    public void get_name() {
        System.out.println(this.name);
    }

    public void get_id() {
        System.out.println(this.ID);
    }

    public void get_type() {
        System.out.println(this.type);
    }
}
