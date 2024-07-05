package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPivotIndexTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, pivotIndex(new int[]{1,7,3,6,5,6}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(-1, pivotIndex(new int[]{1,2,3}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(0, pivotIndex(new int[]{2,1,-1}));
    }

    private int pivotIndex(int[] nums) {
        return 0;
    }
}
