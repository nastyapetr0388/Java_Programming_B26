package day16_review;

import java.util.Scanner;

public class Calculator {
    /*
    declare and assign 2 number variables
    declare and assign a char variable for an operator

    create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num2
        / : divide num1 and num2
        any other char: "invalid operator"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numOne = input.nextDouble();
        System.out.println("Pick operators: + - * / % ");
        String operator = input.next();
        System.out.println("Enter number two:");

    }
}
