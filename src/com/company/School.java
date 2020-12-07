package com.company;

import java.util.ArrayList;

public class School {
    private String name;
    private String description;  //
    private String schoolType;   // public or private
    private ArrayList<Student> schoolStudents;
    private ArrayList<Staffs> schoolStaffs;
    private ArrayList<Course> coursesOffered;
    private ArrayList<Classes> availableClasses;
    private ArrayList<Applicant> applicants;

    public School(String name, String description, String schoolType) {
        this.name = name;
        this.description = description;
        this.schoolType = schoolType;
        this.applicants = new ArrayList<>();
        this.availableClasses = new ArrayList<>();
        this.coursesOffered = new ArrayList<>();
        this.schoolStudents = new ArrayList<>();
        this.schoolStaffs = new ArrayList<>();
    }
     private void addStudents(Student newStudents) {
        schoolStudents.add(newStudents);
    }

    public void addStaffs(Staffs newStaffs) {
        schoolStaffs.add(newStaffs);
    }

    public void addCourses(Course newCourses) {
        coursesOffered.add(newCourses);
    }

    public void addClasses(Classes newClasses) {
        availableClasses.add(newClasses);
    }

    public void addApplicant(Applicant newApplicants) {
        applicants.add(newApplicants);
    }

    //to use by principal for admitting students

//    public static void getAddStudents(Student newStudent) {
//        School.addStudents(newStudent);
//    }

    public void viewApplicants() {
        for (Applicant temp : applicants) {
//            System.out.println("Name: "+ temp.getFirstName() +" "+ temp.getLastName());
//            System.out.println("Applicant ID: " );
            temp.details();
        }
    }

    public void viewStudents() {
        for (Student temp : schoolStudents) {
            temp.viewInfo();
        }
    }

//    public static ArrayList<Applicant> getApplicant() {
//        return applicants;
//    }


}
