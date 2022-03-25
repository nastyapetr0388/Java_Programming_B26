package day26_nested_loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        /*
        String apple

        count how many times each letter is in the String

        a-1
        p-2
        l-1
        e-1

        what we will try to do:

           we will go on character at a time

           charAt(0)==>a
         */
        String s = "apple";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char letter = s.charAt(i);

            for(int j = 0; j < s.length(); j++){

                char eachLetter = s.charAt(j);

                if(letter == eachLetter) {
                    count++;
                }
            }
            System.out.println(letter + " - " + count);

        }
    }
}
