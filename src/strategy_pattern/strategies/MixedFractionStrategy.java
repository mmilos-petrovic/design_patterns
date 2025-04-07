package strategy_pattern.strategies;

public class MixedFractionStrategy implements FractionStrategy{

    @Override
    public String toFraction(int numerator, int denominator) {
        int newNum = numerator % denominator;
        int wholePart = (numerator - newNum ) / denominator;
        return Integer.toString(wholePart) + " " + Integer.toString(newNum) + "/" + Integer.toString(denominator);
    }
}
