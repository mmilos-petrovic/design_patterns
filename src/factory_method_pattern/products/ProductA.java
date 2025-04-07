package factory_method_pattern.products;

public class ProductA extends Product{
    @Override
    public void create() {
        System.out.println("Creating Product A");
    }
}
