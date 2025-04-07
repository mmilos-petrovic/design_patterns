package factory_method_pattern.factories;

import factory_method_pattern.products.Product;
import factory_method_pattern.products.ProductB;

public class FactoryB extends Factory {
    @Override
    public Product createProduct() {
        System.out.println("Factory B creates Product B");
        return new ProductB();
    }
}
