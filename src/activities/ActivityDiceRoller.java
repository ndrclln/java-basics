package activities;

import java.util.Random;
import java.util.Scanner;

public class ActivityDiceRoller {
    public static void main(String[] args){

        // JAVA ROLLER PROGRAM

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int sum = 0;

        // GET # OF DICE FROM THE USER
        System.out.println("Welcome to dice roller!");
        System.out.print("Enter number of dice to roll: ");
        numOfDice = scanner.nextInt();

        // CHECK IF NUMBER OF DICE > 0
        if(numOfDice > 0){
            // ROLL ALL THE DICE
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You roll: " + roll);

                // GET THE SUM
                sum += roll;
            }

            System.out.println("The sum is: " + sum);
        }else {
            System.out.println("Number of dice must be greater than 0");
        }





        scanner.close();
    }
    // DISPLAY ASCII OF DICE

    static void printDie(int roll){

        String dice1 = """
                   -------
                  |       |
                  |   ●   |
                  |       |
                   -------
                  """;

        String dice2 = """
                   -------
                  | ●     |
                  |       |
                  |     ● |
                   -------
                  """;
        String dice3 = """
                   -------
                  | ●     |
                  |   ●   |
                  |     ● |
                   -------
                  """;
        String dice4 = """
                   -------
                  | ●   ● |
                  |       |
                  | ●   ● |
                   -------
                  """;
        String dice5 = """
                   -------
                  | ●   ● |
                  |   ●   |
                  | ●   ● |
                   -------
                  """;
        String dice6 = """
                   -------
                  | ●   ● |
                  | ●   ● |
                  | ●   ● |
                   -------
                  """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid input");
        }
    }

}

