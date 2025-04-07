package decorator_pattern;

public class MetalicCarDecorator extends CarDecorator{

    public Car car;

    public MetalicCarDecorator(Car car)
    {
        this.car = car;
    }
    @Override
    public float cost() {
        return this.car.cost () + (float) 3.5;
    }
}
