package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/container-with-most-water/description/
class ContainerWithMostWaterTest {

    @Test
    public void case01() {
        Assertions.assertEquals(1, maxArea(new int[]{1, 1}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(16, maxArea(new int[]{4,3,2,1,4}));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(2, maxArea(new int[]{1, 2, 1}));
    }

    @Test
    public void case04() {
        Assertions.assertEquals(49, maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    private int maxArea(int[] height) {
        return 0;
    }
}
