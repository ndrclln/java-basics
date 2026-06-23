package basics;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args){
        // Nested If else Statement = are if else statement within an If else statement

        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price = 250;

        System.out.print("Are you a Student (true/false)? ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a Senior (true/false)? ");
        isSenior = scanner.nextBoolean();

        System.out.print("The ticket is ₱250\n");

        if(isStudent){
            if (isSenior){
                System.out.println("\nYou get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else {
                System.out.println("\nYou get a student discount of 10%");
                price *= 0.9;
            }

        }else{
            if (isSenior){
                System.out.println("\nYou get a senior discount of 20%");
                price *= 0.8;
            }
            else {
                System.out.println("\nYou don't get a discount");
                price *= 1;
            }

        }

        System.out.printf("\nThe price of a ticket is: ₱%.2f",price);


        scanner.close();
    }

}

