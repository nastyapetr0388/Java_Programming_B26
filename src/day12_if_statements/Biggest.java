package day12_if_statements;

public class Biggest {

    /*
    declare and assign 3 int variables
    between the 3 numbers find the print the biggest one
     */
    public static void main(String[] args) {

        int num1 = 40;
        int num2 = 1;
        int num3 = 10;

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the biggest");
        } else {
            System.out.println(num3 + " is the biggest");

        }

    }
}
