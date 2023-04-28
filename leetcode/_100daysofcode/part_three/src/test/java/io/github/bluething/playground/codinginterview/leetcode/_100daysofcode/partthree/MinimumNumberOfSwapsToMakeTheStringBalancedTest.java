package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
class MinimumNumberOfSwapsToMakeTheStringBalancedTest {

    @Test
    void case01() {
        Assertions.assertEquals(1, minSwaps("][]["));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, minSwaps("]]][[["));
    }

    @Test
    void case03() {
        Assertions.assertEquals(0, minSwaps("[]"));
    }

    private int minSwaps(String s) {
        return 0;
    }
}
