package com.company;

import java.util.ArrayList;

public class Student {
    // student fields
    private final String firstName;
    private final String lastName;
    private final String studentID;
    private final int age;
    private final Classes classes;
    private final int year;
    private final ArrayList<Course> myCourses;

    // private constructor for students. New students cannot be created directly, they must come from the pool of
    // applicants and can only be admitted by the principal of the school.

    private Student(Applicant applicant) {
        this.firstName = applicant.getFirstName();
        this.lastName = applicant.getLastName();
        this.age = applicant.getAge();
        this.studentID = applicant.getApplicantID();
        this.year = applicant.getYear();
        this.classes = applicant.getClasses();
        this.myCourses = new ArrayList<>();

    }
    // static method for creating students. Only the principal can use this method.
    static Student createStudent(Applicant applicant) {
        return new Student(applicant);
    }


    // method to display student information
    public void viewInfo() {
        System.out.println("Name: "+ this.firstName +" "+ this.lastName +"\nStudent ID: "+ this.studentID +
                "\nAge: "+ this.age +"\nClass: "+ this.classes.getName() +"\nYear of Study: "+
                this.year +"\nCourses Registered: ");
        viewCourses();
    }

    // method to register courses
    public void registerCourses(Course course) {
        this.myCourses.add(course);
    }

    // method to view registered courses
    public void viewCourses() {
        for (Course temp : myCourses) {
            System.out.println(temp.getCourseCode() + " ==> " + temp.getCourseName());
        }
    }

}
