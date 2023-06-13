package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan-v2&envId=top-interview-150
class TwoSumIIInputArrayIsSortedTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1,3}, twoSum(new int[]{2,3,4}, 6));
    }

    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum(new int[]{-1,0}, -1));
    }

    private int[] twoSum(int[] numbers, int target) {

        return new int[2];
    }
}
