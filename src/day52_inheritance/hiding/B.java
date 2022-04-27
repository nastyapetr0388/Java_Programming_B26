package day52_inheritance.hiding;

public class B extends A{

    @Override
    public void instanceMethodA(){
        staticMethod();
    }

    //@Override
    public static void staticMethod(){
        System.out.println("Static method from the Parent class");

    }

}
