package io.github.bluething.playground.codinginterview.leetcode.leetcode_grind41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class _01MatrixTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[][]{{0,0,0},{0,1,0},{0,0,0}}, updateMatrix(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[][]{{0,0,0},{0,1,0},{1,2,1}}, updateMatrix(new int[][]{{0,0,0},{0,1,0},{1,1,1}}));
    }
    private int[][] updateMatrix(int[][] mat) {
        return new int[][]{};
    }
}
