package com.company;

public class Main {

    public static void main(String[] args) {
        Classes jss1 = new Classes("Science", 50);
        Course course1 = new Course("Maths", "mth 101");
        Course course2 = new Course("English", "eng 101");
        Course course3 = new Course("Chemistry", "chm 101");
        Applicant applicant1 = new Applicant("Godday", "Okoduwa", 18, jss1, 2);

        Teacher teacher1 = new Teacher("Chike", "Obi", course1, jss1);

//
//	    student1.registerCourses(course1);
//        student1.registerCourses(course2);
 //       student1.registerCourses(course3);
//        student1.viewInfo();
        System.out.println();
        teacher1.viewInfo();
        System.out.println();
        Principal principal1 = Principal.makePrincipal("Emeka", "Okete");
        principal1.viewInfo();

        School school1 = new School("Decagon Institue", "Software Engineering Training", "private");
        school1.addApplicant(applicant1);
        school1.addClasses(jss1);
        school1.addCourses(course1);
        school1.addCourses(course2);
        school1.addCourses(course3);
        school1.addStaffs(principal1);

    //    principal1.admitApplicant();
        school1.addStaffs(teacher1);
        school1.viewApplicants();
        System.out.println();
        school1.viewStudents();
    }
}
