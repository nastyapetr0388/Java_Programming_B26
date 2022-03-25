package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    /*
     0-id
     1-first name
     2-last name
     3-batch number
     */
    public static void main(String[] args) {

        String [] studentOne = {"7", "James", "Bond", "7"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo = new String [4];
        System.out.println(Arrays.toString(studentTwo));
        studentTwo[0] = "010";
        studentTwo[1] = "Jamie";
        studentTwo[2] = "Smith";
        studentTwo[3] = "26";
        System.out.println(Arrays.toString(studentTwo));

        Scanner input = new Scanner(System.in);
//        String [] studentThree = new String [4];
//        System.out.println("Enter your id");
//        studentThree[0]=input.nextLine();
//        System.out.println("Enter your first name");
//        studentThree[1] = input.nextLine();
//        System.out.println("Enter your last name");
//        studentThree[2]=input. nextLine();
//        System.out.println("Enter your batch");
//        studentThree [3] = input.nextLine();
//        System.out.println(Arrays.toString(studentThree));
//
        String [] studentFour = new String[4];
        String []quetions = { "Enter your id", "Enter your first name", "Enter your last name", "What is your batch number " } ;
        for(int i = 0; i<4; i++){
            System.out.println(quetions[i]);
              studentFour[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(studentFour));
        

    }
}
