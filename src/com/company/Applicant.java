package com.company;

public class Applicant {
    // applicant fields
    private String firstName;
    private String lastName;
    private String applicantID;
    private int age;
    private Classes classes;
    private int year;

    // applicant constructor
    public Applicant(String firstName, String lastName, int age, Classes classes, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.classes = classes;
        this.year = year;
        generateApplicantID();
    }

    // getters for applicant fields

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getApplicantID() {
        return applicantID;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public Classes getClasses() {
        return classes;
    }

    // private method to generate a random 6 digits ID for applicants starting with applicant's year of study.

    private void generateApplicantID() {
        int i = (int)((Math.random() + 1) * 10000);
        this.applicantID = Integer.toString(year) + i;
    }
    // method display applicant details
    public void details() {
        System.out.println("Name: "+ this.firstName +" "+ this.lastName +"\nStudent ID: "+ this.applicantID +
                "\nAge: "+ this.age +"\nClass Applied to: "+ this.classes.getName() +"\nYear of Study: "+
                this.year);
    }

}
