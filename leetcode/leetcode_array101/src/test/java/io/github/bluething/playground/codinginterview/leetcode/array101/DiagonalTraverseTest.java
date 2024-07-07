package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiagonalTraverseTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{1,2,4,7,5,3,6,8,9}, findDiagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1,2,3,4}, findDiagonalOrder(new int[][]{{1,2},{3,4}}));
    }

    private int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        if (row == 0 || col == 0) {
            return new int[]{};
        }

        // x: vertical, y: horizontal
        int x = 0, y = 0;
        int[] result = new int[row * col];
        int idx = 0;
        while (idx < result.length) {
            result[idx++] = mat[y][x];
            boolean isEven = (x+y) % 2 == 0;
            // even: up right, odd: down left
            if (isEven) {
                if (x < col - 1 && y > 0) {
                    x++;
                    y--;
                    // hit edge (y=0)
                } else if (x < col - 1) {
                    x++;
                    // outside egde (y<0)
                } else {
                    y++;
                }
            } else {
                if (y < row - 1 && x > 0) {
                    y++;
                    x--;
                } else if (y < row - 1) {
                    y++;
                } else {
                    x++;
                }
            }
        }
        return result;
    }
}
