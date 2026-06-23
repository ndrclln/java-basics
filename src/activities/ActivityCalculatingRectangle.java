package activities;

import java.util.Scanner;

public class ActivityCalculatingRectangle {
    public static void main(String[] args){
        // Calculating the area of a rectangle

        double width;
        double height;
        double  area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + "cm²");
        scanner.close();
    }
}
