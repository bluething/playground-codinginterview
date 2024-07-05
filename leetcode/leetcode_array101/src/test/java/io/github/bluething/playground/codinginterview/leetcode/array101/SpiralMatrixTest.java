package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    private List<Integer> spiralOrder(int[][] matrix) {
        return null;
    }
}
