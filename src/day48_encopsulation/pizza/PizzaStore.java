package day48_encopsulation.pizza;

import day48_encopsulation.pizza.Pizza;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza first = new Pizza("large", 3);
        System.out.println(first);
        first.setNumberOfToppings(2);
        System.out.println(first);

        Pizza second = new Pizza("", -2);
        System.out.println(second);

        second.setSize("small");
        second.setNumberOfToppings(1);
        System.out.println(second);


    }
}
