package activities;

import java.util.Scanner;

public class ActivityQuizGame {
    public static void main(String[] args){
        // JAVA QUIZ GAME

        // ARRAY[] OF QUESTIONS
        String[] questions = {"AOT stands for?",
                              "Where did Deku get is quirk?",
                              "What did Yuji ate to acquire his power?",
                              "Who revived the world from stone apocalypse?",
                              "Who is the the daughter of Queen Serenity among the sailor guardians?"};

        // 2D ARRAY[][] OF OPTIONS
        String[][] options = {{"1. All of Times", "2. Attack on Titan","3. Arrive of Time", "4. Army of Tennessee"},
                              {"1. Uraraka", "2. Bakugo", "3. All Might", "4. His Father"},
                              {"1. Finger", "2. Dorayaki", "3. Ramen", "4. Hair"},
                              {"1. Senku", "2. Taiju", "3. Chrome", "4. Suika"},
                              {"1. Sailor Venus", "2. Sailor Jupiter", "3. Sailor Mercury", "4. Sailor Moon"}};

        // VARIABLE DECLARATIONS
        int[] answers = {2, 3, 1, 1, 4};
        int score = 0;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

        // WELCOME MESSAGE
        System.out.println("--------------------------------");
        System.out.println("WELCOME TO ANIME JAVA QUIZ GAME!");
        System.out.println("--------------------------------");

        // LOOP OF QUESTIONS

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            // OPTIONS
            for(String option : options[i]){
                System.out.println(option);
            }

            // GET GUESS FORM USER
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // CHECK THE GUESS
            if(guess == answers[i]){
                System.out.println("--------------");
                System.out.println("CORRECT!");
                System.out.println("--------------");
                score++;
            }
            else {
                System.out.println("--------------");
                System.out.println("Wrong!");
                System.out.println("--------------");
            }
        }

        // DISPLAY THE SCORE
        System.out.println("Your Final Score is: " + score + " / " + questions.length);
        scanner.close();
    }
}
