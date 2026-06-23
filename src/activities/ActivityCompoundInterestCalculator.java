package activities;

import java.util.Scanner;

public class ActivityCompoundInterestCalculator {
    public static void main(String[] args){
        //Compound Interest Calculator
        // Formula: amount = principal( 1 + (rate / numberTimesPerYear) ^ ((numberTimesPerYear)(numYear))

        Scanner scanner = new Scanner(System.in);

        double amount;
        double principalAmount;
        double rate;
        int numberTimesPerYear;
        int numYear;

        System.out.println("WELCOME TO COMPOUND INTEREST CALCULATOR");
        System.out.print("Enter the principal amount: ");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        numberTimesPerYear = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        numYear = scanner.nextInt();

        amount = principalAmount * Math.pow(1 + rate / numberTimesPerYear, numberTimesPerYear * numYear);

        System.out.printf("The amount after %d years is ₱%.2f", numYear, amount);
        scanner.close();
    }
}
