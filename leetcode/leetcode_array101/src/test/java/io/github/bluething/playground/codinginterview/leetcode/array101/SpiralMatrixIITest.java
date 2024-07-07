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
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int[][] result = new int[n][n];
        int counter = 1;
        while (counter <= n * n) {
            for (int i = left; i <= right; i++) {
                result[top][i] = counter++;
            }
            top++;
            if (left > right || top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                result[i][right] = counter++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = counter++;
            }
            bottom--;
            if (left > right || top > bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                result[i][left] = counter++;
            }
            left++;
        }
        return result;
    }
}
