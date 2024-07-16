package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimuminRotatedSortedArrayTest {
    @Test
    void case01() {
        Assertions.assertEquals(1, findMin(new int[]{3,4,5,1,2}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, findMin(new int[]{4,5,6,7,0,1,2}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(11, findMin(new int[]{11,13,15,17}));
    }

    private int findMin(int[] nums) {
        return 0;
    }
}
