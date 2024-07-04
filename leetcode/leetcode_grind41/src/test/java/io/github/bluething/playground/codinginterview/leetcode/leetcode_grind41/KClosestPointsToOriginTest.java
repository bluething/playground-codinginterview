package io.github.bluething.playground.codinginterview.leetcode.leetcode_grind41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KClosestPointsToOriginTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[][]{{-2,2}}, kClosest(new int[][]{{1,3},{-2,2}}, 1));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[][]{{3,3},{-2,4}}, kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2));
    }
    private int[][] kClosest(int[][] points, int k) {
        return new int[][]{};
    }
}
