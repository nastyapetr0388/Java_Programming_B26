package day7_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
                int numberOfTvs = 100;

        System.out.println("Person comes into the store and they bought a tv");
        System.out.println("Number of tvs now: " + --numberOfTvs);

        System.out.println("Person comes into the store and they bought a tv");
        System.out.println("Number of tvs now: "+ --numberOfTvs);

        System.out.println("Person comes into the store and they bought a tvand they put into their cart");
        System.out.println("Numbers of tvs in the store: " + --numberOfTvs);




    }
}
