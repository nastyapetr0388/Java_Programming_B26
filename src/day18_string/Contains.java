package day18_string;

public class Contains {
    public static void main(String[] args) {

        String day = "Today it is above 70";//true

        System.out.println(day.contains("itis"));//false

        System.out.println(day.contains("ay it"));//true

        System.out.println(day.contains("7"));//true

        System.out.println(day.contains("today"));//false because we had Today with uppercase T
        System.out.println(day.contains("Ti7"));

    }
}
