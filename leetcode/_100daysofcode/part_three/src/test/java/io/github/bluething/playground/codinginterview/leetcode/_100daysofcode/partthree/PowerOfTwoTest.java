package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/power-of-two/description/
class PowerOfTwoTest {

    @Test
    void case01() {
        Assertions.assertTrue(isPowerOfTwo(1));
    }
    @Test
    void case02() {
        Assertions.assertTrue(isPowerOfTwo(16));
    }
    @Test
    void case03() {
        Assertions.assertFalse(isPowerOfTwo(3));
    }

    private boolean isPowerOfTwo(int n) {
        return false;
    }
}
