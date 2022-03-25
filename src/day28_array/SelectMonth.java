package day28_array;

import java.util.Scanner;

public class SelectMonth {

    /*
     Ask the user the month number they want, print the month name

     1-->January

     12 --> december

     Assume only valid numbers are given, but as a chalenge you can
      handle invalid numbers
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which month do you want");
        int mon = input.nextInt();//4

        String [] months = {"January", "February", "March", "April", "May", "Junu", "July", "September", "October", "November", "December"};

        System.out.println(months[mon - 1]);
        //months[4] ->months[4-1] == months[3] -->April

    }
}
