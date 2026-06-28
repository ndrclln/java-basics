package basics;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){
        /*
        // INTEGER
        int[]  numbers = {1, 2, 3, 4, 5};
        int target = 8;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array.");
        }


        // string
        String[] fruits = {"apple", "banana", "berry"};
        String target1 = "banana";
        boolean isFoundFruit = false;

        for (int i = 0; i < numbers.length; i++){
            if(fruits[i].equals(target1)){
                System.out.println("Element found at index: " + i);
                isFoundFruit = true;
                break;
            }
        }

        if(!isFoundFruit){
            System.out.println("Element not found in the array.");
        }

         */

        // ACCEPTING USER INPUT
        Scanner scanner = new Scanner(System.in);

        String[] fruits;
        boolean isFoundFruit = false;
        String target2;
        int size;

        System.out.print("How many food do you want to add?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        fruits = new String[size];

        for(int i = 0; i < fruits.length; i++){
            System.out.print("Enter a fruit: ");
            fruits[i] = scanner.nextLine();
        }

        System.out.print("Enter fruit to search for: ");
        target2 = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target2)){
                System.out.println("Element found at index: " + i);
                isFoundFruit = true;
                break;
            }
        }

        if(!isFoundFruit){
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
