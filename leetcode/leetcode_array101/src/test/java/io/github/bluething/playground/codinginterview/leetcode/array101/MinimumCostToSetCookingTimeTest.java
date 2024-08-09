package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumCostToSetCookingTimeTest {
    @Test
    void case01() {
        Assertions.assertEquals(6, minCostSetTime(1, 2, 1, 600));
    }
    @Test
    void case02() {
        Assertions.assertEquals(6, minCostSetTime(0, 1, 2, 76));
    }

    private int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        return Integer.MAX_VALUE;
    }
}
