package codealphaspro;
/*QUESTION : A Simple Banking Application in Java is an ideal project
for coding beginners. It covers fundamental concepts
like the Scanner class for input, strings, loops, methods,
and conditional statements. This project involves basic
banking operations such as deposits, withdrawals,
checking balances, and exiting the program.*/

import java.util.Scanner;

public class bankproject{
	private static double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the Sai Bankings");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using our sai banking app!");
                    break;
                default:
                    System.out.println("Invalid option!!!! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
//**************************************CHECKBALANCE************************************************
    private static void checkBalance() {
        System.out.println("Your Current balance: ₹" + balance);
    }
//****************************************DEPOSIT*****************************************************
    private static void deposit(Scanner scanner) {
        System.out.print("Enter the deposit amount in Rupees: ₹");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
//****************************************WITHDRAW******************************************************
    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the withdrawal amount in Rupees: ₹");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

