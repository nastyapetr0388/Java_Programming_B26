package day5_variables;

public class CharExamples {

    public static void main(String[] args) {

        //assigning characters to char type
        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char spesialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(spesialOne);

        System.out.println(letterOne + letterTwo);

        char letterThree = 65; //char letterThree = 'A';
        System.out.println(letterThree);

        //char letterThree = '65'; this is invalid because there is two characters

        System.out.println(letterOne + " " +  letterTwo + " " + letterThree + " " + numberOne + " " + spesialOne);

        System.out.println("chars: " + letterOne +letterTwo +letterThree + numberOne +spesialOne);


    }
}
