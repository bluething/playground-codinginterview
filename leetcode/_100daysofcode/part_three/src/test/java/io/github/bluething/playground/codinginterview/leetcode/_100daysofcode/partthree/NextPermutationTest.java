package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/next-permutation/description/
class NextPermutationTest {

    @Test
    void case01() {
        int[] arr = new int[]{1,2,3};
        nextPermutation(arr);
        Assertions.assertArrayEquals(new int[]{1,3,2}, arr);
    }

    @Test
    void case02() {
        int[] arr = new int[]{3,2,1};
        nextPermutation(arr);
        Assertions.assertArrayEquals(new int[]{1,2,3}, arr);
    }

    @Test
    void case03() {
        int[] arr = new int[]{1,1,5};
        nextPermutation(arr);
        Assertions.assertArrayEquals(new int[]{1,5,1}, arr);
    }

    private void nextPermutation(int[] nums) {

    }
}
