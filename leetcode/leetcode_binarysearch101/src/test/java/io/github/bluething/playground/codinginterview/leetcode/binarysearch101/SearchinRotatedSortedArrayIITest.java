package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchinRotatedSortedArrayIITest {
    @Test
    void case01() {
        Assertions.assertTrue(search(new int[]{2,5,6,0,0,1,2}, 0));
    }
    @Test
    void case02() {
        Assertions.assertFalse(search(new int[]{2,5,6,0,0,1,2}, 3));
    }

    private boolean search(int[] nums, int target) {
        return false;
    }
}
