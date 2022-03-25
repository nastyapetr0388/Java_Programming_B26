package day32_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String[4][];
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo [0] = groupOne;

        System.out.println(Arrays.deepToString(cydeo));

    }
}
