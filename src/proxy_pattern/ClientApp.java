package proxy_pattern;

public class ClientApp {
    public static void main(String[] args){

        PrimeChecker proxyPrimeChecker = new ProxyPrimeChecker();
        boolean result;
        result = proxyPrimeChecker.isPrime(10);
        result = proxyPrimeChecker.isPrime(17);
        result = proxyPrimeChecker.isPrime(10);
    }
}
