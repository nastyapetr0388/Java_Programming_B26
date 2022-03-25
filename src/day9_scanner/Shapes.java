package day9_scanner;

import java.util.Scanner;

public class Shapes {

    /*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 angles ");
        double firstAngle = input.nextDouble();
        double secondAngle = input.nextDouble();
        double thirdAngle = input.nextDouble();

        double sumOfAngles = firstAngle + secondAngle + thirdAngle;
        boolean isTriangle = sumOfAngles == 180;
        boolean isCircle = sumOfAngles == 360;

        System.out.println("Is triangle: " + isTriangle);
        System.out.println("Is circle: " + isCircle);





    }
}
