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
        Assertions.assertArrayEquals(new int[]{}, findDiagonalOrder(new int[][]{{1,2},{3,4}}));
    }

    private int[] findDiagonalOrder(int[][] mat) {
        return new int[]{};
    }
}
