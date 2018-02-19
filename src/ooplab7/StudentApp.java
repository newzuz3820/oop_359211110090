package ooplab7;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //create object as Student
        Student s1 = new Student();
        s1.setId("111111111111");
        s1.setname("Boy Saiyai");
        s1.setmajor("Information System");
        s1.setgroup("IS221");


        Student s2 = new Student("222222222222","Girl Saiyai","Maketing","MK221");

        showData(s1);
        showData(s2);

        Student s3 = new Student();
        //      s3 = inputData(s3);

        //     showData(s3);
        // test
        //   System.out.println(Student.faculty);
        System.out.println(Student.faculty);
    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student info:");
        System.out.print("Enter student ID:");
        s.setId(scanner.nextLine());
        System.out.print("Enter student name:");
        s.setname(scanner.nextLine());
        System.out.print("Enter student major:");
        s.setmajor(scanner.nextLine());
        System.out.print("Enter student group");
        s.setgroup(scanner.nextLine());

        return s;


    }

    private static void showData(Student s1) {
        System.out.println("Student info: ");
        System.out.println("ID: "+s1.getId());
        System.out.println("Name: "+s1.getname());
        System.out.println("Major: "+s1.getmajor());
        System.out.println("Group: "+s1.getgroup());

    }//showData
}//class


