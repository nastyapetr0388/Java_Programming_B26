package day44_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffeer {
    public static void main(String[] args) {

        Offer first = new Offer("Google", "Texas", 200_000, true, 15); // creating an Offer object

        ArrayList<Offer> allOffers = new ArrayList<>(); // creating an ArrayList that will hold Offer objects
        allOffers.add(first); // added the first Offer object to the ArrayList

        allOffers.add( new Offer("Amazon", "New York", 180_000, true, 15) ); // creating an Offer object and added to the ArrayList

        System.out.println(allOffers);
        System.out.println();

        Offer [] moreOffers = {
                new Offer("Apple", "Chicago", 230_000, false, 10),
                new Offer("Tesla", "Texas", 250_000, false, 20),
                new Offer("Facebook", "Florida", 120_000, true, 10)
        }; // created an array of Offer objects

        allOffers.addAll(Arrays.asList(moreOffers)); // added the array of Offers into the ArrayList of offers
        System.out.println(allOffers);

        allOffers.addAll(Arrays.asList(
                new Offer("Discord", "Chicago", 150_000, false, 13),
                new Offer("Netflix", "Canada", 170_000, true, 12)
        )); // added Offer objects using the var args of the asList method to add multiple Offer objects at the same time



    }
}


