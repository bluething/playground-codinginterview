package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, removeDuplicates(new int[]{1,1,2}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    private int removeDuplicates(int[] nums) {
        return 0;
    }
}
