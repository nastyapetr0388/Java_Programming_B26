package day6_arethmetic_operators;

  public class House {

    /*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens,
        is there a basement?, is there an attic, is there a pool, is the house for
        sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding
        school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */

       public static void main(String[] args) {

     String houseType = "Penthouse";
     int numberOfBedroom = 4;
     int numberOfBathroom = 3;
     int numberOfKitchen = 2;
     boolean hasBasement = false;
     boolean hasAttic = false;
     boolean hasPool = true;
     boolean isOnSale = false;
     double costOfHouse = 1_000_000.99;
     String address = "219481 Central Park";
     int zipcode = 219124;
     boolean hasPark = true;
     double schoolRating = 4;

     String houseInfo = "The " + houseType + " on " + address + ", " + zipcode + " cost $ " + costOfHouse + " \nThe " + houseType + " has " + numberOfBedroom + " bedroom, " + numberOfBathroom + " bathroom, " + numberOfKitchen + " kitchen \nIt also includes a basement: " + hasBasement + "\nhas an attic: " + hasAttic + "\nhas a pool: " + hasPool + "\nis on sale: " + isOnSale + "\nand has a park: " + hasPark +".\nThe school in the area have a rating of " + schoolRating;

     System.out.println(houseInfo);


   }

}