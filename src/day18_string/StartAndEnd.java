package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String s = "A";
        System.out.println(str.startsWith(s));

        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("Aoo"));
    }
}
