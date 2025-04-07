package strategy_pattern;


import strategy_pattern.strategies.*;

public class Context {
    private final FractionStrategy fractionStrategy;
    Context()
    {
        this.fractionStrategy = new ProperFractionStrategy();
    }
    Context(FractionStrategy fractionStrategy)
    {
        this.fractionStrategy = fractionStrategy;
    }

    public String convert(int numerator, int denominator){
        return this.fractionStrategy.toFraction(numerator, denominator);
    }
}
