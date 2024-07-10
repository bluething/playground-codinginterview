package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _3SumClosestTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, threeSumClosest(new int[]{0,0,0}, 1));
    }

    private int threeSumClosest(int[] nums, int target) {
        return 0;
    }
}