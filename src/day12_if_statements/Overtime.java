package day12_if_statements;

public class Overtime {

    /*
    create a double variable for your hourly rate
    create a double variable for the number of hours worked

    calculate your net pay, with consideration of overtime pay

    if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay
    is 1.5 the normal rate
    (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */
    public static void main(String[] args) {

        double hourlyRate = 20.5;
        double numberOfHours = 44;
        double netPay;

        //when the number is more than 40, we will get an extra 1.5 for overtime pay

        double overtimeHours = numberOfHours - 40;
        netPay = 40 * hourlyRate;
        netPay += overtimeHours * hourlyRate * 1.5;

        if (numberOfHours > 40) {

        } else {
            // when the number of hours is less than or equal to 40, we will run this code
            netPay =  numberOfHours * hourlyRate;

        }
        System.out.println("Total net pay is: $" + netPay);

    }
}
