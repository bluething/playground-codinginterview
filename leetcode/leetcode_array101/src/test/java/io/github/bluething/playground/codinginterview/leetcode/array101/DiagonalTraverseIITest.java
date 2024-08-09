package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DiagonalTraverseIITest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{1,4,2,7,5,3,8,6,9}, findDiagonalOrder(List.of(List.of(1,2,3), List.of(4,5,6), List.of(7,8,9))));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16}, findDiagonalOrder(List.of(List.of(1,2,3,4,5), List.of(6,7), List.of(8), List.of(9,10,11), List.of(12,13,14,15,16))));
    }
    private int[] findDiagonalOrder(List<List<Integer>> nums) {
        return new int[]{};
    }
}
