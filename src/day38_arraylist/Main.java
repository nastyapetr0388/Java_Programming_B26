package day38_arraylist;

public class Main {
    public static void main(String[] args) {

        /*
        check the number between 0-20 and count all add and all even numbers
         */

        int number = 0;
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i <= 20; i++) {
            if(i % 2 == 0) {
                countEven++;

            }else{
                countOdd++;

            }

        }
        System.out.println(countOdd);
        System.out.println(countEven);





    }
}
