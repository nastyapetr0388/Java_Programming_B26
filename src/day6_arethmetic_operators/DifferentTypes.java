package day6_arethmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {

        //both int
        System.out.println(10 - 5);
        System.out.println(10 *5 );

        //double/int->double
        System.out.println(10.0 / 5);

        //double / double->double
        System.out.println(10.0 / 5.0);

        //int / double ->
        System.out.println(10 / 5.0);

        System.out.println(10.0 / 5.0);
        System.out.println((int)(10.0 / 5.0));
        System.out.println((int)10.5 / 5.0);

        byte b1 = 10;
        byte b2 = 20;

        // byte sum = b1 + b2; this will not work because the values get changed to int during the calculation

        int sum = b1 + b2;
        byte sumByte = (byte)(b1 + b2);
    }
}
