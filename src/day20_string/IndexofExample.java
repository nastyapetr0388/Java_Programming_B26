package day20_string;

public class IndexofExample {
    public static void main(String[] args) {

        String word = "banana";
                    // 012345

        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex); // output 1
        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex);

        int secondIndex = word.indexOf('a',firstIndex + 1);//starts to look from index 2
        System.out.println(secondIndex);
    }
}
