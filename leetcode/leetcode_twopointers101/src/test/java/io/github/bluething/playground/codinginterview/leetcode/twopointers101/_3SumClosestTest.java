package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class _3SumClosestTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, threeSumClosest(new int[]{0,0,0}, 1));
    }

    private int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int gap = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }

                int curGap = Math.abs(sum - target);
                if (curGap < gap) {
                    gap = curGap;
                    ans = sum;
                }
            }
        }
        return ans;
    }
}