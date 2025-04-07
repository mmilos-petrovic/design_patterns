package factory_method_pattern_2;

import factory_method_pattern_2.pizzas.CheesePizza;
import factory_method_pattern_2.pizzas.PepperoniPizza;
import factory_method_pattern_2.pizzas.Pizza;



public class SimplePizzaFactory {
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        if(type.equals("cheese"))
        {
            pizza = new CheesePizza();
        }
        else if(type.equals("pepperoni"))
        {
            pizza = new PepperoniPizza();
        }
        else
        {
            return null;
        }
        return pizza;
    }
}
