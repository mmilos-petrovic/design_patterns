package strategy_pattern;

import strategy_pattern.strategies.*;

public class ClientApp  {
    public static void main(String[] args){

        FractionStrategy properFractionStrategy = new ProperFractionStrategy();
        Context c = new Context(properFractionStrategy);
        System.out.println(c.convert(7,3));  // returns 7/3

        FractionStrategy mixedNumberStrategy = new MixedFractionStrategy();
        c = new Context(mixedNumberStrategy);
        System.out.println(c.convert(7,3)); // returns 2 1/3
    }
}
