package basics;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args){
        // .substring() = A method used to extract a portion of a sting.
        //                  string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Here is your Info");
            System.out.println("Your username: " + username);
            System.out.println("Your email domain: " + domain);
        }else {
            System.out.println("Email must contain \"@\".");
        }

        scanner.close();

    }
}
