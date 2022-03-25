package day8_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {

        int b = 10; //-> 10->11->10->11->12
        b++;//post increment, no other code, adds 1
        System.out.println(b); //print the value of b, which is 11

        b--; //post decrement, no other code
        System.out.println(b); //print the value of b, which is 10
        System.out.println(b++);
        System.out.println(b++);

        System.out.println(b);


    }

}