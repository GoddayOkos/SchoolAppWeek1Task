package com.company;

public class Course {
    // course fields
    private String courseName;
    private String courseCode;

    // course constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName.toUpperCase();
        this.courseCode = courseCode.toUpperCase();
    }

    // getters for course fields
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
