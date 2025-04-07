package strategy_pattern.strategies;

public class ProperFractionStrategy implements FractionStrategy{
    @Override
    public String toFraction(int numerator, int denominator) {
        return Integer.toString(numerator) + "/" + Integer.toString(denominator);
    }
}
