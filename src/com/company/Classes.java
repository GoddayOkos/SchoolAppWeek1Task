package com.company;

import java.util.ArrayList;

public class Classes {
    // class fields
    private String name;
    private int capacity;
    private ArrayList<Student> admittedStudents;

    // class constructor
    public Classes(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.admittedStudents = new ArrayList<Student>();
    }

    //getter for class name
    public String getName() {
        return name;
    }

    private void addStudents(Student students) {
        admittedStudents.add(students);
    }
}
