package activities;

import java.util.Scanner;

public class ActivityMadLibs {
    public static void main(String[] args){
        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective;
        String bird;
        String room;
        String verb1;
        String verb2;
        String name;
        String noun;
        String liquid;
        String verb3;
        String body;
        String noun2;

        System.out.println("WELCOME TO MAD LIBS GAME\n");

        System.out.print("Enter an adjective: ");
        adjective = scanner.nextLine();

        System.out.print("Enter a type of bird: ");
        bird = scanner.nextLine();

        System.out.print("Enter a type of room in the house: ");
        room = scanner.nextLine();

        System.out.print("Enter a past tense verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb2 = scanner.nextLine();

        System.out.print("Enter a name: ");
        name = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();

        System.out.print("Enter a type of liquid: ");
        liquid = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        verb3 = scanner.nextLine();

        System.out.print("Enter a part of the body (plural): ");
        body = scanner.nextLine();

        System.out.print("Enter a plural noun: ");
        noun2 = scanner.nextLine();

        System.out.println("\nIt was a " + adjective + ", cold November day.");
        System.out.println("I woke up to the " + adjective + " smell of " + bird + " roasting in " +
                room + " downstairs.");
        System.out.println("I " + verb1 + " down the stairs to see if I could help " + verb2 + " the dinner.");
        System.out.println("My mom said, \"See if " + name + " needs a fresh " + noun + ".\"");
        System.out.println("So I carried a tray of glasses full of " + liquid + " in to the " + verb3 + " room.");
        System.out.println("When I got there, I couldn't believe my " + body + "!");
        System.out.println("There were " + noun2 + " " + verb3 + " on the " + noun + "!");

        scanner.close();
    }
}
