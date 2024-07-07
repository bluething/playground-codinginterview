package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrixTest {
    @Test
    void case01() {
        List<Integer> expected = List.of(1,2,3,6,9,8,7,4,5);
        Assertions.assertEquals(expected, spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    @Test
    void case02() {
        List<Integer> expected = List.of(1,2,3,4,8,12,11,10,9,5,6,7);
        Assertions.assertEquals(expected, spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
    @Test
    void case03() {
        List<Integer> expected = List.of(7,9,6);
        Assertions.assertEquals(expected, spiralOrder(new int[][]{{7},{9},{6}}));
    }

    private List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            if (left > right || top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            if (left > right || top > bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }

        return result;
    }
}
