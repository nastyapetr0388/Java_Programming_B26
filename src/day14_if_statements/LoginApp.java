package day14_if_statements;

import java.util.Scanner;

public class LoginApp {

    /*
      inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    whent he ssn is not correct print:
        invalid ssn
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode");
        int actualPin = input.nextInt();
        System.out.println("Please enter the last 4 digital of your ssn");
        int actualSSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;

        if(actualPin == expectedPin && actualSSN == expectedSSN) {
            System.out.println("Authentication succeseful");
        }else{
            System.out.println("Authentication failed");
            if(actualPin != expectedPin) {
                System.out.println("incorrect pin code");

            }
            if(actualSSN != expectedSSN){
                System.out.println("incorrect SSN");
            }
        }


    }
}
