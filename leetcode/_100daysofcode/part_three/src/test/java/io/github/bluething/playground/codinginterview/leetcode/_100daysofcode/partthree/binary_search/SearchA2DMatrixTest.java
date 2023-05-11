package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/search-a-2d-matrix/
class SearchA2DMatrixTest {

    @Test
    void case01() {
        Assertions.assertTrue(searchMatrix(new int[][]{{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}}, 3));
    }

    @Test
    void case02() {
        Assertions.assertFalse(searchMatrix(new int[][]{{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}}, 13));
    }

    private boolean searchMatrix(int[][] matrix, int target) {
        return true;
    }
}
