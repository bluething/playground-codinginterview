package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NextPermutationTest {
    @Test
    void case01() {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1,3,2}, nums);
    }
    @Test
    void case02() {
        int[] nums = {3,2,1};
        nextPermutation(nums);
                Assertions.assertArrayEquals(new int[]{1,2,3}, nums);
    }
    @Test
    void case03() {
        int[] nums = {1,1,5};
        nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1,5,1}, nums);
    }

    private void nextPermutation(int[] nums) {

    }
}
