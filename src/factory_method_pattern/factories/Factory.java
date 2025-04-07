package factory_method_pattern.factories;

import factory_method_pattern.products.Product;

public abstract class Factory {
    public void order(){
        System.out.println("Creating Product...");
        Product product = createProduct();
        product.create();
    }
    public abstract Product createProduct();
}
