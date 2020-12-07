package com.company;

public class NonAcademicStaffs extends Staffs{
    String post;
    public NonAcademicStaffs(String firstName, String lastName, String post) {
        super(firstName, lastName);
        this.post = post;
    }

    @Override
    public void role() {
        System.out.println("My name is "+ this.firstName +" "+ this.lastName +", I'm the "+ this.post +
                " of this school");
    }
}
