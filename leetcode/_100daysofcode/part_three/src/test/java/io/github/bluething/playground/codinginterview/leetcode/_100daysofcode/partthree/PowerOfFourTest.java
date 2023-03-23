package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/power-of-four/description/
class PowerOfFourTest {

    @Test
    void case01() {
        Assertions.assertTrue(isPowerOfFour(16));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isPowerOfFour(5));
    }

    @Test
    void case03() {
        Assertions.assertTrue(isPowerOfFour(1));
    }

    private boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n%4 != 0) {
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
