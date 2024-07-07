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
    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{1,2,4,7,5,3,6,8,9}, findDiagonalOrder2(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    @Test
    void case04() {
        Assertions.assertArrayEquals(new int[]{1,2,3,4}, findDiagonalOrder2(new int[][]{{1,2},{3,4}}));
    }

    private int[] findDiagonalOrder(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        if (M == 0 || N == 0) {
            return new int[]{};
        }
        
        int col = 0, row = 0;
        int[] result = new int[M * N];
        int idx = 0;
        while (idx < result.length) {
            result[idx++] = mat[row][col];
            boolean isEven = (col+row) % 2 == 0;
            // even: up right, odd: down left
            if (isEven) {
                if (col < N - 1 && row > 0) {
                    col++;
                    row--;
                    // hit edge (y=0)
                } else if (col < N - 1) {
                    col++;
                    // outside egde (y<0)
                } else {
                    row++;
                }
            } else {
                if (row < M - 1 && col > 0) {
                    row++;
                    col--;
                } else if (row < M - 1) {
                    row++;
                } else {
                    col++;
                }
            }
        }
        return result;
    }

    private int[] findDiagonalOrder2(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        if (M == 0 || N == 0) {
            return new int[]{};
        }

        // 1: up
        int direction = 1;
        int[] result = new int[M * N];
        int idx = 0;
        int row = 0, col = 0;
        while (row < M && col < N) {
            result[idx++] = mat[row][col];

            // up: row -1, col + 1
            // down: col + 1, row - 1
            int newRow = row + (direction == 1 ? -1 : 1);
            int newCol = col + (direction == 1 ? 1 : -1);
            if (newRow < 0 || newRow == M || newCol < 0 || newCol == N) {
                // find the new head (beginning of move)
                if (direction == 1) {
                    // upwards
                    // if col within the bound, then the next col become new head
                    // if col is the edge, then the element below become new head
                    row += (col == N-1 ? 1 : 0);
                    col += (col < N-1 ? 1 : 0);
                } else {
                    // downwards
                    // if row within the bounds, then the nex row become new head
                    // if row is the edge (M-1), then the element beside will become new head
                    col += (row == M -1 ? 1 : 0);
                    row += (row < M-1 ? 1 : 0);
                }

                direction = 1 - direction;
            } else {
                row = newRow;
                col = newCol;
            }
        }

        return result;
    }
}
