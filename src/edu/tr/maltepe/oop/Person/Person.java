package edu.tr.maltepe.oop.Person;

public class Person {
    public enum person_type {
        PROFESSOR,
        STUDENT
    }

    private String name = "default person name";
    private int    ID   = 0001;
    private person_type type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public person_type getType() {
        return type;
    }

    public void setType(person_type type) {
        this.type = type;
    }
}
