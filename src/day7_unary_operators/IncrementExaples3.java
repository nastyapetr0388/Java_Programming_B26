package day7_unary_operators;

public class IncrementExaples3 {

    public static void main(String[] args) {

        int i = 5;
        int z = i++;

        System.out.println(i);
        System.out.println(z++);

        int a = 10;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        int c = ++a;
        System.out.println(c);
        System.out.println(a);

    }
}
