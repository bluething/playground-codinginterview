package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecursiveDigitSumTest {
    @Test
    void case01() {
        Assertions.assertEquals(8, superDigit("9875", 4));
    }
    @Test
    void case02() {
        Assertions.assertEquals(3, superDigit("148", 3));
    }
    @Test
    void case03() {
        Assertions.assertEquals(9, superDigit("123", 3));
    }

    private int superDigit(String n, int k) {
        if (n.length() == 1) {
            return Integer.parseInt(n);
        }

        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        sum *= k;
        return superDigit(String.valueOf(sum), 1);
    }
}
