package day11_if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {

    if(false) {
        System.out.println("Hello Word");//if statements is false so it does not print

    }

        System.out.println("Second Line");//just normal print, nothing to do with if statements

    if(true) {
        System.out.println("Today is Monday");//if statements is true , so it will print this value

        }

    int score = 80;
    if(score >= 75) {
        System.out.println("Passing");
    }

    int year = 2020;
    boolean lockdown = year ==2020 || year == 2021;
    if(lockdown == true){
        System.out.println("Stay at home");
        System.out.println("Practice java");
        System.out.println("Wear mask");

    }

    if(!lockdown) { //!false->true
        System.out.println("Party");
        System.out.println("Still practice java");
        System.out.println("Maybe travel");
    }




    }
 }


