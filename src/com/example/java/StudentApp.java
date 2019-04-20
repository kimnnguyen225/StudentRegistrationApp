package com.example.java;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        /** This application allows a student to enter registration information. The application
            should display a completion message that includes the user's full name and a temporary password */
        // welcome message
        System.out.println("Student Registration Form");
        System.out.println();

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // get data from student
        System.out.println("Enter first name: ");
        String firstName = sc.next();

        System.out.println("Enter last name: ");
        String lastName = sc.next();

        System.out.println("Enter year of birth: ");
        int birthYear = sc.nextInt();

        // create full name and temp password
        String name = firstName + " " + lastName;
        String password = firstName + "*" + birthYear;

        // display the result
        System.out.println();
        System.out.println("Welcome " + name + "!");
        System.out.println("Your registration is complete.");
        System.out.println("Your temporary password is: " + password);
    }

}
