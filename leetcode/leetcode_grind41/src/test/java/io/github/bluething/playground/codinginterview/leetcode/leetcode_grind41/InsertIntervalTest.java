package io.github.bluething.playground.codinginterview.leetcode.leetcode_grind41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertIntervalTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[][]{{1,5},{6,9}}, insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[][]{{1,2},{3,10},{12,16}}, insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}));
    }
    private int[][] insert(int[][] intervals, int[] newInterval) {
        return new int[][]{};
    }
}
