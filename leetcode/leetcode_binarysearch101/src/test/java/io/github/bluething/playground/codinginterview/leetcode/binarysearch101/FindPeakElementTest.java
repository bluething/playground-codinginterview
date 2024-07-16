package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPeakElementTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, findPeakElement(new int[]{1,2,3,1}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(5, findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }

    private int findPeakElement(int[] nums) {
        return -1;
    }
}
