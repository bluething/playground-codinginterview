package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KokoEatingBananasTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, minEatingSpeed(new int[]{3,6,7,11}, 8));
    }
    @Test
    void case02() {
        Assertions.assertEquals(30, minEatingSpeed(new int[]{30,11,23,4,20}, 5));
    }
    @Test
    void case03() {
        Assertions.assertEquals(23, minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }

    private int minEatingSpeed(int[] piles, int h) {
        return -1;
    }
}
