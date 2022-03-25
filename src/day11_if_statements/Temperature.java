package day11_if_statements;

import java.util.Scanner;

public class Temperature {

    /*

    ask the user to enter the temperature
    if the temperature is above 70
    its a nice day
    go outside, but with your laptop to code java
    if the temperature if less than 70
    print: its too cold
    code more java

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temperature = input.nextInt();

        if(temperature >= 70) {
            System.out.println("Its a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        } else {
            System.out.println("Its too cold");
            System.out.println("Code more java");

        }
    }
}
