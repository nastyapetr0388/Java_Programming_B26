package day44_custom_classes;

public class UsingEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("James", "Secret Agent");
        System.out.println(employee1);

        Employee employee2 = new Employee("Eman",25, "SDET", 300000);
        System.out.println(employee2);

        employee1.goToMeeting();
        employee2.goToMeeting();

    }

}
