package DAY44_CUSTOM_CLASSES;

public class Offer {
    /*
    create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO
    */

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    /*
        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    */

    public Offer(String company, String location) {
        this.location = location;
        this.company = company;
    }

    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
    /*
        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects
     */
    public String toString(){

        String info = company + " located in " + location;

        info += "\n "  + (salary > 0 ? salary : "");

        info += "\n " + (isFullTime ? "Full Time" : "Contract");

        info += "\n " + (numberOfPTO > 0 ? numberOfPTO : "");

        return info;

    }
}