package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchinRotatedSortedArrayTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, search(new int[]{4,5,6,7,0,1,2}, 0));
    }
    @Test
    void case02() {
        Assertions.assertEquals(-1, search(new int[]{4,5,6,7,0,1,2}, 3));
    }
    @Test
    void case03() {
        Assertions.assertEquals(-1, search(new int[]{1}, 0));
    }
    private int search(int[] nums, int target) {
        return -1;
    }
}
