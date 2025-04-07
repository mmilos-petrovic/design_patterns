package factory_method_pattern.factories;

import factory_method_pattern.products.Product;
import factory_method_pattern.products.ProductA;

public class FactoryA extends Factory {
    @Override
    public Product createProduct() {
        System.out.println("Factory A creates Product A");
        return new ProductA();
    }
}
