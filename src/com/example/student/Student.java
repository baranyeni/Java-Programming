package com.example.student;

public class Student {
    private String name = "default name";
    private int    ID   = 0001;

    public void get_name() {
        System.out.println(this.name);
    }

    public void get_id() {
        System.out.println(this.ID);
    }
}
