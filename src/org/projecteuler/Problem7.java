package org.projecteuler;

import java.util.ArrayList;

/*
    10001st prime
    Problem 7
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    What is the 10 001st prime number?
 */
public class Problem7 {

    public static void main(String[] args) {
        Integer maxPrime = 2;
        Integer number = 3;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        boolean isPrime = false;

        do {
            for (Integer prime : primes) {
                if (number % prime != 0) {
                    if (isPrime == false) {
                        isPrime = true;
                    }
                } else {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(number);
                maxPrime = number;
                isPrime = false;
            }

            number++;

        } while (primes.size() < 10001);

        System.out.println(maxPrime);
    }
}
