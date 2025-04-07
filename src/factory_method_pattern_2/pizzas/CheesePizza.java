package factory_method_pattern_2.pizzas;

public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "Cheese Pizza";
        toppings.add("Sliced Cheese");
        toppings.add("More Sliced Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting into cheese.");
    }
}
