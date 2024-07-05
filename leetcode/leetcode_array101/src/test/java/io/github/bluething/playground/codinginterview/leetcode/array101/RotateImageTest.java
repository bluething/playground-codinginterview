package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateImageTest {
    @Test
    void case01() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        Assertions.assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}}, matrix);
    }
    @Test
    void case02() {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        Assertions.assertArrayEquals(new int[][]{{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}}, matrix);
    }

    private void rotate(int[][] matrix) {

    }
}
