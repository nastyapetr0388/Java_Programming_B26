package day7_unary_operators;

public class Letters {

    public static void main(String[] args) {

        //task: define a character. print me the next four characters on new lines

        char letter ='G';
        System.out.println("Original " + letter);
        System.out.println("Next four: " );
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
    }
}
