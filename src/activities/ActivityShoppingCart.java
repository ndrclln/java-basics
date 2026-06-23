package activities;

import java.util.Scanner;

public class ActivityShoppingCart {
    public static void main(String[] args){
        // SHOPPING CART - user will be asked about:
        // Product name, Quantity, and Price

        Scanner scanner = new Scanner(System.in);

        String productName;
        double price;
        int quantity;
        char currency = '₱';
        double totalPrice;
        double withVAT;

        System.out.println("WELCOME TO 8/25!");
        System.out.print("Enter the product name: ");
        productName = scanner.nextLine();

        System.out.print("Enter the price of " + productName + ": ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();

        totalPrice = price * quantity;
        withVAT = totalPrice * 1.12;

        System.out.println("\nThank you for shopping in 8/25!");
        System.out.println("Here is your receipt:");
        System.out.println("Product name: " + productName);
        System.out.println("Price: " + currency + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + totalPrice);
        System.out.println("VAT: 12%");
        System.out.println("\nTOTAL: " + currency + withVAT);


        scanner.close();
    }
}
