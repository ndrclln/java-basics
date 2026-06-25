package activities;

import java.util.Scanner;
import java.util.Random;

public class ActivityNumberGuessingGame {
    public static void main(String[] args){
            // Number guessing game using random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int min = 1;
        int max = 10;
        int randomNumber = random.nextInt(min, max + 1);
        int attempt = 0;

        System.out.println("Welcome to RANDOM GUESSING GAME!");
        System.out.printf("Guess a number from %d-%d\n", min, max);

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempt++;

            if(guess > max){
                System.out.println("You input beyond the maximum number!");
            }else if (guess < min){
                System.out.println("You input beyond the minimum number!");
            }else{
                if(guess > randomNumber){
                    System.out.println("Your guess is higher!");
                }else if(guess < randomNumber){
                    System.out.println("Your guess is lower!");
                }else {
                    System.out.printf("\nYou guess RIGHT! The random number is %d!\n", randomNumber);
                    System.out.printf("You take %d attempts to guess.", attempt);
                }
            }
        }while (guess != randomNumber);



        scanner.close();
    }
}
