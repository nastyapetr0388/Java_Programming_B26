package day15_switch_statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        String screenSize = input.next();
        int price = 0;

        System.out.println("Select CPU type:");
        String cpuType = input.next();

        System.out.println("Select RAM size");
        int ramSize = input.nextInt();

        System.out.println("Select storage type:");
        String storageType = input.next();

        System.out.println("Select storage size:");
        int storageSize = input.nextInt();

        System.out.println("Select screen resolution:");
        String screenResolution = input.next();

        switch(screenSize){
            case "13.3":
                price += 150;
                break;
            case "15.0":
                price += 250;
                break;
            case "17.3":
                price += 400;
                break;
        }
        switch(cpuType){
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price = +350;
                break;
        }
        switch(ramSize) {
            case 4:
            price += ((ramSize * 50)/4);
            break;
        }
        switch(storageType){
            case "HDD":
                price += ((storageSize*50)/500);
                break;
            case "SSD":
                price += ((storageSize*100)/500);
                break;
        }
        switch(screenResolution){
            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;
        }
        System.out.println("Laptop price is: $" + price);


    }
}