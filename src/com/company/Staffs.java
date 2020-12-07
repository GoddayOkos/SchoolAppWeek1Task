package com.company;

public class Staffs {
    // Staffs fields
    String firstName;
    String lastName;

    public Staffs(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void role() {
        System.out.println("My name is " + this.firstName +" "+ this.lastName +", I'm a staff in this school.");
    }

}
