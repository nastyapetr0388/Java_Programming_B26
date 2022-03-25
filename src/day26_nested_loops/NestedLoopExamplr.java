package day26_nested_loops;

public class NestedLoopExamplr {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Word");
        }

        System.out.println("Hello Universe\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Word");
        }

        System.out.println("Hello Universe\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Word");
        }

        System.out.println("Hello Universe");

        System.out.println("-----------------------------");
        //outer loop
        for (int j = 0; j < 3; j++) {   //int j =1; j<=3; both give 3 executions
            //inner loop
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello Word");
            }

            System.out.println("Hello Universe\n");
        }
    }
}