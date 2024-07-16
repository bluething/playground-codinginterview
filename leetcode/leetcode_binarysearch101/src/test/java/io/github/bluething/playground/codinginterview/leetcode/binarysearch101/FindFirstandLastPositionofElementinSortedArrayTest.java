package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindFirstandLastPositionofElementinSortedArrayTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{3,4}, searchRange(new int[]{5,7,7,8,8,10}, 8));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{-1,-1}, searchRange(new int[]{5,7,7,8,8,10}, 6));
    }
    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{-1,-1}, searchRange(new int[]{}, 0));
    }

    private int[] searchRange(int[] nums, int target) {
        return new int[]{};
    }
}
