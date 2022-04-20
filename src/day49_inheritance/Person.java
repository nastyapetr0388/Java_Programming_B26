package day49_inheritance;

public class Person {

    String name;
    int age;
    String favoriteHobby;

    public void talk(){
        System.out.println(name + " is talking");
    }

    /*
    Person is the Super class
          name, age , favorite hobby
          talk()

    Student class it the sub class of Person
           int fun level
           study()

     */
}
