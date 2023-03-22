package io.github.bluething.playground.codinginterview.concept.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecursiveDigitSumTest {

    @Test
    void case01() {
        Assertions.assertEquals(3, superDigit("148", 3));
    }

    @Test
    void case02() {
        Assertions.assertEquals(8, superDigit("9875", 4));
    }

    @Test
    void case03() {
        Assertions.assertEquals(9, superDigit("123", 3));
    }

    @Test
    void case04() {
        Assertions.assertEquals(3, superDigit2("148", 3));
    }

    @Test
    void case05() {
        Assertions.assertEquals(8, superDigit2("9875", 4));
    }

    @Test
    void case06() {
        Assertions.assertEquals(9, superDigit2("123", 3));
    }

    // doesn't work with large input
    private int superDigit(String n, int k) {
        StringBuilder nSum = new StringBuilder();
        for (int i = 1; i <= k; i++) {
            nSum.append(n);
        }
        return sumRecur(nSum.toString());
    }

    private int sumRecur(String n) {
        if (n.length() == 1) {
            return Integer.parseInt(String.valueOf(n.charAt(0)));
        }
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        return sumRecur(String.valueOf(sum));
    }

    private int superDigit2(String n, int k) {
        long sum = 0L;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.valueOf(n.charAt(i) - 48);
        }
        sum *= k;

        return sumRecur2(sum);
    }

    private int sumRecur2(long n) {
        if (n < 10) {
            return (int) n;
        }

        long sum = 0L;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sumRecur2(sum);
    }
}