package day54_abstraction.animal;

public final class Parrot extends Bird implements Flyable{

    @Override
    public void eat() {
        System.out.println("Parrot woble to the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}

