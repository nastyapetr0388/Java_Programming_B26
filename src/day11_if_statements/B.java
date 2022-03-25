package day11_if_statements;

public class B {

    /*
    Task: Hard code -> Dynamic

    Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdraw
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

     */
    public static void main(String[] args) {
        double balance = 100;
        double withdraw = 50;

        //withdraw some amount of money from my balance
        balance -= withdraw; //balance = balance - withdraw

        if(balance < 0) {
            System.out.println("Took out too much money, $100 overdraft applied");
            balance -= 100; //balance = balance - 100

        }

        System.out.println("Balance $" + balance);
    }
}
