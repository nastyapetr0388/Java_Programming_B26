package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {

    /*
     0 -full name
     1 - account type
     2 - account number
     3 - balance
     */
    public static void main(String[] args) {

        String[] bankAccountOne = {"Brad Smith", "Checking", "1002199482", "100,000,000"};
        System.out.println(bankAccountOne.length);
        System.out.println("Whole Array " + Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Account type: " + bankAccountOne[1]);
        System.out.println("Account number: " + bankAccountOne[2]);
        System.out.println("Balance: " + bankAccountOne[3]);

        String[] bankAccountTwo = new String[4];
        System.out.println(Arrays.toString(bankAccountTwo));
        bankAccountTwo[0] = "Jamie Fox";
        bankAccountTwo[1] = "Savings";
        bankAccountTwo[2] = "130489345";
        bankAccountTwo[3] = "102304040";
        System.out.println(Arrays.toString(bankAccountTwo));

        String [] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        bankAccountThree[0] = firstName;
        System.out.println("Enter your account type");
        bankAccountThree[1] = input.nextLine();
        System.out.println("Enter your account number");
        bankAccountThree[2] = input.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3] = input.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));

        String bankAccountFour[] = new String[4];
        String[] questions = {"Full name", "Account type", "Account number", "Balance"};

        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your: " + questions);
            bankAccountFour[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(bankAccountFour));
    }
}