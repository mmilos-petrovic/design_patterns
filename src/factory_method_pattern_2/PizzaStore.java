package factory_method_pattern_2;

import factory_method_pattern_2.pizzas.Pizza;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza = simplePizzaFactory.createPizza((type));
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
