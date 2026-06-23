package basics;

import java.util.Scanner;
// "util" is a package & "Scanner" is a class
// used to accept user's input

// NOTES:
// Use "println" for next line and "print" for same line
// Declaring a variable to save the input
// STRING - Use "nextLine" to accept spaces and "next" for first word
// INT - use "nextInt"
// Double - use "nextDouble"
// Boolean - use "nextBoolean"

// COMMON ISSUES
// If you accept string after an int it will accept "enter" as a string.
// To avoid that use "scanner.nextLine()" but DON'T assign to anything.

public class UserInput {
    public static void main(String[] args){
    //  Class   ObjName
        Scanner scanner = new Scanner(System.in);

        System.out.print("What year are you? (1,2,3,4) ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your dream grade in OOP? ");
        double grade = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\nHello " + name + " currently in " + year + " year.");
        System.out.println("You are " + age + " years old.");
        System.out.println("You will have " + grade + " in OOP.");
        System.out.println("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student.");
        }
        else{
            System.out.println("You are NOT enrolled as a student.");

        }
        scanner.close();
    }
}
