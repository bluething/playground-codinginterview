package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {
    @Test
    void case01() {
        Assertions.assertEquals(6, trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(9, trap(new int[]{4,2,0,3,2,5}));
    }
    private int trap(int[] height) {
        return 0;
    }
}