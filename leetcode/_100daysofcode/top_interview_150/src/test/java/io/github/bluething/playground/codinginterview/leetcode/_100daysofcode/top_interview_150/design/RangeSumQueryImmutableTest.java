package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/range-sum-query-immutable/
class RangeSumQueryImmutableTest {

    @Test
    void case01() {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        Assertions.assertEquals(1, numArray.sumRange(0, 2));
        Assertions.assertEquals(-1, numArray.sumRange(2, 5));
        Assertions.assertEquals(-3, numArray.sumRange(0, 5));
    }

    class NumArray {

        private final int[] prefixSum;

        public NumArray(int[] nums) {
            prefixSum = new int[nums.length];
            prefixSum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixSum[i] = prefixSum[i-1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefixSum[right] - (left == 0 ? 0 : prefixSum[left-1]);
        }
    }
}