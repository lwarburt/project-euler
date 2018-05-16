package com.company;

import java.util.ArrayList;
import java.util.List;


public class PrimeTest {
    private List<Integer> primes = new ArrayList<>();

    public PrimeTest(int max) {
        primes.add(2);
        for (int it = 3; it <= max; it += 2) { //creates list of odd numbers up to the maximum
            primes.add(it);
        }
        for (int it = 0; it < primes.size(); it++) {
            for (int n = 2; n * primes.get(it) < max; n++) {
                Object o = n * primes.get(it);
                primes.remove(o);
            }
        }
    }

    public int nthPrime(int n) {
        new PrimeTest(n * 10);
        return (primes.get(n - 1));
    }

    @Override
    public String toString() {
        return primes.toString();
    }
}
