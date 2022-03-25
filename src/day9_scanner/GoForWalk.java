package day9_scanner;

public class GoForWalk {
    public static void main(String[] args) {

        //we want to go for a walk

        //we will go for a walk if it is not raining and the weather is above 70

        //there is no need to check the weather if it is raining

        boolean isRaining = true;
        int temperature = 80;

        System.out.println("go for walk " + (isRaining && temperature >70));
    }
}
