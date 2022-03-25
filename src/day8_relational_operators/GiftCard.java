package day8_relational_operators;

public class GiftCard {

    public static void main(String[] args) {

        /*
          declare and assign a gift card with 200
        buy 2 items.
        buy 1 item for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40
         */

        double giftCard = 200;

        System.out.println("Buy item 1 for 100$");
        giftCard -= 100; //giftCard = giftCard - 100

        System.out.println("Buy item 2 for 40$");
        giftCard -= 40; //giftCard = giftCard-40

        System.out.println("Your gift card balance is now: " + giftCard);
    }
}
