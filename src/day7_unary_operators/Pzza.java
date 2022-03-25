package day7_unary_operators;

public class Pzza {

    public static void main(String[] args) {

    String typeOfPizza = "Cheeze";
    int numberOfSlaces = 8;
    int numberOfPeople = 4;
    int slicesPerPerson = numberOfSlaces / numberOfPeople;
    int slicesLeftOver =  numberOfSlaces % numberOfPeople;

    System.out.println("We ordered " + typeOfPizza + " pizza with " + numberOfSlaces + " slaces,"  + numberOfPeople + " people ate "  + slicesPerPerson + "each with " + slicesLeftOver + " left over" );


}

   }

