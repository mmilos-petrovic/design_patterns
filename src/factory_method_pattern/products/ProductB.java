package factory_method_pattern.products;

public class ProductB extends Product{
    @Override
    public void create() {
        System.out.println("Creating Product B");
    }
}