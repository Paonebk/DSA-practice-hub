package org.example;

public class Prime {

    public void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime p = new Prime();
        p.primeInRange(10);
    }
}
