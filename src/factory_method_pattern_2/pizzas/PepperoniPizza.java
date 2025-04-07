package factory_method_pattern_2.pizzas;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
