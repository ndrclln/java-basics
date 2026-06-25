package basics;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        // FOR LOOP = execute some code a CERTAIN/ KNOWN amount of times
        //              for(initialization; condition; increment/decrement;)
        //              initialization -> loop control variable (counter)
        //              condition      -> when we like to stop
        //              incre/dercre   -> step up or down, to update the counter
        /*
        System.out.println("Increment");
        for(int i = 0; i < 10 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Decrement");
        for(int i = 10; i > 0 ; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Increment by certain number");
        for(int i = 1; i <= 10 ; i+=2){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Decrement by certain number");
        for(int i = 10; i >0 ; i-=2){
            System.out.print(i + " ");
        }*/

        // COUNTDOWN
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }

}
