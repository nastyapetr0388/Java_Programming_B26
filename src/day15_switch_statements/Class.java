package day15_switch_statements;

import java.util.Scanner;

public class Class {

    /*

     Task:

            Ask the user to enter which day it is
            print which class we have on that day, and the time of
            the class
            show if there is office hours

            topic with instructor at time

            challenge:
                make each day flexible

                    monday
                    Monday
                    mon

                 reduce repeating code

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What day do you want to know about");
        String day = input.next();String information = "";

        switch (day){
            case "monday": case "MONDAY": case "mon": case "Mon": case "Monday":
                information = "We have Java with Saim at 7 pm EST";
                break;
            case "tuesday":
                information = "We have Java with Saim at 7 pm EST";
                break;
            case "wednesday":
                information = "We have Java with Saim at 7 pm EST";
                break;
            case "thursday":
                information = "We have Java with Saim at 7 pm EST";
                break;
            case "friday":
                information = "Today is day off";
                break;
            case "saturday":
                information = "We have full day Java with Saim from 10 am to 5 pm EST";
                break;
            case "sunday":
                information = "We have full day Java with Saim from 10 am to 5 pm EST";
                break;
            default:
                information = "Not a valid day";
        }
        System.out.println(information);
    }
}
