package activities;

import java.util.Scanner;

public class ActivityWeightConverter {
    public static void main(String[] args){
        // WEIGHT CONVERTER
        // Converting lbs to kgs and vise versa

        Scanner scanner = new Scanner(System.in);
        int option;
        double lbs;
        double kgs;
        double newWeight;

        System.out.println("WELCOME TO WEIGHT CONVERTER!");
        System.out.println("1 : Convert lbs to kgs.");
        System.out.println("2 : Convert kgs to lbs.");

        System.out.print("Choose action above: ");
        option = scanner.nextInt();

        if (option == 1){
            System.out.print("\nEnter weight in lbs: ");
            lbs = scanner.nextDouble();

            newWeight = lbs * 0.4536;

            System.out.printf("\n%.2f lbs in kilogram is equal to %.2f kg", lbs, newWeight);

        }else if(option == 2){
            System.out.print("\nEnter weight in kgs: ");
            kgs = scanner.nextDouble();

            newWeight = kgs * 2.20462;

            System.out.printf("\n%.2f kgs in pound is equal to %.2f lbs", kgs, newWeight);
        }else{
            System.out.println("\nInvalid choice!");
        }



        scanner.close();
    }
}
