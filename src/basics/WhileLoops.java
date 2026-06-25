package basics;

import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args){

        // While Loop = repeat some code forever while some condition remains true
        //              check the condition before entering

        Scanner scanner = new Scanner(System.in);

        String name = " ";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // Do while = execute the code ones before entering the while loop

        int age = 0;
        do{
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age<0);

        scanner.close();

    }
}
