package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/min-cost-climbing-stairs/
class MinCostClimbingStairsTest {

    @Test
    void case01() {
        Assertions.assertEquals(15, minCostClimbingStairs(new int[]{10,15,20}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(6, minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    private int minCostClimbingStairs(int[] cost) {
        return 0;
    }
}
