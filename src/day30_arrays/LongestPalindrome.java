package day30_arrays;

public class LongestPalindrome {

    /*
      IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome
     */
    public static void main(String[] args) {
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        //outer loop is iterating throgh the array
        for (String eachWord : words) {

            boolean isPalindrome = true;

            //inner loop interating through each String element
            for (int i = 0; i < eachWord.length()/2; i++) {

                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }
            }

            if(isPalindrome && eachWord.length() > longestPalindrome.length()){
                longestPalindrome = eachWord;
            }
        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);
    }
}

