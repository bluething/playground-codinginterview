package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpiralMatrixIIITest {
    @Test
    void case01() {
        Assertions.assertEquals(new int[][]{{1,4},{1,5},{2,5},{2,4},{2,3},{1,3},{0,3},{0,4},{0,5},{3,5},{3,4},{3,3},{3,2},{2,2},{1,2},{0,2},{4,5},{4,4},{4,3},{4,2},{4,1},{3,1},{2,1},{1,1},{0,1},{4,0},{3,0},{2,0},{1,0},{0,0}},
                spiralMatrixIII(5,6,1,4));
    }
    @Test
    void case02() {
        Assertions.assertEquals(new int[][]{{0,0},{0,1},{0,2},{0,3}},
                spiralMatrixIII(1,4,0,0));
    }
    private int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        return new int[][]{};
    }
}
