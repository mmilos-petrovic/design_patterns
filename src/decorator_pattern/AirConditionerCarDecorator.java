
package decorator_pattern;

public class AirConditionerCarDecorator extends CarDecorator{

    public Car car;

    public AirConditionerCarDecorator(Car car)
    {
        this.car = car;
    }
    @Override
    public float cost() {
        return this.car.cost () + (float) 3.5;
    }
}
