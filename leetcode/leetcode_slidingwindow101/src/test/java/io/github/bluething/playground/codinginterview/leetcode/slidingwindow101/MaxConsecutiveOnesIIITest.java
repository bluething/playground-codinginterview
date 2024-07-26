package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesIIITest {
    @Test
    void case01() {
        Assertions.assertEquals(6, longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
    @Test
    void case02() {
        Assertions.assertEquals(10, longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }

    private int longestOnes(int[] nums, int k) {
        int n = nums.length;
        if (n < k) {
            return n;
        }

        int left = 0, right = 0;
        int maxLength = 0, counterOf0 = 0;
        while (right < n) {
            if (nums[right] == 0) {
                counterOf0++;
            }
            while (counterOf0 > k) {
                if (nums[left] == 0) {
                    counterOf0--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}