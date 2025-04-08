package proxy_pattern;

import java.util.HashMap;
import java.util.Map;


public class ProxyPrimeChecker implements PrimeChecker{
    private final Map<Integer, Boolean> cache = new HashMap<Integer, Boolean>();
    private final RealPrimeChecker realPrimeChecker = new RealPrimeChecker();

    public ProxyPrimeChecker(){

    }

    @Override
    public boolean isPrime(int n) {
        boolean isPrime;
        if(!this.cache.containsKey(n))
        {
            isPrime = realPrimeChecker.isPrime(n);
            cache.put(n, isPrime);
        }
        else {
            isPrime = this.cache.get(n);
            String answer = isPrime ? " is prime." : " is not prime.";
            System.out.println("ProxyPrimeChecker getting from cache: " + Integer.toString(n) + answer);
        }
        return isPrime;
    }
}
