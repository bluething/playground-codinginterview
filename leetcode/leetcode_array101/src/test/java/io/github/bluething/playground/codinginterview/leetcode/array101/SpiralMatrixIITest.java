package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpiralMatrixIITest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[][]{{1,2,3},{8,9,4},{7,6,5}}, generateMatrix(3));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[][]{{1}}, generateMatrix(1));
    }

    private int[][] generateMatrix(int n) {
        return new int[][]{};
    }
}
