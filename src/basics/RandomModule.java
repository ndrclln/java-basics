package basics;

import java.util.Random;

public class RandomModule {
    public static void main(String[] args){

        Random random = new Random();

        int number;
        double number1;
        boolean isHeads;

        // To generate random number (origin, bound) - (inclusive/start , exclusive/number before)

        System.out.println("Random Integer");
        number = random.nextInt(1, 6);
        System.out.println(number);

        System.out.println("\nRandom Double");
        number1 = random.nextDouble(1, 6);
        System.out.println(number1);

        System.out.println("\nRandom Boolean");
        isHeads = random.nextBoolean();

        if(isHeads) {
            System.out.println("Heads");
        }else {
            System.out.println("Tails");
        }
    }
}
