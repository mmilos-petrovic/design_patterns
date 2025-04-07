package factory_method_pattern_2.pizzas;

import java.util.ArrayList;

abstract public class Pizza {
    protected String name;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public void bake(){
        System.out.println("Bake in abstract class");
    }
    public void cut(){
        System.out.println("Cut in abstract class");
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        for (String topping : this.toppings) {
            stringBuilder.append(topping);
        }
        return stringBuilder.toString();
    }
}
