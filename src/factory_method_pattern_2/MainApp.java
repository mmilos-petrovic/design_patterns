package factory_method_pattern_2;

import factory_method_pattern_2.pizzas.Pizza;

public class MainApp {
    public static void main(String[] args){

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        Pizza pizza1 = pizzaStore.orderPizza("cheese");
        // Pizza pizza2 = pizzaStore.orderPizza("pepperoni");

        System.out.println(pizza1.toString());

    }
}
