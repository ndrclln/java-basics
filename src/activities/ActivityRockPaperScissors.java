package activities;

import java.util.Random;
import java.util.Scanner;

public class ActivityRockPaperScissors {
    public static void main (String[] args){

        // ROCK PAPER SCISSOR GAME

        // DECLARE VARIABLE
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // GET CHOICE
        do {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice");
                continue;
            }

            // GET RANDOM FOR THE COMPUTER

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choose: " + computerChoice);

            // CHECK WIN CONDITION

            if (playerChoice.equals(computerChoice)) { // == is not use because it will compare memory address
                System.out.println("It's a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // ASK TO PLAY AGAIN

            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));

        // GOODBYE MESSAGE

        System.out.println("THANK YOU FOR PLAYING!");
        scanner.close();
    }

}
