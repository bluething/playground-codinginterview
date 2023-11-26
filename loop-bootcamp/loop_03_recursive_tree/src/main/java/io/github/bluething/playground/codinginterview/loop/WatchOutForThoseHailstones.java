package io.github.bluething.playground.codinginterview.loop;

import java.math.BigInteger;

public class WatchOutForThoseHailstones {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        long n = io.getLong();
        io.println(doRecursive(n));

        io.close();
    }

    private static BigInteger doRecursive(long n) {
        if (n == 1) {
            return BigInteger.ONE;
        }

        if (n % 2 == 0) {
            return doRecursive(n/2).add(BigInteger.valueOf(n));
        }

        return doRecursive((3 * n + 1)).add(BigInteger.valueOf(n));
    }
}
