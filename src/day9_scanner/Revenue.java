package day9_scanner;

import java.util.Scanner;

public class Revenue {

    /*
    Write a program that asks the user to enter a price
    and quantity and then calculate the revenue.
    revenue = price × quantity.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a price");
        double price = input.nextDouble();

        System.out.println("Enter quantity");
        int quantity = input.nextInt();

        double revenue = price * quantity;
        System.out.println(revenue);
    }
}
