package com.company;

import java.util.ArrayList;

public class Principal extends Staffs{
    private static Principal instanceCount = null;

    // private constructor for principal
    private Principal(String firstName, String lastName) {
        super(firstName, lastName);
    }

    // method to create only one instance of principal because a school can only have one principal at a time.
    public static Principal makePrincipal(String firstName, String lastName) {
        if (instanceCount == null) {
            instanceCount = new Principal(firstName, lastName);
            return instanceCount;
        } else {
            System.out.println("ILLEGAL OPERATION! PRINCIPAL ALREADY EXIST!");
            return null;
        }
    }

    // display principal information.
    public void viewInfo() {
        System.out.println("Name: " + this.firstName + " " + this.lastName + "\nRole: " + this.getClass().getSimpleName());
    }

 //   private ArrayList<Applicant> myApplicants = School.getApplicant();


//    public void admitApplicant() {
//        for (Applicant temp: myApplicants) {
//            Student student1 = Student.createStudent(temp);
//            School.getAddStudents(student1);
//        }
//    }

}
