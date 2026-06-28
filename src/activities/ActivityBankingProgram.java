package activities;

import java.util.Scanner;

public class ActivityBankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // BANKING PROGRAM



        // variables
        int choice;
        boolean isRunning = true;
        double balance = 0;
        double deposit;

        // main menu

        System.out.println("WELCOME TO MONEY BANK!");

        while (isRunning) {
            System.out.println();
            System.out.println("Select Transaction:");
            System.out.println("1 : Show Balance");
            System.out.println("2 : Deposit");
            System.out.println("3 : Withdraw");
            System.out.println("4 : Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += enterDeposit();
                case 3 -> balance -= doWithdraw(balance);//doWithdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

            System.out.println("Thank you! Have a nice day!");
        }
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("Your current balance is ₱%.2f\n", balance);
    }

    static double enterDeposit(){
        double amount;

        System.out.print("Enter the amount to be deposited: ₱");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }else {
            return amount;
        }

    }

    static double doWithdraw(double balance){
        double amount;

        System.out.print("Enter the amount to be withdrawn: ₱");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Insufficient Amount");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

}
