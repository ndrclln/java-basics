package basics;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        // array = a collection of values of SAME data type
        //       = think of it as a variable that can store more than 1 value

        String[] fruits = {"Apple", "Mango", "Orange", "Guava"};
        //       index  =     0         1         2        3

        System.out.println(fruits); // Gives the memory address

        // To access the element
        // Accessing element that doesn't exist -> ArrayIndexOutOfBoundsException (Error)
        System.out.println(fruits[0]);
        System.out.println();

        // Changing value of index;
        fruits[0] = "Pineapple";
        System.out.println(fruits[0]);
        System.out.println();

        // Length of an array
        int numOfFruits = fruits.length;
        System.out.println("# of elements in the array: " + numOfFruits);
        System.out.println();

        // To print all the elements
        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
        System.out.println("\n      ");

        // Enhanced for loop/ for each loop -> cycle once for each element within the array
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
        System.out.println("\n        ");

        // To sort an array -> need to be imported
        Arrays.sort(fruits);
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
        System.out.println("\n        ");

        // To fill elements of array with a given value
        Arrays.fill(fruits, "strawberry");
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
        System.out.println("\n        ");
    }
}
