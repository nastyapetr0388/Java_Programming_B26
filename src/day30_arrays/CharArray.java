package day30_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a'};

        String word = "java";

        //converting a String to a char[]
        char [] java = word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        //System.out.println(letters);

        for(char eachChar : java){
            System.out.println(eachChar);
        }
        System.out.println(java[0]);

        //convert a char array to a String

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);
    }
}
