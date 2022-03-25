package day25_recap;

import java.util.Scanner;

public class ReservMiddle {
    /*
    Reverse only second word [String, Loops]

    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java

        Ouput:
        I evol java
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words");
        String str = input.nextLine().trim();

        int firstspace = str.indexOf(" ");
        int lastspace = str.lastIndexOf(" ");

        String middleword = str.substring(firstspace + 1, lastspace);
        String reverse = "";

        for(int i = middleword.length() - 1; i >= 0; i--){
            reverse += middleword.charAt(i);

        }
        System.out.println(str.substring(0, firstspace + 1) + reverse + str.substring(lastspace));
    }
}
