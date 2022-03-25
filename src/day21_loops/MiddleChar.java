package day21_loops;

public class MiddleChar {

    /*

     */
    public static void main(String[] args) {

        String s = "abcde";
                 // 01234
        if(s.length() % 2 == 0) {
            //our word is odd length
        }else{
            //our word is odd length
            char middle = s.charAt(s.length() / 2);
            System.out.println(middle);
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + s.substring(s.length()/2, s.length()/2 + 1));

        }
    }
}
