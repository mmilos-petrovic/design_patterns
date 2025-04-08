package proxy_pattern;

public class RealPrimeChecker implements PrimeChecker{
    @Override
    public boolean isPrime(int n) {

        // Expensive operation.
        for(int i = 2; i < Math.sqrt(n) + 1; i++)
        {
            if (n % i == 0)
            {
                System.out.println("RealPrimeChecker: " + Integer.toString(n) + " is not prime.");
                return false;
            }
        }
        System.out.println("RealPrimeChecker: " + Integer.toString(n) + " is prime.");
        return true;
    }
}
