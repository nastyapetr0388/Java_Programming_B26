package day9_scanner;

public class Discount {

    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isPoliceOfficer = true;
        boolean isFireFighter = false;

        boolean getDiscount = isWeekend &&
                (isTeacher || isPoliceOfficer || isFireFighter);

        System.out.println(getDiscount);
    }
}
