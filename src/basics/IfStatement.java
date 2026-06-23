package basics;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){
        // NOTES:
        // Codes are executed top to bottom.

        // if statements = performs a block of code if its condition is TRUE.
        // else if = executed when the if statement is false.
        // else = if the other statements are false it will be performed.

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();
        System.out.println();

        // STRING
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        // INT
        if(age >= 65){
            System.out.println("You are a senior");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("You haven't born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child!");
        }

        // BOOLEAN
        // direct value of true
        if(isStudent){
            System.out.println("You are a student!");
        }else{
            System.out.println("You are NOT a student");
        }

        scanner.close();
    }
}
