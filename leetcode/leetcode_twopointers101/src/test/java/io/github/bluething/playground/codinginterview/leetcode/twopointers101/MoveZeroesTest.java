package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {
    @Test
    void case01() {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }
    @Test
    void case02() {
        int[] nums = {0};
        moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{0}, nums);
    }
    private void moveZeroes(int[] nums) {

    }
}
