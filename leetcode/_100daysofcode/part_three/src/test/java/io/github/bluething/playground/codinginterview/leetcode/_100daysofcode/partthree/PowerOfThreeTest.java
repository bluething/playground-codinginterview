package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/power-of-three/description/
class PowerOfThreeTest {

    @Test
    void case01() {
        Assertions.assertTrue(isPowerOfThree(27));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isPowerOfThree(0));
    }

    @Test
    void case03() {
        Assertions.assertTrue(isPowerOfThree(-1));
    }

    private boolean isPowerOfThree(int n) {
        return false;
    }
}
