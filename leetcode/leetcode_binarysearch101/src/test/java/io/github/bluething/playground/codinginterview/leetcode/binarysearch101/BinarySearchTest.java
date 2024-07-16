package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    void case02() {
        Assertions.assertEquals(-1, search(new int[]{-1,0,3,5,9,12}, 2));
    }

    private int search(int[] nums, int target) {
        return -1;
    }
}
