package day9_scanner;

import java.util.Scanner;

public class AddNumbers {

    /*create a scanner object
      ask the user to enter 3 numbers
      find and print the sum of the numbers

     */

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = input.nextInt();

        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        System.out.println("Enter number 3");
        int num3 = input.nextInt();

        System.out.println("The sum is " + (num1 + num2 + num3));
    }
}
