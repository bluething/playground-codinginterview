package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SetMatrixZeroesTest {
    @Test
    void case01() {
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        Assertions.assertArrayEquals(new int[][]{{1,0,1},{0,0,0},{1,0,1}}, matrix);
    }
    @Test
    void case02() {
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        Assertions.assertArrayEquals(new int[][]{{0,0,0,0},{0,4,5,0},{0,3,1,0}}, matrix);
    }

    private void setZeroes(int[][] matrix) {

    }
}
