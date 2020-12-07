package com.company;

import java.util.ArrayList;

public class Teacher extends Staffs {
    // Teacher fields
    ArrayList<Course> myCourses;
    ArrayList<Classes> myClasses;

    // constructor for teacher
    public Teacher(String firstName, String lastName, Course course, Classes classes) {
        super(firstName, lastName);
        this.myClasses = new ArrayList<>();
        this.myCourses = new ArrayList<>();
        addClasses(classes);
        addCourses(course);
    }
    // methods for teacher

    public void addCourses(Course extraCourse) {
        myCourses.add(extraCourse);
    }

    public void addClasses(Classes extraClass) {
        myClasses.add(extraClass);
    }

    public void teach() {
        System.out.println("Don't disturb me, I'm teaching my students in the classroom.");
    }

    public void viewInfo() {
        System.out.println("Name: " + this.firstName +" "+ this.lastName +"\nRole: "+ this.getClass().getSimpleName() +
                "\nClasses: ");
        viewClasses();
        System.out.println("Courses: ");
        viewCourses();
    }

    private void viewCourses() {
        for (Course temp : myCourses) {
            System.out.println("\t" + temp.getCourseCode() + " ==> " + temp.getCourseName());
        }
    }

    private void viewClasses() {
        for (Classes temp : myClasses) {
            System.out.println("\t" + temp.getName());
        }
    }

    @Override
    public void role() {
        System.out.println("I'm a teacher in this school, my role is to teach and mentor students.");
    }
}
