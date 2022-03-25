package day5_variables;

public class RecapVariables {

    public static void main(String[] args) {

        //Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

           //We cant print the variables because they dont have a value
 //       System.out.println(numberOfCoffeeCups);
 //       System.out.println(totalPriceOfCoffee);
 //       System.out.println(totalStudentsInClass);


        //Assigning to variable

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentsInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);

        System.out.println(numberOfCoffeeCups + " * " + totalStudentsInClass);

     //Declare

        double temperature = 20.6;
        int javaDates = 5;

        System.out.println("\nThis is my temperature: " + temperature);
        System.out.println("It is day " + javaDates + " in java class");



    }


}
