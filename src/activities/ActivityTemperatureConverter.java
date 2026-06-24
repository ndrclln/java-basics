package activities;

import java.util.Scanner;
public class ActivityTemperatureConverter {
    public static void main(String[] args){
        // TEMPERATURE CONVERTER
        // °C = (°F - 32) * 5/9
        // °F = (°C * 9/5 ) +32

        Scanner scanner = new Scanner(System.in);

        // if statement
        /*
        int choice;
        double fah;
        double cel;

        System.out.println("WELCOME TO TEMPERATURE CONVERTER");
        System.out.println("1 : Fahrenheit (°F) to Celsius (°C)");
        System.out.println("2 : Celsius (°C) to Fahrenheit (°F)");
        System.out.print("Enter your Choice: ");
        choice = scanner.nextInt();



        if (choice == 1){
            System.out.println("\nYou are converting Fahrenheit (°F) to Celsius (°C).");
            System.out.print("Enter Fahrenheit (°F): ");
            fah = scanner.nextDouble();

            cel = (fah - 32 ) * 5/9;

            System.out.printf("\n%.2f°F in Celsius is %.2f°C", fah, cel);
        }else if(choice == 2){
            System.out.println("\nYou are converting Celsius (°C) to Fahrenheit (°F).");
            System.out.print("Enter Celsius (°C): ");
            cel = scanner.nextDouble();

            fah = (cel * 9/5 ) + 32;

            System.out.printf("\n%.2f°C in Celsius is %.2f°F", cel, fah);
        }else {
            System.out.println("\nInvalid choice!");
        }*/

        //TERNARY OPERATOR
        double temp;
        String choice;
        double newTemp;

        System.out.println("WELCOME TO TEMPERATURE CONVERTER");
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the unit to convert to (C/F): ");
        choice = scanner.nextLine().toUpperCase();

        newTemp = (choice.equals("C")) ? (temp - 32 ) * 5/9 : (temp * 9/5 ) + 32;

        System.out.printf("%.1f is equal to %.1f°%s", temp, newTemp, choice);




        scanner.close();
    }
}
