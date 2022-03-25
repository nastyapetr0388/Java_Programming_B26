package day17_string;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java"; //string literal, in string pool

        String second = new String ("java"); //string object, not in string pool but directly in the heap

        System.out.println(first == second);// == with String types gives you false

        String third = "java";
        System.out.println(first == third);

        String forth = "Java";

        System.out.println(first == forth);

        String fifth = new String("java");
        System.out.println(first == fifth);

    }
}
