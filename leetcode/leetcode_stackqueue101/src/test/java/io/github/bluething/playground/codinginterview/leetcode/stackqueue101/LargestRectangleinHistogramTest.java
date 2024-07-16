package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestRectangleinHistogramTest {
    @Test
    void case01() {
        Assertions.assertEquals(10, largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(4, largestRectangleArea(new int[]{2,4}));
    }
    private int largestRectangleArea(int[] heights) {
        return 0;
    }
}
