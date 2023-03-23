package io.github.bluething.playground.codinginterview.concept.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class NthFiboTest {

    private Map<Integer, Integer> memo = new HashMap<>();

    @Test
    void case01() {
        Assertions.assertEquals(5, fib(5));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, fibMemo(5));
    }

    private int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        System.out.printf("Computing fibo(%2d)\n", n);
        return fib(n-1) + fib(n-2);
    }

    private int fibMemo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (memo.get(n) != null) {
            System.out.printf("Grab fibo(%2d) from memo\n", n);
            return memo.get(n);
        }

        System.out.printf("Computing fibo(%2d)\n", n);
        int result = fibMemo(n-1) + fibMemo(n-2);

        memo.put(n, result);

        return result;
    }
}