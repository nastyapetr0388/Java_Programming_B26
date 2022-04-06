package day40_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println(shoppingList.isEmpty() ? "Shopping List Empty" : "You have some items");
        String keepAsking;
        do{
            System.out.println("Enter the item");
            input.nextLine();
            shoppingList.add(input.nextLine());

            System.out.println("Do you want to continue y/n");
            keepAsking = input.nextLine();

        }while(keepAsking.equals("yes") ||  keepAsking.equals("y"));

        System.out.println("Shopping List: " + shoppingList.size() + " items:");
        for(String item : shoppingList){
            System.out.println("*\t" + item);
        }

        System.out.println("------------------------------------");

        System.out.println(shoppingList.contains("water") ? "Water on list" : "No water on the list");

        System.out.println("Do you want remove any items?");
        if(input.nextLine().equals("yes")){
            System.out.println("What item do you want to remove?");
            String removeItem = input.nextLine();
        }

    }
}
