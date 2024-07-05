package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuplicateZerosTest {
    @Test
    void case01() {
        int[] nums = {1,0,2,3,0,4,5,0};
        duplicateZeros(nums);
        Assertions.assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, nums);
    }
    @Test
    void case02() {
        int[] nums = {1,2,3};
        duplicateZeros(nums);
        Assertions.assertArrayEquals(new int[]{1,2,3}, nums);
    }

    private void duplicateZeros(int[] arr) {

    }
}
