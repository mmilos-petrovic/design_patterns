package decorator_pattern;

public class ClientApp {
    public static void main(String[] args){
        Car fiat = new Fiat();
        fiat = new MetalicCarDecorator(fiat);
        fiat = new MetalicCarDecorator(fiat);
        fiat = new AirConditionerCarDecorator(fiat);
        System.out.println(fiat.cost());
    }
}
