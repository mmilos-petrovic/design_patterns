package factory_method_pattern;

import factory_method_pattern.factories.Factory;
import factory_method_pattern.factories.FactoryA;
import factory_method_pattern.factories.FactoryB;


public class MainApp {
    static public void main(String[] args){
        Factory factoryA = new FactoryA();
        factoryA.order();
        Factory factoryB = new FactoryB();
        factoryB.order();
    }
}
